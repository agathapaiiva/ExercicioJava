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
			JOptionPane.showMessageDialog(null, "Não terá raiz");
		}else if (delta == 0) {
			JOptionPane.showMessageDialog(null, "Terá apenas uma raiz");
		}else {
			JOptionPane.showMessageDialog(null, "Terá duas raizes");
			
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;
			
			JOptionPane.showMessageDialog(null, "As raizes da equação é: " + x1 + ""
					+ " \n " + x2);
		}
	}
}
