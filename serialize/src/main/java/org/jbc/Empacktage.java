package org.jbc;

//import org.jbc.generateSource.ImmutableAMoto;

import java.beans.XMLEncoder;
import java.io.*;

/**
 * Created by Jean-Baptiste on 19/02/2017.
 */
public class Empacktage <T extends ObjectSerializable> {

    private T imm;
    public Empacktage(T imm) {
        this.imm = imm;
    }

    public void empackB () {
        ObjectOutputStream oos = null;
        try {
            final FileOutputStream fichier = new FileOutputStream("personne.ser");
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(imm);
            oos.flush();
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void empack () {
        BufferedOutputStream oos = null;
        XMLEncoder encoder = null;
        try {
            final FileOutputStream fichier = new FileOutputStream("personne.xml");
            oos = new BufferedOutputStream(fichier);
            encoder = new XMLEncoder(oos);
            encoder.writeObject(imm);
            encoder.flush();
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (encoder != null) {
                encoder.flush();
                encoder.close();
            }
        }
    }

}
