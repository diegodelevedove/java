/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.BorderLayout;

/**
 *
 * @author Diego
 */
public class App {
    
    //Adcionando cliente
    
    public static void main(String args[]){
        
        ClienteDao clidao = new ClienteDao();
        //Adcionar um cliente
        Cliente cli = new Cliente();
        /*
        cli.setNome("Juliana");
        cli.setTelefone(981117585);
        clidao.addCliente(cli); //execução da Dao depois de sertar o método com os novos dados
        System.out.println("Salvo Com Sucesso");
        */
        
        //updatecliente
        /*cli.setIdCliente(1);
        cli.setNome("Diego Delevedove");
        cli.setTelefone(99499578);
        clidao.updateCliente(cli);
        System.out.println("Atualizado Com Sucesso");
        */
        
        //deletando Cliente
        //clidao.deleteCliente(3);
        
        
        //Retornando todos os clientes
        //System.out.println(clidao.getAllClientes());
        
        
        
        //Retornando pela ID
        //System.out.println(clidao.getClienteByID(1));
        
        
        
        
        
        
        
    }//Fim do main
    
    
}//Fim da classe
