package arrays;

public class Aula03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];

        nomes[0] = "Helen";
        nomes[1] = "Gilberto";
        nomes[2] = "Fernanda";
        nomes[3] = "Lua Maria";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
