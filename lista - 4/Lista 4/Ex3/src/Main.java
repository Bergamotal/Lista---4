import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n1, cont = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = in.nextInt();

        for(int i = 0; i < vetor.length; i ++){
            if(vetor[i] == n1){
                System.out.println("O seu número está na posição: " + i + "!");
                cont++;
            }
        }

        if (cont == 0){
            System.out.println("Seu número não foi encontrado no vetor!");
        }
    }
}