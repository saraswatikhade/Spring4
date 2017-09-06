/**
 * 
 */
package com.open.bank.test.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.open.bank.bean.TransactionDetails;
import com.open.bank.rest.client.RestFacade;

/**
 * @author Saraswati
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class TransactionDetailTest {

	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void setTransactionObject() {
		TransactionDetails transaObject = new TransactionDetails();
		transaObject.setAccountId("123");
		transaObject.setCounterpartyAccount("test");
		transaObject.setCounterpartyName("John");
		transaObject.setDescription("description");
		transaObject.setInstructedAmount(new Double(10.10));
		transaObject.setInstructedCurrency("GBP");
		transaObject.setCounterPartyLogoPath("counterPartyLogoPath");
		transaObject.setTransactionType("sandbox-payment");
		transaObject.setTransactionCurrency("GBP");
		transaObject.setTransactionAmount(new Double(1010));
		
		
		assertEquals("123", transaObject.getAccountId());
		assertEquals("test", transaObject.getCounterpartyAccount());
		assertEquals("John", transaObject.getCounterpartyName());
		assertEquals("description", transaObject.getDescription());
		assertEquals(new Double(10.10), transaObject.getInstructedAmount());
		assertEquals("GBP", transaObject.getInstructedCurrency());
		assertEquals("counterPartyLogoPath", transaObject.getCounterPartyLogoPath());
		assertEquals("sandbox-payment", transaObject.getTransactionType());
		assertEquals("GBP", transaObject.getTransactionCurrency());
		assertEquals(new Double(1010), transaObject.getTransactionAmount());
		
		
	}
	
}
