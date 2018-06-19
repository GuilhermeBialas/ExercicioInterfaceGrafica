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
import javax.swing.JTextField;

/**
 *
 * @author Guilherme Bialas
 */
public class Exercicio00 implements JFrameBaseInterfaceJava{
    private JFrame jFrame;
    private JTextField jTextField;
    private JButton jButtonCancelar;
    private JButton jButtonSalvar;
    private JCheckBox jCheckBox;

    
   
    @Override
    public void gerarComponentes() {
        
    }

    @Override
    public void instanciarComponentes() {
     jButtonSalvar = new JButton("Salvar");
     jButtonCancelar = new JButton("Cancelar");
    }

    @Override
    public void gerarDimensoes() {
     
    }

    @Override
    public void gerarLocalizacoes() {
        
    }

    @Override
    public void adicionarComponentes() {
       jFrame.add(jButtonSalvar);
       jFrame.add(jButtonCancelar);
       jFrame.add(jTextField);
       jFrame.add(jCheckBox);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(618,423);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
}
