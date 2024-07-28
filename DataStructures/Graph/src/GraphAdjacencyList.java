
import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAdjacencyList {
    ArrayList<LinkedList<Node>> alist;

    public GraphAdjacencyList() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currLinkedList = new LinkedList<>();
        currLinkedList.add(node);
        alist.add(currLinkedList);
    }

    public void addEdge(int src, int dst){
        LinkedList<Node> currLinkedList=alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currLinkedList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currLinkedList=alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node:currLinkedList){
            if(node==dstNode){
                return true;
            }
        }
        return false;
    }

    public void show(){
        for(LinkedList<Node> currLinkedList : alist){
            for(Node node: currLinkedList){
                System.out.print(node.data+" -> ");
            }
            System.out.println();
        }
    }
    
}
