/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.codificacion.aritmetica;

import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {
/*
    prob-probabilidad
    inteI-Intervalo inferior
    inteS-Intervalo Superior
    alfabeto-lista de caracteres a revisar la probabilidad
    */
    public String decodificarMensaje(float numero, int niveles,float prob[], float inteI[],float inteS[],char alfabeto[]){
       String msn="";
       int n=0;
   //    int []cont=new int[alfabeto.length];
       float suma=(float)0;
        for(int i=0;i<alfabeto.length;i++){
           
            if(inteI[i]<=numero && numero<inteS[i]){
               n++;
               msn+=alfabeto[i];
               numero= (numero-inteI[i])/prob[i];
               suma+=prob[i];
              if(n<niveles){
                  i=0;
              }else{
                  break;
              }
           }
       }
        System.out.println(suma);
        return msn;
    }
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    File f;
    FileInputStream fis;
    String ruta;
    
    private String getRuta(){
        return ruta;
    }
    
    private File getArchivo(){
        f = new File(getRuta());
        return f;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_textMensaje = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_textAritmetica = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField_rutaArchivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel_mostrarTiempo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_longitudMensaje = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_intervaloFinal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_textAritmetica1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea_textMensaje.setColumns(20);
        jTextArea_textMensaje.setLineWrap(true);
        jTextArea_textMensaje.setRows(5);
        jScrollPane1.setViewportView(jTextArea_textMensaje);

        jLabel1.setText("Mensaje a Codificar");

        jTextArea_textAritmetica.setColumns(20);
        jTextArea_textAritmetica.setLineWrap(true);
        jTextArea_textAritmetica.setRows(5);
        jScrollPane2.setViewportView(jTextArea_textAritmetica);

        jLabel2.setText("Mensaje Codificado - Aritmetica");

        jButton1.setText("Codificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caracter", "Num. Caracteres", "Intervalo"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel3.setText("Seleccionar Archivo:");

        jLabel4.setText("Ruta de Archivo:");

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Duracion en Codificar:");

        jLabel_mostrarTiempo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Algoritmo de Compresion Aritmetica");

        jLabel6.setText("Longitud del Mensaje:");

        jLabel_longitudMensaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Intervalo Final:");

        jLabel_intervaloFinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea_textAritmetica1.setColumns(20);
        jTextArea_textAritmetica1.setLineWrap(true);
        jTextArea_textAritmetica1.setRows(5);
        jScrollPane4.setViewportView(jTextArea_textAritmetica1);

        jLabel9.setText("Mensaje Descodificado - Aritmetica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField_rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(297, 297, 297)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(280, 280, 280)
                                            .addComponent(jLabel2)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel_longitudMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel_intervaloFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel_mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTextField_rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel9)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_longitudMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_intervaloFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_mostrarTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Tiempo de Duracion
        long inicio = System.nanoTime();
        
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                new Random().nextDouble();
            }
        }
        //Tiempo de Duracion
        
        String mensaje = jTextArea_textMensaje.getText();
        String longitudMensaje = String.valueOf(jTextArea_textMensaje.getText().length());
        jLabel_longitudMensaje.setText("   "+longitudMensaje);
	StringBuffer fileContents = new StringBuffer(mensaje);
        
        int longitud = mensaje.length();
        
        float[] L = new float[256];
        float[] H = new float[256];
        
        Object[] fila5 = new Object[3];
        String[] huffMan = new String[256];
	String[][] huffMan2 = new String[256][256];
        int[] fuenteUno = new int[256];
	int[][] fuenteDos = new int[256][256];
        int primero = 0;
        int segundo = 0;
        
        
        huffMan = Huffman.processFile(fileContents.toString(), fuenteUno);
        
        if (longitud % 2 == 0) {
            huffMan2 = Huffman.processFile2(fuenteDos, fuenteUno);

            String mensajeHuffman2 = Huffman.crearMensajeHuffman2(fileContents);
        } else {
            String mensajeHuffman2 = "No se puede codificar porque el numero de caracteres de la cadena es impar";
        }
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Caracter");
        modelo.addColumn("Num. Caracteres");
        modelo.addColumn("Intervalo");
        
        jTable1.setModel(modelo);
        char [] alf=new char[255];
        int [] n_Carac=new int[255];
        for (int i = 0; i < 255; i++){
            /* fuenteUno tiene de los 255 caracteres solo son "1" los q existe en el mensaje */
            if (fuenteUno[i] > 0) {
                primero = segundo;
                segundo = segundo + fuenteUno[i];
                System.out.println("Fuente Uno["+i+"]: "+fuenteUno[i]);
                L[i] = (float) primero / longitud;      // Rango Principio (Probabilidad)
                H[i] = (float) segundo / longitud;      // Rango Final (Probabilidad)
                fila5[0] = (char) i;
                alf[i]=(char) i;
                fila5[1] = fuenteUno[i];
                n_Carac[i]=fuenteUno[i];
                fila5[2] = "[" + L[i] + " , " + H[i] + " )";
                System.out.println(i + " " + fuenteUno[i] + " " + L[i] + " " + H[i]);
                
                modelo.addRow(fila5);
            }
        }
        
        /* Mensaje Cifrado */
        Aritmetica msn = new Aritmetica(fileContents, L, H);
	String mensajeAritmetica = msn.crearMensajeAritmetico();
        System.out.println("Codificación aritmetica: "+msn.lowAux);
        float[] prob = new float[256];
        float sum=(float)0;
        for(int i=0;i<256;i++){
            prob[i]=H[i]-L[i];
            System.out.println("Int "+i+": ["+L[i]+", "+H[i]+")");
            sum+=prob[i];
        }
        System.out.println("Suma(1): "+sum);
        System.out.println("Texto: "+decodificarMensaje(msn.lowAux,fileContents.length(),prob,L,H,alf));
        jTextArea_textAritmetica.setText(mensajeAritmetica);
        jTextArea_textAritmetica1.setText(decodificarMensaje(msn.lowAux,fileContents.length(),prob,L,H,alf));
        
        File f = new File("ArchivoComprimido.txt");
        //Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            //wr.write("Esta es una linea de codigo");//escribimos en el archivo
            wr.append(jTextArea_textAritmetica.getText());
            wr.append(jTextArea_textAritmetica1.getText());
            wr.close();
            bw.close();
        } catch (IOException e) {};

        //Tiempo de Duracion
        long fin = System.nanoTime();
        double dif = (double)(fin - inicio)*1.0e-9;
        System.out.println("El Programa Dura: "+ dif +"  segundos");
        String difString = Double.toString(dif);
        this.jLabel_mostrarTiempo.setText(difString+"  segundos");
        
        JOptionPane.showMessageDialog(null,"AVISO: Cifrado Completo");
        //Tiempo de Duracion
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fch = new JFileChooser();
        fch.showOpenDialog(this);
        File ar = fch.getSelectedFile();
        ruta = ar.getAbsolutePath();
        
        jTextField_rutaArchivo.setText(ruta);
        
        int contSaltoLinea = 0;
        String linea = "";
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            while ( (linea = bf.readLine()) != null) {
                texto = texto.concat(linea);
                contSaltoLinea++;
            }
        } catch (Exception e) {
            System.err.println("AVISO: No existe el Archivo");
        }
        
        System.out.println("TEXTO LEIDO: " + texto);
        jTextArea_textMensaje.setText(texto);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel_intervaloFinal;
    private javax.swing.JLabel jLabel_longitudMensaje;
    private javax.swing.JLabel jLabel_mostrarTiempo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_textAritmetica;
    private javax.swing.JTextArea jTextArea_textAritmetica1;
    private javax.swing.JTextArea jTextArea_textMensaje;
    private javax.swing.JTextField jTextField_rutaArchivo;
    // End of variables declaration//GEN-END:variables
}
