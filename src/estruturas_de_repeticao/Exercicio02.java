package estruturas_de_repeticao;

public class Exercicio02 {
        //Dado valor de um carro, descubra em quantas parcelas ele pode ser parcelado
        //Condição valorParcela >= 1000
    public static void main(String[] args) {
        float valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ " + valorParcela);
        }
    }
}
