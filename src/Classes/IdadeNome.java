package Classes;

import javax.swing.JOptionPane;

public class IdadeNome {
	public static void main(String[] args) {

		// Mostrando idade e nome do usu�rio

		String nomeCompleto;
		int idade;

		nomeCompleto = JOptionPane.showInputDialog("Informe o seu nome completo");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

		if (idade >= 18) { // < menor | > maior
			JOptionPane.showMessageDialog(null, "Seu nome completo �: " + nomeCompleto + " " + "\n Sua idade �: "
					+ idade + " Voc� � maior de idade");
		}
		if (idade <= 18) {
			JOptionPane.showMessageDialog(null, "Seu nome completo �: " + nomeCompleto + " " + "\n Sua idade �: "
					+ idade + " Voc� � menor de idade");
		} else {
			JOptionPane.showMessageDialog(null, "E tem acima de 65 anos");
		}

	}
	
}
