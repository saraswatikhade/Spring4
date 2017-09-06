package com.open.bank.test.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.open.bank.bean.Result;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/TransactionControllerTest-context.xml"})
public class ResultTest {


	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testResultObject() {
		Result result = new Result();
		result.setTotalAmount(new Double(10.10));;
		
		assertEquals(new Double(10.10), result.getTotalAmount());
		
		
	}
}
