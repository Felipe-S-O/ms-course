package br.com.inottec.msFolhaDePagamento.servi;

import org.springframework.stereotype.Service;

import br.com.inottec.msFolhaDePagamento.entidade.Pagamento;

@Service
public class PagamentoServidor {

	public Pagamento getPagamento(long Trabalhador, int dias) {
		
		return new Pagamento("felpe", 200.0, 3);
		
	}
}
