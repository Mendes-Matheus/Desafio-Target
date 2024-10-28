package br.com.mendes.matheus;
import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O numero " + number + " pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("O numero " + number + " nao pertence a sequencia de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int prev = 0;
        int current = 1;

        while (current < number) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current == number;
    }
}