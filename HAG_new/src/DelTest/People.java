
package DelTest;

//@FunctionalInterface
abstract class Peopl{
//       public void getAge1();
}

 class People extends Peopl {
static int x=10;
//    @Override
    public void getAge1() {
        //return x;
    }
}


//class Do {
//    int xx;
//    Do(People x) {
//        xx=x.getAge();
//    }
//}

class RunTEST{
    public static void main(String[] args) {
        People p0= new People();
        People p1 = new People();
//        Do d0= new Do(p1);
//        int x=(People::getAge1);


    }
}
