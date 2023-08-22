public class operadores {
    public static void main(String[] args) {
        int numero = 5;
        //numero = numero + 1;
        System.out.println(numero ++);
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a,b;
        a = 5;
        b = 6;
        //String resultado = a==b ? "verdadeiro": "faslo";
        int resultado = a == b ? 1 : 0;
        //if (a==b)
       //     resultado = "verdaadeiro";
       // else 
       //     resultado = "faslo";
        System.out.println(resultado);

        String nomeUm = "Gerson";
        String nomeDois =new String ("Gerson");
        System.out.println(nomeUm.equals(nomeDois));

    }
}
