package com.app_limp.api_applimp.service;

import com.app_limp.api_applimp.model.Orcamento;
import com.app_limp.api_applimp.repository.OrcamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {
    private final OrcamentoRepository repository;

    public OrcamentoService(OrcamentoRepository repository) {
        this.repository = repository;
    }

    public List<Orcamento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Orcamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Orcamento salvar(Orcamento orcamento) {
        return repository.save(orcamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
