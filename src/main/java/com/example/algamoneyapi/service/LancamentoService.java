package com.example.algamoneyapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.LancamentoRepository;
import com.example.algamoneyapi.repository.PessoaRepository;
import com.example.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Lancamento salvarLancamento(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findByCodigo(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isIantivo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	public Lancamento buscarLacamentoPeloCodigo(Long codigo) {
		Lancamento lancamentoSalvo = lancamentoRepository.findByCodigo(codigo);
		if(lancamentoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return lancamentoSalvo;
	}
	
	public List<Lancamento> listar() {
		return lancamentoRepository.findAll();
	}
}
