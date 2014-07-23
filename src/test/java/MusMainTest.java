/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.masterpay.moxy.test.Configset;
import com.masterpay.moxy.test.Mus;
import com.masterpay.moxy.test.MusMain;
import javax.xml.bind.JAXBException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sihaya
 */
public class MusMainTest {
    @Test
    public void test() throws JAXBException {
        MusMain main = new MusMain();
        Configset configset = main.read();
        
        assertEquals(1, configset.musen.size());
        
        Mus mus = configset.musen.iterator().next();
        assertEquals("123", mus.naam);
        
        main.write(configset);
    }
    
}
