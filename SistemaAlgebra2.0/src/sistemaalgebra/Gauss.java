/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Gauss extends javax.swing.JFrame {

    private int incognitas;
    private int ecuaciones;
    private DefaultTableModel modelo;

    public Gauss() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldnNumIncognitas = new javax.swing.JTextField();
        jButtonGenerarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldnNumEcuaciones = new javax.swing.JTextField();
        jButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Numero de Ecuaciones: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextFieldnNumIncognitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldnNumIncognitasKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldnNumIncognitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 110, -1));

        jButtonGenerarMatriz.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonGenerarMatriz.setText("Generar Matriz");
        jButtonGenerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jTable.setForeground(new java.awt.Color(0, 0, 153));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 190));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, 190));

        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Resolver el Sistema Lineal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Numero de Incognitas: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextFieldnNumEcuaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldnNumEcuacionesKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldnNumEcuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, -1));

        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonfomate.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -40, 1010, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarMatrizActionPerformed

        if (!jTextFieldnNumIncognitas.getText().equals("") && !jTextFieldnNumEcuaciones.getText().equals("")) {
            this.setIncognitas(Integer.parseInt(jTextFieldnNumIncognitas.getText()));
            int inc = this.getIncognitas();
            this.setEcuaciones(Integer.parseInt(jTextFieldnNumEcuaciones.getText()));
            int fila = this.getEcuaciones();
            if (inc >= 2) {
                //las filas son las igcognitas y el +1 es por los resultados
                // Object columna[] = new Object[fila + 1];
                Object columna[] = new Object[inc + 1];
                for (int i = 0; i < columna.length; i++) {
                    if (i < inc) {
                        columna[i] = "x" + (i + 1);
                    } else {
                        columna[i] = "Lado Derecho";
                    }
                    modelo = new DefaultTableModel(columna, fila);
                    jTable.setModel(modelo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe Ingresar minimo 2 incognitas");
                jTextFieldnNumIncognitas.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene los Datos");
        }


    }//GEN-LAST:event_jButtonGenerarMatrizActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        Rellenar la matriz de coeficientes y el arreglo de resultados
        Calculadora aux = new Calculadora();
        int n = this.getIncognitas();
        int m=this.getEcuaciones();
        
        
        boolean bandera=false;
        if(n<m){
         double areglo[] = new double[m];
       int areglo1[] = new int[2];
             double matriz[][] = new double[m][m];
            
             for (int i = 0; i < m; i++) {
//              Rellenar la matriz de coeficientes
            for (int j = 0; j < m-1 ;j++) {
                try {
                    matriz[i][j] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, j)));
                } catch (NumberFormatException e) {
                    
                    bandera=true;
                }

            }
//              Rellenar el arreglo de resultados
        try{
            areglo[i] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, n)));
        }catch(NumberFormatException e){
            
            bandera=true;
        }
        } 
              GraficaTest grafi = new GraficaTest(matriz,areglo);
          grafi.setVisible(true);
          
                
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j]+" ");
                    
                }
                System.out.println("  ");
            }
 
            
           
             
             

