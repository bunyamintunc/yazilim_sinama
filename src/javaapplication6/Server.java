/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author pc
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
  
   private static Socket client ;
   private static InputStreamReader in;
   private static BufferedReader br;
   private static PrintWriter print ;
   private static String gelenVeri;
   private static SecretKeySpec secretKey;
   private static byte[] key;
   private static String plainText ;
   
    
    public Server() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("çöz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Şifreli:");

        jLabel2.setText("Mesaj:");

        jButton2.setText("gönder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("SHA-256");

        jCheckBox2.setText("SPN-16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(4, 4, 4)
                        .addComponent(jCheckBox2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sifre;
        
        if (jCheckBox1.isSelected()){
             sifre=decrypt(gelenVeri, "bunyamin");
              jTextArea1.setText("Client: "+sifre);
        }
        if(jCheckBox2.isSelected()){
            String key = "abcdefgh";

        String[] plain_key = new String[key.length()/2];
        fillToPlainArray(key,plain_key); //Key ikili gruplandırıldı.

        

        

        String[] binary_key = new String[plain_key.length];//ikili gruplanan key(şifre) binary sistemine dönüştürüldü.
        fillToBinaryArray(plain_key,binary_key);

        int[] index = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; //Dizi elemanlarını karıştırmak için indexler üreten fonksiyon.

        String cipher_Text = gelenVeri;
        plainText = "";

       

        String[] decryptCipherText = new String[cipher_Text.length()/16];
        fillToDecryptText(cipher_Text,decryptCipherText);//Şifreli text 16'lı gruplara bölündü.

        for (int i=0; i<decryptCipherText.length; i++){
            plainText += decrypt(decryptCipherText[i],binary_key,index);
        }

        
        }
        
        System.out.println(plainText.length());
        jTextArea1.setText(binaryToText(plainText));
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Server().setVisible(true);
            }
        });
       
        ServerSocket server = new ServerSocket(1201);
        client =server.accept();
        in=new InputStreamReader(client.getInputStream());
        br=new BufferedReader(in);
        print=new PrintWriter(client.getOutputStream());
        
         gelenVeri=br.readLine();
          
         System.out.println(gelenVeri.length());
         jTextField2.setText(gelenYazdir(gelenVeri));
          
       
        
        
        
        
    }
    
    public static String decrypt(String strToDecrypt, String secret) {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        }
        catch (Exception e)
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    public static void setKey(String myKey)
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-256");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
        }
    }
    
     public static void fillToPlainArray(String mesaj, String[] pt){
        int adim = 0;
        for (int i = 0; i<mesaj.length()/2; i++){
            pt[i] = mesaj.substring(adim,adim+2);
            adim +=2;
        }
    }

    public static void fillToDecryptText(String cipher_msg, String[] ct){
        int adim = 0;
        for (int i=0; i<cipher_msg.length()/16;i++){
            ct[i] = cipher_msg.substring(adim,adim+16);
            adim +=16;
        }
    }

    public static String convertTextToBinary(String mesaj){
        StringBuilder binary_msg = new StringBuilder();
        char[] m = mesaj.toCharArray();
        for (char cc : m){
            binary_msg.append(String.format("%8s", Integer.toBinaryString(cc))
                    .replaceAll(" ", "0"));
        }
        return binary_msg.toString();
    }

    public static void fillToBinaryArray(String[] pt, String[] b_msg){
        for (int i=0; i<pt.length; i++){
            b_msg[i] = convertTextToBinary(pt[i]);
        }
    }

    public static int[] arrayShuffle(){
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static String decryptCipherShuffle(String cipher, int[] index){
        StringBuilder decryptCipher = new StringBuilder();

        for (int i=0; i<16; i++){
            decryptCipher.append(String.valueOf(cipher.charAt(index[i])));
        }
        return decryptCipher.toString();
    }

    public static int indexBul(int[] hedefDizi, int arananIndex){
        int sira = -1;

        for (int i=0; i<hedefDizi.length; i++){
            if (hedefDizi[i] == arananIndex){
                sira = i;
                break;
            }
        }

        return sira;
    }

    public static String cipherShuffle(String cipher, int[] index){
        StringBuilder ciphershuffled = new StringBuilder();

        for (int i=0; i<16; i++){
            int sayiIndex = indexBul(index,i);
            ciphershuffled.append(String.valueOf(cipher.charAt(sayiIndex)));
        }

        return ciphershuffled.toString();
    }

    public static String binaryToText(String binary) {
        return Arrays.stream(binary.split("(?<=\\G.{8})"))/* regex to split the bits array by 8*/
                .parallel()
                .map((var eightBits) -> (char)Integer.parseInt(eightBits, 2))
                .collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append
                ).toString();
    }

    public static String encrypt(String b_msg, String[] b_key, int[] index){
        String cipher = "";
        String cipher_1 = "";
        String cipher_2 = "";
        String cipher_3 = "";

        for (int i=0; i<16; i++){
            cipher += b_msg.charAt(i) ^ b_key[0].charAt(i);
        }

        cipher = cipherShuffle(cipher,index);

        for (int i=0; i<16; i++){
            cipher_1 += String.valueOf(cipher.charAt(i) ^ b_key[1].charAt(i));
        }

        cipher_1 = cipherShuffle(cipher_1,index);

        for (int i=0; i<16; i++){
            cipher_2 += String.valueOf(cipher_1.charAt(i) ^ b_key[2].charAt(i));
        }

        for (int i=0; i<16; i++){
            cipher_3 += String.valueOf(cipher_2.charAt(i) ^ b_key[3].charAt(i));
        }

        return cipher_3;
    }

    public static String decrypt(String cipher_text, String[] b_key, int[] index){
        String decryptText = "";
        String decryptText_1 = "";
        String decryptText_2 = "";
        String decryptText_3 = "";


        for (int i=0; i<16; i++){
            decryptText += String.valueOf(cipher_text.charAt(i) ^ b_key[3].charAt(i));
        }

        for (int i=0; i<16; i++){
            decryptText_1 += String.valueOf(decryptText.charAt(i) ^ b_key[2].charAt(i));
        }

        decryptText_1 = decryptCipherShuffle(decryptText_1,index);

        for (int i=0; i<16; i++){
            decryptText_2 += String.valueOf(decryptText_1.charAt(i) ^ b_key[1].charAt(i));
        }

        decryptText_2 = decryptCipherShuffle(decryptText_2,index);

        for (int i=0; i<16; i++){
            decryptText_3 += String.valueOf(decryptText_2.charAt(i) ^ b_key[0].charAt(i));
        }

        return decryptText_3;
    }
    public static String gelenYazdir(String gelen){
        boolean gelenVeriVarMi=false;
        if(gelen !=null || gelen!=""){
            gelenVeriVarMi=true;
            return gelen;
            
        }
        return "bos";
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

