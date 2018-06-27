package ead5.com.br.calculoclt.controller;

	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ead5.com.br.calculoclt.calculo.ContraCheque;

@RestController
@RequestMapping("/contracheque")
public class CalculoController {

@PostMapping
public ContraCheque calcular(@RequestBody ContraCheque contraCheque) {
	return contraCheque;
}
	
}

