package View;

import javax.swing.JOptionPane;

public class PrincipalMain {
	public static void main(String[] args) {
		
		Controler controle = new Controler();
		
		
// declaração de variaveis
		int opcoes = 0;
		int varAux = 0;
		int valor01 = 0;
		int valor02 = 0;

		do {

			opcoes = Integer.parseInt(JOptionPane.showInputDialog(
					"Exemplos Práticos de Java" + "\n Exercicio 1:" + "\n Exercicio 2:" + "\n Exercicio 3:"
							+ "\n Exercicio 4:" + "\n Exercicio 5:" + "\n Exercicio 6:" + "\n Exercicio 7:"
									+ "\n 8: FIM" ));

			switch (opcoes) {
			case 1:
				valor01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
				valor02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
				
				controle.MaiorValor(valor01, valor02, varAux); // chamando a função criada na classe controle
				break;

			case 2:
				valor01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
				controle.NumDesc(valor01, varAux);
				break;

			case 3:
				controle.parImpar();
				break;

			case 4:
				valor01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
				valor02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
				controle.trocaValor(valor01, valor02);
				break;

			case 5:
				valor01 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
				valor02 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
				controle.NumCompara(valor01, valor02);
				break;

			case 6:
				controle.adicionarNotas(varAux);
				break;

			case 7:
				System.out.println("Exercicio 7");
				break;
				
			case 8:
				System.exit(opcoes);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida!");

			}
		} while (opcoes != 7);
	}
}
