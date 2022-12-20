package jframe_teste;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaJPanel implements ActionListener {

    private JFrame jan1 = new JFrame();

    private String[] colunas = {"Nome", "Idade","email"};

    private DefaultTableModel model = new DefaultTableModel(colunas,0);
    private JTable tableDados = new JTable(model);
    private JScrollPane barraRolagemLista = new JScrollPane(tableDados);

    private JButton btImprimirTodos = new JButton();
    private JButton btExcluirTodos = new JButton();
    private JButton btSair = new JButton();

    private List<Pessoa> listaPessoas = Pessoa.criaLista();

    private int larg = 600, alt =500;

    public void carregaJanela() {

        jan1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jan1.setLayout(new GridLayout(4,1,10,10));
        jan1.setSize(larg,alt);
        jan1.setTitle("Exemplo de JPanel");
        jan1.getContentPane().setBackground(Color.WHITE);

        jan1.setTitle("Imprimir/Excluir todos");

        btImprimirTodos.setText("Imprimir Todos");
        btImprimirTodos.setMnemonic('I');
        btImprimirTodos.addActionListener(this);

        btExcluirTodos.setText("Excluir Todos");
        btExcluirTodos.setMnemonic('E');
        btExcluirTodos.addActionListener(this);
        btExcluirTodos.setPreferredSize(new Dimension(40, 40));

        btSair.setText("Sair");
        btSair.setMnemonic('S');
        btSair.addActionListener(this);

        jan1.add( barraRolagemLista );
        jan1.add( btImprimirTodos   );
        jan1.add( btExcluirTodos    );
        jan1.add( btSair            );

        jan1.setVisible( true );
    }

    @Override
    public void actionPerformed( ActionEvent act ) {

        if(act.getSource().equals(btImprimirTodos)) {

            imprimeDadosPessoa();

        } else if ( act.getSource( ).equals( btExcluirTodos ) ) {

            if ( excluirTodosDados ( ) ) {

                JOptionPane.showMessageDialog( null,"Dados removidos" , "Sucesso",  JOptionPane.INFORMATION_MESSAGE );
                DefaultTableModel    model = new DefaultTableModel( colunas, 0 );
                tableDados.setModel( model );
            }


        }else if(act.getSource().equals(btSair)) {
            jan1.dispose();
        }
    }
    public void imprimeDadosPessoa() {

        if(listaPessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Não há pessoas cadastradas." , "ERRO",  JOptionPane.ERROR_MESSAGE);

        }else {
            model = new DefaultTableModel(colunas,0);

            for(Pessoa pessoa : listaPessoas) {

                String[] dados = {pessoa.getNome(), String.valueOf(pessoa.getIdade()), pessoa.getEmail()};
                model.addRow(dados);

            }

            tableDados.setModel(model);
        }
    }

    public boolean excluirTodosDados() {

        if(listaPessoas.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Não há dados a serem removidos." , "ERRO",  JOptionPane.ERROR_MESSAGE);
            return false;
        }else {

            listaPessoas = new ArrayList<>();
        }
        return true;
    }
}
