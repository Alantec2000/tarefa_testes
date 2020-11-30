import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Testes.class)
public class TestesTest {

    @Test
    public void testeRetornaMaiorSemDesvio() {
        Testes testes = new Testes();
        int atual;
        int esperado = 2;

        atual = testes.retornaMaior(1, 2);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeRetornaMaiorComDesvio() {
        Testes testes = new Testes();
        int atual = 0;
        int esperado = 3;

        atual = testes.retornaMaior(3, 2);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeObterCargoDesenvolvedor() {
        Testes testes = new Testes();
        String esperado = "Desenvolvedor";

        String atual = testes.obterNomePorIdCargo(1);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeObterCargoDesconhecido() {
        Testes testes = new Testes();
        String esperado = "Nenhum";

        String atual = testes.obterNomePorIdCargo(2);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeIncrementarValor() throws Exception {
        Testes testes = new Testes();
        int esperado = 999;

        int atual = testes.incrementarValor(999);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeIncrementarValorAbaixoLimite() throws Exception {
        Testes testes = new Testes();
        int esperado = 0;

        String METHOD = "getValor";

        Testes spy = PowerMockito.spy(testes);
        PowerMockito.when(spy, METHOD).thenReturn(500);

        int atual = spy.incrementarValor(-600);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeIncrementarValorAcimaLimite() {
        Testes testes = new Testes();
        int esperado = 1000;
        int atual = testes.incrementarValor(1001);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeIncrementarValorMock() throws Exception {
        Testes testes = new Testes();
        int esperado = 600;
        String METHOD = "getValor";

        Testes spy = PowerMockito.spy(testes);
        PowerMockito.when(spy, METHOD).thenReturn(500);

        int atual = spy.incrementarValor(100);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeEhPar() throws Exception {
        Testes testes = new Testes();
        String esperado = "Par";

        String atual = testes.parOuImpar(2);

        Assert.assertEquals(atual, esperado);
    }

    @Test
    public void testeEhImpar() throws Exception {
        Testes testes = new Testes();
        String esperado = "Impar";

        String atual = testes.parOuImpar(3);

        Assert.assertEquals(atual, esperado);
    }
}
