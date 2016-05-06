/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TxtReaderTest {
    TxtReader txtR;
    
    public TxtReaderTest() {
    }
    
    @Before
    public void setUp() {
        try {
            txtR = new TxtReader("moods/test.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void getRowsWorksCorrectly() {
        ArrayList <String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(list, txtR.getRows());
    }
    
    @Test
    public void makeAStringOfRowsWorksCorrectly() {
        assertEquals("a\nb\nc\n", txtR.makeAStringOfRows());
    }
}
