
package OO;

public class TesteRetorno {

    public void naoRetornaNada(){
        int i = 10;
        if(i > 50){
            return; //Aborta o metodo
        }
    }

    int somar(int a, int b){
        return  a + b;
    }

    Carro criarUmCarro(){
        Carro c = new Carro();
        c.modelo = "Ferrari";
        c.cor = "Vermelha";
        c.motor = "5.0 V12";
        return c;
    }

    public static void main(String[] args){
        TesteRetorno ts = new TesteRetorno();
        ts.naoRetornaNada();
        int soma = ts.somar(10, 20);
        System.out.println("A soma é:" +soma);
    }
}
