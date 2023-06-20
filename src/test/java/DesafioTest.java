import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DesafioTest {

	@Test
	void testQuandoChamarImprimiSaldoComSaldo2500Retornar2500() {
		String saldoAImprimir = Desafio.imprimirSaldo(2500);

		assertTrue("O saldo da sua conta é de: 2500.0".equals(saldoAImprimir), "Quando o saldo for 2500 entao OK");
	}

	@Test
	void testQuandoChamarImprimiSaldoComSaldo2300Comparadocom2500Retornar2300() {
		String saldoAImprimir = Desafio.imprimirSaldo(2300);

		assertFalse("O saldo da sua conta é de: 2500.0".equals(saldoAImprimir), "Quando o saldo for 2300 entao NOK");
	}

	@Test
	void testQuandoChamarChecarOpcaoMenuComValorValidoRetornarVazio() {
		// faça um laço FOR para fazer os testes do test 24 para todas as opções válidas

		// int i = 1;
		// while (i <= 4) {
		// assertTrue(Desafio.checarOpcaoMenu(i) == "");
		// ++i;
		// }

		// i = 1;
		// do {
		// assertTrue(Desafio.checarOpcaoMenu(i) == "");
		// i++;
		// } while(i <= 4);

		for (int idx = 1; idx <= 4; ++idx) {
			assertTrue(Desafio.checarOpcaoMenu(idx) == "");
		}

		// int[] iarr = {1, 2, 3, 4};
		// for (int j : iarr) {
		// assertTrue(Desafio.checarOpcaoMenu(j) == "");
		// }
	}

	@Test
	void testQuandoChamarChecarOpcaoMenuComValorInvalidoRetornarFalso() {
		String checarMenu = Desafio.checarOpcaoMenu(0);
		assertTrue("Opção inválida!".equals(checarMenu));

		checarMenu = Desafio.checarOpcaoMenu(5);
		assertTrue("Opção inválida!".equals(checarMenu));
	}
	@Test
	void testQuandoChamarDepositarVerificarValorAtual() {
		double checarDeposito = Desafio.depositar(200d, 10d);

		assertTrue(210d == checarDeposito);
	}

}
// faça um test para que o ChecarOpcaoMenu retorne um valor invalido
