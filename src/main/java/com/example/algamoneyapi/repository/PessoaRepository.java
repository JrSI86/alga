package com.example.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.pessoa.PessoaRepositoruQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoruQuery{
	
	Pessoa findByCodigo(Long codigo);
}
