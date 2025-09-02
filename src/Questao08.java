public class Questao08 {
    public static void main(String[] args){

        int[] valores = new int[]{1,2,3,4,5};

        System.out.print("Os valores são: ");

        for (int i=0; i < valores.length; i++){
            System.out.printf("%d -> ", valores[i]);
        }

        System.out.print("\n");
        System.out.print("Os valores revertidos são: ");

        for (int i=valores.length-1; i >= 0; i--){
            System.out.printf("%d -> ", valores[i]);
        }

    }
}
