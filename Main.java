public class Main {
	public static void main(String[] args) {
		System.out.println("Esse é o gerense films");

		Filme filme = new Filme("Vingadores", 2012, 8.0, "Filme de super-heróis salvando a Terra.");
		filme.exibirDetalhes();

		int classificacao = (int) (filme.getNota() / 2);
		System.out.println("Classificação: " + classificacao);
	}
}
