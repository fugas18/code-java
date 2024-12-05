
import java.awt.Color;
import java.io.File;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 6487
 */
public class jF_Ajuda extends javax.swing.JFrame {

    int tema;
    
    Color corFundo = new Color(153, 51, 0);
    Color corLetras = new Color(255, 153, 0);

    /**
     * Creates new form jF_Ajuda
     */
    public jF_Ajuda() {
        initComponents();
    }

    private void setThemeDark() {

        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setForeground(Color.LIGHT_GRAY);

        jBtnRelogio.setBackground(Color.DARK_GRAY);
        jBtnRelogio.setForeground(Color.LIGHT_GRAY);

        jBtnCronometro.setBackground(Color.DARK_GRAY);
        jBtnCronometro.setForeground(Color.LIGHT_GRAY);

        jBtnMenu.setBackground(Color.DARK_GRAY);
        jBtnMenu.setForeground(Color.LIGHT_GRAY);

        jBtnSaida.setBackground(Color.DARK_GRAY);
        jBtnSaida.setForeground(Color.LIGHT_GRAY);

        

    }

    private void setThemeLight() {

        jPanel1.setBackground(Color.LIGHT_GRAY);
        jPanel1.setForeground(Color.BLACK);

        jBtnRelogio.setBackground(Color.LIGHT_GRAY);
        jBtnRelogio.setForeground(Color.BLACK);

        jBtnCronometro.setBackground(Color.LIGHT_GRAY);
        jBtnCronometro.setForeground(Color.BLACK);

        jBtnMenu.setBackground(Color.LIGHT_GRAY);
        jBtnMenu.setForeground(Color.BLACK);

        jBtnSaida.setBackground(Color.LIGHT_GRAY);
        jBtnSaida.setForeground(Color.BLACK);

    }

    private void setThemeGold() {

        jPanel1.setBackground(corFundo);
        jPanel1.setForeground(corLetras);

        jBtnRelogio.setBackground(corFundo);
        jBtnRelogio.setForeground(corLetras);

        jBtnCronometro.setBackground(corFundo);
        jBtnCronometro.setForeground(corLetras);

        jBtnMenu.setBackground(corFundo);
        jBtnMenu.setForeground(corLetras);

        jBtnSaida.setBackground(corFundo);
        jBtnSaida.setForeground(corLetras);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnMenu = new javax.swing.JButton();
        jBtnRelogio = new javax.swing.JButton();
        jBtnCronometro = new javax.swing.JButton();
        jBtnSaida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnMenu.setText("Menu");
        jBtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 114, 43));

        jBtnRelogio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnRelogio.setText("Relógio");
        jBtnRelogio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRelogioActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnRelogio, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 260, 114, 43));

        jBtnCronometro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnCronometro.setText("Cronometro");
        jBtnCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCronometroActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 260, 114, 43));

        jBtnSaida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtnSaida.setText("Saída");
        jBtnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaidaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 260, 114, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnRelogioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRelogioActionPerformed
        // TODO add your handling code here:

        // Instância de jFRelogio(Form de relógio)
        jF_Relogio FRelogio = new jF_Relogio() {
        };

        // Botão que abre o formulário jF_Relogio
        FRelogio.setVisible(true);

        // Fecha form Menu_TimeAPP
        this.dispose();

    }//GEN-LAST:event_jBtnRelogioActionPerformed

    private void jBtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMenuActionPerformed
        // TODO add your handling code here:

        // Menu_TimeApp MTAPP = new Menu_TimeApp();
        Menu_TimeApp MTAPP = new Menu_TimeApp();

        //  Botão que permite abrir o Menu
        MTAPP.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jBtnMenuActionPerformed

    private void jBtnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaidaActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jBtnSaidaActionPerformed

    private void jBtnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCronometroActionPerformed
        // TODO add your handling code here:

        // Instância de jF_Cronometro(Form de Cronometro)
        jF_Cronometro FCronometro = new jF_Cronometro();

        // Botão que abre o formulário jF_Cronometro
        FCronometro.setVisible(true);

        // Fecha form Menu_TimeAPP
        this.dispose();

    }//GEN-LAST:event_jBtnCronometroActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("tema.txt"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            tema = Integer.parseInt(line);

        }

        switch (tema) {
            case 0:
                setThemeLight();
                break;
            case 1:
                setThemeDark();
                break;
            default:
                setThemeGold();
                break;
        }

    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(jF_Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jF_Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jF_Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jF_Ajuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jF_Ajuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCronometro;
    private javax.swing.JButton jBtnMenu;
    private javax.swing.JButton jBtnRelogio;
    private javax.swing.JButton jBtnSaida;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}