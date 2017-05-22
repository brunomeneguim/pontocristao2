package pontocristao.visao;

import java.awt.*;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import pontocristao.controle.*;
import pontocristao.modelo.*;
import pontocristao.util.Utilidades;

/**
 *
 * @author Marcondes
 */
public class FrmCaixa extends javax.swing.JDialog {

    private DefaultTableModel modeloTabela;
    private ControleCaixa controle = new ControleCaixa();
    private static Frame frame;
    private java.util.List<MovimentacaoCaixa> lista;

    public static FrmCaixa Mostrar(java.awt.Frame parent) {
        frame = parent;
        FrmCaixa frm = new FrmCaixa(parent, true);
        frm.setVisible(true);
        return frm;
    }

    public FrmCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AjustarTabela();

        Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setBounds(bounds);

        jspSaldo.setEnabled(false);
        
        Listar();
        AtualizarSaldo();
    }

    private void AjustarTabela() {
        String[] colunas = new String[]{"Operação", "Data", "Valor", "Tipo de movimentação", "Descrição"};
        modeloTabela = new DefaultTableModel(null, colunas) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        jTableLista.setModel(modeloTabela);
        jTableLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void AtualizarTabela(java.util.List<MovimentacaoCaixa> movimentacoes) {
        while (modeloTabela.getRowCount() > 0) {
            modeloTabela.removeRow(0);
        }

        lista = movimentacoes;

        for (MovimentacaoCaixa movimentacao : movimentacoes) {
            AdicionarLinha(movimentacao);
        }
    }

    private void AdicionarLinha(MovimentacaoCaixa movimentacao) {
        modeloTabela.addRow(RetornarNovaLinha(movimentacao));
    }

    private Object[] RetornarNovaLinha(MovimentacaoCaixa movimentacao) {
        String operacao = "";
        String tipo = "";
        String descricao = "";
        
        if(movimentacao instanceof MovimentacaoCaixaContaPagar)
        {
            operacao = "Débito";
            tipo = "Pagamento de conta";
            descricao = "Identificador da conta: " + ((MovimentacaoCaixaContaPagar) movimentacao).getContaPagar().getId();
        }
        else if(movimentacao instanceof MovimentacaoCaixaDeposito)
        {
            operacao = "Crédito";
            tipo = "Depósito";
            descricao = ((MovimentacaoCaixaDeposito) movimentacao).getDescricao();
        }
        else if(movimentacao instanceof MovimentacaoCaixaLocacao)
        {
            operacao = "Crédito";
            tipo = "Pagamento de locação";
            descricao = "Identificador da locação: " + ((MovimentacaoCaixaLocacao) movimentacao).getLocacao().getId();
        }
        else if(movimentacao instanceof MovimentacaoCaixaRetirada)
        {
            operacao = "Débito";
            tipo = "Retirada";
            descricao = ((MovimentacaoCaixaRetirada) movimentacao).getDescricao();
        }
        else if(movimentacao instanceof MovimentacaoCaixaVenda)
        {
            operacao = "Crédito";
            tipo = "Pagamento de venda";
            descricao = "Identificador da venda: " + ((MovimentacaoCaixaVenda) movimentacao).getVenda().getId();
        }
        else
        {
            Utilidades.MostrarMensagemErro(new Exception("Tipo desconhecido."));
        }

        return new Object[]{
            operacao,
            movimentacao.getData(),
            movimentacao.getValor(),
            tipo,
            descricao
        };
    }

    public void Listar() {
        try {
            AtualizarTabela(controle.RetornarMovimentacoesCaixa());
        } catch (Exception e) {
            Utilidades.MostrarMensagemErro(e);
        }
    }
    
    public void AtualizarSaldo()
    {
        double saldo = controle.RetornarCaixa().getSaldo();
        jspSaldo.setValue(saldo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRetirar = new javax.swing.JButton();
        BtnDepositar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        BtnSair = new javax.swing.JButton();
        jspSaldo = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Locação");

        BtnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnNovo.png"))); // NOI18N
        BtnRetirar.setText("Retirar");
        BtnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetirarActionPerformed(evt);
            }
        });

        BtnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnEditar.png"))); // NOI18N
        BtnDepositar.setText("Depositar");
        BtnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDepositarActionPerformed(evt);
            }
        });

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableLista);

        BtnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnSair.png"))); // NOI18N
        BtnSair.setText("Sair");
        BtnSair.setPreferredSize(new java.awt.Dimension(139, 65));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        jspSaldo.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 0.0d));

        jLabel1.setText("Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnRetirar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDepositar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jspSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetirarActionPerformed
        FrmCaixaRetirada frmCaixaRetirada = FrmCaixaRetirada.Mostrar(frame);
        
        if (frmCaixaRetirada.getModeloAtualizado()) {
            MovimentacaoCaixa movimentacao = frmCaixaRetirada.getMovimentacao();
            modeloTabela.addRow( RetornarNovaLinha(movimentacao));
            jspSaldo.setValue(movimentacao.getCaixa().getSaldo());
        }
    }//GEN-LAST:event_BtnRetirarActionPerformed

    private void BtnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDepositarActionPerformed
        FrmCaixaDeposito frmCaixaDeposito = FrmCaixaDeposito.Mostrar(frame);
        
        if (frmCaixaDeposito.getModeloAtualizado()) {
            MovimentacaoCaixa movimentacao = frmCaixaDeposito.getMovimentacao();
            modeloTabela.addRow( RetornarNovaLinha(movimentacao));
            jspSaldo.setValue(movimentacao.getCaixa().getSaldo());
        }
    }//GEN-LAST:event_BtnDepositarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(null,
                "Deseja sair do caixa? ",
                "Confirmação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                botoes, botoes[0]);
        if (resposta == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastrarLocacao dialog = new FrmCadastrarLocacao(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDepositar;
    private javax.swing.JButton BtnRetirar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    private javax.swing.JSpinner jspSaldo;
    // End of variables declaration//GEN-END:variables
}
