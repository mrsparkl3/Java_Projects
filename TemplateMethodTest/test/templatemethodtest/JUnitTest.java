

package templatemethodtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class JUnitTest {
    private ConcreteOpenFile test = new ConcreteOpenFile();
    @Test
    void JUnitTest() {        
            assertEquals("I'm opening the File\n"
                    +"I'm saving the File\n" 
                    +"The File is now closed.", 
                    test.templateMethod());
    }
    
}
