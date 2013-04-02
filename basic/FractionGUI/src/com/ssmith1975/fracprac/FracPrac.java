/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FracPrac.java
 *
 * Created on Mar 25, 2011, 1:19:50 AM
 */

package com.ssmith1975.fracprac;
import com.ssmith1975.mylib.*;
/**
 *
 * @author Kush
 */
public class FracPrac extends javax.swing.JFrame {
    static final private int LOW = 1;
    static final private int HIGH = 15;

    /** Creates new form FracPrac */
    public FracPrac() {
        initComponents();
        generateFractions();
        btnAdd.setEnabled(true);
        btnNew.setEnabled(false);
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wrapper = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        action = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        responsebox = new javax.swing.JPanel();
        lblFeedback = new javax.swing.JLabel();
        fractionbox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNum1 = new javax.swing.JTextField();
        txtDen1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNum2 = new javax.swing.JTextField();
        txtDen2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNum3 = new javax.swing.JTextField();
        txtDen3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frac Prac");
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        wrapper.setBackground(new java.awt.Color(255, 255, 255));
        wrapper.setMaximumSize(new java.awt.Dimension(400, 415));
        wrapper.setPreferredSize(new java.awt.Dimension(299, 414));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Frac Prac");

        btnNew.setText("Again!");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnAdd.setText("Enter");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionLayout = new javax.swing.GroupLayout(action);
        action.setLayout(actionLayout);
        actionLayout.setHorizontalGroup(
            actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addContainerGap())
        );
        actionLayout.setVerticalGroup(
            actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        responsebox.setBackground(new java.awt.Color(255, 255, 255));
        responsebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        responsebox.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout responseboxLayout = new javax.swing.GroupLayout(responsebox);
        responsebox.setLayout(responseboxLayout);
        responseboxLayout.setHorizontalGroup(
            responseboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responseboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        responseboxLayout.setVerticalGroup(
            responseboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responseboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        fractionbox.setBackground(new java.awt.Color(255, 255, 255));
        fractionbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        fractionbox.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("+");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("=");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtNum1.setColumns(3);
        txtNum1.setEditable(false);
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.setMinimumSize(new java.awt.Dimension(30, 20));
        txtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum1ActionPerformed(evt);
            }
        });

        txtDen1.setColumns(3);
        txtDen1.setEditable(false);
        txtDen1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDen1.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 5));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("__________");
        jLabel3.setPreferredSize(new java.awt.Dimension(56, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtDen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDen1, txtNum1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtNum2.setColumns(3);
        txtNum2.setEditable(false);
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.setMinimumSize(new java.awt.Dimension(50, 20));
        txtNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum2ActionPerformed(evt);
            }
        });

        txtDen2.setColumns(3);
        txtDen2.setEditable(false);
        txtDen2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDen2.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 5));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("__________");
        jLabel4.setPreferredSize(new java.awt.Dimension(56, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtNum3.setColumns(3);
        txtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum3.setToolTipText("Numerator");
        txtNum3.setMinimumSize(new java.awt.Dimension(50, 20));
        txtNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNum3ActionPerformed(evt);
            }
        });

        txtDen3.setColumns(3);
        txtDen3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDen3.setToolTipText("Denominator");
        txtDen3.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 5));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("__________");
        jLabel6.setPreferredSize(new java.awt.Dimension(56, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fractionboxLayout = new javax.swing.GroupLayout(fractionbox);
        fractionbox.setLayout(fractionboxLayout);
        fractionboxLayout.setHorizontalGroup(
            fractionboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fractionboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fractionboxLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel4});

        fractionboxLayout.setVerticalGroup(
            fractionboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fractionboxLayout.createSequentialGroup()
                .addGroup(fractionboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fractionboxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fractionboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fractionboxLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(fractionboxLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kush\\My Icons\\paisley\\PNG\\paisley5.png")); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kush\\My Icons\\Basic_set_by_prokofusha\\Basic_set\\Basic_set_Png\\Basic_set_Png\\stop_32.png")); // NOI18N
        jButton1.setMnemonic('x');
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wrapperLayout = new javax.swing.GroupLayout(wrapper);
        wrapper.setLayout(wrapperLayout);
        wrapperLayout.setHorizontalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrapperLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(responsebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fractionbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(29, 29, 29)))
        );
        wrapperLayout.setVerticalGroup(
            wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(wrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wrapperLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel1)
                    .addGap(22, 22, 22)
                    .addComponent(fractionbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(responsebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        getContentPane().add(wrapper);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateFractions() {

        setFraction(txtNum1, txtDen1);
        setFraction(txtNum2, txtDen2);

        txtNum3.setText("");
        txtDen3.setText("");

        lblFeedback.setText("");

    }
    private void setFraction(javax.swing.JTextField num,  javax.swing.JTextField den) {
        int numerator, denominator;

        denominator = RandomRange.getRandom(LOW, HIGH);
        numerator = RandomRange.getRandom(LOW, HIGH);
         while (numerator >= denominator) {
            numerator = RandomRange.getRandom(LOW, HIGH);
        }
        num.setText(numerator+"");
        den.setText(denominator+"");

    }

    private boolean checkAnswer(Fraction f1, Fraction f2){
        return f1.equals(f2);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int n1, d1, n2, d2, n3, d3;
        Fraction result;

        n1 = Integer.parseInt(txtNum1.getText());
        d1 = Integer.parseInt(txtDen1.getText());
 
        n2 = Integer.parseInt(txtNum2.getText());
        d2 = Integer.parseInt(txtDen2.getText());

        n3 = Integer.parseInt(txtNum3.getText());
        d3 = Integer.parseInt(txtDen3.getText());
        
        Fraction fraction1 = new Fraction(n1,d1);
        Fraction fraction2 = new Fraction(n2,d2);
        Fraction fraction3 = new Fraction(n3, d3);

        // Compute the correct answer
        result = fraction1.addFraction(fraction2).reduce();

       /* if (checkAnswer(fraction3, result)) {
            lblFeedback.setText("Your answer is correct!");
        } else*/ if ( fraction3.isEquivalent(result) ) {
            lblFeedback.setText("<html>Your answer is correct. <br>Solution: "+ result.getNumerator()+ "/"+ result.getDenominator()+"</html>");
        } else  {
            lblFeedback.setText("<html>Sorry, your answer is incorrect. <br>Solution: "+ result.getNumerator()+ "/"+ result.getDenominator()+"</html>");
        }


        n3 = result.getNumerator();
        d3 = result.getDenominator();

        
        btnAdd.setEnabled(false);
        btnNew.setEnabled(true);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum1ActionPerformed

    private void txtNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum2ActionPerformed

    private void txtNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum3ActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        generateFractions();
        btnAdd.setEnabled(true);
        btnNew.setEnabled(false);
      

    }//GEN-LAST:event_btnNewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FracPrac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel action;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnNew;
    private javax.swing.JPanel fractionbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFeedback;
    private javax.swing.JPanel responsebox;
    private javax.swing.JTextField txtDen1;
    private javax.swing.JTextField txtDen2;
    private javax.swing.JTextField txtDen3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JPanel wrapper;
    // End of variables declaration//GEN-END:variables

}
