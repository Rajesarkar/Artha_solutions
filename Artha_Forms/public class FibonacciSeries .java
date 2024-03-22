public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change this value to generate Fibonacci series up to a different number of
                    // terms
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
