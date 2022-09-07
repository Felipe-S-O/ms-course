package br.com.inottec.msTrabalhador.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.inottec.msTrabalhador.entidade.Trabalhador;
import br.com.inottec.msTrabalhador.repositorios.TrabalhadorRepositorio;

@RestController
@RequestMapping(value = "/trabalhadores")
public class Recursos {

	@Autowired
	private TrabalhadorRepositorio repositorio;

	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAl() {
		List<Trabalhador> list = repositorio.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id) {

		Trabalhador obj = repositorio.findById(id).get();
		return ResponseEntity.ok(obj);

	}

}
