class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        frente = null;
        tras = null;
    }

    public void adicionar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (tras != null) {
            tras.proximo = novoNode;
        }
        tras = novoNode;
        if (frente == null) {
            frente = novoNode;
        }
    }

    public Elemento atender() {
        if (frente == null) {
            return null; // Fila vazia
        }
        Elemento elemento = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return elemento;
    }

}
