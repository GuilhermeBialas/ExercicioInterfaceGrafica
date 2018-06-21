/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface00;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio00 implements JFrameBaseInterfaceJava {

    private JFrame jFrame;
    private JTextField jTextFieldNome;
    private JButton jButtonCancelar;
    private JButton jButtonSalvar;
    private JCheckBox jCheckBoxRaca;
    private JLabel jLabelNome;
    private JLabel jLabelApelido;
    private JLabel jLabelIdade;
    private JLabel jLabelPreco;
    private JTextArea jTextAreaNome;
    private JTextArea jTextAreaApelido;
    private JTextArea jTextAreaIdade;
    private JTextArea jTextAreaPreco;

    public Exercicio00() {
        gerarTela();
        instanciarComponentes();
        gerarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarComponentes() {

    }

    @Override
    public void instanciarComponentes() {
        jButtonSalvar = new JButton("Salvar");
        jButtonCancelar = new JButton("Cancelar");
        jTextFieldNome = new JTextField("Nome");
        jCheckBoxRaca = new JCheckBox("Raça");
        jTextAreaNome = new JTextArea("");
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("");
        jLabelApelido = new JLabel("");
        jLabelPreco = new JLabel("");
        jTextAreaApelido = new JTextArea("");
    }

    @Override
    public void gerarDimensoes() {
     jButtonSalvar.setSize(141, 70);
         jButtonCancelar.setSize(141, 70);
        //  jTextFieldNome.setSize(55, 60);
        // jTextAreaNome.setSize(10 , 60);
        jLabelNome.setSize(10, 90);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonSalvar.setLocation(447, 335);
        jButtonCancelar.setLocation(306, 215);
      //  jTextFieldNome.setLocation(50 , 50);
        // jTextAreaNome.setLocation(15, 20);
        // jLabelNome.setLocation(10,10);

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonSalvar);
         jFrame.add(jButtonCancelar);
        // jFrame.add(jTextFieldNome);
        // jFrame.add(jCheckBoxRaca);
      //  jFrame.add(jTextAreaNome);
      //  jFrame.add(jLabelNome);
      //  jFrame.add(jTextAreaIdade);
      //  jFrame.add(jTextAreaPreco);
      //  jFrame.add(jTextAreaApelido);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(645, 460);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
