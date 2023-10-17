
public class PR450Producte {
    private int id;
    private String nom;


    public PR450Producte(int id, String nom) {
        this.id = id;
        this.nom = nom;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        System.out.println("El Producte ha camviat l'id de "+oldId+" a "+id);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        System.out.println("El Producte ha camviat el nom de "+oldNom+" a "+nom);
       
    }
}