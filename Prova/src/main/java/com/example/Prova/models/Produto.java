package com.example.Prova.models;

import jakarta.persistence.*;
import lombok.*;




@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    
    private Categoria categoria;
}