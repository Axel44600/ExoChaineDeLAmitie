package pojo;

import java.util.List;

public class Personne {

    private String prenom;
    private List<String> dejaSaluer;

    public Personne() {
    }

    public Personne(String prenom, List<String> dejaSaluer) {
        this.prenom = prenom;
        this.dejaSaluer = dejaSaluer;
    }

    public void sePresenter() {
        System.out.println("Bonjour je m'appelle "+this.getPrenom()+" ! Et vous comment vous appelez-vous ?");
    }

    public void sePresenter(Personne personne) {
        String p = personne.getPrenom();
        boolean verif = this.getDejaSaluer().contains(personne.getPrenom());

        if(p != this.getPrenom()) {
            if(!verif || this.getDejaSaluer().isEmpty()) {
                System.out.println("Bonjour " + personne.getPrenom() + " ! je m'appelle " + this.getPrenom() + ". Et toi comment t'appelles-tu ?");
                this.getDejaSaluer().add(personne.getPrenom());
            }
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<String> getDejaSaluer() {
        return dejaSaluer;
    }

    public void setDejaSaluer(List<String> dejaSaluer) {
        this.dejaSaluer = dejaSaluer;
    }
}
