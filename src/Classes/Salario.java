package Classes;

import javax.swing.JOptionPane;

public class Salario {
	public static void main(String[] args) {

		double salario = 0;

		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
		
		JOptionPane.showMessageDialog(null, "O salario ajustado é" + (salario * 1.15));
	}
}
