public class Testes {
    private int valor = 0;

    public int retornaMaior(int numero1, int numero2)
    {
        if (numero1 > numero2) {
            return numero1;
        }

        return numero2;
    }

    public String obterNomePorIdCargo(int numeroCargo) {
        switch (numeroCargo) {
            case 1:
                return "Desenvolvedor";
            default:
                return "Nenhum";
        }
    }

    public int incrementarValor(int valor) {
        int valorAtual = getValor();
        int novoValor = valorAtual + valor;

        if (novoValor > 1000) {
            novoValor = 1000;
        }

        if (novoValor < 0) {
            novoValor = 0;
        }

        setValor(novoValor);

        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public String parOuImpar(int valor) {
        if (valor % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
