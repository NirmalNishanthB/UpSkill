public class App {
    public static void main(String[] args){
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 2);

        graph.show();
        graph.breadthFirstSearch(0);

        GraphAdjacencyList gAList = new GraphAdjacencyList();
        gAList.addNode(new Node('A'));
        gAList.addNode(new Node('B'));
        gAList.addNode(new Node('C'));
        gAList.addNode(new Node('D'));
        gAList.addNode(new Node('E'));

        gAList.addEdge(0, 1);
        gAList.addEdge(1, 2);
        gAList.addEdge(1, 4);
        gAList.addEdge(2, 3);
        gAList.addEdge(4, 0);

        //gAList.show();
    }
}
