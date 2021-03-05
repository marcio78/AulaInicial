package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		//op.concatenaString();
		//op.concatenaBuffer();
		
		String frase = "Boa tarde e bom final de semana para os alunos do 3o. ADS tarde";
				op.quebraFrase(frase);

	}

}
