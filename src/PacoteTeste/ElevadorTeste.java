package PacoteTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.fiap.Elevador;

public class ElevadorTeste {
	
	Elevador elevador = new Elevador();
	
	@Test
	public void entraPessoa57() {
		assertEquals(elevador.entrarNoElevador(57), 57, 0);
	}
	@Test
	public void saiPessoa30() {
		elevador.setCargaAtual(80);
		assertEquals(elevador.sairDoElevador(90), -10, 0);
	}
	@Test
	public void alarme201() {
		assertEquals(elevador.avaliarPeso(201), true);
	}

}
