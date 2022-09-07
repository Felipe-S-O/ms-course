package br.com.inottec.msFolhaDePagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsFolhaDePagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFolhaDePagamentoApplication.class, args);
	}

}
