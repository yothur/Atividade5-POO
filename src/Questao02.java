import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um indice entre 0 e 4");
        String indice = input.next();

        int[] numeros = new int[5];

        numeros[0] = 5;
        numeros[1] = 15;
        numeros[2] = 25;
        numeros[3] = 35;
        numeros[4] = 45;

        switch (indice){
            case "0" -> System.out.println(numeros[0]);
            case "1" -> System.out.println(numeros[1]);
            case "2" -> System.out.println(numeros[2]);
            case "3" -> System.out.println(numeros[3]);
            case "4" -> System.out.println(numeros[4]);
            default -> System.out.println("Invalido!");
        }

    }
}
