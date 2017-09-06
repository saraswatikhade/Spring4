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

import com.open.bank.bean.Holders;
import com.open.bank.bean.Metadata;
import com.open.bank.bean.OtherAccount;

/**
 * @author e5542274
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class OtherAccountTest {


	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}

	@Test
	public void testOtherAccountObject() {
		OtherAccount other = new OtherAccount();
		Holders holder = new Holders();
		Metadata metaData = new Metadata();
		other.setId("1234");
		other.setNumber("2002");
		other.setHolder(holder);
		other.setMetadata(metaData);

		assertEquals("1234", other.getId());
		assertEquals("2002", other.getNumber());
		assertEquals(holder, other.getHolder());
		assertEquals(metaData, other.getMetadata());

	}

}
