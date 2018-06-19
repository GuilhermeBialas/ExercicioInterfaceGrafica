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
    private JTextArea jTextAreaNome;
   
    
    
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
        jTextAreaNome = new  JTextArea("");
    }

    @Override
    public void gerarDimensoes() {
     jButtonSalvar.setSize(100, 20);
     jButtonCancelar.setSize(100, 20);
     jTextFieldNome.setSize(55, 60);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonSalvar.setLocation(50, 50);
        jButtonCancelar.setLocation( 60, 60);
        jTextFieldNome.setLocation(10 , 10);
        jTextAreaNome.setLocation(15, 20);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        jFrame.add(jTextFieldNome);
        jFrame.add(jCheckBoxRaca);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(625, 425);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
