import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double[] numeros = new double[5];

        double soma = 0;

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }

        double media = soma / 5;

        System.out.print("\n");
        System.out.printf("O valor da media foi %.1f\n", media);

        if (media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }

    }
}
