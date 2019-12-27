package com.example.algamoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		//faz uma copia de pessoa vinda pelo requestBody para pessoa salva, evitando ter que setar cada atributo
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		pessoaRepository.save(pessoaSalva);
		return pessoaSalva;
	}

	public void atualizarAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}

	private Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findByCodigo(codigo);
		if(pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
}
