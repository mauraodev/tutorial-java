package OO;

public class Contador {

    static int count = 0;

    void incrementar(){
        count++;
    }

    public static void main(String[] args){
        Contador c = new Contador();
        c.incrementar();
        System.out.println(Contador.count);
        Contador.count++;
        System.out.println(c.count);
    }
}
