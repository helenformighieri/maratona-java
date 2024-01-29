package estruturas_de_repeticao;

public class Aula01 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 5){
            System.out.println("while " + count);
            count ++;
        }

        System.out.println("***********************************************");

        count = 0;
        do {
            System.out.println("do while " + count);
            count++;
        }while (count < 5);

        System.out.println("***********************************************");

        count = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("for " + count);
            count++;
        }
    }
}
