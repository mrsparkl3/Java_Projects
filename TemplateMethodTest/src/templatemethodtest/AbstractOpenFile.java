
package templatemethodtest;

/**
 * Classe astratta di esempio con un algoritmo per utilizzare un file,
 * più un template method che racchiude e chiama tutti i metodi dell'algoritmo
 */
public abstract class AbstractOpenFile {
        abstract void open();
        abstract void save();
        abstract void close();
        
        //Template Method include i metodi dell'algoritmo
        public void templateMethod(){
         open();
         save();
         close();
        }
        
}
