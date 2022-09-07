package br.com.inottec.mscourse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.inottec.mscourse.entidade.Trabalhador;

public interface TrabalhadorRepositorio extends JpaRepository<Trabalhador, Long>  {

}
