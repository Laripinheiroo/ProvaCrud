package com.example.Prova.controller;


import com.example.Prova.models.Produto;
import com.example.Prova.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }
    
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @GetMapping("/{id}")
    public com.example.Prova.models.Produto buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}