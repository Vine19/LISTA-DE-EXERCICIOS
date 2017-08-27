
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class Ex2Prog2 extends javax.swing.JFrame {

    /**
     * Creates new form Ex2Prog2
     */
    public Ex2Prog2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPeso = new javax.swing.JLabel();
        lblSelectPlan = new javax.swing.JLabel();
        btnMercurio = new javax.swing.JRadioButton();
        btnVenus = new javax.swing.JRadioButton();
        btnMarte = new javax.swing.JRadioButton();
        btnJupiter = new javax.swing.JRadioButton();
        btnSaturno = new javax.swing.JRadioButton();
        btnUrano = new javax.swing.JRadioButton();
        btnEnviarPeso = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPeso.setText("Peso na Terra (Kg): ");

        lblSelectPlan.setText("Selecione o Planeta:");

        btnMercurio.setText("Mercúrio");

        btnVenus.setText("Vênus");

        btnMarte.setText("Marte");

        btnJupiter.setText("Jupiter");

        btnSaturno.setText("Saturno");

        btnUrano.setText("Urano");

        btnEnviarPeso.setText("Calcular Peso");
        btnEnviarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPesoActionPerformed(evt);
            }
        });

        txtPeso.setText("Peso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMercurio)
                            .addComponent(btnVenus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMarte)
                            .addComponent(btnJupiter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUrano)
                            .addComponent(btnSaturno)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnEnviarPeso)))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblPeso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblPeso)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectPlan)
                    .addComponent(btnEnviarPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMercurio)
                    .addComponent(btnMarte)
                    .addComponent(btnSaturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenus)
                    .addComponent(btnJupiter)
                    .addComponent(btnUrano))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btnEnviarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPesoActionPerformed
        String pesoTerra = txtPeso.getText();
        double pTerra = Integer.parseInt(pesoTerra);
        double resposta = 0;
        String planeta = null;
        
        if(btnMercurio.isSelected()){
            planeta = "Mercurio" ;
            resposta = (pTerra/10) * 0.37;
        }
        
        if(btnVenus.isSelected()){
            planeta = "Vênus" ;
            resposta = (pTerra/10) * 0.88;
        }
        
        if(btnMarte.isSelected()){
            planeta = "Marte" ;
            resposta = (pTerra/10) * 0.38;
        }
        
        if(btnJupiter.isSelected()){
            planeta = "Jupiter" ;
            resposta = (pTerra/10) * 2.54;
        }
        
        if(btnSaturno.isSelected()){
            planeta = "Saturno" ;
            resposta = (pTerra/10) * 1.15;
        }
        
        if(btnUrano.isSelected()){
            planeta = "Urano" ;
            resposta = (pTerra/10) * 1.17;
        }
        
        JOptionPane.showMessageDialog(null, "Seu peso em " + planeta + " é " +resposta+ "");
    }//GEN-LAST:event_btnEnviarPesoActionPerformed

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
            java.util.logging.Logger.getLogger(Ex2Prog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex2Prog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex2Prog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex2Prog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ex2Prog2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarPeso;
    private javax.swing.JRadioButton btnJupiter;
    private javax.swing.JRadioButton btnMarte;
    private javax.swing.JRadioButton btnMercurio;
    private javax.swing.JRadioButton btnSaturno;
    private javax.swing.JRadioButton btnUrano;
    private javax.swing.JRadioButton btnVenus;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSelectPlan;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}