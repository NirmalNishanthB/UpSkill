public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree btree = new BinaryTree();
        btree.insert(8);
        btree.insert(7);
        btree.insert(12);
        btree.insert(15);
        btree.insert(2);
        btree.insert(5);

        btree.inOrder();
        btree.preOrder();
        btree.postOrder();
    }
}
