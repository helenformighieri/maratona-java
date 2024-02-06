package orientação_objetos.referencia_a_objetos.aula01.test;

import orientação_objetos.referencia_a_objetos.aula01.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusion";
        carro1.modelo = "Sedan";
        carro1.ano = 2023;

        carro2.nome = "Hilux";
        carro2.modelo = "Caminhonete";
        carro2.ano = 2024;

        carro1 = carro2;
    }
}
