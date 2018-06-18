package Classes;

import javax.swing.JOptionPane;

public class Idade {
	public static void main(String[] args) {

		int idade1, idade2, idade3 = 0;
		String nome1, nome2, nome3 = null;

		// Calculando a idade e comparando

		idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		nome1 = JOptionPane.showInputDialog("Digite o seu nome");

		
		idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		nome2 = JOptionPane.showInputDialog("Digite o seu nome");

		idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		nome3 = JOptionPane.showInputDialog("Digite o seu nome");



		if(idade1 <= idade2) { // menor
			JOptionPane.showMessageDialog(null, nome2 + " é mais velho (a) e sua idade é:  " + idade2 + " anos");

		}else if (idade1 >= idade3){ // maior
			JOptionPane.showMessageDialog(null, nome3 + " é mais velho (a) e sua idade é:  " + idade3 + " anos");

		}else if(idade2 <= idade1){
			JOptionPane.showMessageDialog(null, nome1 + " é mais velho (a) e sua idade é:  " + idade1 + " anos");
		
		}else if(idade2 >= idade3){
			JOptionPane.showMessageDialog(null, nome3 + " é mais velho (a) e sua idade é:  " + idade3 + " anos");
		
		}else if(idade3 <= idade1) {
			JOptionPane.showMessageDialog(null, nome1 + " é mais velho (a) e sua idade é:  " + idade1 + " anos");
		}else {
			JOptionPane.showMessageDialog(null, nome2 + " é mais velho (a) e sua idade é:  " + idade2 + " anos");
		}

	}
}
