package HAG.RKotsurLesson31;

/**
 * Created by 1 on 26.02.2019.
 */
public interface Wagons {
    int getSizeWagon();

}


class Coupe implements Wagons{
    final int sizeCoupe=40;
    public int getSizeWagon(){
        return sizeCoupe;
    }

}
class Placecart implements Wagons{
    final int sizePlacecart=54;
    public int getSizeWagon(){
        return sizePlacecart;
    }
}
class Suite implements Wagons{
    final int sizeSuite=18;
    public int getSizeWagon(){
        return sizeSuite;
    }

}

//class C1 implements Wagons{
//    final int sizeC1=56;
//
//
//}
//class C2 implements Wagons{
//    final int sizeC2=80;
//
//
//}