package HAG.RKotsurLesson20;

/**
 * Создайте класс Account, у которого будут методы дебет и кредит,
 * дебет будет снимать деньги с учетной записи, а кредит будет их пополнять.
 * Убедитесь, что сумма дебетов не превышает баланс счета. Если это так,
 * баланс должен быть оставлен без изменений, и метод должен напечатать сообщение:
 */
public class Account {
    static public float getAccount() {
        return account;
    }

    static public void setAccount(float account) {
        account = account;
    }

    static protected float account=0;

    public float kreditAccount(float x){
        float account=getAccount()+x;
        setAccount(account);
        return getAccount();

    }

}
