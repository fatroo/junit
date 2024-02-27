package PacoteTeste;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.fiap.Calculadora;

public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	@Before
	public void setUp() throws Exception {
		System.out.println("Bem-Vindo à calculadora");
	}

	@Test
	public void test2com5() {
		
		assertEquals(calc.somar(2, 5), 7);
	}
	
	@Test
	public void test2menos5() {
		assertEquals(calc.subtrair(2, 5), 3);
	}
	
	@Test
	public void test5por2() {
		assertEquals(calc.dividir(5, 2), 2.5, 0);
	}

}
