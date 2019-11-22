/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.codigos.services;

import com.example.codigos.domain.Categoria;
import com.example.codigos.repositories.CategoriaRepository;
import com.example.codigos.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego
 * 
 * Serviço que ofereçe consulta das categorias no repositório(aqui vamos instanciar o objeto de fato)
 */



@Service
public class CategoriaService {
    
    @Autowired //em teoria essa anotation exclui a nessecidade de declarar o método na interface 
    private CategoriaRepository repo; // Guardei a requisição em uma variável la da classe CategoriaRepository
    
    public Categoria buscar(Integer id){
        
        Optional<Categoria> obj = repo.findById(id);
        //Fazendo um testizinho nesse obj
        //Criamos uma classe para lidar com a Excessão está no pacote exceptions
        //Não conseguir ainda fazer retornar o 404 not found
        if(obj == null){
            throw new ObjectNotFoundException("Objeto não encontrado ID" + id + "Tipo de Objeto:" + Categoria.class.getName());
        }
        
        
        //return obj;
        //O return tá usando expressão lambda
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! Id: "+id + ", Tipo" + Categoria.class.getName()));
         
    }
}
