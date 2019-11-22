/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.codigos.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.codigos.domain.Cliente;
import com.example.codigos.services.ClienteService;
import java.util.ArrayList;// Esses imports se devem a mudanças que fizemos
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author Diego
 * Lembre do nome da classe de dominio e de onde esta
 * Aqui está o rest ou a classe endpoint
 * 
 */

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
    
    @Autowired
    private ClienteService service;
    
    
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET ) // Acesse localhost:8081/categorias 
    // 1 - versão public List<Categoria> find(@PathVariable Integer id){ //Precido apontar qual o id ele vai pegar com a anotation
    // mudadmos para responseEntity (ja encapsula uma resposta http melhor que a lista)encontra entity com esse id
    public ResponseEntity<?> find(@PathVariable Integer id){
        
        //Vamos incluir um try catch aqui pois definimos uma implementação de excessão
        
      
        
       //Optional<Categoria> obj = service.buscar(id); // Busquei essa categoria lá no service que tem o id que queremos
       Cliente obj = service.buscar(id); // Busquei essa categoria lá no service que tem o id que queremos
            
       
       
       
       return ResponseEntity.ok().body(obj);
       
        
                
                
        /*
        O método anterior retornava uma string
        public String listar(){
        return "Rest Funcionando"
        quando criamos uma lista, o tipo de retorno também é convertido pra lista e 
        portanto o método é uma lista do tipo Array<list>
        
        }
        
        */
        
        /*
        Categoria cat1 = new Categoria(1,"Informática");
        Categoria cat2 = new Categoria(2,"Escritório");
        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        */
        
        
        
        
    }
    
    
    
    
}//fim da classe
