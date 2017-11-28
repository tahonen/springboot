package com.redhat.emeatigers.springboot.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
public class SpringBootAppTests {

	@Inject
	SpringBootService service;

	@Test
	public void contextLoads() {
	}

	@Test
    public void testSayHello() {
        String message = service.sayHello();
        assertTrue(message!=null);
        assertEquals(message,"Hey Developer!");
    }

}
