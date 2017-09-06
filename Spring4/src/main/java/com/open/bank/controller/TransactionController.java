/**
 * 
 */
package com.open.bank.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.open.bank.bean.TransactionDetails;
import com.open.bank.rest.client.RestFacade;
import com.open.bank.bean.Result;

/**
 * This class is created for transaction details information
 * 1) will get list of all transactions
 * 2)Search details as per transaction type
 * 3)Get total amount transactions 
 * @author Saraswati
 *
 */
@RestController
@RequestMapping(value="bank")
public class TransactionController {

	private static final Logger logger = Logger.getLogger(TransactionController.class);
	
	
	/**
	 * Default home page
	 * @return
	 *//*
	@RequestMapping("/")
	public String bank(){
		return "bank";
	}*/
	/**
	 * This method is used to expose the restful service for the list of transaction
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "transactions", method = RequestMethod.GET)
	public List<TransactionDetails> getTransaction() {
		logger.info("Getting Transaction List...");
		RestFacade restFacade = new RestFacade();
		List<TransactionDetails> result = restFacade.getTransactions();
		return result;

	}

	/**
	 * Transaction filter based on transaction type
	 * @param transactionType
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value ="filter/{transactionType}", method = RequestMethod.GET)
	public List<TransactionDetails> getFilterTransaction(@PathVariable("transactionType") String transactionType) {
		logger.info("Get transaction details for transaction type :" + transactionType);
		RestFacade restFacade = new RestFacade();
		List<TransactionDetails> result = restFacade.getFilterTransactions(transactionType);
		return result;

	}

	/**
	 * Total amount for transaction type
	 * @param transactionType
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "total/{transactionType}", method = RequestMethod.GET)
	public Result getTotalTransactionAmount(@PathVariable("transactionType") String transactionType){
		logger.info("Get total transaction amount for transaction type :" + transactionType);
		RestFacade restFacade = new RestFacade();
		Result result = restFacade.getTotalAmount(transactionType);
		logger.info("Total amount for " +transactionType + "is" +result.getTotalAmount());
		return result;

	}


}
