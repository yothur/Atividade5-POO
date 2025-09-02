import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o %d° valor: ", i+1);
            numeros[i] = input.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }System.out.printf("O maior valor foi %d e o menor foi %d", maior, menor);

    }
}
