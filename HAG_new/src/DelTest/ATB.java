package DelTest;

public class ATB {
   static void atbCheck(){
       boolean check;
       boolean type=true;
       int price1=200;
       int price2=100;
       check=(type&&(price1<=price2));
       System.out.println("ATB "+check);


    }
    public static void main(String[] args) {
        atbCheck();

    }
}
