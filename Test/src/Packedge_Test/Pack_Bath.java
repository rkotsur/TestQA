package Packedge_Test;

/**
 * Created by 1 on 23.11.2018.
 */
public class Pack_Bath {
    private String
    s1= "s1 initial",
    s2= "s2 initial",
    s3,s4;
    //
    private int i;
    private float aFloat;
    public Pack_Bath(){
        System.out.println("Construct Pack_Bath()");
        s3= "Hello";
        aFloat=3.14f;
        Pack_Soap pack_soap;
        pack_soap= new Pack_Soap();
    }
    public static void main (System[] args){
        Pack_Bath pack_bath= new Pack_Bath();
    }
}
