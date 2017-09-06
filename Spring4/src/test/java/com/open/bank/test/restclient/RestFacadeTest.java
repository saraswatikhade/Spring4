package com.open.bank.test.restclient;

import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.open.bank.bean.Result;
import com.open.bank.bean.TransactionDetails;
import com.open.bank.bean.Transactions;
import com.open.bank.bean.TranscationsDTO;
import com.open.bank.rest.client.RestFacade;
import com.open.bank.util.BankConstants;


import junit.framework.TestCase;
/**
 * Test class for TestFacade
 * @author Saraswati
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class RestFacadeTest extends TestCase {
	
	public RestFacade restFacade = null;
	
	 @InjectMocks
	 RestTemplate restTemplate= new RestTemplate();
	 

	 @InjectMocks
	 ObjectMapper mapper = new ObjectMapper();


	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		restFacade = new RestFacade();
		
	}
	

	/**
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void testGetTransactionMethod() throws JsonParseException, JsonMappingException, IOException {
		String url = BankConstants.REST_URL;
		String result = restTemplate.getForObject(url, String.class);
		TranscationsDTO transcationsDTO = mapper.readValue(result, TranscationsDTO.class);
		List<Transactions> transactionList = transcationsDTO.getTransactions();		
		assertNotNull(transactionList);
		assertFalse(transactionList.isEmpty());
		assertNotNull(transcationsDTO);
		assertNotNull(result);
		 
	}
	
	/**
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void getTransactionTest() throws JsonParseException, JsonMappingException, IOException {
		List<TransactionDetails> details = restFacade.getTransactions();
		assertEquals("savings-kids-john", details.get(0).getAccountId());

	}
	
	/**
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void testFilteredTransaction() throws JsonParseException, JsonMappingException, IOException {
		List<TransactionDetails> details = restFacade.getFilterTransactions("sandbox-payment");
		assertEquals("dcb8138c-eb88-404a-981d-d4edff1086a6", details.get(0).getId());
		assertEquals("savings-kids-john", details.get(0).getAccountId());
		assertEquals("13677980653", details.get(0).getCounterpartyAccount());
		assertEquals("ALIAS_CBCDE5", details.get(0).getCounterpartyName());
		assertEquals(null, details.get(0).getCounterPartyLogoPath());
		assertEquals(new Double(10.0), details.get(0).getInstructedAmount());
		assertEquals("GBP", details.get(0).getInstructedCurrency());
		assertEquals("sandbox-payment", details.get(0).getTransactionType());
		assertEquals("Description abc", details.get(0).getDescription());
		assertNotSame(-1, details.size());
	}
	
	/**
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void testTotalTransactionAmount() throws JsonParseException, JsonMappingException, IOException {
	Result result = Mockito.mock(Result.class);
	List<TransactionDetails> transactionList = new ArrayList<TransactionDetails>();
	transactionList.add(setTransactionDetails());
	assertNotNull(transactionList.get(0).getTransactionType());
	assertEquals("sandbox-payment", transactionList.get(0).getTransactionType());
	assertNotNull(transactionList);
	assertNotSame(-1, transactionList.size());
	
	
	
	}
	
	@Test
	public void testTotalTransactionAmount1() throws JsonParseException, JsonMappingException, IOException {
		String transactionType ="sandbox-payment";
		RestFacade restFacade = Mockito.mock(RestFacade.class);
		Result result  = restFacade.getTotalAmount(transactionType);
		verify(restFacade).getTotalAmount(transactionType);
	
	}
	
	@Test
	public void testFilteredTransaction1() throws JsonParseException, JsonMappingException, IOException {
		String transactionType ="sandbox-payment";
		RestFacade restFacade = Mockito.mock(RestFacade.class);
		List<TransactionDetails> transactionList = restFacade.getFilterTransactions(transactionType);
		verify(restFacade).getFilterTransactions(transactionType);
	
	}
	
	private TransactionDetails setTransactionDetails() {
		TransactionDetails transObj = new TransactionDetails();
		transObj.setAccountId("savings-kids-john");
		transObj .setCounterpartyAccount("13677980653");
		transObj.setCounterpartyName("ALIAS_CBCDE5");
		transObj.setTransactionType("sandbox-payment");
		transObj.setInstructedAmount(new Double(10.0));
		transObj.setInstructedCurrency("GBP");
		transObj.setDescription("Description abc");
		transObj.setCounterPartyLogoPath(null);
		return transObj;
	}
	
	

}
