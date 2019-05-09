import java.util.Random;

class Letter{
}

public class DataOnly{

public int brosok(){
        Random monetka = new Random();
    int x=monetka.nextInt(100);
    System.out.println(x);
 return x%2;
}

    public static void main (String [] args){
        DataOnly dd= new DataOnly();
        System.out.println(dd.brosok()>1);
    }


}
