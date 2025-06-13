package com.app_limp.api_applimp.controller;

import com.app_limp.api_applimp.model.Orcamento;
import com.app_limp.api_applimp.service.OrcamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentoController {
    private final OrcamentoService service;

    public OrcamentoController(OrcamentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Orcamento> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Orcamento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PostMapping
    public Orcamento salvar(@RequestBody Orcamento orcamento) {
        return service.salvar(orcamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
