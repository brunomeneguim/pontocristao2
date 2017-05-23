package pontocristao.visao;

import java.awt.Frame;

/**
 *
 * @author Bruno
 */
public class FrmContato extends javax.swing.JDialog {

    private static Frame frame;

    public static FrmContato Mostrar(java.awt.Frame parent) {
        frame = parent;
        FrmContato frmContato = new FrmContato(parent, true);
        frmContato.setVisible(true);
        return frmContato;
    }

    public FrmContato(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lContato = new javax.swing.JLabel();
        lTelefoneDesenvolvedor = new javax.swing.JLabel();
        lCelularDesenvolvedor = new javax.swing.JLabel();
        lEmailDesenvolvedor = new javax.swing.JLabel();
        lTelefoneFaculdade = new javax.swing.JLabel();
        lEmailFaculdade = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lContato.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lContato.setText("Contato");

        lTelefoneDesenvolvedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lTelefoneDesenvolvedor.setText("Telefone Desenvolvedor: (42) 3035-2002");

        lCelularDesenvolvedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lCelularDesenvolvedor.setText("Celular Desenvolvedor: (42) 9-9922-7422");

        lEmailDesenvolvedor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lEmailDesenvolvedor.setText("E-mail Desenvolvedor: brunomeneguim@hotmail.com");

        lTelefoneFaculdade.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lTelefoneFaculdade.setText("Telefone Faculdade: (42) 3622-2000");

        lEmailFaculdade.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lEmailFaculdade.setText("E-mail Faculdade: faleconosco@faculdadeguairaca.com.br");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pontocristao/icones/BtnConfirmar.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lContato, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTelefoneFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEmailDesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lEmailFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lTelefoneDesenvolvedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lCelularDesenvolvedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jButton1)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lContato)
                .addGap(18, 18, 18)
                .addComponent(lTelefoneDesenvolvedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCelularDesenvolvedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmailDesenvolvedor)
                .addGap(18, 18, 18)
                .addComponent(lTelefoneFaculdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEmailFaculdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmContato dialog = new FrmContato(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lCelularDesenvolvedor;
    private javax.swing.JLabel lContato;
    private javax.swing.JLabel lEmailDesenvolvedor;
    private javax.swing.JLabel lEmailFaculdade;
    private javax.swing.JLabel lTelefoneDesenvolvedor;
    private javax.swing.JLabel lTelefoneFaculdade;
    // End of variables declaration//GEN-END:variables
}
