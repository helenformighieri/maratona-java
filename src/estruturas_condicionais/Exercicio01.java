package estruturas_condicionais;

public class Exercicio01 {
    public static void main(String[] args) {
        float salario = 22300f;

        if (salario <= 34712) {
            float impostoUm = salario * (9.70f / 100);
            System.out.println("Você paga 9.70% de imposto. Valor pago: " + impostoUm);

        } else if (salario >= 34.713 && salario <= 68507) {
            float impostoDois = salario * (37.35f / 100);
            System.out.println("Você paga 37.35% de imposto. Valor pago: " + impostoDois);

        } else {
            float impostoTres = salario * (49.50f / 100);
            System.out.println("Você paga 49.50% de imposto. Valor pago: " + impostoTres);
        }
    }
}
