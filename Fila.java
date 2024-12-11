public class Fila {

    private ListaEncadeada lista;

    public Fila() {
        lista = new ListaEncadeada();
    }

    public void enfileirar(int valor) {
        lista.adicionarFim(valor);
    }

    public void desenfileirar() {
        lista.removerInicio();
    }

    public void imprimirFila() {
        lista.imprimir();
    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.desenfileirar();

        fila.imprimirFila();
    }
}
