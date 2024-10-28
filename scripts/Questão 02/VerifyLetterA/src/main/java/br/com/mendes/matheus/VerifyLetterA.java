package br.com.mendes.matheus;
import java.util.Scanner;

public class VerifyLetterA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = countOccurrences(input);

        if (count > 0) {
            System.out.println("A letra 'a' (maiuscula ou minuscula) aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' nao aparece na string.");
        }
    }

    public static int countOccurrences(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}