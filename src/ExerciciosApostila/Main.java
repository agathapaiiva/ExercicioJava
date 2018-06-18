package ExerciciosApostila;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		Funcoes funcoes = new Funcoes();

		// declaração de variaveis
		int menu, varAux, valor01, valor02, media = 0;
		int base, altura, area = 0;
		int a , b, c, x, y, auxT = 0;
		int idade;
		double deposito, valorAtual = 0; 
		double kelvin, fah = 0;
		double celsius = 0;
		double valorReal, cotacaoDolar, convertido = 0;
		double x1 = 0;
		double x2 = 0; 
		double delta = 0;
		double alturaP, largura, comprimento, salario;
		double salarioB, aux = 0;
		double salarioL =0;
		double aux2 =0;
		String nomeCompleto;

		do {

			menu = Integer.parseInt(JOptionPane.showInputDialog("Exemplos Práticos da Apostila Java" + "\n Exercicio 1:"
					+ "\n Exercicio 2:" + "\n Exercicio 3:" + "\n Exercicio 4:" + "\n Exercicio 5:" + "\n Exercicio 6:"
					+ "\n Exercicio 7:" + "\n Exercicio 8:" + "\n Exercicio 9:" + "\n Exercicio 10:" + "\n Exercicio 11:"
							+ "\n Exercicio 12: " + "\n Exercicio 13: " + " \n 14 - FIM"));

			switch (menu) {
			case 1:
				int nota01 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira Nota:"));
				int nota02 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda Nota:"));
				int nota03 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira Nota:"));

				funcoes.Media(nota01, nota02, nota03, media);

				break;

			case 2:

				base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));

				funcoes.AreaTriangulo(base, altura, area);

				break;

			case 3:
				deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito"));
				
				funcoes.CalculoPoupanca(deposito, valorAtual);
				break;

			case 4:
				celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
				
				funcoes.Celsius(celsius, fah);
				break;

			case 5:
				valorReal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor R$: "));
				cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dolar: "));
				
				funcoes.Dolar(valorReal, cotacaoDolar, convertido);

				break;

			case 6: 
				
				a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
				b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
				c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
				
				funcoes.Equacao(a, b, c, x1, x2, delta);
				
				break;

			case 7:
				kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Kelvin"));
				
				funcoes.Kelvin(kelvin, celsius);

				break;

			case 8: 
				comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento"));
				largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura"));
				alturaP = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
				

				break;

			case 9:
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
				
				funcoes.Salario(salario);

				break;

			case 10:
				salarioB = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário bruto"));
				
				funcoes.SalarioFuncionario(salarioL, salarioB, aux, aux2);

				break;
				
			case 11:
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor X  "));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor Y "));
				
				funcoes.TrocaValor(x, y, auxT);
				
				break;
				
			case 12:
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				funcoes.PlanoSaude(idade);
				
				break;
			
			case 13: 
				nomeCompleto = JOptionPane.showInputDialog("Informe o seu nome completo");
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
				funcoes.IdadeNome(idade, nomeCompleto);
				
				break;
				
			default:
				System.exit(0);

			}
		} while (menu != 14);
		
		
	}
}
