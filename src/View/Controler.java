package View;

import javax.swing.JOptionPane;

public class Controler {

	public void MaiorValor(int valor01, int valor02, int varAux) { // criando uma funcao

		if (valor01 > valor02) {
			varAux = valor01;
		} else {
			varAux = valor02;
		}

		// varAux = Math.max(valor01, valor02)

		JOptionPane.showMessageDialog(null, "O primeiro valor digitado é " + valor01 + "\n O segundo valor digitado é "
				+ valor02 + "\n O maior valor digitado " + varAux);
	}

	public void NumDesc(int valor01, int varAux) {
		varAux = 0;

		while (valor01 >= varAux) { // <menor | > maior
			System.out.print(valor01 + "-");
			valor01--;
		}

	}

	public void parImpar() {
		int somaPar = 0;
		int multiplicaImpar = 1;

		for (int i = 0; i <= 5; i++) { // enquanto I for <menor que 5 I++
			if (i % 2 == 0) { // se I dividido por 2 for igual a zero
				somaPar += i;
			} else {
				multiplicaImpar = multiplicaImpar * i;
			}
		}
		JOptionPane.showMessageDialog(null,
				"A somatoria par de 0 a 5 " + somaPar + "" + "\n A multiplicacao Impar é " + multiplicaImpar);
	}

	public void trocaValor(int valor01, int valor02) {
		int varAux = 0;

		varAux = valor01;

		valor01 = valor02;
		valor02 = varAux;

		JOptionPane.showMessageDialog(null,
				"O primeiro valor digitado é " + varAux + "" + "\n O segundo valor digitado é: " + valor01 + ""
						+ "\n INVERTENDO" + "\n O primeiro valor agora é " + valor01 + ""
						+ "\n O segundo valor agora é " + valor02);

	}

	public void NumCompara(int valor01, int valor02) {

		System.out.println("O primeiro valor digitado: " + valor01 + "\n O segundo valor digitado: " + valor02);

		if (valor01 == valor02) {
			System.out.println("São iguais");
		} else {
			System.out.println("\n São diferentes");
		}

		if (valor01 > valor02) { // <menor | >maior
			System.out.println("O valor " + valor01 + " é maior \n E o valor " + valor02 + " é menor");

		} else {
			System.out.println("O valor " + valor02 + " é maior o valor " + valor01 + " é menor ");

		}

	}

	public void adicionarNotas(int varAux) {

		int somaNota = 0;
		int x = 0;

		int[] vetNotas = new int[3]; // criando um vetor

		for (int i = 0; i < vetNotas.length; i++) { // length para verificar o tamanho do vetor
			varAux = Integer.parseInt(JOptionPane.showInputDialog(" Digite a nota do aluno "));

			if (varAux >= 0 && varAux <= 100) {
				vetNotas[i] = varAux;
				somaNota += vetNotas[i];
			}
			x++;

		}

		JOptionPane.showMessageDialog(null, "A média do aluno é " + (somaNota / x));

	}

}
