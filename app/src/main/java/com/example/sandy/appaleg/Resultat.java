package com.example.sandy.appaleg;

import java.util.ArrayList;

public class Resultat {

    private ArrayList<String> listD;
    private ArrayList<String> listT;

    public Resultat()
    {
        //recuperer les checkbox select à l'appui du bouton
    }

    public boolean resultBool(String text)
    {

        String[] textParse=text.split(",");
        boolean m=false;
        for(String t:listD) {
            for(String tt:textParse)
            {
                if(t.equals(tt))
                {
                    listT.add(t);//Afficher ce que contient ce text
                    m=true;
                }
            }

        }
        return m;
    }
}
