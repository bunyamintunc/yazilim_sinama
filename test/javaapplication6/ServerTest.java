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
public class ServerTest {
    
    public ServerTest() {
       
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
     * Test of main method, of class Server.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Server.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Server.
     */
    @Test
    public void testDecrypt_String_String() {
        System.out.println("decrypt");
        String strToDecrypt = "UQULZG7krYQEhq3mRdU2Yw==";
        String secret = "bunyamin";
        String expResult = "abc";
        String result = Server.decrypt(strToDecrypt, secret);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class Server.
     */
    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String myKey = "";
        Server.setKey(myKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillToPlainArray method, of class Server.
     */
    @Test
    public void testFillToPlainArray() {
        System.out.println("fillToPlainArray");
        String mesaj = "";
        String[] pt = null;
        Server.fillToPlainArray(mesaj, pt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillToDecryptText method, of class Server.
     */
    @Test
    public void testFillToDecryptText() {
        System.out.println("fillToDecryptText");
        String cipher_msg = "";
        String[] ct = null;
        Server.fillToDecryptText(cipher_msg, ct);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertTextToBinary method, of class Server.
     */
    @Test
    public void testConvertTextToBinary() {
        System.out.println("convertTextToBinary");
        String mesaj = "";
        String expResult = "";
        String result = Server.convertTextToBinary(mesaj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillToBinaryArray method, of class Server.
     */
    @Test
    public void testFillToBinaryArray() {
        System.out.println("fillToBinaryArray");
        String[] pt = null;
        String[] b_msg = null;
        Server.fillToBinaryArray(pt, b_msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arrayShuffle method, of class Server.
     */
    @Test
    public void testArrayShuffle() {
        System.out.println("arrayShuffle");
        int[] expResult = null;
        int[] result = Server.arrayShuffle();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decryptCipherShuffle method, of class Server.
     */
    @Test
    public void testDecryptCipherShuffle() {
        System.out.println("decryptCipherShuffle");
        String cipher = "";
        int[] index = null;
        String expResult = "";
        String result = Server.decryptCipherShuffle(cipher, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexBul method, of class Server.
     */
    @Test
    public void testIndexBul() {
        System.out.println("indexBul");
        int[] hedefDizi = null;
        int arananIndex = 0;
        int expResult = 0;
        int result = Server.indexBul(hedefDizi, arananIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cipherShuffle method, of class Server.
     */
    @Test
    public void testCipherShuffle() {
        System.out.println("cipherShuffle");
        String cipher = "";
        int[] index = null;
        String expResult = "";
        String result = Server.cipherShuffle(cipher, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of binaryToText method, of class Server.
     */
    @Test
    public void testBinaryToText() {
        System.out.println("binaryToText");
        String binary = "";
        String expResult = "";
        String result = Server.binaryToText(binary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class Server.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String b_msg = "";
        String[] b_key = null;
        int[] index = null;
        String expResult = "";
        String result = Server.encrypt(b_msg, b_key, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Server.
     */
    @Test
    public void testDecrypt_3args() {
        System.out.println("decrypt");
        String cipher_text = "";
        String[] b_key = null;
        int[] index = null;
        String expResult = "";
        String result = Server.decrypt(cipher_text, b_key, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGelenVeriYazdir(){
        boolean beklenen=true;
        String gelen="abc";
        String veri=Server.gelenYazdir(gelen);
        boolean varMi=false;
        if(!"bos".equals(veri) && veri!=null){
            varMi=true;
            
        }
        assertEquals(gelen, varMi);
        
        
        
    }
    
}
