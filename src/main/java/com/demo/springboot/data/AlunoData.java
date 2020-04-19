package com.demo.springboot.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.model.Aluno;

@Repository
public interface AlunoData extends JpaRepository<Aluno, Long> {

}
