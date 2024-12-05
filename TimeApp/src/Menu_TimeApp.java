
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 6487
 */
public class Menu_TimeApp extends javax.swing.JFrame {

    /**
     * Creates new form Menu_TimeApp
     *
     * Este formulário serve como menu. Não pode ser redimensionado e não dispõe
     * de borda (border).
     *
     * O tema é uma variante de cor aplicada programaticamente e controlada
     * através de uma variàvel de controlo inteira com o mesmo nome. A alteração
     * do valor desta variàvel é dada pela ação sobre os botoes "L", "D" e "G".
     *
     * A navegação é garantida através dos bot~es associados aos respectivos
     * formulários
     *
     *
     */
    //Definição de variáveis globais 
    /*------------------------------------------------------------------*/
    Color corFundo = new Color(153, 51, 0); //cor de fundo de tema Gold. 
    Color corLetras = new Color(255, 153, 0); // cor das letras de tema Gold.

    int tema; //Variável de controlo para os temas

    /*------------------------------------------------------------------*/
    public Menu_TimeApp() {
        initComponents();

    }

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
            java.util.logging.Logger.getLogger(Menu_TimeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_TimeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_TimeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_TimeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_TimeApp().setVisible(true);
            }
        });
    }

    private void setThemeDark() {

        jPanel1.setBackground(Color.DARK_GRAY);
        jPanel1.setForeground(Color.LIGHT_GRAY);

        jPanel2.setBackground(Color.DARK_GRAY);
        jPanel2.setForeground(Color.LIGHT_GRAY);

        jBtn_Relogio3.setBackground(Color.DARK_GRAY);
        jBtn_Relogio3.setForeground(Color.LIGHT_GRAY);

        jBtn_Cronometro.setBackground(Color.DARK_GRAY);
        jBtn_Cronometro.setForeground(Color.LIGHT_GRAY);

        jBtn_Ajuda.setBackground(Color.DARK_GRAY);
        jBtn_Ajuda.setForeground(Color.LIGHT_GRAY);

        jBtn_Saida.setBackground(Color.DARK_GRAY);
        jBtn_Saida.setForeground(Color.LIGHT_GRAY);

        jBtn_Cronometro.setBackground(Color.DARK_GRAY);
        jBtn_Cronometro.setForeground(Color.LIGHT_GRAY);

        jBtn_Light.setBackground(Color.DARK_GRAY);
        jBtn_Light.setForeground(Color.LIGHT_GRAY);

        jBtn_Dark.setBackground(Color.DARK_GRAY);
        jBtn_Dark.setForeground(Color.LIGHT_GRAY);

        jBtn_Gold.setBackground(Color.DARK_GRAY);
        jBtn_Gold.setForeground(Color.LIGHT_GRAY);

    }

    private void setThemeLight() {

        jPanel1.setBackground(Color.LIGHT_GRAY);
        jPanel1.setForeground(Color.BLACK);

        jPanel2.setBackground(Color.LIGHT_GRAY);
        jPanel2.setForeground(Color.BLACK);

        jBtn_Relogio3.setBackground(Color.LIGHT_GRAY);
        jBtn_Relogio3.setForeground(Color.BLACK);

        jBtn_Cronometro.setBackground(Color.LIGHT_GRAY);
        jBtn_Cronometro.setForeground(Color.BLACK);

        jBtn_Ajuda.setBackground(Color.LIGHT_GRAY);
        jBtn_Ajuda.setForeground(Color.BLACK);

        jBtn_Saida.setBackground(Color.LIGHT_GRAY);
        jBtn_Saida.setForeground(Color.BLACK);

        jBtn_Cronometro.setBackground(Color.LIGHT_GRAY);
        jBtn_Cronometro.setForeground(Color.BLACK);

        jBtn_Light.setBackground(Color.LIGHT_GRAY);
        jBtn_Light.setForeground(Color.BLACK);

        jBtn_Dark.setBackground(Color.LIGHT_GRAY);
        jBtn_Dark.setForeground(Color.BLACK);

        jBtn_Gold.setBackground(Color.LIGHT_GRAY);
        jBtn_Gold.setForeground(Color.BLACK);

    }

    private void setThemeGold() {

        jPanel1.setBackground(corFundo);
        jPanel1.setForeground(corLetras);

        jPanel2.setBackground(corFundo);
        jPanel2.setForeground(corLetras);

        jBtn_Relogio3.setBackground(corFundo);
        jBtn_Relogio3.setForeground(corLetras);

        jBtn_Cronometro.setBackground(corFundo);
        jBtn_Cronometro.setForeground(corLetras);

        jBtn_Ajuda.setBackground(corFundo);
        jBtn_Ajuda.setForeground(corLetras);

        jBtn_Saida.setBackground(corFundo);
        jBtn_Saida.setForeground(corLetras);

        jBtn_Cronometro.setBackground(corFundo);
        jBtn_Cronometro.setForeground(corLetras);

        jBtn_Light.setBackground(corFundo);
        jBtn_Light.setForeground(corLetras);

        jBtn_Dark.setBackground(corFundo);
        jBtn_Dark.setForeground(corLetras);

        jBtn_Gold.setBackground(corFundo);
        jBtn_Gold.setForeground(corLetras);

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
        jBtn_Ajuda = new javax.swing.JButton();
        jBtn_Saida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtn_Cronometro = new javax.swing.JButton();
        jBtn_Relogio3 = new javax.swing.JButton();
        jBtn_Light = new javax.swing.JButton();
        jBtn_Dark = new javax.swing.JButton();
        jBtn_Gold = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn_Ajuda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtn_Ajuda.setText("Ajuda");
        jBtn_Ajuda.setPreferredSize(new java.awt.Dimension(75, 25));
        jBtn_Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AjudaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 165, 162, 55));

        jBtn_Saida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtn_Saida.setText("Saida");
        jBtn_Saida.setPreferredSize(new java.awt.Dimension(75, 25));
        jBtn_Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn_SaidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn_SaidaMouseExited(evt);
            }
        });
        jBtn_Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SaidaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Saida, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 232, 162, 55));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn_Cronometro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtn_Cronometro.setText("Cronometro");
        jBtn_Cronometro.setPreferredSize(new java.awt.Dimension(75, 25));
        jBtn_Cronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_CronometroActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_Cronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 162, 55));

        jBtn_Relogio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtn_Relogio3.setText("Relógio");
        jBtn_Relogio3.setPreferredSize(new java.awt.Dimension(75, 25));
        jBtn_Relogio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Relogio3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn_Relogio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 162, 55));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 197, 155));

        jBtn_Light.setText("L");
        jBtn_Light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LightActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Light, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 305, 47, -1));

        jBtn_Dark.setText("D");
        jBtn_Dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_DarkActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 305, 47, -1));

        jBtn_Gold.setText("G");
        jBtn_Gold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtn_GoldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBtn_GoldMouseExited(evt);
            }
        });
        jBtn_Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_GoldActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Gold, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 305, 47, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_Relogio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Relogio3ActionPerformed
        // TODO add your handling code here:

        // Instância de jFRelogio(Form de relógio)
        jF_Relogio FRelogio = new jF_Relogio() {
        };

        // Botão que abre o formulário jF_Relogio
        FRelogio.setVisible(true);

        // Fecha form Menu_TimeAPP
        this.dispose();


    }//GEN-LAST:event_jBtn_Relogio3ActionPerformed

    private void jBtn_CronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_CronometroActionPerformed
        // TODO add your handling code here:

        // Instância de jF_Cronometro(Form de Cronometro)
        jF_Cronometro FCronometro = new jF_Cronometro() {
        };

        // Botão que abre o formulário jF_Cronometro
        FCronometro.setVisible(true);

        // Fecha form Menu_TimeAPP
        this.dispose();

    }//GEN-LAST:event_jBtn_CronometroActionPerformed

    private void jBtn_AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AjudaActionPerformed
        // TODO add your handling code here:

        // Instância de jF_Ajuda(Form de Ajuda)
        jF_Ajuda FAjuda = new jF_Ajuda() {
        };

        // Botão que abre o formulário jF_Cronometro
        FAjuda.setVisible(true);

        // Fecha form Menu_TimeAPP
        this.dispose();

    }//GEN-LAST:event_jBtn_AjudaActionPerformed

    private void jBtn_SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SaidaActionPerformed
        // TODO add your handling code here:

        //Fecha este formulário
        this.dispose();

    }//GEN-LAST:event_jBtn_SaidaActionPerformed

    private void jBtn_DarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_DarkActionPerformed
        // TODO add your handling code here:
        //O botão vai aplicar o tema e gravar o valor correspondente em tema.txt

        tema = 1; //Variavel Dark tem valor 1
        setThemeDark(); //Chama o método setThemeDark para aplicar o tema Escuro

        //O try é utilizado para o controlo de excepções 
        try {
            PrintWriter writer = new PrintWriter("tema.txt");
            writer.println(tema); //Escrita do valor de tema no ficheiro
            writer.close(); //Fechar ficheiro 

        } catch (Exception e) {
            System.out.println(e.getMessage());// Em caso de excepção escreve a mensagem associada.
        }
    }//GEN-LAST:event_jBtn_DarkActionPerformed

    private void jBtn_LightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LightActionPerformed
        // TODO add your handling code here:
        tema = 0; //Variavel Light tem valor 0
        setThemeLight(); //Chama o método setThemeDark para aplicar o tema Claro.

        try {
            PrintWriter writer = new PrintWriter("tema.txt");
            writer.println(tema);//Escrita do valor de tema no ficheiro.
            writer.close(); //Fechar ficheiro 

        } catch (Exception e) {
            System.out.println(e.getMessage());// Em caso de excepção escreve a mensagem associada.
        }

    }//GEN-LAST:event_jBtn_LightActionPerformed

    private void jBtn_GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_GoldActionPerformed
        // TODO add your handling code here:
        tema = 2; //Variavel Light tem valor 2
        setThemeGold(); //Chama o método setThemeDark para aplicar o tema Dourado

        try {
            PrintWriter writer = new PrintWriter("tema.txt");
            writer.println(tema);//Escrita do valor de tema no ficheiro.
            writer.close(); //Fechar ficheiro

        } catch (Exception e) {
            System.out.println(e.getMessage());// Em caso de excepção escreve a mensagem associada.
        }
    }//GEN-LAST:event_jBtn_GoldActionPerformed

    private void jBtn_SaidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_SaidaMouseEntered
        // TODO add your handling code here:
        
        // Neste evneto as cores do botão de Saída quendo o cursor (a setinha) do rato entra na área do botão.
        
        jBtn_Saida.setBackground(Color.RED); // Mudar a cor de fundo do botão de saída para vermelho,
        jBtn_Saida.setForeground(Color.WHITE); // Mudar a cor das letras do botão de saída para branco.

    }//GEN-LAST:event_jBtn_SaidaMouseEntered

    private void jBtn_SaidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_SaidaMouseExited
        // TODO add your handling code here:

        /*
        Neste evento as cores do botão de saída voltam a ser aplicadas em conformidade 
        com o tema aplicado.
        */
        
        if (tema == 0) { // Se o valor da variavel tema for 0, será aplicado o tema "Claro" [LIGHT] 
            jBtn_Saida.setBackground(Color.LIGHT_GRAY);
            jBtn_Saida.setForeground(Color.BLACK);
        } else if (tema == 1) { // Se o valor da variavel tema for 1, será aplicado o tema "Escuro" [DARK] 
            jBtn_Saida.setBackground(Color.DARK_GRAY);
            jBtn_Saida.setForeground(Color.LIGHT_GRAY);
        } else { // Se o valor da variavel tema for 1, será aplicado o tema "Dourado" [GOLD] 
            jBtn_Saida.setBackground(corFundo);
            jBtn_Saida.setForeground(corLetras);
        }

    }//GEN-LAST:event_jBtn_SaidaMouseExited

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        
        //Neste evento quando a janela é carregada o valor da variavel tema é aplicado
        
        Scanner scanner = null; // Instância  de Scanner que irá ler o ficheiro "tema.txt"

        try {
            scanner = new Scanner(new File("tema.txt")); // Ler ficheiro "tema.txt"

        } catch (Exception e) {
            System.out.println(e.getMessage()); // Em caso de excepção é apresenta a mensagem da mesma
        }

        //Enquanto o Scanner tver linhas para ler guarda a informação na vairável tema
        while (scanner.hasNextLine()) { 
            String line = scanner.nextLine(); // Veriificar linha seguinte e inseri-la na variàvel "line"
            System.out.println(line); // Escrever variavel "line".
            tema = Integer.parseInt(line); // Escrever na Variàvel tema o valor inteiro que está dentro da variàvel line. 

        }

        //Conforme o valor da variável tema
        switch (tema) { // verifica o valor do tema.
            case 0: // em caso de ser valor 0
                setThemeLight(); // aplicar tema Claro (Light)
                break;
            case 1: // em caso de ser valor 1 
                setThemeDark(); // aplicar tema Escuro (Dark)
                break;
            default: // em caso de ser valor 2 
                setThemeGold(); // aplicar tema Dourado (Gold)
                break;
        }


    }//GEN-LAST:event_formWindowGainedFocus

    private void jBtn_GoldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_GoldMouseEntered
        // TODO add your handling code here:
        jBtn_Gold.setBackground(corFundo);
        jBtn_Gold.setForeground(corLetras);

    }//GEN-LAST:event_jBtn_GoldMouseEntered

    private void jBtn_GoldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_GoldMouseExited
        // TODO add your handling code here:
        if (tema == 0) {
            jBtn_Gold.setBackground(Color.LIGHT_GRAY);
            jBtn_Gold.setForeground(Color.BLACK);
        } else if (tema == 1) {
            jBtn_Gold.setBackground(Color.DARK_GRAY);
            jBtn_Gold.setForeground(Color.LIGHT_GRAY);
        } else {
            jBtn_Gold.setBackground(corFundo);
            jBtn_Gold.setForeground(corLetras);
        }

    }//GEN-LAST:event_jBtn_GoldMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Ajuda;
    private javax.swing.JButton jBtn_Cronometro;
    private javax.swing.JButton jBtn_Dark;
    private javax.swing.JButton jBtn_Gold;
    private javax.swing.JButton jBtn_Light;
    private javax.swing.JButton jBtn_Relogio3;
    private javax.swing.JButton jBtn_Saida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
