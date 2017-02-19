package org.jbc.enums;

/**
 * Created by Jean-Baptiste on 19/02/2017.
 */
public enum Sexe {
    M("masculin"), F("feminin");

    private String name = "";

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    Sexe (String name) {
        this.name = name;
    }
}
