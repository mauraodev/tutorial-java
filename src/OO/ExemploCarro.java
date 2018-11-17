package OO;

public class ExemploCarro {

    public static void main(String[] args){

        Carro umCarro = new  Carro();

        //Atribui valores as variaveis
        umCarro.modelo = "Gol";
        umCarro.cor = "Preto";
        umCarro.motor = "1.0";

        //Executa os metodos da classe carro;
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro = null;

        System.gc();
    }

}
