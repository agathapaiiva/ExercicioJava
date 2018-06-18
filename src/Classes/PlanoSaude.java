package Classes;

import javax.swing.JOptionPane;

public class PlanoSaude {
	public static void main(String[] args) {

		int idade;

		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

		if (idade <= 10) {
			JOptionPane.showMessageDialog(null, "O custo do plano de saúde será R$ 30,00 ");

		} else if (idade <= 29) {
			JOptionPane.showMessageDialog(null, "O custo do plano de saúde será R$ 60,00 ");
		} else if (idade <= 45) {
			JOptionPane.showMessageDialog(null, "O custo do plano de saúde será R$ 120,00 ");
		} else if (idade <= 59) {
			JOptionPane.showMessageDialog(null, "O custo do plano de saúde será R$ 150,00 ");
		} else if (idade >= 60) {
			JOptionPane.showMessageDialog(null, "O custo do plano de saúde será R$ 250,00 ");
		}
		
		System.exit(0);

	}
}
