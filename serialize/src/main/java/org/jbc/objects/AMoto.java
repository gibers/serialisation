package org.jbc.objects;


import org.immutables.value.Value;
import org.jbc.enums.Marques;

import java.io.Serializable;

/**
 * Created by Jean-Baptiste on 19/02/2017.
 */
@Value.Immutable
public abstract class AMoto implements Serializable {

//    private Long id ;
//    private Enum<Marques> marque ;
//    private String Model ;
//    private int cylindre ;
//    private float prix ;
//    private int nbModelDispo ;

    public abstract Long getId();
    public abstract Enum<Marques> getMarque();

    @Value.Default
    public String getModel() {
        return "";
    }

    @Value.Default
    public int getCylindre() {
        return -1;
    }

    @Value.Default
    public float getPrix() {
        return -1;
    }

    @Value.Default
    public int getNbModelDispo() {
        return -1;
    }


}
