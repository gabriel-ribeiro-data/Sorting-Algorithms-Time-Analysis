/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;


/**
 *
 * @author lucas
 * @author Filipe
 *
 */
public class Sort extends Funcoes{
    
    //Variaveis locais e encapsulamento
    private int[] vetorEntrada;
    private int[] vetorSaida ;
    private double tempoCorrido;
    
    public void setvetorEntrada(int[] entrada){
    this.vetorEntrada = entrada;
   }

   public int[] getvetorEntrada(){
    return this.vetorEntrada;
   }
   
   public void setvetorSaida(int[] saida){
    this.vetorSaida = saida;
   }

   public int[] getvetorSaida(){
    return this.vetorSaida;
   }

   public void setTempoCorrido(double tempo){ 
    this.tempoCorrido = tempo;
   }
   public double getTempoCorrido(){
    return this.tempoCorrido;
   }

   Sort(int[] entrada){
       setvetorEntrada(entrada);
    }
    
    public void organiza1(){
        //SelectionSort
        long tempoInicial = System.currentTimeMillis();
        int[] num = getvetorEntrada();
        int n = num.length;
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            // Troca o elemento mínimo encontrado com o primeiro elemento
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        long tempoFinal = System.currentTimeMillis();
        //System.out.println(tempoInicial);
        //System.out.println(tempoFinal);
        setTempoCorrido(tempoFinal - tempoInicial);
        setvetorSaida(num);
        
    } 

    // Método para ordenar o vetor usando Binary Insertion Sort
    public void organiza2() {
        long tempoInicial = System.currentTimeMillis();
        //BinaryIntertionSort
        int[] num = getvetorEntrada();
        for (int i = 1; i < num.length; i++) {
            int chave = num[i];
            int j = i - 1;

            // Encontra a posição correta para a chave usando busca binária
            int pos = buscaBinaria(num, chave, 0, j);

            // Move todos os elementos para a direita para criar espaço para a chave
            while (j >= pos) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = chave;
        }
        long tempoFinal = System.currentTimeMillis();
        setTempoCorrido(tempoFinal - tempoInicial);
        setvetorSaida(num);
        
    }
    
    // Método para realizar a busca binária
    private int buscaBinaria(int[] num, int item, int baixo, int alto) {
        while (baixo <= alto) {
            int meio = baixo + (alto - baixo) / 2;
            if (item == num[meio]) {
                return meio + 1;
            } else if (item > num[meio]) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return baixo;
    }
        
    public void organiza3() {
        long tempoInicial = System.currentTimeMillis();
        int[] num = getvetorEntrada();
        int n = num.length;
        //HeapSort
        // Constrói o heap (reorganiza o array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(num, n, i);
        }

        // Extrai elementos do heap um por um
        for (int i = n - 1; i >= 0; i--) {
            // Move a raiz atual para o final
            int temp = num[0];
            num[0] = num[i];
            num[i] = temp;

            // Chama heapify no heap reduzido
            heapify(num, i, 0);
        }
        long tempoFinal = System.currentTimeMillis();
        setTempoCorrido(tempoFinal - tempoInicial);
        setvetorSaida(num);
        
    }

    // Para reorganizar um subárvore enraizada no nó i, que é um índice em num[]
    // n é o tamanho do heap
    private void heapify(int num[], int n, int i) {
        int tamanho = i; // Inicializa tamanho como raiz
        int numEsquerdo = 2 * i + 1; // esquerda = 2*i + 1
        int numDireito = 2 * i + 2; // direita = 2*i + 2

        // Se o filho da esquerda é maior que a raiz
        if (numEsquerdo < n && num[numEsquerdo] > num[tamanho]) {
            tamanho = numEsquerdo;
        }

        // Se o filho da direita é maior que tamanho até agora
        if (numDireito < n && num[numDireito] > num[tamanho]) {
            tamanho = numDireito;
        }

        // Se tamanho não é a raiz
        if (tamanho != i) {
            int swap = num[i];
            num[i] = num[tamanho];
            num[tamanho] = swap;

            // Recursivamente heapify a subárvore afetada
            heapify(num, n, tamanho);
        }
    }
    
    
    
}
