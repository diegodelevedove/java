package LendoPastas;


import java.io.File;
import java.util.Scanner;
public class PastasArquivos {

	
	
	//Criando Método que vai pegar os Arquivos e tratar
	
	public static void getFiles(String path){
		
		
	}
	
	
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		File path = new File("C:/Users/Diego/Desktop/");
		
		if(path.exists()){
			System.out.println("Caminho Absoluto: "+path.getPath());
			System.out.println("Pasta: "+path.getName());
		if(path.isDirectory()){	
			(path.list());
		}
			System.out.println("Arquivos: ");
			String[] dir = path.list();
			for(String dirLista : dir){
			System.out.printf(dirLista+",");	
			}
			
			
		}
		
		
		

	}

}
