public class Fila {

    private ListaEncadeada lista;

    public Fila() {
        lista = new ListaEncadeada();
    }

    public void empilhar(int valor) {
        lista.adicionarInicio(valor);
    }

    public void desempilhar() {
        lista.removerInicio();
    }

    public void imprimirPilha() {
        lista.imprimir();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.empilhar(5);
        fila.empilhar(15);
        fila.empilhar(25);
        fila.desempilhar();

        fila.imprimirFila();
    }
}
