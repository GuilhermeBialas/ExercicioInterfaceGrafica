/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01Lista09Packge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio01Lista09 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;

    public Exercicio01Lista09() {
        gerarTela();
        instanciaComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adcionarComponentes();
        acaoButtonConcatenar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exercicio01Lista09");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void adcionarComponentes() {
        jFrame.add(jButtonConcatenar);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);

    }

    @Override
    public void instanciaComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField("");
        jTextFieldSobrenome = new JTextField("");
        jButtonConcatenar = new JButton("Concatenar");

    }

    @Override
    public void gerarLocalizacoes() {
        jButtonConcatenar.setLocation(10,100);
        jLabelNome.setLocation(10, 10);
        jLabelSobrenome.setLocation(10, 60);
        jTextFieldNome.setLocation(10, 40);
        jTextFieldSobrenome.setLocation(10, 80);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNome.setSize(200, 20);
        jTextFieldSobrenome.setSize(200, 20);
        jButtonConcatenar.setSize(100, 100);
        jLabelNome.setSize(100, 20);
        jLabelSobrenome.setSize(100, 20);
    }

    public void acaoButtonConcatenar() {
        jButtonConcatenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nome do usuário: "
                        + "\n" + jTextFieldNome.getText().trim()+ " " + jTextFieldSobrenome.getText().trim());
            }
        });
    }

}
