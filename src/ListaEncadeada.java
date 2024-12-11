public class ListaEncadeada {

    private No cabeca;

    public void adicionarInicio(int valor){
        No novoElemento = new No(valor);
        if(cabeca == null){
            cabeca = novoElemento;
        }else{
            novoElemento.proximo = cabeca;
            cabeca = novoElemento;
        }
    }

    public void removerInicio(){
        if(cabeca!=null){
            cabeca = cabeca.proximo;
        }
    }

    public void adicionarMeio(int valor, int valorReferencia){
        No novoElemento = new No(valor);
        if(cabeca == null){
            cabeca = novoElemento;
        }else{
            No temp = cabeca;
            while(temp.proximo!=null && temp.valor!=valorReferencia){
                temp = temp.proximo;
            }
            novoElemento.proximo = temp.proximo;
            temp.proximo = novoElemento;
        }
    }

    public void adicionarFim(int valor){
        No novoElemento = new No(valor);
        if(cabeca==null){
            cabeca = novoElemento;
        }else{
            No temp = cabeca;
            while(temp.proximo!=null){
                temp = temp.proximo;
            }
            temp.proximo = novoElemento;
        }
    }

    public void removerFim(){
        if(cabeca != null){
            if(cabeca.proximo == null){
                cabeca = null;
            }else{
                No temp = cabeca;
                while(temp.proximo.proximo!=null){
                    temp = temp.proximo;
                }
                temp.proximo = null;
            }
        }
    }

    public void imprimir(){
        No temp = cabeca;
        while(temp!=null) {
            System.out.print(temp.valor+" ");
            temp = temp.proximo;            
        }
    }
  

    private class No {
        int valor;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            proximo = null;
        }
    }

      public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionarFim(2);
        lista.adicionarFim(0);
        lista.adicionarFim(50);
        lista.adicionarInicio(1000);
        lista.adicionarMeio(3, 0);
        lista.imprimir();
    }
}