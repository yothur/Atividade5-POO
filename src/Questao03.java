public class Questao03 {
    public static void main(String[] args){

        int[] numeros = new int[]{3,7,1,9,12};

        int soma = 0;

        for (int i=0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}
