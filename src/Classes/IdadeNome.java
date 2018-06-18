package Classes;

import javax.swing.JOptionPane;

public class IdadeNome {
	public static void main(String[] args) {

		// Mostrando idade e nome do usuário

		String nomeCompleto;
		int idade;

		nomeCompleto = JOptionPane.showInputDialog("Informe o seu nome completo");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

		if (idade >= 18) { // < menor | > maior
			JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nomeCompleto + " " + "\n Sua idade é: "
					+ idade + " Você é maior de idade");
		}
		if (idade <= 18) {
			JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nomeCompleto + " " + "\n Sua idade é: "
					+ idade + " Você é menor de idade");
		} else {
			JOptionPane.showMessageDialog(null, "E tem acima de 65 anos");
		}

	}
	
}
