package br.com.joaovictor.sistemademensagens;

import org.springframework.boot.SpringApplication;

public class TestSistemademensagensApplication {

	public static void main(String[] args) {
		SpringApplication.from(SistemademensagensApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
