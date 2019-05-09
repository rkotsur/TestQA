package Packedge_Test1;

/**
 * Created by 1 on 08.11.2018.
 */
public class CheckMany {
    protected CheckMany(){
        System.out.println ("Конструктор CheckMany");
    }
    public int publicInt;
    private int privetInt;
    protected int protectedInt;
    static int staticInt;
    public void  publicMany(){
        System.out.println ("publicMany в классе СheckMany");
    }
    private void  privateMany(){
        System.out.println ("privateMany в классе СheckMany");
    }
    protected void  protectedMany(){
        System.out.println ("protectedMany в классе СheckMany");
    }
    static void  staticMany(){
        System.out.println ("staticMany в классе СheckMany");
    }

}
