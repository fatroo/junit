package br.com.fiap;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int num1,num2;
		String aux;
		int opcao;
		
		Calculadora calculadora = new Calculadora();
		aux = JOptionPane.showInputDialog("Digite o Primeiro Número");
		num1 = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Digite o Segundo Número");
		num2 = Integer.parseInt(aux);
		
		
		aux = JOptionPane.showInputDialog("Escolha: \n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir");
		opcao = Integer.parseInt(aux);
		switch (opcao) {
		case 1:
			System.out.println(calculadora.somar(num1, num2));
			JOptionPane.showMessageDialog(null, calculadora.somar(num1, num2));
			break;
		case 2:
			System.out.println(calculadora.subtrair(num1, num2));
			JOptionPane.showMessageDialog(null, calculadora.subtrair(num1, num2));
			break;
		case 3:
			System.out.println(calculadora.multiplicar(num1, num2));
			JOptionPane.showMessageDialog(null, calculadora.multiplicar(num1, num2));
			break;
		case 4:
			System.out.println(calculadora.dividir(num1, num2));
			JOptionPane.showMessageDialog(null, calculadora.dividir(num1, num2));
			break;
			
		default:
			break;
		}
	}

}
