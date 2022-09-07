package br.com.inottec.msTrabalhador.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.inottec.msTrabalhador.entidade.Trabalhador;

public interface TrabalhadorRepositorio extends JpaRepository<Trabalhador, Long> {

}
