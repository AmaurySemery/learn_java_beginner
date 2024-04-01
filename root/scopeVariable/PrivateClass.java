package root.scopeVariable;

class PrivateClass {
    int internalProperty = 0; // assigne automatiquement package-private par défaut
    //protected defaultProperty = true; // assigne automatiquement package-private
    public boolean publicProperty = true; // convertit automatiquement en package-private
    private String fileprivateProperty = "Hello!"; //disponible seulement pour la classe
    private static void privateMethod() {
    }
} 