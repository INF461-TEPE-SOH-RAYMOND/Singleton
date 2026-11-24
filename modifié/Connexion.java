
public final class Connexion {

    private String name;
    private String pass;
    private static Connexion DBconnexion = null;

    private Connexion(String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public static Connexion createConnexion(String name, String pass) {
        if(DBconnexion == null){
            DBconnexion = new Connexion(name, pass);
        }

        return DBconnexion;
    }

    public String closeConnexionn(){
        DBconnexion = null;
        return "Connexion fermée";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
   
}
