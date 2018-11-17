public class ClausulaBreak {

    public static void main(String[] args){

        char letras[] = {'a', 'b', 'c', 'd'};
        int i;
        for(i=0; i<letras.length; i++){
            if(letras[i] == 'c'){
                break;
            }
            System.out.println("O numero "+i+" é: " +letras[i]);
        }
    }
}
