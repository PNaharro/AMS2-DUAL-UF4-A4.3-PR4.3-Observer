import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PR450Producte {
    private int id;
    private String nom;
    private PropertyChangeSupport pcs;

    public PR450Producte(int id, String nom) {
        this.id = id;
        this.nom = nom;
        pcs = new PropertyChangeSupport(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        System.out.println("El Producte ha camviat l'id de "+oldId+" a "+id);
        pcs.firePropertyChange("producteId", oldId, id);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        System.out.println("El Producte ha camviat el nom de "+oldNom+" a "+nom);
        pcs.firePropertyChange("producteName", oldNom, nom);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
