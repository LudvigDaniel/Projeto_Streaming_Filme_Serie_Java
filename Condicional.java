public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento do ANO!");
        } else {
            System.out.println("Filme de 1986, do Top Gun que vale a pena assistir");
        }
            if (incluidoNoPlano == true && tipoPlano.equals("plus")){
                System.out.println("Filme liberado");

            }else{
                System.out.println("Deve pagar a locação");
            }



    }
}

