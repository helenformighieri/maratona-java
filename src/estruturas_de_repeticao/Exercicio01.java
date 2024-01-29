package estruturas_de_repeticao;

public class Exercicio01 {
    public static void main(String[] args) {
        int par = 0;

        for (int i = 0; i < 50; i += 2){
            System.out.println("numeros pares: " + i);
        }

        //solução professor
        for (int i = 0; i < 50; i++){
            if (i % 2 == 0){
                System.out.println("numeros pares: " + i);
            }
        }
    }
}
