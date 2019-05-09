package Packedge_Test;

/**
 * Created by 1 on 06.11.2018.
 */
public class Pack_Test {
   public Pack_Test(){
     System.out.println("Packedge_Test class Pack_Test");
    }
    void PackTestVoid(){
        System.out.println("PackTestVoid Pack_Test");
    }
    public void intString(String s){
        System.out.println(s);
    }
    private void aVoidPrivate(){
        System.out.println("Приватный метод в классе Pack_Test");
    }
    void aVoidDouble(){
        aVoidPrivate();
    }
}
