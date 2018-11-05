package com.example.sandy.appaleg;

import java.util.ArrayList;

public class Allergie {
    private ArrayList<String> listAlleg;

    public Allergie(String type)
    {
        listAlleg=new ArrayList<String>();
        switch (type)
        {
            case "Lait":
            {
                listAlleg.add("lactose");
            }
            case "Arachide":
            {
                listAlleg.add("noix");
            }

        }

    }

    public ArrayList<String> getListAlleg() {
        return listAlleg;
    }

    public void setListAlleg(ArrayList<String> listAlleg) {
        this.listAlleg = listAlleg;
    }
}
