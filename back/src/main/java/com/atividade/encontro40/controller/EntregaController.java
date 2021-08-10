package com.atividade.encontro40.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.encontro40.entity.Entrega;
import com.atividade.encontro40.repository.EntregaRepositorio;

@RestController
@RequestMapping("entregas")
public class EntregaController {
	
	@Autowired
	private EntregaRepositorio repositorio;
	
	@GetMapping("listar")
	public List<Entrega> listarEntrega(){
		return repositorio.findAll();
	}
	
	@GetMapping("incluir")
	public void incluir(@RequestBody Entrega novaEntrega) {
		repositorio.save(novaEntrega);
		repositorio.flush();
	}
	
}
