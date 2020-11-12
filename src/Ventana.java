import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ventana extends javax.swing.JFrame {

    private Ecuacion ec;

    public Ventana() {
        initComponents();
        hideLabels();
        jPanel4.setEnabled(false);
        fieldA.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fieldB = new javax.swing.JTextField();
        fieldA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        x01 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        x02 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        y01 = new javax.swing.JTextField();
        y02 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ecuaciones Diferenciales Homogeneas");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 640));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(640, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 480));
        jPanel1.setSize(new java.awt.Dimension(480, 640));

        lab1.setBackground(new java.awt.Color(237, 237, 237));
        lab1.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        lab1.setForeground(new java.awt.Color(153, 153, 153));
        lab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lab1.setOpaque(true);

        lab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab2.setSize(new java.awt.Dimension(0, 30));

        lab3.setBackground(new java.awt.Color(237, 237, 237));
        lab3.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        lab3.setForeground(new java.awt.Color(153, 153, 153));
        lab3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lab3.setOpaque(true);
        lab3.setSize(new java.awt.Dimension(0, 30));

        lab4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab4.setSize(new java.awt.Dimension(0, 30));

        lab5.setBackground(new java.awt.Color(237, 237, 237));
        lab5.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        lab5.setForeground(new java.awt.Color(153, 153, 153));
        lab5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lab5.setOpaque(true);
        lab5.setSize(new java.awt.Dimension(0, 30));

        lab6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab6.setSize(new java.awt.Dimension(0, 30));

        lab7.setBackground(new java.awt.Color(237, 237, 237));
        lab7.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        lab7.setForeground(new java.awt.Color(153, 153, 153));
        lab7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lab7.setOpaque(true);
        lab7.setSize(new java.awt.Dimension(0, 30));

        lab8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab8.setSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lab8, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
            .addComponent(lab7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lab8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        lab1.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Product Sans", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora de Ecuaciones Diferenciales Homogéneas ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Latin Modern Roman", 2, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("y''");

        fieldB.setFont(new java.awt.Font("Latin Modern Math", 0, 20)); // NOI18N
        fieldB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldB.setBorder(null);
        fieldB.setMaximumSize(new java.awt.Dimension(60, 60));
        fieldB.setMinimumSize(new java.awt.Dimension(60, 60));
        fieldB.setSize(new java.awt.Dimension(60, 60));

        fieldA.setFont(new java.awt.Font("Latin Modern Math", 0, 20)); // NOI18N
        fieldA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldA.setBorder(null);
        fieldA.setMaximumSize(new java.awt.Dimension(60, 60));
        fieldA.setMinimumSize(new java.awt.Dimension(60, 60));
        fieldA.setPreferredSize(new java.awt.Dimension(60, 60));
        fieldA.setSize(new java.awt.Dimension(30, 30));

        jLabel4.setFont(new java.awt.Font("Latin Modern Roman", 2, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("y");

        fieldC.setFont(new java.awt.Font("Latin Modern Math", 0, 20)); // NOI18N
        fieldC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldC.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Latin Modern Roman", 2, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("y'");

        jLabel5.setFont(new java.awt.Font("Latin Modern Roman", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("= 0");

        cb1.setText("¿PVI?");

        x01.setFont(new java.awt.Font("Latin Modern Roman", 0, 18)); // NOI18N
        x01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setFont(new java.awt.Font("Latin Modern Math", 0, 14)); // NOI18N
        jLabel6.setText("y(");

        jLabel8.setFont(new java.awt.Font("Latin Modern Math", 0, 14)); // NOI18N
        jLabel8.setText(")=");

        jLabel9.setFont(new java.awt.Font("Latin Modern Math", 0, 14)); // NOI18N
        jLabel9.setText(")=");

        x02.setFont(new java.awt.Font("Latin Modern Roman", 0, 18)); // NOI18N
        x02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel7.setFont(new java.awt.Font("Latin Modern Math", 0, 14)); // NOI18N
        jLabel7.setText("y'(");

        y01.setFont(new java.awt.Font("Latin Modern Roman", 0, 18)); // NOI18N
        y01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y01.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        y02.setFont(new java.awt.Font("Latin Modern Roman", 0, 18)); // NOI18N
        y02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        y02.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(x01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(y01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(x02, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(y02, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(fieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );

        jButton1.setFont(new java.awt.Font("Product Sans", 0, 24)); // NOI18N
        jButton1.setText("Obtener solución");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private void hideLabels() {
        lab1.setVisible(false);
        lab2.setVisible(false);
        lab3.setVisible(false);
        lab4.setVisible(false);
        lab5.setVisible(false);
        lab6.setVisible(false);
        lab7.setVisible(false);
        lab8.setVisible(false);
    }
    
    private void showLabels() {
        boolean t = true;
        lab1.setVisible(t);
        lab2.setVisible(t);
        lab3.setVisible(t);
        lab4.setVisible(t);
        lab5.setVisible(t);
        lab6.setVisible(t);
    }
        
    private void mostrar() {
        showLabels();
        Visualizar a = new Visualizar(ec.ecuacionCaracteristicaToString());
        Visualizar b = new Visualizar(ec.solToString());
        Visualizar c = new Visualizar(ec.raicesToString());
        lab1.setText("La ecuación característica es:");
        lab2.setIcon(a.getFormula());
        lab3.setText("Las raíces están dadas por:");
        lab4.setIcon(c.getFormula());
        lab5.setText("La solución general es:");
        lab6.setIcon(b.getFormula());
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double a = Double.parseDouble(fieldA.getText());
        double b = Double.parseDouble(fieldB.getText());
        double c = Double.parseDouble(fieldC.getText());
        ec = new Ecuacion(a, b, c);
        mostrar();
        if(cb1.isSelected()) {
            jPanel4.setEnabled(true);
            lab7.setVisible(true);
            lab8.setVisible(true);
            ec.setPv1(Double.parseDouble(x01.getText()), Double.parseDouble(y01.getText()));
            ec.setPv2(Double.parseDouble(x02.getText()), Double.parseDouble(y02.getText()));
            ec.calcularPVI();
            Visualizar d = new Visualizar(ec.pviToString());
            lab7.setText("La solución del P.V.I. es:");
            lab8.setIcon(d.getFormula());
        } else {
            hideLabels();
            mostrar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JTextField fieldA;
    private javax.swing.JTextField fieldB;
    private javax.swing.JTextField fieldC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JTextField x01;
    private javax.swing.JTextField x02;
    private javax.swing.JTextField y01;
    private javax.swing.JTextField y02;
    // End of variables declaration//GEN-END:variables
}
