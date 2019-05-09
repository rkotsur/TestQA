package Packedge_Test;

/**
 * Created by 1 on 23.11.2018.
 */
public class Pack_Run {
    String string1,string2,string3,string4;
    private Pack_DB pack_db = new Pack_DB();
    private int anInt;
    private float aFloat;
    public String toString(){
        return
        "string1= "+string1+" "+
        "string2= "+string2+" "+
        "string3= "+string3+" "+
        "string4= "+string4+" "+
        "anInt= "+anInt+" "+
        "aFloat= "+aFloat+" "+
        "pack_db= "+pack_db;
    }
    public static void main(String []args){
    Pack_Run pack_run= new Pack_Run();
    System.out.print(pack_run);
    }

}
