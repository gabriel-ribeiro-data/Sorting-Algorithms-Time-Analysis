/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author lucas
 * @author Filipe
 *
 */
public class Funcoes {

    //Função para separar uma string em um vetor
    public String[] textoParaVetor(String numeros){
        String[] vetor = numeros.split(",");
        return vetor;
    
    }
    
    public int[] vetorStringParaInt(String texto){
        String[] partes = textoParaVetor(texto);
        int[] vetorInteiros = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            vetorInteiros[i] = Integer.parseInt(partes[i]);
        }
     
        return vetorInteiros;
    }
    
    public double[] vetorStringParaDouble(String texto){
        String[] partes = textoParaVetor(texto);
        double[] vetorDouble = new double[partes.length];

        for (int i = 0; i < partes.length; i++) {
            vetorDouble[i] = Double.parseDouble(partes[i]);
        }
      
        return vetorDouble;
    }
   
    public boolean testandoExecucao(String texto){
        Scanner scanner = new Scanner(System.in);

        System.out.print(texto);
        String entrada = scanner.nextLine().toUpperCase();

        while(!entrada.equals("N") && !entrada.equals("S")){
            System.out.print("Digite somente 'S' ou 'N': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }
        if(entrada.equals("S"))
            return true;
        else
            return false;

    }

    public String[] escolhendo(String escolhaUm, String escolhaDois, String escolhatres, String pastaArquivo, String[] fileNames){
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        
        while(!entrada.equals(escolhaUm) && !entrada.equals(escolhaDois) && !entrada.equals(escolhatres)){
            System.out.print("Digite somente '1' ou '2' ou '3': ");
            entrada = scanner.nextLine().toUpperCase();
            
        }
        String arquivoListaSort = fileNames[Integer.parseInt(entrada)-1];
        String escolhido[] = {pastaArquivo + arquivoListaSort,entrada};
        return escolhido;

    }

}
