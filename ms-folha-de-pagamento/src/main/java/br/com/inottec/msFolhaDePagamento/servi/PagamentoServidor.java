package br.com.inottec.msFolhaDePagamento.servi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.inottec.msFolhaDePagamento.entidade.Pagamento;
import br.com.inottec.msFolhaDePagamento.entidade.Trabalhador;

@Service
public class PagamentoServidor {

	@Value("${ms-trabalhador.host}")
	private String trabalhadorHost;

	@Autowired
	private RestTemplate restTemplate;

	public Pagamento getPagamento(long trabalhadorID, int dias) {

		Map<String, String> uriVariables = new HashMap<>();

		uriVariables.put("id", "" + trabalhadorID);

		Trabalhador trablhador = restTemplate.getForObject(trabalhadorHost + "/trabalhadores/{id}", Trabalhador.class,
				uriVariables);
		return new Pagamento(trablhador.getNome(), trablhador.getDiaria(),dias);

	}
}
