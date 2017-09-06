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

import com.open.bank.bean.Holders;
import com.open.bank.bean.Result;
import com.open.bank.bean.ThisAccount;

/**
 * @author e5542274
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class ThisAccountTest {


	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testThisAccountObject() {
		ThisAccount thisAmt = new ThisAccount();
		List<Holders> list = new ArrayList<Holders>();
		thisAmt.setId("123");
		thisAmt.setNumber("345");
		thisAmt.setKind("kind");
		thisAmt.setIban("iban");
		thisAmt.setHolders(list);
		
		assertEquals("123", thisAmt.getId());
		assertEquals("345", thisAmt.getNumber());
		assertEquals("kind", thisAmt.getKind());
		assertEquals("iban", thisAmt.getIban());
		assertEquals(list, thisAmt.getHolders());
		
		
	}
}
