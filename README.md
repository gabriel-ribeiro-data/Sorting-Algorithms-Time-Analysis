
# Time Analysis of Sorting Algorithms in Java: SelectionSort, BinaryInsertionSort, and Heapsort.
----

### This repository contains a project with the time analysis of sorting algorithms implemented in Java, created during my undergraduate studies in Computer Science. Please note that the language of the implementation is in the authors' native language (Brazilian Portuguese).
----

## Introduction
  This project consists of developing a software application using the Java programming language, focused on analyzing the performance of sorting algorithms. The main objective is to compare the execution time of three sorting algorithms: SelectionSort, BinaryInsertionSort, and HeapSort. The application processes datasets of varying sizes (1,000, 5,000, and 10,000 numbers) to measure and evaluate the efficiency of each algorithm in sorting tasks.

Additionally, the aim is to provide a clear and practical implementation, enabling users to understand how different sorting algorithms perform under various conditions. This project highlights the importance of algorithm efficiency in computer science and helps users deepen their knowledge of performance analysis and the trade-offs involved in algorithm design.

The sorting algorithms analyzed in this project differ significantly in their approach and time complexity. SelectionSort, a simple comparison-based algorithm, iteratively selects the smallest element and places it in its correct position. BinaryInsertionSort optimizes the insertion process by using binary search to determine the position of each element. HeapSort, on the other hand, leverages the heap data structure to efficiently sort elements. By comparing their performance, this project provides valuable insights into how algorithmic design impacts computational efficiency.

## Necessary preparation before running the program
  Before running the program, go to line 24 of the JavaApplication2 class. Locate the declaration: String pastaArquivo = "INSERT PATH HERE" and replace "INSERT PATH HERE" with the path to the "PastaTxtAPS" folder.

## Big-O notation
  The Big-O notation represents the upper bound of the execution time, indicating the complexity of the worst case, that is, the one containing the largest number of instructions. The order of Big-O terms is given by: O(1) < O(log n) < O(Sqrt(n)) < O(n) < O(n log n) < O(n^2) < O(n^3) < O(2^n). The larger the term, the worse the algorithm's efficiency will be, and the greater the number of instructions, as shown in the graph in Fig. 1.

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 1.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em>Fig. 1. Big-O notation;
      Source: DicionarioTec (2024)</em>
    </td>
  </tr>
</table>

## Big-O notation of the 3 sorting algorithms used
  Fig. 2. contains the Big-O notation for each case of the sorting algorithms, namely: SelectionSort, BinaryInsertionSort, and Heapsort.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 2.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em>Fig. 2. Big-O notation of the cases for each algorithm </em>
    </td>
  </tr>
</table>
<br>

## Comparison of sorting times of the algorithms with 1000 numbers
  As shown in Table 1 and Fig. 3, the BinaryInsertionSort and HeapSort algorithms exhibited equivalent performance, both in terms of speed and smaller time variation. In contrast, the SelectionSort algorithm stood out as the slowest, also showing the highest time variation. Ten attempts were made for each algorithm to ensure accuracy in the results.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 3.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Table 1. Table comparing the algorithms with 1000 numbers. </em>
    </td>
  </tr>
</table>
<br>

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 4.png' width="800">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Fig. 3. Line chart comparing the algorithms sorting 1000 numbers. </em>
    </td>
  </tr>
</table>
<br>

## Comparison of sorting times of the algorithms with 5000 numbers
  According to Table 2 and Fig. 4, the HeapSort algorithm was the fastest and showed the smallest time variation. On the other hand, the SelectionSort and BinaryInsertionSort algorithms had identical average times, both with 7 ms. Ten attempts were made for each algorithm to ensure accuracy in the results.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 5.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Table 2. Table comparing the algorithms with 5000 numbers. </em>
    </td>
  </tr>
</table>
<br>

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 6.png' width="800">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Fig. 4. Line chart comparing the algorithms sorting 5000 numbers. </em>
    </td>
  </tr>
</table>
<br>

## Comparison of sorting times of the algorithms with 10000 numbers
 As observed in Table 3 and Fig. 5, the HeapSort algorithm was significantly faster than the others, also showing the smallest time variation. Next, the BinaryInsertionSort algorithm recorded an average time of 25 ms, while the SelectionSort had the highest average time, with 38 ms. Ten attempts were made for each algorithm to ensure accuracy in the results.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 7.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Table 3. Table comparing the algorithms with 10000 numbers. </em>
    </td>
  </tr>
</table>
<br>

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 8.png' width="800">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Fig. 5. Line chart comparing the algorithms sorting 10000 numbers. </em>
    </td>
  </tr>
</table>
<br>

## Comparison of the average time of all algorithms
 Therefore, the analysis of Table 4 and Fig. 6. allows us to conclude that HeapSort was the fastest algorithm in all scenarios, with the best performance and the smallest time variation. BinaryInsertionSort ranked second, while SelectionSort was the slowest, with a particularly pronounced time difference in inputs of 10,000 elements. Ten attempts were made for each algorithm to ensure accuracy in the results.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 9.png' width="600">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Table 4. Table comparing the average time of all algorithms. </em>
    </td>
  </tr>
