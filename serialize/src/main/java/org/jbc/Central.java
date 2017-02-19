package org.jbc;

import org.jbc.configuration.Config;
import org.jbc.enums.Marques;
//import org.jbc.generateSource.ImmutableAMoto;
import org.jbc.enums.Sexe;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jean-Baptiste on 19/02/2017.
 */
public class Central {
    public static void main(String args[]) {
        System.out.println("salut les loucoumes");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Marques m = Marques.Honda;

        System.out.println("m.name() => " + m.name());

        Enum<Sexe> sexe = Sexe.M;
        Person p1 = new Person("Durant", "toto", 33, sexe );

//        ImmutableAMoto immMoto = ImmutableAMoto.builder().id(12l).marque(Marques.Honda)
//                .model("Deauville")
//                .build();

        Empacktage emp = new Empacktage(p1);
        emp.empack();

    }
}
