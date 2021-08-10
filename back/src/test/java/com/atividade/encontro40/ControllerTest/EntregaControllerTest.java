package com.atividade.encontro40.ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.atividade.encontro40.controller.EntregaController;
import com.atividade.encontro40.entity.Entrega;
import com.atividade.encontro40.repository.EntregaRepositorio;

@SpringBootTest
public class EntregaControllerTest {
	
	@Autowired
	private EntregaRepositorio repositorio;
	
	@Autowired
	private EntregaController controller;
	
	@Test
	void testListarEntrega() {
		try {
			long expected;
			expected = repositorio.count();
			
			List<Entrega> lista = controller.listarEntrega();
			long result = (long)lista.size();
			
			System.out.print("Teste de listar entrega: Esperado: " + expected + " obtido: " + result + "\n");
			if(expected == result) {
				System.out.println("Teste Ok");
			} else {
				System.out.println("Fail");
			}
			
			assertThat(expected).isEqualTo(result);
		}
		catch (Exception msg) {
			fail("Erro ao testar o banco de dados: " +msg.getMessage());
		}
	}
	
	@Test
	void testIncluirEntrega() {
		try {
			long expected = repositorio.count()+1;
			
			Entrega nova = new Entrega();
			nova.setCodigo(0);
			nova.setCodigoCliente(3);
			nova.setEndereco("Avenida Mato Grosso, 2020");
		
			
			controller.incluir(nova);
			
			long result = repositorio.count();
			assertThat(expected).isEqualTo(result);
			
			if(expected == result) {
				System.out.println("Teste incluir Entrega validado!");
			} else {
				System.out.println("Teste falhou: esperado " + expected + " resultado " + result);
			}
				
		}
		catch (Exception msg) {
			fail("Erro ao testar incluir entrega: " +msg.getMessage());
		}
	}
	

}
