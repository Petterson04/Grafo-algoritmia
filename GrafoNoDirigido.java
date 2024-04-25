public class GrafoNoDirigido {
    private int V; // número de vértices
    private int[][] matrizAdy; // matriz de adyacencia

    // Constructor
    public GrafoNoDirigido(int vertices) {
        this.V = vertices;
        matrizAdy = new int[V][V];
    }

    // Método para agregar una arista al grafo
    public void agregarArista(int origen, int destino) {
        matrizAdy[origen][destino] = 1;
        matrizAdy[destino][origen] = 1; // como es no dirigido, también agregamos la arista en sentido inverso
    }

    // Método para imprimir la matriz de adyacencia
    public void imprimirMatrizAdyacencia() {
        System.out.println("Matriz de adyacencia:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matrizAdy[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método principal (main) para probar la clase GrafoNoDirigido
    public static void main(String[] args) {
        int V = 5; // número de vértices
        GrafoNoDirigido grafo = new GrafoNoDirigido(V);

        // Agregamos algunas aristas al grafo
        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 4);
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(1, 4);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);

        // Imprimimos la matriz de adyacencia
        grafo.imprimirMatrizAdyacencia();
    }
}