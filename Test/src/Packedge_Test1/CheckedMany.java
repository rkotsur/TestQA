package Packedge_Test1;

/**
 * Created by 1 on 08.11.2018.
 */
public class CheckedMany {
    public void checkedMany(){
        CheckMany checkMany = new CheckMany();
        System.out.println("checkMany.publicInt "+checkMany.publicInt);
        //System.out.println("checkMany.privetInt "+checkMany.privetInt);
        System.out.println("checkMany.protectedInt "+checkMany.protectedInt);
        System.out.println("checkMany.staticInt "+checkMany.staticInt);
       checkMany.publicMany();
        //checkMany.privetMany();
        checkMany.protectedMany();
        checkMany.staticMany();
    }
}
