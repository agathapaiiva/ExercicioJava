package Classes;

import javax.swing.JOptionPane;

public class Kelvin {
	public static void main(String[] args) {
		
		double kelvin;
		double celsius;
		
		kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Kelvin"));
		
		celsius = kelvin - 273;
		
		JOptionPane.showMessageDialog(null, "A Temperatura digitada foi: " + kelvin + " \n O valor convertido para"
				+ " a temperatura Celsius é: "+ celsius );
	
	}
}
