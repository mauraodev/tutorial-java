package OO;

public class MetodoEstatico {

    public static void main(String[] args){
       MetodoEstatico me = new MetodoEstatico();
       me.metodoNaoEstatico();;
       me.metodoEstatico();
       MetodoEstatico.metodoEstatico();
       metodoEstatico();
    }

    static void metodoEstatico(){
       //metodoNaoEstatico(); //Errado
       // (new  MetodoEstatico()).metodoNaoEstatico(); //OK
    }

    void metodoNaoEstatico(){
        metodoEstatico();
    }
}
