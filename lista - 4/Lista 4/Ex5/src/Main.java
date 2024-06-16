import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] vetor = new int [10];
        int [] inverso = new int [10];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dez números: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = in.nextInt();
        }

        System.out.print("A sequência é: [ ");
        for(int j = 0; j < vetor.length; j++){
            inverso[j] = vetor[(vetor.length - 1) - j];

            System.out.print(vetor[j] + " ");
        }

        System.out.println("] ");
        System.out.print("E a sequência invertida é: [ ");

        for (int k = 0; k < vetor.length; k++){
            System.out.print(inverso[k] + " ");
        }

        System.out.println("]");
    }
}