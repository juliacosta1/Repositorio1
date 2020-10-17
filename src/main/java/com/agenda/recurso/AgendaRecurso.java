package com.agenda.recurso;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.AgendaC;
import com.agenda.repositorio.AgendaRepositorio;

@RestController
@RequestMapping("agenda")
public class AgendaRecurso {

		@Autowired
		private AgendaRepositorio repositorio;
		
		@PostMapping("/inserir")
		public String Salvar(@RequestBody AgendaC agenda) {
			repositorio.save(agenda);
			return "Salvo com sucesso!";
		}
		
		@GetMapping("/lista")
		public List<AgendaC> SelecionarTodos() {
			return repositorio.findAll();
		}
		

}
