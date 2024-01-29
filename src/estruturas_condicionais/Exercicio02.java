package estruturas_condicionais;

public class Exercicio02 {
    public static void main(String[] args) {
        int diasSemana = 6;

        switch (diasSemana){
            case 1:
            case 7:
                System.out.println("Fim de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
