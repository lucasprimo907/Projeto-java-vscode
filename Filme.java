public class Filme extends Conteudo {
    private String sinopse;

    public Filme(String titulo, int anoDeLancamento, double nota, String sinopse) {
        super(titulo, anoDeLancamento, nota);
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return sinopse;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Sinopse: " + sinopse);
    }
}

