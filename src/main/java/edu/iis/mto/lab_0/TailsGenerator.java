package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList <String> temp = new ArrayList<>();
        temp.add(value);
        for (int i = 1; i < value.length(); i++){
            temp.add(temp.get(i-i).substring(1));
        }
        temp.add("");
        return temp;
    }

}
