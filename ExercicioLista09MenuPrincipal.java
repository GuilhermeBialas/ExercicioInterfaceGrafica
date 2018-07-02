
package Exercicio01Lista09Packge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Guilherme Bialas
 */
public class ExercicioLista09MenuPrincipal implements JFrameBaseInterface  {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;

    public ExercicioLista09MenuPrincipal() {
        gerarTela();
        instanciaComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adcionarComponentes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();

        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adcionarComponentes() {
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
    public void instanciaComponentes() {
        jButton01 = new JButton("Exercicio 01");
        jButton02 = new JButton("Exercicio 02");
        jButton03 = new JButton("Exercicio 03");
        jButton04 = new JButton("Exercicio 04");
        jButton05 = new JButton("Exercicio 05");
        jButton06 = new JButton("Exercicio 06");
        jButton07 = new JButton("Exercicio 07");
        jButton08 = new JButton("Exercicio 08");
        jButton09 = new JButton("Exercicio 09");

    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10, 10);
        jButton02.setLocation(120, 10);
        jButton03.setLocation(230, 10);
        jButton04.setLocation(340, 10);
        jButton05.setLocation(10, 120);
        jButton06.setLocation(120, 120);
        jButton07.setLocation(230, 120);
        jButton08.setLocation(340, 120);
        jButton09.setLocation(10, 230);

    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
        jButton09.setSize(100, 100);

    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    
 
    }
 
  

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01Lista09();
            }
        });
    }

 

}


