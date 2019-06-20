/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopamaven.scrapper;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import static org.jsoup.nodes.Document.OutputSettings.Syntax.html;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
    
Verifique as Importações,as libs importantes para o Jsoup são:

org.jsoup
org.jsoup.examples
org.jsoup.helper
org.jsoup.nodes
org.jsoup.parser
org.jsoup.safety
org.jsoup.salect



*/


/**
 *
 * @author Diego
 */
public class Scrapper {
    
    
    public static void main(String[] args) throws IOException {
        
        final Document document = Jsoup.connect("http://www.cnj.jus.br/interceptacoes_tel/relatorio_quantitativos.php").get(); // Padrão de conexão com a URL
        //final Document document = Jsoup.parse(new File("http://www.cnj.jus.br/interceptacoes_tel/relatorio_quantitativos.php"),"utf -8");
        
        
        //Abaixo - retorno todo o código da página 
        
        //System.out.println(document.outerHtml());
        
        System.out.println(document);        
        
        
        //System.out.println(document);
                
                
        //Agora definindo o laço pra retornar o que eu quero
        /*
        String title = document.title();
        String url = document.baseUri();
        System.out.println("Titulo da Página: "+title);
        System.out.println(url);
        */
    
        
        
        
        
        
        /*
        
        
        
     Elements links = document2.select("a[href]");  
for (Element link : links) {  
    System.out.println("\nlink : " + link.attr("href"));  
    System.out.println("text : " + link.text());  
}  
    */
}
    

}//Fim da classe
