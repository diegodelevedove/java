/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author Diego
 */
public class ClienteDao {
    
     // Criar as sessões que fazem o CRUD
    //De fato são métodos que quando invocados criam e fecham uma sessão com uma ação específica
   //Para saber mais existem 3 métodos importantes : Transaction,Session,Factory em hibernate
    public void addCliente(Cliente cli){ // Aqui vai o objeto do pojo
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(cli);
            session.getTransaction().commit();
            
        }catch(RuntimeException re){
               if(trans!=null){
                trans.rollback();
                
            
        }      
        re.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
               
    }//Fim do insert
    
    
    
    //Atualizando o cliente
    public void updateCliente(Cliente cli){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(cli);
            session.getTransaction().commit();
            
        }catch(RuntimeException re){
            if(trans!=null){
                trans.rollback();
            }
            re.printStackTrace();
            }finally{
                    session.flush();
                    session.close();
            }
     }//fim do update
    
        
    //Deletando um cliente
    
    public void deleteCliente(Cliente cli){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.delete(cli);
            session.getTransaction().commit();
        }catch(RuntimeException re){
                if(trans != null){
                trans.rollback();
            }
                re.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
    }
       
    //Retornando Todos os Clientes da lista
    public List<Cliente> getAllClientes(){
        
        List<Cliente> clientes = new ArrayList<>();
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            clientes = session.createQuery("from Cliente").list();//Aqui não é o nome da tabela e sim da Classe mapeada(HQL convertido)
            
        }catch(RuntimeException re){
            re.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return clientes;
    }

    //Retornando pelo ID
    public Cliente getClienteByID(int clid){
        Cliente cli = null;
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            String queryId = "from Cliente where idCliente = :id";
            Query query = session.createQuery(queryId);
            query.setInteger("id",clid);
            cli = (Cliente)query.uniqueResult();
       }catch(RuntimeException re){
           re.printStackTrace();
       }finally{
            session.flush();
            session.close();
        }
        return cli;
    }
    
    
        
        
        
        
    
  
    
    
    
    
}//Fim da classe
