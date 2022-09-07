package br.com.inottec.msFolhaDePagamento.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.inottec.msFolhaDePagamento.entidade.Pagamento;
import br.com.inottec.msFolhaDePagamento.servi.PagamentoServidor;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoRecursos {

	
	@Autowired
	private PagamentoServidor service;

	@GetMapping(value = "/{trabalhadorID}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long trabalhadorID, @PathVariable Integer dias) {
		Pagamento pag = service.getPagamento(trabalhadorID, dias);
		return ResponseEntity.ok(pag);
	}

}
