package orientação_objetos.exercicio01.test;

import orientação_objetos.exercicio01.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Hilux";
        carro1.modelo = "Caminhonete";
        carro1.ano = 2021;

        carro2.nome = "Fusion";
        carro2.modelo = "Sedan";
        carro2.ano = 2023;

        System.out.println("Nome:" + carro1.nome + "\nModelo:" + carro1.modelo + "\nAno:" + carro1.ano);

        System.out.println("*****************");

        System.out.println("Nome:" + carro2.nome + "\nModelo:" + carro2.modelo + "\nAno:" + carro2.ano);
    }
}
