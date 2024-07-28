public class App {
    public static void main(String[] args) throws Exception {
        Stack numbers = new Stack();
        numbers.push(12);
        numbers.push(11);
        numbers.push(23);

        numbers.show();

        System.out.println(numbers.pop());

    }
}
