package br.com.api.anailson.repository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PessoasController {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity init (){
		return new ResponseEntity("Ola Api RH",HttpStatus.OK );
		
	}

}
