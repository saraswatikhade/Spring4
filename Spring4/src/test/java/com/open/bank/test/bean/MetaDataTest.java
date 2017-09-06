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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class MetaDataTest {

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testMetaDataObject() {
		Metadata metaData = new Metadata();
		metaData.setImageURL("http://www.google.com");
		assertEquals("http://www.google.com", metaData.getImageURL());
		
	}
}
