/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.io.IOException;
/**
 *
 * @author lucas
 * @author Filipe
 * 
 */

public class JavaApplication2 extends Funcoes{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Funcoes objFuncoes = new Funcoes();


        ArquivoTxt objArquivo = new ArquivoTxt();
        String pastaArquivo = "INSERT PATH HERE";
        //String listaNumeros = new String();
        
        boolean verificaVerdade = objFuncoes.testandoExecucao("Deseja iniciar a aplicação? Digite 'S' ou 'N'\nR: ");
        
        while (verificaVerdade == true) {
            System.out.println("\n\n-----------------------------------------------------------------------------\n");
            try {
                System.out.print("Qual tipo de organização você deseja realizar?\n");
                System.out.print("Digite: 1- SelectionSort\n        2- BinaryIntertionSort\n        3- HeapSort\nR: ");
                String[] vetorSort = {"SelectionSort.txt","BinaryIntertionSort.txt","HeapSort.txt"};
                
                String escolhaSort[] = objFuncoes.escolhendo("1", "2", "3",pastaArquivo, vetorSort);
                //Lendo txt SORT
                String conteudo1 = objArquivo.lendoArquivo(escolhaSort[0]);
                //Transformando o conteudo em um Vetor Double (Float não funciona)
                double[] vetorTempos = objFuncoes.vetorStringParaDouble(conteudo1);

                System.out.println("Qual lista de numeros deseja ordenar?");
                System.out.print("Digite: 1- 1000(tempo medio de '"+String.format("%.1f",vetorTempos[0]/vetorTempos[3])+"ms') 2- 5000(tempo medio '"+String.format("%.1f",vetorTempos[1]/vetorTempos[4])+"ms') 3- 10000(tempo medio '"+String.format("%.1f",vetorTempos[2]/vetorTempos[5])+"ms')\nR:");
                String[] vetorNums = {"1000_numbers.txt","5000_numbers.txt","10000_numbers.txt"};

                String[] escolhaLista = objFuncoes.escolhendo("1", "2", "3",pastaArquivo, vetorNums);
                //Leitura de arquivo texto
                String conteudo = objArquivo.lendoArquivo(escolhaLista[0]);
                //System.out.println(conteudo);
                //listaNumeros = conteudo;
                
                //Funções como conversão de valor, manipulação de dados, estão na classe abaixo
                //Convertendo a string da lista para um vetor int
                int[] vetor = objFuncoes.vetorStringParaInt(conteudo);
                Sort objSort = new Sort(vetor);
                
                //Os 3 tipos de organização
                if(escolhaSort[1].equals("1")){
                    objSort.organiza1(); //SelectionSort
                    System.out.println("O tempo da organização usando o SelectionSort foi de '"+objSort.getTempoCorrido()+"'ms");
                }
                else if(escolhaSort[1].equals("2")){
                    objSort.organiza2(); //BinaryIntertionSort
                    System.out.println("O tempo da organização usando o BinaryIntertionSort foi de '"+objSort.getTempoCorrido()+"'ms");
                }
                else if(escolhaSort[1].equals("3")){
                    objSort.organiza3(); //HeapSort
                    System.out.println("O tempo da organização usando o HeapSort foi de '"+objSort.getTempoCorrido()+"'ms");
                }
                vetor = objSort.getvetorSaida();

                //Print do vetor
                //System.out.println(Arrays.toString(vetor));

                vetorTempos[Integer.parseInt(escolhaLista[1])-1] = vetorTempos[(Integer.parseInt(escolhaLista[1])-1)] + objSort.getTempoCorrido();
                vetorTempos[Integer.parseInt(escolhaLista[1]) +2] = vetorTempos[Integer.parseInt(escolhaLista[1]) +2] + 1;                
                //Escrevendo os 3 tempos registrados, um só está alterado
                objArquivo.escreverVetorEmArquivo(escolhaSort[0], vetorTempos);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            verificaVerdade = objFuncoes.testandoExecucao("\nDeseja continuar na aplicação? Digite 'S' ou 'N'\nR:");
        }
        System.out.println("\n\n-----------------------------------------------------------------------------\n");
        System.out.println("                              FINALIZADO");
        System.out.println("\n-----------------------------------------------------------------------------\n");

        
        
    }
    
}
