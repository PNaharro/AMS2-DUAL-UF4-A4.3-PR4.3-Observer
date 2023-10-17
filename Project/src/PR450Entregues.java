import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class PR450Entregues {
    private List<PR450Producte> productes;
    private PropertyChangeSupport pcs;

    public PR450Entregues() {
        productes = new ArrayList<>();
        pcs = new PropertyChangeSupport(this);
    }

    public void addProducte(PR450Producte producte) {
        productes.add(producte);
        System.out.println("S'ha afegit el producte amd id "+producte.getId());
        pcs.firePropertyChange("entreguesAdd", null, producte);
    }

    public void removeProducte(int id) {
        PR450Producte removedProducte = null;
        for (PR450Producte producte : productes) {
            if (producte.getId() == id) {
                removedProducte = producte;
                break;
            }
        }

        if (removedProducte != null) {
            productes.remove(removedProducte);
            pcs.firePropertyChange("entreguesRemove", removedProducte, null);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Entregues:[");
        for (PR450Producte producte : productes) {
            result.append(producte.getId()).append(" : ").append(producte.getNom()).append(",");
        }
        result.append("]");
        return result.toString();
    }
}
