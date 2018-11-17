public class TipoString {

    public static void main(String[] arfs){

        String str = "Ola Mundo";
        String outraPalavra = "Ola Mundo";

        System.out.println("Imprimindo uma String "+str);

        if(str.equals(outraPalavra)){
            System.out.println("As palavras são iguais");
        }

        String [] palavras = str.split("");
        System.out.println("Slipt :"+palavras);

        //Retorna o indice de uma palavra.
        int i = str.indexOf("uma");
        System.out.println("Retorna um indice de uma palavra: " +i);

        //Substitui os caresteres
        str = str.replace('a', '@');
        System.out.println("Usando o replace: "+str);
    }

}