//      Identificar si el sistema es compatible
    if(bandera==false){
        int rangoA = 0, rangoB;
        areglo1 = aux.comprobarSistema(matriz, areglo, n,m);
        rangoA = areglo1[0];
        rangoB = areglo1[1];
        System.out.println(rangoA+"Rangoa");
        System.out.println(rangoB+"Rango");

        if (rangoA != rangoB) {

            JOptionPane.showMessageDialog(null, "Sistema incompatible");
        } else {
            if (n == rangoA) {
                JOptionPane.showMessageDialog(null, "Sistem conpatible determinado");
                if(matriz[0][0]==0){
                    double aux2;
                    double aux1;
                    for (int i = 0; i < m; i++) {
                        if(matriz[0][0]==0){
                        for (int j = 0; j < m; j++) {
                           aux2=matriz[0][j];
                           matriz[0][j]=matriz[i][j];
                           matriz[i][j]=aux2;
                        }
                        aux1=areglo[0];
                        areglo[0]=areglo[i];
                        areglo[i]=aux1;
                        }
                        else{
                           break ;
                        }
                    }
                }
              
                areglo = aux.resolver(matriz, areglo, getIncognitas());

                
                for (int i = 0; i < areglo.length; i++) {
                    System.out.println(areglo[i]);
                    
                }
                for (int i = 0; i < areglo.length; i++) {
                    if(areglo[i]!=2.885633){
                    jTextArea.append("x" + (i + 1) + "=" + String.format("%.3f", areglo[i]) + "\n");
                    }
                }

            } else {
                int parametros=m-rangoA-1;
                JOptionPane.showMessageDialog(null, "Sistema Compatible Indeterminado  con  "+parametros+" parametros");
                String[] arreglo = new String[getIncognitas()];
                if(parametros<=3){
                      
                arreglo = Calculadora.resolver1(matriz, areglo, getIncognitas(),parametros);
               
                for (int i = 0; i < arreglo.length; i++) {
                    jTextArea.append("x" + (i + 1) + "=" + arreglo[i] + "\n");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Solo puede resolver hasta tres parametros");
                }
            }

        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
    }
        }else{
            
           double areglo[] = new double[n];
             int areglo1[] = new int[2];
             double matriz[][] = new double[n][n];
             for (int i = 0; i < m; i++) {
//              Rellenar la matriz de coeficientes
            for (int j = 0; j < matriz[i].length; j++) {
                try {
                    matriz[i][j] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, j)));
                } catch (NumberFormatException e) {
                    
                    bandera=true;
                }

            }
//              Rellenar el arreglo de resultados
        try{
            areglo[i] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, n)));
        }catch(NumberFormatException e){
            
            bandera=true;
        }
        }
 GraficaTest grafi = new GraficaTest(matriz,areglo);
          grafi.setVisible(true);
//      Identificar si el sistema es compatible
    if(bandera==false){
        int rangoA = 0, rangoB;
        areglo1 = aux.comprobarSistema(matriz, areglo, n,m);
        rangoA = areglo1[0];
        rangoB = areglo1[1];

        if (rangoA != rangoB) {

            JOptionPane.showMessageDialog(null, "Sistema incompatible");
        } else {
            if (n == rangoA) {
                JOptionPane.showMessageDialog(null, "Sistem compatible determinado");
                
                areglo = aux.resolver(matriz, areglo, getIncognitas());
                 
                for (int i = 0; i < areglo.length; i++) {
                  
                    jTextArea.append("x" + (i + 1) + "=" + String.format("%.3f", areglo[i]) + "\n");
                    
                }

            } else {
                int parametros=n-rangoA;
                JOptionPane.showMessageDialog(null, "Sistema Compatible Indeterminado  con  "+parametros+" parametros");
                String[] arreglo = new String[getIncognitas()];
                if(parametros<=3){
                
                arreglo = Calculadora.resolver1(matriz, areglo, getIncognitas(),parametros);
                 
                for (int i = 0; i < arreglo.length; i++) {
                    jTextArea.append("x" + (i + 1) + "=" + arreglo[i] + "\n");
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Solo puede resolver hasta tres parametros");
                }
            }

        }}else{
        JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
    }
        }   
    


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextArea.setText(" ");
        jTextFieldnNumEcuaciones.setText("");
        jTextFieldnNumIncognitas.setText("");
        modelo.setRowCount(0);
        for (int i = 0; i < jTable.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        jTable.setModel(new DefaultTableModel());


    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldnNumIncognitasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnNumIncognitasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldnNumIncognitasKeyTyped

    private void jTextFieldnNumEcuacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnNumEcuacionesKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldnNumEcuacionesKeyTyped

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        Menu a= new Menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gauss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGenerarMatriz;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldnNumEcuaciones;
    private javax.swing.JTextField jTextFieldnNumIncognitas;
    // End of variables declaration//GEN-END:variables

    public int getIncognitas() {
        return incognitas;
    }

    public void setIncognitas(int incognitas) {
        this.incognitas = incognitas;
    }

    public int getEcuaciones() {
        return ecuaciones;
    }

    public void setEcuaciones(int ecuaciones) {
        this.ecuaciones = ecuaciones;
    }
    
    
}
