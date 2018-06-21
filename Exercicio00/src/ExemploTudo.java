
import Interface00.JFrameBaseInterfaceJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public abstract class ExemploTudo implements JFrameBaseInterfaceJava {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;

    public ExemploTudo() {
        gerarTela();
        gerarDimensoes();
        gerarLocalizacoes();
        instanciarComponentes();
        adicionarComponentes();
        gerarComponentes();

    }

    @Override
    public void gerarComponentes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void instanciarComponentes() {
        jButton00 = new JButton("Exemplo 00");
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");

    }

    @Override
    public void gerarDimensoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarLocalizacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);

    }

    @Override
    public void gerarTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("public void acaoJButton0" + i + "(){");
            System.out.println("jButton0" + i + ".addActionListener(new ActionListener() {");
            System.out.println("@Override");

        }
    }

    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ExemploJFrame01 exemploJFrame01 = new ExemploJFrame01();
            }
        });
    }
}
