package com.vetpetmon.wyrmsofnyrus.invasion;

import java.util.ArrayList;

public class HiveName {
    public static String HiveName() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Forakk");
        names.add("Gamii");
        names.add("Irikom");
        names.add("Teku");
        names.add("Thorakk");
        names.add("Origok");
        names.add("Tebiuk");
        names.add("Carik");
        names.add("Aarak");
        names.add("Temuk");
        names.add("Irikek");
        names.add("Ikik");
        names.add("Zir");
        names.add("Vim");
        return names.get((int) ((Math.random()) * 12));
        //return names.get((int) ((Math.random()) * names.size()));
    }
}
