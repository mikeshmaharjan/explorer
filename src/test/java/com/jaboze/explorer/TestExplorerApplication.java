package com.jaboze.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExplorerApplication::main).with(TestExplorerApplication.class).run(args);
	}

}
