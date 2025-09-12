package interfaceGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmAluno extends JFrame {

    private JLabel JLNome;
    private JTextField JTFNome;
    private JLabel JLNota1;
    private JTextField JTFNota1;
    private JLabel JLNota2;
    private JTextField JTFNota2;
    private JLabel JLNota3;
    private JTextField JTFNota3;
    private JLabel JLMedia;
    private JLabel JLMediaResultado;
    private JButton JBCalcular;
    private JButton JBLimpar;
    private JButton JBFechar;

    public FrmAluno() {
        initComponents();
    }

    private void initComponents() {
        JLNome = new JLabel("Nome:");
        JTFNome = new JTextField();
        JLNota1 = new JLabel("Nota 1:");
        JTFNota1 = new JTextField();
        JLNota2 = new JLabel("Nota 2:");
        JTFNota2 = new JTextField();
        JLNota3 = new JLabel("Nota 3:");
        JTFNota3 = new JTextField();
        JLMedia = new JLabel("Média:");
        JLMediaResultado = new JLabel("");
        JBCalcular = new JButton("Calcular");
        JBLimpar = new JButton("Limpar");
        JBFechar = new JButton("Fechar");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cálculo da Média do Aluno");

        setLayout(null);

        JLNome.setBounds(20, 20, 100, 20);
        JTFNome.setBounds(100, 20, 150, 20);
        JLNota1.setBounds(20, 50, 100, 20);
        JTFNota1.setBounds(100, 50, 50, 20);
        JLNota2.setBounds(20, 80, 100, 20);
        JTFNota2.setBounds(100, 80, 50, 20);
        JLNota3.setBounds(20, 110, 100, 20);
        JTFNota3.setBounds(100, 110, 50, 20);
        JLMedia.setBounds(20, 140, 100, 20);
        JLMediaResultado.setBounds(100, 140, 200, 20);
        JBCalcular.setBounds(20, 170, 100, 30);
        JBLimpar.setBounds(130, 170, 100, 30);
        JBFechar.setBounds(240, 170, 100, 30);

        add(JLNome);
        add(JTFNome);
        add(JLNota1);
        add(JTFNota1);
        add(JLNota2);
        add(JTFNota2);
        add(JLNota3);
        add(JTFNota3);
        add(JLMedia);
        add(JLMediaResultado);
        add(JBCalcular);
        add(JBLimpar);
        add(JBFechar);

        JBCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBCalcularActionPerformed(evt);
            }
        });

        JBLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        JBFechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        setSize(380, 250);
        setLocationRelativeTo(null);
    }

    private void JBCalcularActionPerformed(ActionEvent evt) {
        String nome = JTFNome.getText();
        double nota1 = Double.parseDouble(JTFNota1.getText());
        double nota2 = Double.parseDouble(JTFNota2.getText());
        double nota3 = Double.parseDouble(JTFNota3.getText());

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        double media = aluno.getMedia();
        JLMediaResultado.setText("O aluno: " + nome + " está com média " + media);
    }

    private void JBLimparActionPerformed(ActionEvent evt) {
        JTFNome.setText("");
        JTFNota1.setText("");
        JTFNota2.setText("");
        JTFNota3.setText("");
        JLMediaResultado.setText("");
    }

    private void JBFecharActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAluno().setVisible(true);
            }
        });
    }
}
