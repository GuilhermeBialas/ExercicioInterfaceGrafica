package Interface00;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos Guilherme Bialas
 */
public class ExemploJTable01 implements JFrameBaseInterfaceJava {

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private DefaultTableModel defaulTableModel;
    private JScrollPane jScrollPane;

    public ExemploJTable01() {
        gerarTela();
        instanciarComponentes();
        gerarComponentes();
        gerarDimensoes();
        adicionarComponentes();
        gerarLocalizacoes();
        configurarTableModel();

    }

    @Override
    public void gerarComponentes() {
       
    }

    @Override
    public void instanciarComponentes() {
        jTable = new JTable();
        new Object[] colunas {"Nome", "Idade", "Altura"};
       
      defaultTableModel = new DefaultTableModel
      defaultTableModel = new DefaultTableModel(colunas , 0){
        
                 
                 }; 
        jScrollPane = new JScrollPane(jTable);
      configurarTableModel();
    }

    @Override
    public void gerarDimensoes() {
        jTable.setSize(400, 400);
    }

    @Override
    public void gerarLocalizacoes() {
        jTable.add(jTable);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jScrollPane);

    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void configurarTableModel() {
        defaultTableModel.addRow(new Object[]{
            "Gustavo", 22, 1.68});
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 1.75});
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76});

        jTable.setModel(defaultTableModel);
    }
}
