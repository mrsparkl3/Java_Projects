
package templatemethodtest;

/**
 * Classe di test, compone un oggetto ConcreteOpenFile e chiama solo il
 * Template Method della classe Abstract, che racchiude tutta la "finta"
 * procedura di uso di un File.
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
            
        ConcreteOpenFile file = new ConcreteOpenFile();
        file.templateMethod();
    }
    
}
