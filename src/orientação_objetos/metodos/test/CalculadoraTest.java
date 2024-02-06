package orientação_objetos.metodos.test;

import orientação_objetos.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.SomarDoisNumeros();
        System.out.println(calculadora);

        calculadora.subtrairDoisNumeros();
        System.out.println(calculadora);
    }
}
