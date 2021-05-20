/**
 * 
 */
package com.diego.clima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.diego.clima.response.RespostaResponse;

/**
 * @author dcandido
 *
 */
@Service
public class ClimaService {

	private static final String URL_BASE = "https://api.hgbrasil.com/weather";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${keyValue}")
	private String key;
	
	public RespostaResponse todos() {
		final RespostaResponse response = restTemplate.getForObject(URL_BASE, RespostaResponse.class);
		return response;
	}
	
	public RespostaResponse todosPorCodigoCidade(final Integer cidade) {

		final RespostaResponse response = restTemplate.getForObject(URL_BASE + "?woeid=" + cidade, RespostaResponse.class);
		return response;
	}

	
	public RespostaResponse todosPorNomeCidade(final String cidade) {

		final RespostaResponse response = restTemplate.getForObject(
						URL_BASE + "?key=" + key + "&city_name=" + cidade,
						RespostaResponse.class);
		return response;
	}
}
