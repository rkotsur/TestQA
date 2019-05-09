package HAG.RKotsurLesson20;

/**
 * -Дебит суммы превысил остаток на счете или
 -Недостаточно средств на счету (как решите сами)
 В классе AccountTest создать логику дебетования.

 */
public class AccountTest {
    public void debetAccount (float y){
        float money=Account.getAccount();
        if(money>y){
            System.out.println("У Вас не достаточно денег");
        }
        else{
            money=money-y;
            Account.setAccount(money);
        }

    }
}
