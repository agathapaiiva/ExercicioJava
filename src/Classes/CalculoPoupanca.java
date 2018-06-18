package Classes;

import javax.swing.JOptionPane;

public class CalculoPoupanca {
	public static void main(String[] args) {
		
		double deposito;
		double valorAtual;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito"));
		
		valorAtual = (deposito * 0.05 + deposito);
		
		JOptionPane.showMessageDialog(null, "O valor depositado + 5% referente a 30 dias: "
				+ "\n " + valorAtual);
	}
}
