/**
 * 
 */
package com.diego.clima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.clima.response.RespostaResponse;
import com.diego.clima.service.ClimaService;

/**
 * @author dcandido
 *
 */
@RestController
@RequestMapping("/clima")
public class ClimaController {

	@Autowired
	private ClimaService climaService;
	
	@GetMapping
	public ResponseEntity<RespostaResponse> todos() {
		return ResponseEntity.ok().body(climaService.todos());
	}
	
//	EXTREMA = 432113
	@GetMapping("/codigoCidade/{codigoCidade}")
	public ResponseEntity<RespostaResponse> todosPorCodigoCidade(@PathVariable Integer codigoCidade) {
		return ResponseEntity.ok().body(climaService.todosPorCodigoCidade(codigoCidade));
	}
	
	@GetMapping("/nomeCidade/{nomeCidade}")
	public ResponseEntity<RespostaResponse> todosPorNomeCidade(@PathVariable String nomeCidade) {
		return ResponseEntity.ok().body(climaService.todosPorNomeCidade(nomeCidade));
	}
}
