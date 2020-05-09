
package templatemethodtest;

/**
 *
 * Classe concreta che implementa i metodi astratti di 
 * "AbstractOpenFile" 
 */
public class ConcreteOpenFile extends AbstractOpenFile {
        @Override
        void open(){
            System.out.println("I'm opening the File");
        }
        @Override
        void save(){
            System.out.println("I'm saving the File");
        }
        @Override
        void close(){
            System.out.println("The File is now closed.");
        }
}
