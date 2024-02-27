package br.com.fiap;

public class Elevador {

	private int id;
	private double cargaMaxima = 200;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	//construtores
	public Elevador() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Elevador(int id, double cargaMaxima, double cargaAtual, boolean sinalAlerta) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.cargaAtual = cargaAtual;
		this.sinalAlerta = sinalAlerta;
	}


	Calculadora calc = new Calculadora();

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getCargaMaxima() {
		return cargaMaxima;
	}


	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	public double getCargaAtual() {
		return cargaAtual;
	}


	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}


	public boolean isSinalAlerta() {
		return sinalAlerta;
	}


	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	
	//metodos
	public double entrarNoElevador(double peso) {
		cargaAtual = calc.somar(cargaAtual, peso);
		setCargaAtual(cargaAtual);
		return cargaAtual;
	}
	
	public double sairDoElevador(double peso) {
		cargaAtual = calc.subtrair(cargaAtual, peso);
		setCargaAtual(cargaAtual);
		return cargaAtual;
	}
	
	public boolean avaliarPeso(double peso) {
		cargaAtual = peso;
		if(cargaAtual > cargaMaxima) {
		return true;
		}else {
			return false;
		}
	}
	
	
	
}
