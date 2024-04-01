package view;

import javax.swing.JOptionPane;
import controller.PalindromoController;

public class Main {
	    public static void main(String[] args) throws Exception {
	        
	        PalindromoController pl = new PalindromoController();
	        
	        String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é um palíndromo:");

	        String palavraInvertida = pl.invertePalavra(palavra);

	        boolean resultado = pl.comparaPalavras(palavra, palavraInvertida);

	        if (resultado) {
	            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
	        } else {
	            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
	        }
	    }
	}



