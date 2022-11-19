package com.algaworks.algalog.domain.model;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private Long id;
	private String nome;
	private String email;
	private String Telefone;
	
}
