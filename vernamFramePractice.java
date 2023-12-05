
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class vernamFramePractice extends javax.swing.JFrame {

    final String alpha = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
  

    public vernamFramePractice() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        pathField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ebisa Achame 1786/12 vernam Cipher");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 204));
        jButton4.setText("Browse File");
        jButton4.setToolTipText("Reads .txt File format");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 40));

        pathField.setEditable(false);
        pathField.setBackground(new java.awt.Color(0, 0, 0));
        pathField.setForeground(new java.awt.Color(255, 255, 255));
        pathField.setText("file path");
        pathField.setToolTipText("File Path");
        jPanel1.add(pathField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, 40));

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 255));
        jButton2.setText("Decrypt");
        jButton2.setToolTipText("Decryption Button");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, 40));

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 204));
        jButton3.setText("Save");
        jButton3.setToolTipText("Save file as .txt only");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 120, 40));

        JTextArea.setBackground(new java.awt.Color(204, 204, 204));
        JTextArea.setColumns(20);
        JTextArea.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        JTextArea.setRows(5);
        JTextArea.setCaretColor(new java.awt.Color(255, 0, 204));
        JTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(JTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 670, 630));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 255));
        jButton1.setText("Encrypt");
        jButton1.setToolTipText("Encryption Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 40));

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.setToolTipText("Reset All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JTextArea.setText(vernamEncryption(JTextArea.getText()));
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JTextArea.setText(vernamDecryption(JTextArea.getText()));
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("User.home"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.only text", "pdf", "txt");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            String path;
            File selectedFile = fileChooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            pathField.setText(path);

            try {
                FileReader reader = new FileReader(path);
                BufferedReader br = new BufferedReader(reader); // It buffers the characters in order to enable efficient reading of text data
                JTextArea.read(br, null);
                br.close();
                JTextArea.requestFocus();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(vernamFramePractice.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(vernamFramePractice.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (result == JFileChooser.CANCEL_OPTION) {
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JFileChooser fileSaver = new JFileChooser();

            fileSaver.showSaveDialog(null);// opens the file saver window to select a location and also give names for the file

            File f = fileSaver.getSelectedFile();
            if (!Files.exists(f.toPath())) { // checks if file already exists or not  in specified directory

                pathField.setText(f.toPath().toString());
                String name = f.getName();

                FileWriter writer = new FileWriter(f.toPath().toString());
                BufferedWriter bw = new BufferedWriter(writer);
                JTextArea.write(bw);
                bw.close();
                JTextArea.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "File alrady there \n please rename");// if file exist shows a translatedMessage 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "cancelled");//  aborts the saving if closed
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        JTextArea.setText("");
        pathField.setText("");
 
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vernamFramePractice().setVisible(true);
            }
        });
    }

    public String vernamEncryption(String plainText) {
        SecureRandom secureRandom = new SecureRandom(new byte[] {3,5,7,9,11,13});
        byte[] byt = plainText.getBytes();
        int[] bytInt = new int[plainText.length()];
        secureRandom.nextBytes(byt);///  generates a array of generated random number for all given plain text characters
        String Finalmessage = "";

        char[] encrypted = new char[plainText.length()];

        char[] Extracted = JTextArea.getText().toCharArray();
        char[] symbols = alpha.toCharArray();

        int index;

        for (int j = 0; j < plainText.length(); j++) {

            bytInt[j] = (int) byt[j];
            char raw = Extracted[j];
            if (!String.valueOf(raw).equals(" ") && !String.valueOf(raw).equals("\n") && !String.valueOf(raw).equals("\t")) {
                index = alpha.indexOf(raw);// gets the index value o characters
                if (bytInt[j] < 0) {
                    bytInt[j] = -bytInt[j];
                }
                int value;
                value = (index + bytInt[j]) % alpha.length();
                if (value < 0) {                            // checks if the remainder is
                    value = value + alpha.length();// negative and adds the lenths of the sym to make it positive
                }
                encrypted[j] = symbols[value];

                char fina = encrypted[j];

                Finalmessage = Finalmessage + String.valueOf(fina);
            } else {
                Finalmessage = Finalmessage + raw;
            }

        }

        return Finalmessage;

    }
 
    public String vernamDecryption(String cipherText) {
    
        SecureRandom secureRandom = new SecureRandom(new byte[]{3,5,7,9,11,13});
        byte[] byt = cipherText.getBytes();
        int[] bytInt = new int[cipherText.length()];
        secureRandom.nextBytes(byt);
        String fin = "";

        char[] encrypted = new char[cipherText.length()];

        char[] extracted = cipherText.toCharArray();
        char[] sym = alpha.toCharArray();

        int index;

        for (int j = 0; j < cipherText.length(); j++) {
            bytInt[j] = (int) byt[j];
            char raw = extracted[j];
            ////// space , new line and tab are not encrypted in this algorithm
            if (!String.valueOf(raw).equals(" ") && !String.valueOf(raw).equals("\n") && !String.valueOf(raw).equals("\t")) {
                index = alpha.indexOf(raw);// gets the index value of characters


                if (bytInt[j] < 0) {
                    bytInt[j] = -bytInt[j];
                }
                int value;
                value = (index - bytInt[j]) % alpha.length();
                if (value < 0) {  
                    value = value + alpha.length();
                }
                encrypted[j] = sym[value];

                char c = encrypted[j];

                fin = fin + String.valueOf(c);

            } else {
                fin = fin + raw;
            }

        }

        return fin;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pathField;
    // End of variables declaration//GEN-END:variables
}
