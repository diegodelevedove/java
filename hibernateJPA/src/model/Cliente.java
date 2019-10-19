package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // Essa anotation é da classe então tem que ficar aqui por padrão
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Para redefinir o nome da coluna na tabela use se for o caso
	//@Column(nome = "NomeCompleto") 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int telefone;
		
	
	public Cliente(){
	}
	
		
	public Cliente(Integer id,String nome,int telefone){
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

	public int getTelefone() {
		return telefone;
	}

	
		
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefone="
				+ telefone + "]";
	}
	
	
	
	
}//fim da classe
