public class Conteudo {
    private String titulo;
    private int anoDeLancamento;
    private double nota;

    public Conteudo(String titulo, int anoDeLancamento, double nota) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getNota() {
        return nota;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota: " + nota);
    }
}
