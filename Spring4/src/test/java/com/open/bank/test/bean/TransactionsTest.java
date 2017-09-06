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

import com.open.bank.bean.Metadata;
import com.open.bank.bean.Transactions;

/**
 * @author e5542274
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class TransactionsTest {
	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testTransactionObject() {
		Transactions transactions = new Transactions();
		transactions.setId("1234");
		assertEquals("1234", transactions.getId());
		
	}

}
