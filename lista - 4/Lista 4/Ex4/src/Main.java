import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] vetor = new int[10];
        int G = 0, P = 0;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = in.nextInt();

            if (i == 0){
                G = vetor[i];
                P = vetor[i];
            }
            else if (vetor[i] > G){
                G = vetor[i];
            }
            else if(vetor[i] < P){
                P = vetor[i];
            }
        }
    }
}