package com.open.bank.rest.client;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import com.open.bank.bean.Result;
import com.open.bank.bean.TransactionDetails;
import com.open.bank.bean.Transactions;
import com.open.bank.bean.TranscationsDTO;
import com.open.bank.util.BankConstants;


/**
 * This  class act as the REST client for the transaction service provided by open bank
 * @author Saraswati
 *
 */
public class RestFacade {
	final static Logger logger = Logger.getLogger(RestFacade.class);
	
	
	/**
	 * This method is use to map the backbase fields to open bank fields
	 * @return
	 */
	public List<TransactionDetails> getTransactions() {
		logger.info("Consuming Rest API URL...");
		RestTemplate restTemplate = new RestTemplate();
		String url = BankConstants.REST_URL;
		String result = restTemplate.getForObject(url, String.class);
		ObjectMapper mapper = new ObjectMapper();
		TranscationsDTO transcationsDTO = null;
		TransactionDetails transactionDetails = null;
		List<TransactionDetails> detailsList = new ArrayList<TransactionDetails>();		
		
		try {
			transcationsDTO = mapper.readValue(result, TranscationsDTO.class);
			List<Transactions> transactionList = transcationsDTO.getTransactions();
			
			if(null != transcationsDTO && !transactionList.isEmpty()){
				int size = transactionList.size();
				logger.info("Size of transaction List..." + size);
				for(int i = 0; i < size; i++){
					transactionDetails = new TransactionDetails();
					transactionDetails.setId(transactionList.get(i).getId());
					transactionDetails.setAccountId(transactionList.get(i).getThis_account().getId());
					transactionDetails.setCounterpartyAccount(transactionList.get(i).getOther_account().getNumber());
					transactionDetails.setCounterpartyName(transactionList.get(i).getOther_account().getHolder().getName());
					transactionDetails.setCounterPartyLogoPath(transactionList.get(i).getOther_account().getMetadata().getImageURL());
					transactionDetails.setInstructedAmount(Double.valueOf(transactionList.get(i).getDetails().getValue().getAmount()));
					transactionDetails.setInstructedCurrency(transactionList.get(i).getDetails().getValue().getCurrency());
					transactionDetails.setTransactionAmount(Double.valueOf(transactionList.get(i).getDetails().getValue().getAmount()));
					transactionDetails.setTransactionCurrency(transactionList.get(i).getDetails().getValue().getCurrency());
					transactionDetails.setTransactionType(transactionList.get(i).getDetails().getType());
					transactionDetails.setDescription(transactionList.get(i).getDetails().getDescription());
					detailsList.add(transactionDetails);
				}
				
				logger.info("Number of Records present : " + detailsList.size());
			}
		}catch(JsonParseException e) {
			logger.error("Error occured while parsing web service while parsing JSON:"+e.getMessage());
		}catch(JsonMappingException e) {
			logger.error("Error occured while parsing web service while mapping JSON:"+e.getMessage());
		}catch(IOException e) {
			logger.error("IO Exception occured:"+e.getMessage());
		}
		return detailsList;
	}

	/**
	 * Get the list of the transaction based on transaction type
	 * @param transactionType
	 * @return
	 */
	public List<TransactionDetails> getFilterTransactions(String transactionType) {
		logger.info("Getting transaction details for transaction type :" + transactionType);
		List<TransactionDetails> transactionFilter = new ArrayList<TransactionDetails>();
		List<TransactionDetails> transactionList = getTransactions();
		
		for (TransactionDetails t : transactionList) {
			if (t.getTransactionType()!=null && t.getTransactionType().equals(transactionType)) {
				transactionFilter.add(t);
			}
		}
		return transactionFilter;
	}
	
	/**
	 * Total transation amount for transaction type customer in list.
	 * 
	 * @param transactionType
	 * 
	 * @return total transaction amount for selected transactionType
	 */
	public Result getTotalAmount(String transactionType) {
		logger.info("Getting total transaction amount for transaction type :" + transactionType);
		Double totalTransactionAmount = 0.00;
		Result result = new Result();
		List<TransactionDetails> transactionList = getTransactions();
		
			for (TransactionDetails t : transactionList) {
				if (t.getTransactionType()!=null && t.getTransactionType().equals(transactionType)) {
					totalTransactionAmount = totalTransactionAmount + t.getTransactionAmount();
				}
				
				result.setTotalAmount(Double.parseDouble(new DecimalFormat(BankConstants.DECIMAL_FORMAT).format(totalTransactionAmount)));
		}
		return result;
	}
	
}
