package DarraghBoylan;



public class Voiture {
    private String marque;
    private float prix;

    public Voiture(String marque, float prix) {
        this.marque = marque;
        this.prix = prix;
    }


    public String getMarque() {
        return marque;
    }


    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }


    public void setPrix(float prix) {
        this.prix=prix;
    }
}
// Getter pour le prix