package Classes;

import javax.swing.JOptionPane;

public class Paralelepipedo {
	public static void main(String[] args) {
		double comprimento; 
		double larguraP;
		double altura;
		double volume;
		
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento"));
		larguraP = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
		volume = comprimento * larguraP * altura;
		
		JOptionPane.showMessageDialog(null, "O volume do paralelepido é: " + volume);
	}
}
