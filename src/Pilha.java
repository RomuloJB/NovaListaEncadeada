public class Pilha {

    private ListaEncadeada lista;

    public Pilha() {
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
        Pilha pilha = new Pilha();

        pilha.empilhar(5);
        pilha.empilhar(15);
        pilha.empilhar(25);
        pilha.desempilhar();

        pilha.imprimirPilha();
    }
}
