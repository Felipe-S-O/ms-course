package br.com.inottec.msFolhaDePagamento.feigncliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.inottec.msFolhaDePagamento.entidade.Trabalhador;


@Component
@FeignClient(name = "ms-trabalhador", url = "localhost:8001", path = "/trabalhadores")
public interface TrabalhadorFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Trabalhador> findById(@PathVariable Long id);

}
