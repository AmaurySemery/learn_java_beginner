package root.loop;

public class loopWhile {
    public static void main(String[] args) {
        // Boucle "While"
        int pushUpGoal = 0;
        while (pushUpGoal > 0) {
            System.out.println("Push up!");
            pushUpGoal -= 1;
        }
        // Boucle "do/while"
        do {
            System.out.println("Push up!");
            pushUpGoal -= 1;
        } while (pushUpGoal > 0);
    }
}

// la boucle while d'origine n'effectuera pas de « push-up ». La boucle do... while provoquera un push-up une seule fois