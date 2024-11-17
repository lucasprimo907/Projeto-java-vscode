public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2012;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.0;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2012) {
            System.out.println("Filme muito curtido na época que foi lançado!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
