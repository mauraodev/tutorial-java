
package OO;

public class DeclaracaoDeMetodo {

    public static void main(String[] args){
          DeclaracaoDeMetodo dm = new DeclaracaoDeMetodo();
          dm.fazerAlgo();
          dm.imprimirNaTela("Daniel");
          int soma = dm.somar(2, 3);
          Carro meuCarro = dm.criarUmCarro();
         
    }

    void fazerAlgo(){
        System.out.println("Esse metodo não faz nada");
    }

    void imprimirNaTela(String nome){
        System.out.println("O meu nome é:" +nome);
    }

    int somar( int a, int b){
        return a+b;
    }

    Carro criarUmCarro(){
        Carro c = new Carro();
        c.modelo = "Ferrari";
        c.cor = "Vermelha";
        c.motor = "5.0";
        return c;
    }


}
