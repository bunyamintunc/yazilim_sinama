/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Client.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Client.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class Client.
     */
    @Test
    public void testSetKey() throws Exception {
        System.out.println("setKey");
        boolean beklenen=true;
        String myKey = "bunyamin";
        boolean sonuc=Client.setKey(myKey);
        assertEquals(beklenen, sonuc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class Client.
     */
    @Test
    public void testEncrypt_String_String() {
        System.out.println("encrypt");
        String strToEncrypt = "abc";
        String secret = "bunyamin";
        int expResult = 24;
        String result = Client.encrypt(strToEncrypt, secret);
        int sonuc=result.length();
        assertEquals(expResult, sonuc);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fillToPlainArray method, of class Client.
     */
    @Test
    public void testFillToPlainArray() {
        System.out.println("fillToPlainArray");
        String mesaj = "";
        String[] pt = null;
        Client.fillToPlainArray(mesaj, pt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fillToDecryptText method, of class Client.
     */
    @Test
    public void testFillToDecryptText() {
        System.out.println("fillToDecryptText");
        String cipher_msg = "";
        String[] ct = null;
        Client.fillToDecryptText(cipher_msg, ct);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertTextToBinary method, of class Client.
     */
    @Test
    public void testConvertTextToBinary() {
        System.out.println("convertTextToBinary");
        String mesaj = "";
        String expResult = "";
        String result = Client.convertTextToBinary(mesaj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fillToBinaryArray method, of class Client.
     */
    @Test
    public void testFillToBinaryArray() {
        System.out.println("fillToBinaryArray");
        String[] pt = null;
        String[] b_msg = null;
        Client.fillToBinaryArray(pt, b_msg);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of arrayShuffle method, of class Client.
     */
    @Test
    public void testArrayShuffle() {
        System.out.println("arrayShuffle");
        int[] expResult = null;
        int[] result = Client.arrayShuffle();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decryptCipherShuffle method, of class Client.
     */
    @Test
    public void testDecryptCipherShuffle() {
        System.out.println("decryptCipherShuffle");
        String cipher = "";
        int[] index = null;
        String expResult = "";
        String result = Client.decryptCipherShuffle(cipher, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of indexBul method, of class Client.
     */
    @Test
    public void testIndexBul() {
        System.out.println("indexBul");
        int[] hedefDizi = null;
        int arananIndex = 0;
        int expResult = 0;
        int result = Client.indexBul(hedefDizi, arananIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cipherShuffle method, of class Client.
     */
    @Test
    public void testCipherShuffle() {
        System.out.println("cipherShuffle");
        String cipher = "";
        int[] index = null;
        String expResult = "";
        String result = Client.cipherShuffle(cipher, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of binaryToText method, of class Client.
     */
    @Test
    public void testBinaryToText() {
        System.out.println("binaryToText");
        String binary = "";
        String expResult = "";
        String result = Client.binaryToText(binary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class Client.
     */
    @Test
    public void testEncrypt_3args() {
        System.out.println("encrypt");
        String b_msg = "";
        String[] b_key = null;
        int[] index = null;
        String expResult = "";
        String result = Client.encrypt(b_msg, b_key, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Client.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String cipher_text = "";
        String[] b_key = null;
        int[] index = null;
        String expResult = "";
        String result = Client.decrypt(cipher_text, b_key, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of topla method, of class Client.
     */
    @Test
    public void testTopla() {
        System.out.println("topla");
        int a = 0;
        int expResult = 0;
        int result = Client.topla(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGonder(){
        boolean beklenen=false;
        String Sifre="abc";
        boolean sonuc=Client.gonder(Sifre);
        assertEquals(beklenen, sonuc);

    }

   
    
}
