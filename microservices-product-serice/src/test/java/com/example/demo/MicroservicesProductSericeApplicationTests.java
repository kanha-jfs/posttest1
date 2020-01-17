package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;
@EnableDiscoveryClient
@SpringBootApplication

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicesProductSericeApplicationTests {

	@Test
	public void contextLoads() {
	}

}
