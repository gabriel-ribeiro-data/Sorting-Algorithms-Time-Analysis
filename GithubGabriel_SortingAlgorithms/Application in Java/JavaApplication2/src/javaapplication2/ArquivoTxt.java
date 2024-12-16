/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author lucas
 * @author Filipe
 *
 */

public class ArquivoTxt{
    
    public String lendoArquivo(String caminho) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = br.readLine()) != null) {
            conteudo.append(linha).append(",");
                
         }
        return conteudo.toString(); 
        
    }

    
    public static void escreverVetorEmArquivo(String nomeArquivo, double[] vetor) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (double valor : vetor) {
                writer.write(String.valueOf(valor));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
