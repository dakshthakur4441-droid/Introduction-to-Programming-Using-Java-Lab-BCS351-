/**
 * Experiment 2 - Question 4
 * Student: Daksh Thakur (BCS2025506)
 */
class Main {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 5 is " + fact);
    }
}