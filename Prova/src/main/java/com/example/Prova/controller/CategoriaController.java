package com.example.Prova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Prova.models.Categoria;
import com.example.Prova.service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listar();
    }

    @PostMapping
public Categoria salvar(@RequestBody Categoria categoria) {
    return categoriaService.salvar(categoria);
}

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categoriaService.deletar(id);
    }

    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable Long id) {
        return categoriaService.buscarPorId(id);
    }
}
