/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatemavenjpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Diego
 */


@Entity
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1l;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gerando o id automático e portano o objeto deve ser null
    private Integer id;
    private String nome;
    private String telefone;

    public Pessoa(){ // sem construtor vazio quando eu for buscar o objeto não vou conseguir por ele por ele
        
    }
    
    public Pessoa(Integer id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
}
