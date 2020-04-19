package com.demo.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.springboot.model.Aluno;
import com.demo.springboot.service.AlunoService;


@RestController
@Scope("request")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Aluno> salvar(@Valid Aluno aluno) {
		this.alunoService.salvar(aluno);
		return ResponseEntity.ok(aluno);
	}	

	@PutMapping("/atualizar")
	public ResponseEntity<Aluno> atualizar(@Valid Aluno aluno) {		
		this.alunoService.atualizar(aluno);
		return ResponseEntity.ok(aluno);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity excluir(@PathVariable("id") Long id) {				
		this.alunoService.excluir(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/listar")
	public ResponseEntity<List<Aluno>> listar() {		
		List<Aluno> alunos = this.alunoService.listar();
		return ResponseEntity.ok(alunos);
	}

	@GetMapping("/buscar/{id}")
	public ResponseEntity<Aluno> buscar(@PathVariable("id") Long id) {
		Aluno aluno = this.alunoService.buscar(id);
		return ResponseEntity.ok(aluno);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
