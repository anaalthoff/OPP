package interfaceGrafica;

import javax.swing.*;

public class FrmTriangulo extends JFrame {
    private JLabel JLBase;
    private JTextField JTFBase;
    private JLabel JLAltura;
    private JTextField JTFAltura;
    private JLabel JLArea;
    private JLabel JLResultadoArea;
    private JButton JBCalcular;
    private JButton JBLimpar;
    private JButton JBFechar;

    public FrmTriangulo() {
        initComponents();
    }

    private void initComponents() {
        JLBase = new JLabel("Base:");
        JTFBase = new JTextField();
        JLAltura = new JLabel("Altura:");
        JTFAltura = new JTextField();
        JLArea = new JLabel("Área:");
        JLResultadoArea = new JLabel("0.0");
        JBCalcular = new JButton("Calcular");
        JBLimpar = new JButton("Limpar");
        JBFechar = new JButton("Fechar");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cálculo da área do triângulo");

        setLayout(null);
        JLBase.setBounds(20, 20, 100, 20);
        JTFBase.setBounds(20, 40, 100, 20);
        JLAltura.setBounds(20, 70, 100, 20);
        JTFAltura.setBounds(20, 90, 100, 20);
        JLArea.setBounds(20, 120, 100, 20);
        JLResultadoArea.setBounds(20, 140, 100, 20);
        JBCalcular.setBounds(150, 40, 100, 30);
        JBLimpar.setBounds(150, 80, 100, 30);
        JBFechar.setBounds(150, 120, 100, 30);

        add(JLBase);
        add(JTFBase);
        add(JLAltura);
        add(JTFAltura);
        add(JLArea);
        add(JLResultadoArea);
        add(JBCalcular);
        add(JBLimpar);
        add(JBFechar);

        JBCalcular.addActionListener(evt -> JBCalcularActionPerformed(evt));
        JBLimpar.addActionListener(evt -> JBLimparActionPerformed(evt));
        JBFechar.addActionListener(evt -> JBFecharActionPerformed(evt));

        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    private void JBCalcularActionPerformed(java.awt.event.ActionEvent evt) {
        Triangulo tri1 = new Triangulo();
        tri1.setBase(Double.parseDouble(JTFBase.getText()));
        tri1.setAltura(Double.parseDouble(JTFAltura.getText()));
        JLResultadoArea.setText(String.valueOf(tri1.getArea()));
    }

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {
        JTFBase.setText("");
        JTFAltura.setText("");
        JLResultadoArea.setText("0.0");
    }

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}