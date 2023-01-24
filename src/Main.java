import pojo.Personne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personne> listOfUser = new ArrayList<>();
            listOfUser.add(new Personne("René", new ArrayList<>()));
            listOfUser.add(new Personne("Julien", new ArrayList<>()));
            listOfUser.add(new Personne("Lisa", new ArrayList<>()));
            listOfUser.add(new Personne("Lola", new ArrayList<>()));
            listOfUser.add(new Personne("Cyrille", new ArrayList<>()));
            listOfUser.add(new Personne("Julien", new ArrayList<>()));

            listOfUser.get(0).sePresenter();

        for(int i = 0; i < listOfUser.size(); i++) {
            int nbRandom = 1 + (int)(Math.random() * ((listOfUser.size() - 2) + 1));

            Personne p =  listOfUser.get(nbRandom);
            p.sePresenter(listOfUser.get(i));
        }

    }
}