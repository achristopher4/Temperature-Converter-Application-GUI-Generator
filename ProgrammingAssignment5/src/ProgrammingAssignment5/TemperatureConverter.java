/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProgrammingAssignment5;

/**
 *
 * @author alexchristopher
 */
public class TemperatureConverter extends javax.swing.JFrame {

    /**
     * Creates new form TemperatureConverter
     */
    public TemperatureConverter() {
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

        tempConversionButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        chooseTypeLabel = new javax.swing.JLabel();
        toCelsiusRadioButton = new javax.swing.JRadioButton();
        toFahrenheitRadioButton = new javax.swing.JRadioButton();
        enterTempLabel = new javax.swing.JLabel();
        outputPretextLabel = new javax.swing.JLabel();
        outputAnswerLabel = new javax.swing.JLabel();
        enterTempTextField = new javax.swing.JTextField();
        convertTempButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setText("Temperature Converter");

        chooseTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chooseTypeLabel.setText("Choose Conversion Type:");

        tempConversionButtonGroup.add(toCelsiusRadioButton);
        toCelsiusRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toCelsiusRadioButton.setText("Fahrenheit to Celsius");
        toCelsiusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCelsiusRadioButtonActionPerformed(evt);
            }
        });

        tempConversionButtonGroup.add(toFahrenheitRadioButton);
        toFahrenheitRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toFahrenheitRadioButton.setText("Celsius to Fahrenheit");

        enterTempLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterTempLabel.setText("Enter the temperature to convert:");

        outputPretextLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputPretextLabel.setText("  ");

        outputAnswerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        outputAnswerLabel.setText("                  ");

        enterTempTextField.setColumns(10);
        enterTempTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterTempTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterTempTextFieldActionPerformed(evt);
            }
        });

        convertTempButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        convertTempButton.setText("Convert Temperature");
        convertTempButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertTempButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterTempLabel)
                                    .addComponent(outputPretextLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enterTempTextField)
                                    .addComponent(outputAnswerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(convertTempButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(toFahrenheitRadioButton)
                                .addComponent(toCelsiusRadioButton)
                                .addComponent(chooseTypeLabel)))
                        .addGap(210, 210, 210))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toCelsiusRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toFahrenheitRadioButton)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterTempLabel)
                    .addComponent(enterTempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputAnswerLabel)
                    .addComponent(outputPretextLabel))
                .addGap(27, 27, 27)
                .addComponent(convertTempButton)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toCelsiusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCelsiusRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toCelsiusRadioButtonActionPerformed

    private void enterTempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterTempTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterTempTextFieldActionPerformed

    private void convertTempButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertTempButtonActionPerformed
        // TODO add your handling code here:
        double conversionCalc;
        String answer;
        double textFieldNumb = Double.parseDouble(enterTempTextField.getText());
        outputPretextLabel.setText(String.format("The tempature converts to:", ""));
        
        if (toCelsiusRadioButton.isSelected()) {
            conversionCalc = (textFieldNumb - 32.0) * (5.0/9.0);
            answer = String.format("%.1f degrees Celsius", conversionCalc);
            outputAnswerLabel.setText(answer);
        } else {
            conversionCalc = (textFieldNumb * (9.0/5.0)) +32.0;
            answer = String.format("%.1f degrees Fahrenheit", conversionCalc);
            outputAnswerLabel.setText(answer);
        }
    }//GEN-LAST:event_convertTempButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseTypeLabel;
    private javax.swing.JButton convertTempButton;
    private javax.swing.JLabel enterTempLabel;
    private javax.swing.JTextField enterTempTextField;
    private javax.swing.JLabel outputAnswerLabel;
    private javax.swing.JLabel outputPretextLabel;
    private javax.swing.ButtonGroup tempConversionButtonGroup;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton toCelsiusRadioButton;
    private javax.swing.JRadioButton toFahrenheitRadioButton;
    // End of variables declaration//GEN-END:variables
}
