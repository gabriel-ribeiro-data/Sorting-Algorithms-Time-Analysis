
# Time Analysis of Sorting Algorithms in Java: SelectionSort, BinaryInsertionSort, and Heapsort.
----

### This repository contains a project with the time analysis of sorting algorithms implemented in Java, created during my undergraduate studies in Computer Science. Please note that the language of the implementation is in the authors' native language (Brazilian Portuguese).
----

## Introduction
  This project consists of developing a software application using the Java programming language, focused on analyzing the performance of sorting algorithms. The main objective is to compare the execution time of three sorting algorithms: SelectionSort, BinaryInsertionSort, and HeapSort. The application processes datasets of varying sizes (1,000, 5,000, and 10,000 numbers) to measure and evaluate the efficiency of each algorithm in sorting tasks.

Additionally, the aim is to provide a clear and practical implementation, enabling users to understand how different sorting algorithms perform under various conditions. This project highlights the importance of algorithm efficiency in computer science and helps users deepen their knowledge of performance analysis and the trade-offs involved in algorithm design.

The sorting algorithms analyzed in this project differ significantly in their approach and time complexity. SelectionSort, a simple comparison-based algorithm, iteratively selects the smallest element and places it in its correct position. BinaryInsertionSort optimizes the insertion process by using binary search to determine the position of each element. HeapSort, on the other hand, leverages the heap data structure to efficiently sort elements. By comparing their performance, this project provides valuable insights into how algorithmic design impacts computational efficiency.

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
      <em>Fig. 1. Big O notation;
      Source: DicionarioTec (2024)</em>
    </td>
  </tr>
</table>

## Vulnerabilities and Weaknesses
  One of the main weaknesses of the Vigenère cipher arises from the fact that it does not conceal the letter frequencies in the original text. If an attacker knows or suspects that the Vigenère cipher is being used and can determine the length of the key, they can perform frequency analysis on groups of encrypted letters to identify patterns, which will reveal information about the key.

  Furthermore, there is another significant issue with the Vigenère cipher concerning the size of the key. If the key is too short relative to the length of the original text, the cipher becomes more vulnerable to brute force attacks, as there are fewer possible variations of the key to be tested.

## Running Application
  After opening the program, the user is presented with two options and must choose one of them, with the first option being “1 - Encrypt” and the second option “2 - Decrypt.” The user needs to enter “1” or “2” respectively to indicate the desired operation. If the user makes an invalid entry, the message “Please enter only '1' or '2':” will appear, repeating the two options above until a valid entry is made. Fig. 2 below illustrates the described situation.
  
<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 2.png' width="300">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em>Fig. 2. User's choice between encrypting and decrypting </em>
    </td>
  </tr>
</table>
<br>

  Fig. 3 shows the complete operation of the application running, including input prompts and the output results generated during the encryption and decryption processes. This illustration provides a clear overview of how the application functions in real-time, demonstrating its capabilities and user interaction through console inputs and outputs.

<table align="center">
  <tr>
    <td align="center">
      <img src='/Images/Image 3.png' width="500">
    </td>
  </tr>
  <tr>
    <td align="center">
      <em>Fig. 3. Example of the Application Running </em>
    </td>
  </tr>
</table>

## Authors

* Gabriel Ribeiro Fernandes
* Filipe Pires Barbosa
* João Pedro Marinho Rego Grippa
* Lorena Costa Minsoni 
* Lucas Henrique dos Santos Oliveira

## References

- [1] BORGES, Izabella B. F. Types of Cryptography: How They Work and Their Importance. Clicksign, Barueri, Apr. 17, 2023. Available at: clicksign.com.br. Accessed on: Oct. 8, 2023.

- [2] Caesar Cipher. Wikipedia, 2023. Available at: wikipedia.org. Accessed on: Sept. 26, 2023.

- [3] Vigenère Cipher. Wikipedia, 2023. Available at: wikipedia.org. Accessed on: Sept. 26, 2023.

- [4] Confederate Cipher Disc. Crypto Museum, 2023. Available at: cryptomuseum.com. Accessed on: Oct. 11, 2023.

- [5] Discover What Are the Types of Cryptography. DocuSign, Sept. 30, 2022. Available at: docusign.com.br. Accessed on: Oct. 7, 2023.

- [6] DONDA, Daniel. The Mathematics of the Vigenère Cipher. Daniel Donda, Aug. 31, 2010. Available at: danieldonda.com. Accessed on: Oct. 8, 2023.

- [7] DOS REIS, Fábio. Cryptography – Vigenère Cipher. Bóson Treinamentos, Sept. 6, 2016. Available at: bosontreinamentos.com.br. Accessed on: Oct. 8, 2023.

- [8] FIELDS, Brandon T. Figure 1. Vigenère Table. 2011. Digital image. Available at: wikipedia.org. Accessed on: Oct. 26, 2023.

- [9] JAMAL, Taha. The Vigenère Cipher: A Story of Cryptography and Intrigue. Museum, Jan. 25, 2023. Available at: medium.com. Accessed on: Oct. 11, 2023.

- [10] KHANDURI, Ayush. Vigenère Cipher. Geeks for Geeks, May 29, 2023. Available at: geeksforgeeks.org. Accessed on: Sept. 26, 2023.

- [11] What is Data Encryption? Definition and Explanation. Kaspersky, 2023. Available at: kaspersky.com.br. Accessed on: Oct. 7, 2023.

- [12] What is Cryptography? AWS Amazon, 2023. Available at: aws.amazon.com. Accessed on: Oct. 7, 2023.

- [13] ROBOT, Marvin T. How a 17th Century Cipher Becomes an Unbreakable Cryptography? Kaspersky, Sept. 21, 2015. Available at: kaspersky.com.br. Accessed on: Sept. 26, 2023.

- [14] SILVA, Bárbara L. Cryptography and Codes: See the Main Ways to Hide Information Used Throughout History. QueroBolsa, Aug. 24, 2023. Available at: querobolsa.com.br. Accessed on: Sept. 26, 2023.

- [15] SIMMONS, Gustavus J. Vigenère Cipher. Britannica, 2023. Available at: britannica.com. Accessed on: Sept. 26, 2023.

- [16] Vigenère Cipher. Wikipedia, 2023. Available at: wikipedia.org. Accessed on: Oct. 11, 2023.
