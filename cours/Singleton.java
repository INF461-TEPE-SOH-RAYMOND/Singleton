public final class Singleton {

    private static Singleton instance;

    public int x;
    public int y;

    private Singleton() {
        super();
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public float moyenne(int x, int y) {
        return (x + y) / 2.0f;
    }

    public int somme(int x, int y) {
        return x + y;
    }

    public int produit(int x, int y) {
        return x * y;
    }

    public void afficher() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
}