public class Questao05 {
    public static void main(String[] args){

        int[] numero = new int[]{2, 5, 8, 10, 15, 18};

        int cont = 0;

        for (int i=0; i < numero.length; i++){
            if ((numero[i] % 2) == 0){
                cont++;
            }
        }
        System.out.printf("Existem %d pares no vetor!", cont);
    }
}
