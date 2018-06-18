package Classes;

import javax.swing.JOptionPane;

public class SalarioFuncionario {
	public static void main(String[] args) {
		
		double salarioL;
		double salarioB;
		double aux;
		double aux2;
		
		salarioB = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário bruto"));
		
		aux = (salarioB * 0.1 + salarioB);
		
		JOptionPane.showMessageDialog(null, "Salario + 10% = " + aux);
		
		aux = (salarioB - salarioB * 0.2);
		
		JOptionPane.showMessageDialog(null, "Salario liquido menos 20% de imposto = " + aux);
	}
}
