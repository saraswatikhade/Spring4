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

import com.open.bank.bean.Details;
import com.open.bank.bean.TransactionDetails;
import com.open.bank.bean.Value;

/**
 * @author e5542274
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class DetailsTest {


	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testDetailsObject() {
		Details details = new Details();
		Value value = new Value();
		value.setAmount("1000");
		value.setCurrency("USD");
		details.setDescription("Loan");
		details.setType("sandBox");
		details.setValue(value);
		
		assertEquals("1000", value.getAmount());
		assertEquals("USD", value.getCurrency());
		assertEquals("Loan", details.getDescription());
		assertEquals("sandBox", details.getType());
		assertEquals(value, details.getValue());
	}
}
