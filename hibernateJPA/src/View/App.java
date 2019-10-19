package View;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;


public class App {

		
	public static void main(String[] args) {
		
		
		Cliente cli1 = new Cliente(null,"Fulano",99499578);//Coloquei null porque o banco vai atribuir o id 
		Cliente cli2 = new Cliente(null,"Beltrano",981118899);
		Cliente cli3 = new Cliente(null,"Cicrano",981118565);
		
		/*Testando
		System.out.println(cli1);
		System.out.println(cli2);
		System.out.println(cli3);
		*/		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Fazendo um insert
		em.getTransaction().begin();
		em.persist(cli1);
		em.persist(cli2);
		em.persist(cli3);
		em.getTransaction().commit();
		
		
		/*Retornando um objeto do banco
		Cliente cli = em.find(Cliente.class,2); //Objeto e id
		System.out.println(cli);
		*/
		
		/*
		O jpa só consegue remover uma instancia que já está monitorada
		ou seja,primeiro precisamos retornar o objeto para que ele seja em seguida removido
		Sempre começe um begin e termine com commit ou as operações não serão realizadas
		em.getTransaction().begin();
		Cliente cli = em.find(Cliente.class,2); //Retornando aqui
		em.remove(cli); // Removendo ou deletando do db
		System.out.println("Removido");
		em.getTransaction().commit(); //Commitando a deleção
		*/
		
		em.close();
		emf.close();
		

	}

}
