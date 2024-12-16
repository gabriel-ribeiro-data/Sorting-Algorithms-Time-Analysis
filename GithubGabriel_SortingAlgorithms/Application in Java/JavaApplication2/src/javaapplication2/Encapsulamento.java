/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
/**
 *
 * @author lucas
 * @author Filipe
 *
 */
public class Encapsulamento {
    private int[] vetorSelecion ;
    private int[] vetorBinary ;
    private int[] vetorHeapify ;
    
   //Set's
    
    public void setSelecion(int[] entrada){
    this.vetorSelecion = entrada;
   }
    
    public void setBinary(int[] entrada){
    this.vetorBinary = entrada;
   }
        
    public void setHeapify(int[] entrada){
    this.vetorHeapify = entrada;
   }

   //Get's

   public int[] getSelecion(){
    return this.vetorSelecion;
   }
   
   public int[] getBinary(){
    return this.vetorBinary;
   }
      
   public int[] getHeapify(){
    return this.vetorHeapify;
   }
    
    
}
/*
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class LeitorDeArquivo {
    public static String lerArquivoParaString(String caminhoDoArquivo) throws IOException {
        Path caminho = Paths.get(caminhoDoArquivo);
        return Files.readString(caminho);
    }

    public static void main(String[] args) {
        try {
            String conteudo = lerArquivoParaString("caminho/do/seu/arquivo.txt");
            System.out.println(conteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/