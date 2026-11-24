public class App {
    public static void main(String[] args) {
        // Récupération de l'instance unique de Singleton
        Singleton singleton = Singleton.getInstance();

        // Utilisation des méthodes de calcul
        int a = 10;
        int b = 20;

        System.out.println("Moyenne: " + singleton.moyenne(a, b));
        System.out.println("Somme: " + singleton.somme(a, b));
        System.out.println("Produit: " + singleton.produit(a, b));

        Singleton singleton2 = Singleton.getInstance();

        // Affichage des attributs de l'instance
        singleton.afficher();
        singleton2.afficher();
    }
}
