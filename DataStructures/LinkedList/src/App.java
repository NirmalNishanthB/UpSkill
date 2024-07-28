public class App {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(2);
        linkedList.insert(8);
        linkedList.insertAtStart(9);
        linkedList.insertAt(2, 6);
        linkedList.delete(2);
        linkedList.show();
    }
}
