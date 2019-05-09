package DelTest;

public enum EnumClass {
    ONE, TWO, THREE;
}
class Actor{
    public void act(){

    }
}
class HappyActor extends  Actor{
    public void act(){
        System.out.println("Happy Act");
    }

}
class SedActor extends Actor{
    public void act(){
        System.out.println("Sed Act");
    }
    public void rest(){
        System.out.println("Rest");
    }
}
class Stage{
    private Actor actor = new Actor();
    public void change(){
        actor= new SedActor();
    }
    public void performPlay(){
        actor.act();
    }
}
class run{
    public static void main(String[] args) {
        Actor[] arr = {new HappyActor(), new SedActor(),new Actor()};
        arr[0].act();
        ((SedActor)(arr[1])).rest();
        System.out.println(arr[1].getClass());
        System.out.println(arr[2].getClass());

    }
}
