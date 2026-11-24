public class App{
    public static void main(String[] args) {
        Connexion db = Connexion.createConnexion("Tora", "123");
        System.out.println(db.getName());
        System.out.println(db.getPass());

        Connexion db2 = Connexion.createConnexion("Ray", "1234");
        System.out.println(db2.getName());
        System.out.println(db2.getPass());

        db.closeConnexionn();
        
    }
}