/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_2;

/**
 *
 * @author fhz
 */
public class ATM extends javax.swing.JFrame {
    
    int displayFlag;
    private final String PIN;
    int pinDigitStatus;
    private int pinAttempts;
    private double balance;
    double amount;
    private String currentFunction;
    private String input;
    private String transactionMode;
    
    /**
     * Creates new form ATM
     */
    public ATM() {
        initComponents();
        displayFlag = 0;
        PIN = "1234";
        pinDigitStatus = 0;
        balance = 10.0;
        pinAttempts = 0;
        currentFunction = "auth";
        input = "";
        transactionMode = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        numericDisplay = new javax.swing.JTextField();
        withdrawal = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        checkBal = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cash Machine");

        displayArea.setColumns(20);
        displayArea.setRows(5);
        displayArea.setText("Please enter your PIN on the numeric keypad");
        jScrollPane1.setViewportView(displayArea);

        numericDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numericDisplayActionPerformed(evt);
            }
        });

        withdrawal.setText("Withdrawal");
        withdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalActionPerformed(evt);
            }
        });

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        checkBal.setText("Check Balance");
        checkBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");

        exit.setText("Quit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(numericDisplay)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkBal, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numericDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawal)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three)
                    .addComponent(enter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBal)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numericDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numericDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numericDisplayActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("auth")) {
            input = input + "9";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        
            if (pinDigitStatus == 4) {
                if (input.equals(PIN)) {
                    displayArea.setText("Select your choice of operation.");
                    numericDisplay.setText("");
                } else {
                    if (pinAttempts < 2) {
                        displayArea.setText("Incorrect PIN. Try again!\n" + (2 - pinAttempts) + " attempt(s) remaining.\n");
                        numericDisplay.setText("");
                        input = "";
                    } else {
                        pinAttempts = 0;
                        displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                        numericDisplay.setText("");
                        input = "";
                        System.exit(0);
                    }
                }
            }
        } else if (currentFunction.equals("amountInput")) {
            amount = (amount * 10) + 9;
        }
    }//GEN-LAST:event_nineActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "3";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
                numericDisplay.setText("");
            } else {
                if (pinAttempts < 2) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (2 - pinAttempts) + " attempt(s) remaining.\n");
                    numericDisplay.setText("");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    numericDisplay.setText("");
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_threeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        displayArea.setText("Please enter your PIN on the numeric keypad");
        currentFunction = "pin";
        input = "";
        displayFlag = 0;
        pinDigitStatus = 0;
        balance = 10.0;
        pinAttempts = 0;
        numericDisplay.setText("");
    }//GEN-LAST:event_exitActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "1";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
                numericDisplay.setText("");
            } else {
                if (pinAttempts < 2) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (2 - pinAttempts) + " attempt(s) remaining.\n");
                    numericDisplay.setText("");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    numericDisplay.setText("");
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "2";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_twoActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "4";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "5";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "6";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "7";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "8";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_eightActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        if (currentFunction.equals("pin")) {
            input = input + "0";
            pinDigitStatus++;
            numericDisplay.setText(numericDisplay.getText() + "*");
        }
        
        if (pinDigitStatus == 4) {
            if (input.equals(PIN)) {
                displayArea.setText("Select your choice of operation.");
            } else {
                if (pinAttempts < 3) {
                    displayArea.setText("Incorrect PIN. Try again!\n" + (3 - pinAttempts) + " attempt(s) remaining.\n");
                } else {
                    pinAttempts = 0;
                    displayArea.setText("Incorrect PIN. You have exhausted all your attempts. Card blocked.\n");     
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        numericDisplay.setText("");
        input = "";
    }//GEN-LAST:event_clearActionPerformed

    private void withdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawalActionPerformed
        // TODO add your handling code here:
        currentFunction = "amountInput";
        transactionMode = "withdrawal";
        displayArea.setText("Enter amount (in multiples of 100) to be withdrawn:\n");
        numericDisplay.setText("");
    }//GEN-LAST:event_withdrawalActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
        currentFunction = "amountInput";
        transactionMode = "deposit";
        displayArea.setText("Enter amount (maximum 50000) to deposit:");
        numericDisplay.setText("");
    }//GEN-LAST:event_depositActionPerformed

    private void checkBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalActionPerformed
        // TODO add your handling code here:
        currentFunction = "checkBal";
        displayArea.setText("Your current balance is Rs " + balance + "\nSelect your next operation.\n");
        numericDisplay.setText("");
    }//GEN-LAST:event_checkBalActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
        if (transactionMode.equals("withdrawal")) {
            if (balance - amount < 0) {
                displayArea.setText("Insufficient balance. Try again.");
                numericDisplay.setText("");
                currentFunction = "amountInput";
                amount = 0;
            } else {
                balance = balance - amount;
                displayArea.setText("Please collect your cash and receipt!\n");
                System.out.println("Amount withdrawn: Rs" + amount + "\nBalance: Rs" + balance + "\n");
                amount = 0;
                numericDisplay.setText("");
                transactionMode.setText("");
                currentFunction = "auth";
            }
        }
    }//GEN-LAST:event_enterActionPerformed

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton checkBal;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposit;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton eight;
    private javax.swing.JButton enter;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nine;
    private javax.swing.JTextField numericDisplay;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton withdrawal;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
