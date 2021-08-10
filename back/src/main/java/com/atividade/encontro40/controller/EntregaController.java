package com.atividade.encontro40.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.encontro40.entity.Entrega;
import com.atividade.encontro40.repository.EntregaRepositorio;

@RestController
@RequestMapping("entregas")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8090", "http://localhost:9876"} )
public class EntregaController {
	
	@Autowired
	private EntregaRepositorio repositorio;
	
	@GetMapping("listar")
	public List<Entrega> listarEntrega(){
		return repositorio.findAll();
	}
	
	@PostMapping("incluir")
	public void incluir(@RequestBody Entrega novaEntrega) {
		repositorio.save(novaEntrega);
		repositorio.flush();
	}
	
}
