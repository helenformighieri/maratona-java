package orientação_objetos.metodos.test;

import orientação_objetos.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println("*****************");

        calculadora.divideDoisNumeros(86, 5);
    }
}
