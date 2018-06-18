package Classes;

import javax.swing.JOptionPane;

public class TrocaValor {
	public static void main(String[] args) {
		int x; 
		int y;
		int auxT;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor X  "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor Y "));

		auxT = x;
		x = y;
		y = auxT;
		
		JOptionPane.showMessageDialog(null, "O valor de X: " + y + ""
				+ "\n O valor de Y " + x + "\n -------"
						+ "\n Y vale  "
						 + auxT + "\n X vale " + x);
		
	}
}
