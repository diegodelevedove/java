/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.diego.scrapermaven;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * https://www.baeldung.com/java-with-jsoup
 * https://jsoup.org/cookbook/
 * @author Diego
 */


public class Scraper {
 //https://pt.pornhub.com/pornstars?gender=female
    /*
    
    exemplo de strip da url
    https://pt.pornhub.com/pornstar/lana-rhoades = Atriz
    https://pt.pornhub.com/pornstar/lana-rhoades/videos = Home
    https://pt.pornhub.com/pornstar/lana-rhoades/videos?page=2 = Paginada
    
    */
    public static void main(String[] args) throws IOException {
        
        
        
         
         System.out.printf("%s%s%15s\n","Atriz","","Link");
         for(int i = 1;i<=221;i++){
         final Document doc = Jsoup.connect("https://pt.pornhub.com/pornstars?gender=female").get();
         Elements classAtriz = doc.getElementsByClass("js-mxp");
          
            for(Element elements: classAtriz){
            String atrizNome = elements.attr("data-mxptext");
            String urlAtriz =  elements.attr("href");
            System.out.printf("%s%s%s\n",atrizNome,",","https://pt.pornhub.com"+urlAtriz+"/videos");          
            String path = "C:/Users/Diego/Desktop/saidTxt.txt";
            List<String> lines = Arrays.asList("%s%s%s\n",atrizNome,",","https://pt.pornhub.com"+urlAtriz+"/videos");
            Path file = Paths.get(path);
            Files.write(file, lines,StandardCharsets.UTF_8);
            
            }
            
            
            
            
         
         
         }
         
         
       
         
                 
         
         
         
         
         
         
         
         
        
        
                
    }//fim do main

    
    
    
    
}//fim da classe
