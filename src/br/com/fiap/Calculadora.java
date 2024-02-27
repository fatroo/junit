package br.com.fiap;

public class Calculadora {

	
	private double num1;
	private double num2;
	
	
	
	
	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}




	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	//Adição
	public double somar(double num1, double num2) {
		double soma;
		soma = num1 + num2;
		return soma;
	}
	
	//Subtração
	public double  subtrair(double num1, double num2) {
		double subtracao;
		subtracao = num1 - num2;
		return subtracao;
	}
	
	//Multiplicação
	public double multiplicar(double num1, double num2) {
		double multiplicacao;
		multiplicacao = num1 * num2;
		return multiplicacao;
	}
	
	//Divisão
	public float dividir(int num1, int num2) {
		float divisao;
		divisao = (num1 / num2);
		return divisao;
	}
	
}
