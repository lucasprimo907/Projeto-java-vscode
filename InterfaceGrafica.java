import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InterfaceGrafica {
    private static ArrayList<Filme> filmesCadastrados = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Filmes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JLabel labelTitulo = new JLabel("Título do Filme:");
        JTextField textFieldTitulo = new JTextField(20);

        JLabel labelAno = new JLabel("Ano de Lançamento:");
        JTextField textFieldAno = new JTextField(4);

        JLabel labelNota = new JLabel("Nota do Filme:");
        JTextField textFieldNota = new JTextField(4);

        JLabel labelSinopse = new JLabel("Sinopse:");
        JTextArea textAreaSinopse = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textAreaSinopse);

        JButton cadastrarButton = new JButton("Efetuar Cadastro");

        DefaultListModel<String> listaModel = new DefaultListModel<>();
        JList<String> listaFilmes = new JList<>(listaModel);
        JScrollPane scrollLista = new JScrollPane(listaFilmes);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        panel.add(labelTitulo);
        panel.add(textFieldTitulo);
        panel.add(labelAno);
        panel.add(textFieldAno);
        panel.add(labelNota);
        panel.add(textFieldNota);
        panel.add(labelSinopse);
        panel.add(scrollPane);
        panel.add(new JLabel());
        panel.add(cadastrarButton);
        panel.add(new JLabel("Filmes Cadastrados:"));
        panel.add(scrollLista);

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String titulo = textFieldTitulo.getText();
                    int anoLancamento = Integer.parseInt(textFieldAno.getText());
                    double nota = Double.parseDouble(textFieldNota.getText());
                    String sinopse = textAreaSinopse.getText();

                    Filme filme = new Filme(titulo, anoLancamento, nota, sinopse);
                    filmesCadastrados.add(filme);

                    listaModel.addElement(filme.getTitulo() + " (" + filme.getAnoDeLancamento() + ") - Nota: " + filme.getNota() + " - " + filme.getSinopse());

                    JOptionPane.showMessageDialog(frame, "Filme cadastrado com sucesso!");

                    textFieldTitulo.setText("");
                    textFieldAno.setText("");
                    textFieldNota.setText("");
                    textAreaSinopse.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos para o ano e a nota.");
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

