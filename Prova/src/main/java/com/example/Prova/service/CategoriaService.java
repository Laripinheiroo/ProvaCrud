package com.example.Prova.service;

import com.example.Prova.models.Categoria;
import com.example.Prova.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Categoria buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}