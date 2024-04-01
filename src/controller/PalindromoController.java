package controller;
import br.org.Kay_Almeida.pilhastring.*;

public class PalindromoController {
	
	    public String invertePalavra(String palavra) throws Exception {
	       Pilha pilha = new Pilha();
	        
	        for (int i = 0; i < palavra.length(); i++) {
	            pilha.push(Character.toString(palavra.charAt(i)));
	        }

	        StringBuffer palavraInvertida = new StringBuffer();
	        while (!pilha.isEmpty()) {
	            palavraInvertida.append(pilha.pop());
	        }
	        
	        return palavraInvertida.toString();
	    }

	    public boolean comparaPalavras(String palavraOriginal, String palavraInvertida) {
	        return palavraOriginal.equals(palavraInvertida);
	    }
	}



