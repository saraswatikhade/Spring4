/**
 * 
 */
package com.open.bank.test.controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import static org.mockito.Mockito.*;
import com.open.bank.bean.Result;
import com.open.bank.bean.TransactionDetails;
import com.open.bank.controller.TransactionController;
import com.open.bank.rest.client.RestFacade;


/**
 * @author Saraswati
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class TransactionControllerTest {


	@Autowired
	private TransactionController transactionController;

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	/* Happy Scanario */
	/**
	 * Test to get transaction Account id 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void getTransactionTest() {
		List<TransactionDetails> details = transactionController.getTransaction();
		assertEquals("savings-kids-john", details.get(0).getAccountId());
	}
	/**
	 * 
	 */
	@Test
	public void getTransactionTest1() {
		List<TransactionDetails> details = transactionController.getTransaction();
		assertEquals("dcb8138c-eb88-404a-981d-d4edff1086a6", details.get(0).getId());
	}
	/**
	 * 
	 */
	@Test
	public void getFilteredTransactionTest()  {
		String transactionType ="sandbox-payment";
		List<TransactionDetails> result  = transactionController.getFilterTransaction(transactionType);
		assertEquals("sandbox-payment", result.get(0).getTransactionType());
		//when(transactionController.getFilterTransaction(transactionType)).thenReturn(result);
		//verify(restFacade).getTransactions();
	}

	/**
	 * 
	 */
	@Test
	public void getTotalTransactionAmountTest() {
		String transactionType ="sandbox-payment";
		Result result  = transactionController.getTotalTransactionAmount(transactionType);
		assertEquals(new Double(73.76), result.getTotalAmount());
	}

	@Test
	public void testFilteredTransaction1() {
		String transactionType ="sandbox-payment";
		TransactionController transController = Mockito.mock(TransactionController.class);
		List<TransactionDetails> result  = transController.getFilterTransaction(transactionType);
		verify(transController).getFilterTransaction(transactionType);
	}

	@Test
	public void testFilteredTransaction2() {
		String transactionType ="sandbox-payment";
		RestFacade restFacade = Mockito.mock(RestFacade.class);
		List<TransactionDetails> result  = restFacade.getFilterTransactions(transactionType);
		verify(restFacade).getFilterTransactions(transactionType);
	}

	@Test
	public void testTotalTransaction1() {
		String transactionType ="sandbox-payment";
		TransactionController transController = Mockito.mock(TransactionController.class);
		Result result   = transController.getTotalTransactionAmount(transactionType);
		//when(transController.getTotalTransactionAmount(transactionType).getTotalAmount()).thenReturn(73.76);
		verify(transController).getTotalTransactionAmount(transactionType);
	}

	@Test
	public void testTotalTransaction2() {
		String transactionType ="sandbox-payment";
		RestFacade restFacade = Mockito.mock(RestFacade.class);
		Result result  = restFacade.getTotalAmount(transactionType);
		verify(restFacade).getTotalAmount(transactionType);
	}
	
	@Test
	public void testTransaction1() {
		TransactionController transController = Mockito.mock(TransactionController.class);
		List<TransactionDetails> list = transController.getTransaction();
		//when(transController.getTotalTransactionAmount(transactionType).getTotalAmount()).thenReturn(73.76);
		verify(transController).getTransaction();
	}

	@Test
	public void testTransaction2() {
		RestFacade restFacade = Mockito.mock(RestFacade.class);
		List<TransactionDetails> list  = restFacade.getTransactions();
		verify(restFacade, times(1)).getTransactions();
	}


}
