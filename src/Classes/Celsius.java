package Classes;

import javax.swing.JOptionPane;

public class Celsius {
	public static void main(String[] args) {
		double celsius;
		double fah;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
		
		fah = (9*celsius + 160) / 5;
	
		JOptionPane.showMessageDialog(null, "A temperatura convertida é: " + fah);
	}
}
