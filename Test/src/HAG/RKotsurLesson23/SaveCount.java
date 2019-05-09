package HAG.RKotsurLesson23;

/**
 * 1.Создать класс Сберегательный счет. Используйте статическую переменную «годовая процентная ставка» для хранения годовой процентной ставки всех владельцев счетов. Каждый объект класса содержит переменную частного сбережения, указывающую сумму, которую хранитель в настоящее время имеет при внесении. Написать метод для расчета ежемесячного процента. Напишите статический метод «изменение процентной ставки», который устанавливает «годовую процентную ставку» на новое значение.
 Напишите программу для тестирования класса Сберегательный счет. Создайте два объекта сберегательной учетной записи: saver1 и saver2, с балансом $ 2000.00 и $ 3000.00 соответственно. Установить годовую процентную ставку до 4%, затем рассчитать ежемесячный процент и распечатать новые балансы для обоих вкладчиков. Затем установите годовую процентную ставку на 5%, рассчитайте проценты следующего месяца и распечатайте новые балансы для обоих вкладчиков.

 */
public class SaveCount {
    static float percentYear;

    public static float getPercentYear() {
        return percentYear;
    }

    public static void setPercentYear(float percentYear) {
        SaveCount.percentYear = percentYear;
    }

    public float getSummUser() {
        return summUser;
    }

    public void setSummUser(float summUser) {
        this.summUser = summUser;
    }

    float summUser;
    static float monthPercent(){
        return percentYear/12;
    }
    public static void percentChenge (float x){
        setPercentYear(x);
    }
    public float setSummPercent(float x, int y){
        setSummUser(x);
        int countMonth=y;
        setSummUser(getSummUser()*((monthPercent()/100)*y+1) );
        return getSummUser();


    }

}
class RunCount{
    public static void main(String[] args) {
        SaveCount saver1 = new SaveCount();
        SaveCount saver2 = new SaveCount();
        saver1.setSummUser(2000);
        saver2.setSummUser(3000);
        SaveCount.setPercentYear(4);
        System.out.println("Процент в месяц "+SaveCount.monthPercent());
        System.out.println("Положили депозит на 1 месяц " +"Под "+SaveCount.percentYear +"% годовых " +saver1.setSummPercent(saver1.getSummUser(),1));
        System.out.println("Положили депозит на 1 месяц " +"Под "+SaveCount.percentYear +"% годовых " +saver2.setSummPercent(saver2.getSummUser(),1));
        SaveCount.setPercentYear(5);
        System.out.println("\n");
        System.out.println("Положили депозит на 1 месяц " +"Под "+SaveCount.percentYear +"% годовых " +saver1.setSummPercent(saver1.getSummUser(),1));
        System.out.println("Положили депозит на 1 месяц " +"Под "+SaveCount.percentYear +"% годовых " +saver2.setSummPercent(saver2.getSummUser(),1));
        System.out.println("\n");
        System.out.println("Баланс первого депозита "+saver1.getSummUser());
        System.out.println("Баланс второго депозита "+saver2.getSummUser());


    }

        }
