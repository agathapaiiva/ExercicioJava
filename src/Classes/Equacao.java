package Classes;

import javax.swing.JOptionPane;

public class Equacao {
	public static void main(String[] args) {
		int a, b, c; 
		double x1, x2; 
		double delta;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
		
		delta = Math.pow(b,2) - 4 * a * c;
		
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "N�o ter� raiz");
		}else if (delta == 0) {
			JOptionPane.showMessageDialog(null, "Ter� apenas uma raiz");
		}else {
			JOptionPane.showMessageDialog(null, "Ter� duas raizes");
			
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;
			
			JOptionPane.showMessageDialog(null, "As raizes da equa��o �: " + x1 + ""
					+ " \n " + x2);
		}
	}
}
