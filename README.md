# Desafio Target

Esse repositório contém as soluções dos desafios propostos no desafio para estágio na empresa Target Sistemas. Os desafios foram realizados com a linguagem Java

## Soluções

---

**QUESTÃO 01:** Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código.

**RESPOSTA:**

```java
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

```

---

**QUESTÃO 02:** Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código.

**RESPOSTA**

```java
import java.util.Scanner;

public class VerifyLetterA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int count = countOccurences(input);

        if (count > 0) {
            System.out.println("A letra 'a' (maiuscula ou minuscula) aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' nao aparece na string.");
        }
    }

    public static int countOccurences(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}

```

---

**QUESTÃO 03:** Observe o trecho de código abaixo: 

```
int INDICE = 12, SOMA = 0, K = 1;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
imprimir(SOMA);
```

Ao final do processamento, qual será o valor da variável SOMA?

**RESPOSTA:** O código acima realiza adições dos números de 2 a 12 (ou seja, 2 + 3 + 4 + ... + 12), resultando em **77**. Podemos testar executando o código em Java disponível no link abaixo:

```java
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

```

---

**QUESTÃO 04:** Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, _
b) 2, 4, 8, 16, 32, 64, _
c) 0, 1, 4, 9, 16, 25, 36, _
d) 4, 16, 36, 64, _
e) 1, 1, 2, 3, 5, 8, _
f) 2,10, 12, 16, 17, 18, 19, __

**RESPOSTA:**

a) 9.

    Explicação: a sequência consiste em **números ímpares**, que aumentam de 2 em 2

b) 128

    Explicação: a sequência consiste em números que são **potencia de 2**

c) 49

    Explicação: a sequência consiste em **quadrados perfeitos**

d) 100

    Explicação: a sequência consiste em **quadrados de numeros pares**

e) 13

    Explicação: a sequência consiste em números pertecentes a **sequência de Fibonacci**

f) 200

    Explicação: a sequência consiste em **números que iniciam com a letra D**

---

**QUESTÃO 05:** Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

**RESPOSTA**

**A estratégia consiste nos seguintes passos:**

1. **Acender uma lâmpada:** Primeiro eu ligaria um dos interruptores e aguardarias alguns minutos. A lâmpada correspondente a esse interruptor ficaria quente devido à incandescência.
2. **Eliminar uma opção:** Depois eu desligaria o interruptor que liguei primeiro e ligaria outro.
3. **Ir em cada uma das salas:** Depois eu iria em cada uma das salas
4. **Identificar as lâmpadas:**
   - **Lâmpada quente:** A lâmpada quente corresponde ao primeiro interruptor que eu liguei.
   - **Lâmpada acesa:** A lâmpada acesa corresponde ao segundo interruptor que eu liguei.
   - **Lâmpada fria e apagada:** A lâmpada fria e apagada corresponde ao interruptor que eu não liguei em nenhum momento.
