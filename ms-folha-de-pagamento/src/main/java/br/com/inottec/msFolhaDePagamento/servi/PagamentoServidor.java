package br.com.inottec.msFolhaDePagamento.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.inottec.msFolhaDePagamento.entidade.Pagamento;
import br.com.inottec.msFolhaDePagamento.entidade.Trabalhador;
import br.com.inottec.msFolhaDePagamento.feigncliente.TrabalhadorFeignClient;

@Service
public class PagamentoServidor {

	@Autowired
	private TrabalhadorFeignClient trabalhadorFeignClient;

	public Pagamento getPagamento(long trabalhadorID, int dias) {

		Trabalhador trablhador = trabalhadorFeignClient.findById(trabalhadorID).getBody();
		return new Pagamento(trablhador.getNome(), trablhador.getDiaria(), dias);

	}
}
