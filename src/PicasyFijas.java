/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEJA
 */
import java.util.Random;
public class PicasyFijas extends javax.swing.JFrame {
char [] random=new char [4]; 

    /**
     * Creates new form PicasyFijas
     */
    public PicasyFijas() {
        initComponents();
        this.setLocationRelativeTo(null);
        String $letras=new String("abcdefghijklmnñopqrstuvwxyz");
        for(int i=0;i<4;i++){
            Random $nletra=new Random();
            byte $postletra = (byte) $nletra.nextInt($letras.length()-1);
            random[i]=($letras.charAt($postletra));        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtprocedimiento = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtletra = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtprocedimiento1 = new javax.swing.JTextArea();
        btnlimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        txtprocedimiento.setColumns(20);
        txtprocedimiento.setRows(5);
        jScrollPane2.setViewportView(txtprocedimiento);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Picas y Fijas con Letras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jButton2.setText("Ir a menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, -1, -1));

        txtletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtletraActionPerformed(evt);
            }
        });
        getContentPane().add(txtletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 90, 40));

        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btninsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        txtprocedimiento1.setColumns(20);
        txtprocedimiento1.setRows(5);
        jScrollPane3.setViewportView(txtprocedimiento1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 150));

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por favor inserte una palabra de 4 letras. ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dfdfgrfyiu/9.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Lab7 a=new Lab7();
        a.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtletraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtletraActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
        char [] character=new char[4];
        int pica,fija;
        pica=0;
        fija=0;
        String t1=txtletra.getText();
        for (int i = 0; i < character.length; i++) {
            character[i]=(char) t1.charAt(i);
        }
        for (int i = 0; i < random.length; i++) {
            if (random[0]==character[i]) {
                if(random[0]==character[0])
                fija++;
                else
                pica++;
            } else {
                if (random[1]==character[i]) {
                    if(random[1]==character[1])
                    fija++;
                    else
                    pica++;
                } else {
                    if (random[2]==character[i]) {
                        if(random[2]==character[2])
                        fija++;
                        else
                        pica++;
                    } else {
                        if (random[3]==character[i]) {
                            if(random[3]==character[3])
                            fija++;
                            else
                            pica++;
                        }
                    }
                }
            }
        }
        String [] $con=new  String [4] ;
        for (int i = 0; i < character.length; i++) {
            $con[i]=Integer.toString(character[i]);
            txtprocedimiento.append($con[i]);
        }
        txtprocedimiento.append("La palabra tiene " +pica+ " picas, " +fija+ " fijas"+"\n");
        if(fija==4){
            txtprocedimiento.append("Muy bien, haz acertado" + "\n");
        }
        
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        txtprocedimiento.setText("");
        txtletra.setText("");
        String $letras=new String(" abcdefghijklmnñopqrstuvwxyz ");
        for(int i=0;i<4;i++){
            Random $nletra=new Random();
            byte $postletra = (byte) $nletra.nextInt($letras.length()-1);
            random[i]=($letras.charAt($postletra));
        }

    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(PicasyFijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PicasyFijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PicasyFijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PicasyFijas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PicasyFijas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtletra;
    private javax.swing.JTextArea txtprocedimiento;
    private javax.swing.JTextArea txtprocedimiento1;
    // End of variables declaration//GEN-END:variables
}
