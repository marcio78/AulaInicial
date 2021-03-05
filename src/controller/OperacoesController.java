package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}

	public void concatenaString() {
		String palavra = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0 ; i < 32768 ; i++ ) {
			palavra = palavra + "x";
			
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("String =>"+tempoTotal+ "s.");
	
	}
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i = 0 ; i < 32768 ; i++) {
			buffer.append("x");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,9);
		System.out.println("Buffer =>"+tempoTotal+ "s.");
	}
	
	public void quebraFrase(String frase) {
		String[] vetorPalavras = frase.split(" ");
		//for(int i = 0 ; i < vetorPalavras.length ; i++) {
			//System.out.println(vetorPalavras[i]);
			
		//}
		//Foreach
		//for (Tipo variavel : vetor)
		for(String palavra : vetorPalavras) {
			System.out.println(palavra);
		}
		
	}
}
