package root.conditions;

/**Ce programme affiche
* - un message Hello personnalisé si un argument a été envoyé lors de l'exécution du programme
* - le message traditionnel "Hello World!" si ce n'est pas le cas
* @author L'équipe Éducation d'OpenClassrooms

la commande : java conditions/ConditionalHello Hello world!
*/

public class ConditionalHello {

/** Le programme commence ici
* @param args arguments envoyé avec la ligne de commande
*/

public static void main(String[] args) {
  if (args.length==1) {
      sayHelloTo(args[0]);
  } else if (args.length==2) {
      sayHelloTo(args[0] + "-" + args[1]);
  } else if (args.length==3) {
      sayHelloTo(args[0] + "-" + args[1] + "-" + args[2]);
  } else {
      sayHelloTo("world");
  }
}

/** affiche le message hello au destinataire fourni
* @param recipient
*/

   private static void sayHelloTo(String recipient) {
       System.out.println("Hello " + recipient + "!");
    }

}