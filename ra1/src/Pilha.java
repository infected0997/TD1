class Pilha {
    private Node topo;

    public Pilha() {
        topo = null;
    }

    public void empilhar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    public Elemento desempilhar() {
        if (topo == null) {
            return null; // Pilha vazia
        }
        Elemento elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }

}