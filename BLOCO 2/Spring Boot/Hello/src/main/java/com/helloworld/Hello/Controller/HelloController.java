package com.helloworld.Hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping("/at1")
	public String Atividade1()
	{
		return "Nesta ativividade foram ultilizadas as mentalidades de persistencia e atenção aos detalhes.";
	}

	@GetMapping("/at2")
	public String Atividade2()
	{
		return "Meu maior objetivo de aprendizagem é melhorar a minha habilidade de atenção aos detalhes"
				+ " e me desenvolver melhor nos conteudos passados em aula. Gostaria de pesquisar mais informações"
				+ " além das que são passadas em aula para aprimorar meus conhecimentos sobre o conteudo.";
	}
	
	
	
	

}
