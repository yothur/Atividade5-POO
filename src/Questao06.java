import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para verificar se está presente no vetor");
        int valor = input.nextInt();

        boolean encontrou = false;

        int[] numeros = new int[]{4,8,15,16,23,42};

        for (int i=0; i < numeros.length; i++){
            if (valor == numeros[i]){
                encontrou = true;
            }
        }

        if (encontrou == true){
            System.out.println("Encontrou");
        }else {
            System.out.println("Não Encontrou");
        }

    }
}
