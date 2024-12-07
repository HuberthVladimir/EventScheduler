package com.huberthvladimir.EventScheduler.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Atividade() {}

    public Atividade(Integer id, String nome, String descricao, Double price, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.price = price;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
