package estruturas_condicionais;

public class Aula01 {
    public static void main(String[] args) {
        int idade = 28;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;

        if(idade >= 18){
            System.out.println("Você pode comprar bebidas");
        }else{
            System.out.println("Você não pode comprar bebidas ");
        }

         //! false
        if(!isAutorizadoComprarBebidaAlcoolica){
            System.out.println("Você não pode comprar bebida alcoolica");
        }

        //obrigatorio um if voltar true or false

        // else só pode ser usado com if
    }
}
