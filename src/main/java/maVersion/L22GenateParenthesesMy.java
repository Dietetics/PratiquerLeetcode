package maVersion;

import java.util.ArrayList;
import java.util.List;

public class L22GenateParenthesesMy {

    // generer tous les combinaisons possibles de parentheses avec n paires de parentheses
    public List<String> generateParenthesis(int n){
        List<String> sln = new ArrayList<>(); // sln.add("");

        // cas initiale
        int gauche = 0;
        int droite = 0;
        String cas = "";

        // genere les parentheses a partir de n
        generer(sln, gauche, droite, cas, n);

        return sln;
    }


    // fonction auxiliaire pour generer les combinaisons
    public void generer(List<String> sln, int gauche, int droite, String cas, int n){
        // lorsqu on atteint la longueur en question, elle est donc une combinaison
        if (cas.length() == n*2) sln.add(cas);

        // deux cas, soit ajouter "(", soit ajouter ")"
        if (gauche < n) generer(sln, gauche+1, droite, cas + "(", n);
        if (droite < gauche) generer(sln, gauche, droite+1, cas + ")", n);
    }
}
