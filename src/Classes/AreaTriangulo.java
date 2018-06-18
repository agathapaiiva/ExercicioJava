package Classes;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {
		int base = 0;
		int altura = 0;
		int area = 0;

		// calculando o valor de um triangulo

		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));

		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));

		area = (base * altura) / 2;

		JOptionPane.showMessageDialog(null, "A área do triangulo é: " + area);

		System.exit(0);
	}

}
