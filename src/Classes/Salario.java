package Classes;

import javax.swing.JOptionPane;

public class Salario {
	public static void main(String[] args) {

		double salario = 0;

		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio"));
		
		JOptionPane.showMessageDialog(null, "O salario ajustado �" + (salario * 1.15));
	}
}
