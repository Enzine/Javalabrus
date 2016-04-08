/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TxtReaderTest {
    TxtReader txtR;
    
    public TxtReaderTest() {
    }
    
    @Before
    public void setUp() {
        try {
            txtR = new TxtReader("goodmood.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TxtReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
