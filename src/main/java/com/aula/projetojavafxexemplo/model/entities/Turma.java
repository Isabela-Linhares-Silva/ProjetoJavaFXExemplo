package com.aula.projetojavafxexemplo.model.entities;

public class Turma {
    private Integer id_turma;
    private String nome;

    public Turma(Integer id_turma, String nome){
        this.id_turma = id_turma;
        this.nome = nome;
    }

    public Integer getId_turma() {
        return id_turma;
    }
    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
