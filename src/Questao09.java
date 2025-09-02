import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite os valores para o vetor:");
        System.out.print("\n");

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o %d° Valor: ",i+1);
            numeros[i] = input.nextInt();
        }

        System.out.print("\n");

        System.out.println("Digite um valor para multiplicar pelos números no vetor:");
        int valor = input.nextInt();

        System.out.printf("As multiplicações foram: \n");

        int soma = 0;

        for (int i=0; i < numeros.length; i++){
            int mult = valor * numeros[i];
            soma += mult;
            System.out.printf("%d x %d = %d\n", valor, numeros[i], mult);
        }System.out.printf("Total: %d ", soma);

    }
}
