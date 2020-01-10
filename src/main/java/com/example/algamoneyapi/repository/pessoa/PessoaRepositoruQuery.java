package com.example.algamoneyapi.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.filter.PessoaFilter;

public interface PessoaRepositoruQuery {
	
	public Page<Pessoa> filtrar(PessoaFilter lancamentoFilter, Pageable pageable);

}
