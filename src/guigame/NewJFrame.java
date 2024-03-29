/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guigame;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        btnNewGame = new javax.swing.JButton();
        lblFirstCard = new javax.swing.JLabel();
        lblSecondCard = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDealerFirstCard = new javax.swing.JLabel();
        lblDealerSecondCard = new javax.swing.JLabel();
        lblDealerTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNewGame.setText("Start New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        lblFirstCard.setText("xxxxxx");

        lblSecondCard.setText("xxxxxx");

        lblTotal.setText("xxxxxx");

        lblPlayer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPlayer.setText("Player");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Dealer");

        lblDealerFirstCard.setText("xxxxxx");

        lblDealerSecondCard.setText("xxxxxx");

        lblDealerTotal.setText("xxxxxx");

        jButton1.setText("Hit!");
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNewGame)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlayer)
                                    .addComponent(lblFirstCard)
                                    .addComponent(lblSecondCard))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDealerSecondCard)
                                    .addComponent(lblDealerFirstCard)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDealerTotal)))
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstCard)
                    .addComponent(lblDealerFirstCard))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecondCard)
                    .addComponent(lblDealerSecondCard))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblDealerTotal))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(btnNewGame)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed

        int start = 1;
        int end = 11;
        
        Random randomNumberGenerator = new Random();

        int firstCard = randomNumberGenerator.nextInt( end ) + start;
        int secondCard = randomNumberGenerator.nextInt( end ) + start;
        int total = firstCard + secondCard;
        
        int dealerFirstCard = randomNumberGenerator.nextInt( end ) + start;
        int dealerSecondCard = randomNumberGenerator.nextInt( end ) + start;
        int dealerTotal = firstCard + secondCard;
        
        lblFirstCard.setText( String.valueOf( firstCard ) );
        lblSecondCard.setText( String.valueOf( secondCard ));
        
        lblDealerFirstCard.setText( String.valueOf( dealerFirstCard ) );
        lblDealerSecondCard.setText( String.valueOf ( dealerSecondCard ) );
        
        lblTotal.setText( String.valueOf( total ) );
        lblDealerTotal.setText( String.valueOf ( dealerTotal ));
        
        if ( Integer.valueOf(lblDealerTotal.getText() )  == 21){
            System.out.println("Game Over, Dealer Wins");
        }

    }//GEN-LAST:event_btnNewGameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int start = 1;
        int end = 11;
        Random randomNumberGenerator = new Random();
        
        int nextHit = randomNumberGenerator.nextInt( end ) + start;
        int playerTotal = Integer.parseInt(lblTotal.getText()) + nextHit;
        
        lblTotal.setText( String.valueOf( playerTotal ) );
        
        if ( Integer.valueOf(lblTotal.getText() )  > 21 ){
            System.out.println("Game Over, Player Bust");
            resetTotals();
        } else if ( Integer.valueOf(lblTotal.getText() ) == 21 ){
            System.out.println("Game Over, You Win");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void resetTotals(){
        lblFirstCard.setText( String.valueOf(0));
        lblSecondCard.setText( String.valueOf(0));
        lblTotal.setText( String.valueOf(0));
        
        lblDealerFirstCard.setText(( String.valueOf(0)));
        lblDealerSecondCard.setText(( String.valueOf(0)));
        lblDealerTotal.setText( ( String.valueOf(0)));
    }
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDealerFirstCard;
    private javax.swing.JLabel lblDealerSecondCard;
    private javax.swing.JLabel lblDealerTotal;
    private javax.swing.JLabel lblFirstCard;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblSecondCard;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
