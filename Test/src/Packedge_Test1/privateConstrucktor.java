package Packedge_Test1;

/**
 * Created by 1 on 09.11.2018.
 */
public class privateConstrucktor {
    protected privateConstrucktor(){
        System.out.println("Конструктор privateConstrucktor");
    }

 static void aVoid(){
    new privateConstrucktor();
}
}