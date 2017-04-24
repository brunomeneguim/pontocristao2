package pontocristao.visao;

import java.awt.*;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;
import pontocristao.controle.*;
import pontocristao.modelo.*;
import pontocristao.util.Utilidades;

/**
 *
 * @author Marcondes
 */
public class FrmCadastrarLocacao extends javax.swing.JDialog {

    private static Frame frame;
    private ControleFilme controle;
    private Boolean modeloAtualizado = false;
    private java.util.List<Fornecedor> listaFornecedores;
    private java.util.List<TipoFilme> listaTiposFilme;

    public Boolean getModeloAtualizado() {
        return modeloAtualizado;
    }

    public Filme getFilme() {
        return controle.getFilme();
    }

    public FrmCadastrarLocacao(java.awt.Frame parent, boolean modal, long id) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

        txtCodigo.setEnabled(false);
        jcDataLocacao.setEnabled(false);
        
        txtNomeProduto.requestFocus();

        InicializarControle(id);
    }

    public static FrmCadastrarLocacao Mostrar(java.awt.Frame parent, long id) {
        frame = parent;
        FrmCadastrarLocacao frm = new FrmCadastrarLocacao(parent, true, id);
        frm.setVisible(true);
        return frm;
    }

    private void InicializarControle(long id) {
        controle = new ControleFilme();
        
        listaFornecedores = controle.RetornarFornecedores();
        listaTiposFilme = controle.RetornarTiposFilme();
        
        for (Fornecedor fornecedor : listaFornecedores) {
            jComboFornecedor.addItem(RetornarDescricaoFornecedor(fornecedor));
        }
        
        for (TipoFilme tipoFilme : listaTiposFilme) {
            jComboTipoFilme.addItem(RetornarDescricaoTipoFilme(tipoFilme));
        }
        
        jComboFornecedor.setSelectedIndex(-1);
        jComboTipoFilme.setSelectedIndex(-1);
        
        if (id > 0) {
            Exception erro = controle.RecuperarFilme(id);

            if (erro != null) {
                Utilidades.MostrarMensagemErro(erro);
            } else {
                AtualizarCampos();
            }
        }
    }
    
    private String RetornarDescricaoFornecedor(Fornecedor fornecedor) {
        return fornecedor.getId() + " - " + fornecedor.getNomeFantasia() + " - " + fornecedor.getCnpj();
    }
    
    private String RetornarDescricaoTipoFilme(TipoFilme tipoFilme) {
        return tipoFilme.getId() + " - " + tipoFilme.getDescricao();
    }

    private void AtualizarCampos() {
        txtCodigo.setText(String.valueOf(controle.getFilme().getId()));
        txtCodigoBarra.setText(controle.getFilme().getCodigoBarra());
        jcDataLocacao.setDate(controle.getFilme().getDataCadastro());
        txtNomeProduto.setText(controle.getFilme().getNome());
        jspValor.setValue(controle.getFilme().getValorVenda());
        jspQuantidade.setValue(controle.getFilme().getQuantidade());
        jComboFornecedor.setSelectedItem(RetornarDescricaoFornecedor(controle.getFilme().getFornecedor()));
        jComboTipoFilme.setSelectedItem(RetornarDescricaoTipoFilme(controle.getFilme().getTipoFilme()));
        chkLancamento.setSelected(controle.getFilme().getLancamento());
    }

    private void AtualizarModelo() {
        controle.getFilme().setCodigoBarra(txtCodigoBarra.getText());
        controle.getFilme().setNome(txtNomeProduto.getText());
        controle.getFilme().setValorVenda((Double)jspValor.getValue());
        controle.getFilme().setQuantidade((Integer)jspQuantidade.getValue());
        controle.getFilme().setLancamento(chkLancamento.isSelected());
        String descricaoFornecedor = jComboFornecedor.getSelectedItem().toString();
        String descricaoTipoProduto = jComboTipoFilme.getSelectedItem().toString();
        
        for (Fornecedor fornecedor : listaFornecedores) {
            if (RetornarDescricaoFornecedor(fornecedor).equals(descricaoFornecedor)) {
                controle.getFilme().setFornecedor(fornecedor);
            }
        }
        
        for (TipoFilme tipoFilme : listaTiposFilme) {
            if (RetornarDescricaoTipoFilme(tipoFilme).equals(descricaoTipoProduto)) {
                controle.getFilme().setTipoFilme(tipoFilme);
            }
        }
    }

    public Boolean ValidaCampos() {
        Boolean retorno = true;

        if (txtNomeProduto.getText().equals("")
                || jspValor.getValue().toString().equals("")){
            retorno = false;
            JOptionPane.showMessageDialog(null, "Todos os campos em negrito devem estar preenchidos.");
        }

        return retorno;
    }

    @Override
    public void dispose() {
        if (controle != null) {
            controle.Dispose();
        }

        super.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCodigo = new javax.swing.JLabel();
        jspValor = new javax.swing.JSpinner();
        BtnCancelar = new javax.swing.JButton();
        BtnConfirmar1 = new javax.swing.JButton();
        lValorVenda = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lNomeProduto = new javax.swing.JLabel();
        jcDataLocacao = new com.toedter.calendar.JDateChooser();
        txtCodigo = new javax.swing.JTextField();
        lDataLocacao = new javax.swing.JLabel();
        BtnPesquisarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Filmes");

        lCodigo.setText("Código");

        jspValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnCancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnConfirmar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnConfirmar.png"))); // NOI18N
        BtnConfirmar1.setText("Confirmar");
        BtnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmar1ActionPerformed(evt);
            }
        });

        lValorVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lValorVenda.setText("Valor de Locação*");

        lNomeProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNomeProduto.setText("Nome do Cliente*");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setEnabled(false);

        lDataLocacao.setText("Data de Locação");

        BtnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnPesquisar.png"))); // NOI18N
        BtnPesquisarCliente.setText("Pesquisar Cliente");
        BtnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnConfirmar1)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lValorVenda)
                            .addComponent(jspValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lCodigo))
                                        .addGap(186, 186, 186)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lDataLocacao)
                                            .addComponent(jcDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lNomeProduto)
                                    .addComponent(txtNomeProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPesquisarCliente)))
                        .addGap(0, 167, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(lDataLocacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcDataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNomeProduto)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lValorVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnConfirmar1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmar1ActionPerformed
        if (ValidaCampos()) {
            AtualizarModelo();

            Exception erro = controle.Salvar();

            if (erro != null) {
                Utilidades.MostrarMensagemErro(erro);
            } else {
                modeloAtualizado = true;
                this.dispose();
            }
        }
    }//GEN-LAST:event_BtnConfirmar1ActionPerformed

    private void BtnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarClienteActionPerformed

    }//GEN-LAST:event_BtnPesquisarClienteActionPerformed

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
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar1;
    private javax.swing.JButton BtnPesquisarCliente;
    private com.toedter.calendar.JDateChooser jcDataLocacao;
    private javax.swing.JSpinner jspValor;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDataLocacao;
    private javax.swing.JLabel lNomeProduto;
    private javax.swing.JLabel lValorVenda;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
