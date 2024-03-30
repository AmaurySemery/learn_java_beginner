package root.cleanHello;

public class CleanWorld {
    
    /** Le programme commence ici */
    public static void main(String[] args) {
       sayHelloTo("world");
    }
    
    /** affiche le message "hello" au destinataire fourni */
    private static void sayHelloTo(String recipient) {
       System.out.println("Hello " + recipient);
    }
    
 }