</table>
<br>

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 10.png' width="900">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em> Fig. 6. Line chart comparing the average time of all algorithms. </em>
    </td>
  </tr>
</table>
<br>

## Authors

* Gabriel Ribeiro Fernandes
* Filipe Pires Barbosa
* João Pedro Marinho Rego Grippa
* Lorena Costa Minsoni 
* Lucas Henrique dos Santos Oliveira

## References

- [1] AUDDY, Amit. Binary Insertion Sort. GeeksForGeeks, Jan. 31, 2023. Available at: https://www.geeksforgeeks.org/binary-insertion-sort/. Accessed on: Sept. 30, 2024.

- [2] CALAZANS, Luiz. Understanding Heapsort. Medium, Sept. 24, 2023. Available at: https://luizcalazans.medium.com/entendendo-o-heapsort-95ec851dcdbf. Accessed on: Oct. 10, 2024.
  
- [3] CHATTOPADHYAY, Agnishom. et al. Binary Heap. Brilliant, [n.d.]. Available at: https://brilliant.org/wiki/binary-heap/. Accessed on: Oct. 10, 2024.
  
- [4] CHHABRA, Sahil. Recursive Insertion Sort. Sept. 13, 2023. Available at: https://www.geeksforgeeks.org/recursive-insertion-sort/. Accessed on: Sept. 30, 2024.
  
- [5] CORMEN, T. H. et al. Algorithms: Theory and Practice. 3rd ed. Rio de Janeiro: Elsevier, 2009.
 
- [6] DicionarioTec. Big-O Notation. 2020. Available at: https://dicionariotec.com/posts/notacao-do-big-o. Accessed on: Sept. 24, 2024.

- [7] freeCodeCamp. Sorting Algorithms Explained with Examples in JavaScript, Python, Java, and C++. freeCodeCamp, Dec. 4, 2019. Available at: https://www.freecodecamp.org/news/sorting-algorithms-explained-with-examples-in-python-java-and-c/. Accessed on: Sept. 4, 2024.

- [8] GUPTA, Yash. SelectionSort. [n.d.]. Available at: https://www.naukri.com/code360/problems/selection-sort_624469?leftPanelTabValue=PROBLEM. Accessed on: Sept. 24, 2024.

- [9] KNUTH, Donald. The Art of Computer Programming, Volume 3: Sorting and Searching. 3rd ed. Boston: Addison-Wesley, 1997.

- [10] LAMARCA, A.; LADNER, R. E. The Influence of Caches on the Performance of Sorting. Journal of Algorithms, v. 31, n. 1, p. 66-104, 1997.

- [11] LAFORE, Robert. Data Structures & Algorithms in Java. 2nd ed. Indianapolis: Sams Publishing, 2002.

- [12] MATHIAS, Stefano B. B. R. P. Algorithm Complexity – Data Structures LECTURE 11. 2024. 26 slides. Lecture presented in the Computer Science course, Institute of Exact Sciences and Technology, Universidade Paulista, Dutra Campus, São José dos Campos.

- [13] MOORE, Karleigh. et al. Sorting Algorithms. Brilliant, [n.d.]. Available at: https://brilliant.org/wiki/sorting-algorithms/. Accessed on: Sept. 4, 2024.

- [14] PIERRI, Renato. What is the Difference Between Heap and Stack? Jul. 16, 2022. Available at: https://nets-nuts.com.br/qual-e-a-diferenca-entre-heap-e-stack/. Accessed on: Oct. 10, 2024.

- [15] PRESTES, Edson. Algorithm Complexity. [n.d.]. 22 slides. Lecture, Institute of Informatics, Federal University of Rio Grande do Sul. Available at: https://www.inf.ufrgs.br/~prestes/Slides/aula1.pdf. Accessed on: Sept. 23, 2024.

- [16] RUSLAN. Calculating Time Complexity of an Algorithm: What You Should Know. Intersog, Oct. 9, 2020. Available at: https://intersog.com/blog/strategy/algorithm-complexity-estimation-a-bit-of-theory-and-why-it-is-necessary-to-know/. Accessed on: Sept. 24, 2024.

- [17] SEDGEWICK, Robert; WAYNE, Kevin. Algorithms. 4th ed. Boston: Addison-Wesley, 2011.

- [18] SHARMA, Akash. Heap Sort. [n.d.]. Available at: https://www.hackerearth.com/practice/algorithms/sorting/heap-sort/tutorial/. Accessed on: Oct. 10, 2024.

- [19] VIANA, Daniel. Discover the Main Sorting Algorithms. TreinaWeb, Jan. 2017. Available at: https://www.treinaweb.com.br/blog/conheca-os-principais-algoritmos-de-ordenacao. Accessed on: Sept. 4, 2024.
