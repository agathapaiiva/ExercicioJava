package ExerciciosApostila;

import javax.swing.JOptionPane;

public class Funcoes {

	// calculando a media de um aluno

	public void Media(int nota01, int nota02, int nota03, int media) {
		media = (nota01 + nota02 + nota03) / 3;

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Sua m�dia � " + media + "\n Voc� est� Aprovado");
		}

		if (media <= 3) {
			JOptionPane.showMessageDialog(null, "Sua m�dia � " + media + "\n Voc� est� Reprovado");

		}
	}

	// Calculando a Area de um Triangulo

	public void AreaTriangulo(int base, int altura, int area) {
		area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "A �rea do triangulo �: " + area);

	}

	// calculando o o rendimento da poupan�a

	public void CalculoPoupanca(double deposito, double valorAtual) {
		valorAtual = (deposito * 0.05 + deposito);
		JOptionPane.showMessageDialog(null, "O valor depositado + 5% referente a 30 dias: " + "\n " + valorAtual);

	}

	// Calculo Celsius

	public void Celsius(double celsius, double fah) {
		fah = (9 * celsius + 160) / 5;

		JOptionPane.showMessageDialog(null, "A temperatura convertida �: " + fah);
	}

	// Convertendo Real em Dolar

	public void Dolar(double valorReal, double cotacaoDolar, double convertido) {
		convertido = (valorReal * cotacaoDolar);

		JOptionPane.showMessageDialog(null, "O valor digitado em R$:  " + valorReal + "" + "\n A cota��o do D�lar: "
				+ cotacaoDolar + "\n Valor convertido : " + convertido);

	}

	// Calculando Equa��o
	public void Equacao(int a, int b, int c, double x1, double x2, double delta) {
		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			JOptionPane.showMessageDialog(null, "N�o ter� raiz");
		} else if (delta == 0) {
			JOptionPane.showMessageDialog(null, "Ter� apenas uma raiz");
		} else {
			JOptionPane.showMessageDialog(null, "Ter� duas raizes");

			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;

			JOptionPane.showMessageDialog(null, "As raizes da equa��o �: " + x1 + "" + " \n " + x2);
		}
	}

	// Calculando Kelvin
	public void Kelvin(double kelvin, double celsius) {
		celsius = kelvin - 273;

		JOptionPane.showMessageDialog(null, "A Temperatura digitada foi: " + kelvin + " \n O valor convertido para"
				+ " a temperatura Celsius �: " + celsius);

	}

	// Calculando Paralelepipedo
	public void Paralelepipedo(double comprimento, double larguraP, double altura, double volume) {
		volume = comprimento * larguraP * altura;

		JOptionPane.showMessageDialog(null, "O volume do paralelepido �: " + volume);
	}

	// Calculo Salario
	public void Salario(double salario) {
		JOptionPane.showMessageDialog(null, "O salario ajustado �" + (salario * 1.15));

	}

	// Salario Funcionaro Imposto
	public void SalarioFuncionario(double salarioL, double salarioB, double aux, double aux2) {
		aux = (salarioB * 0.1 + salarioB);

		JOptionPane.showMessageDialog(null, "Salario + 10% = " + aux);

		aux = (salarioB - salarioB * 0.2);

		JOptionPane.showMessageDialog(null, "Salario liquido menos 20% de imposto = " + aux);

	}

	// Troca Valor de Variaveis
	public void TrocaValor(int x, int y, int auxT) {
		auxT = x;
		x = y;
		y = auxT;
		
		JOptionPane.showMessageDialog(null, "O valor de X: " + y + ""
				+ "\n O valor de Y " + x + "\n -------"
						+ "\n Y vale  "
						 + auxT + "\n X vale " + x);
	
	}
	
	// Plano de saude
	
	public void PlanoSaude(int idade){
		if (idade <= 10) {
			JOptionPane.showMessageDialog(null, "O custo do plano de sa�de ser� R$ 30,00 ");

		} else if (idade <= 29) {
			JOptionPane.showMessageDialog(null, "O custo do plano de sa�de ser� R$ 60,00 ");
		} else if (idade <= 45) {
			JOptionPane.showMessageDialog(null, "O custo do plano de sa�de ser� R$ 120,00 ");
		} else if (idade <= 59) {
			JOptionPane.showMessageDialog(null, "O custo do plano de sa�de ser� R$ 150,00 ");
		} else if (idade >= 60) {
			JOptionPane.showMessageDialog(null, "O custo do plano de sa�de ser� R$ 250,00 ");
		}
		
	}
	
	// Idade e Nome
	public void IdadeNome(int idade, String nomeCompleto) {
		if (idade >= 18) { // < menor | > maior
			JOptionPane.showMessageDialog(null, "Seu nome completo �: " + nomeCompleto + " " + "\n Sua idade �: "
					+ idade + " Voc� � maior de idade");
		}
		else if (idade <= 18) {
			JOptionPane.showMessageDialog(null, "Seu nome completo �: " + nomeCompleto + " " + "\n Sua idade �: "
					+ idade + " Voc� � menor de idade");
		} else {
			JOptionPane.showMessageDialog(null, "E tem acima de 65 anos");
		}
	}
}