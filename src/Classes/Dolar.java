package Classes;

import javax.swing.JOptionPane;

public class Dolar {
	public static void main(String[] args) {
		double valorReal;
		double cotacaoDolar;
		double convertido;
		
		valorReal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor R$: "));
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dolar: "));
		
		convertido =(valorReal*cotacaoDolar);
		
		JOptionPane.showMessageDialog(null, "O valor digitado: " + valorReal + ""
				+ "\n A cotação do Dólar: " 
				+ "\n Valor convertido : " + convertido);
		
	}
}
