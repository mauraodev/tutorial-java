
public class TiposUnitarios {

    public static void main(String[] args){

        int a = 1;
        System.out.println("O valor de a: "+a);

        int b = a++;
        System.out.println("O valor de b: "+b);

        int c = ++a;
        System.out.println("O valor de c:"+c);

        b = a--;
        System.out.println("O valor de b decrementado depois de atribuir: "+b);

        c = --a;
        System.out.println("O valor de c descrementado antes de atribuir :"+c);

        int x = +3;
        x = -x;
        System.out.println("O valor de x: "+x);

        //Concatenação
        long var = 12345;
        String str = ("O valor de var é:" +var);
        System.out.println(str);
    }
}
