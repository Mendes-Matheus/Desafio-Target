package br.com.mendes.matheus;

public class Sum {

    public static void main(String[] args) {
        int index = 12, sum = 0, k = 1;
        while (k < index) {
            k = k + 1;
            sum = sum + k;
            System.out.printf("%d + %d = %d\n", sum - k, k, sum);
        }
        System.out.println();
        System.out.printf("RESULTADO: %d\n", sum);
    }
}