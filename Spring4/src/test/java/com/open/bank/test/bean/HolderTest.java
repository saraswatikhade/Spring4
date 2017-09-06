package com.open.bank.test.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.open.bank.bean.Holders;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class HolderTest {



	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testHoldersObject() {
		Holders holder = new Holders();
		holder.setName("John");
		holder.setIsAlias("Matt");
		assertEquals("John", holder.getName());
		assertEquals("Matt", holder.getIsAlias());
		
	}
}
