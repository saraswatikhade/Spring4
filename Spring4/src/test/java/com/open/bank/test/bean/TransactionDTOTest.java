/**
 * 
 */
package com.open.bank.test.bean;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.open.bank.bean.Transactions;
import com.open.bank.bean.TranscationsDTO;

/**
 * @author e5542274
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class TransactionDTOTest {
	

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}

	
	@Test
	public void testTransactionObject() {
		TranscationsDTO transactions = new TranscationsDTO();
		List<Transactions> list = new ArrayList<Transactions>();
		transactions.setTransactions(list);
		assertEquals(list, transactions.getTransactions());
		
	}
}
