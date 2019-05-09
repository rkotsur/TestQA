package HAG.old;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 1 on 12.12.2018.
 */
public class Lesson4 {
    public static void main(String[] args) {
        //classWork3();
        //classWork4();
        //classWork5();
        //homeWork1();
        homeChess();
    }

    public static void classWork3() {
        int getNum1, getNum2, getNum3, replaceNum;
        int numberSort = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        getNum1 = scanner.nextInt();
        System.out.println("Введите второе число");
        getNum2 = scanner.nextInt();
        System.out.println("Введите третье число");
        getNum3 = scanner.nextInt();
        System.out.println(getNum1 + " " + getNum2 + " " + getNum3);

        while (numberSort < 2) {
            if (getNum3 < getNum2) {
                replaceNum = getNum2;
                getNum2 = getNum3;
                getNum3 = replaceNum;
                //System.out.println(getNum1 + " " + getNum2 + " " + getNum3);
            }
            if (getNum2 < getNum1) {
                replaceNum = getNum1;
                getNum1 = getNum2;
                getNum2 = replaceNum;
            }
            //System.out.println(getNum1 + " " + getNum2 + " " + getNum3);
            numberSort++;
        }
        System.out.println(getNum1 + " " + getNum2 + " " + getNum3);
    }

    public static void classWork4() {
        Random random = new Random();
        int number = random.nextInt(999);
        System.out.println(number);
        //int number=321;
        int numberSort = 0;
        int hundred, decimal, one, replaceNum;
        hundred = number / 100;
        //System.out.println(hundred);
        decimal = number / 10 % 10;
        //System.out.println(decimal);
        one = number % 100 % 10;
        //System.out.println(one);
        while (numberSort < 2) {
            if (one < decimal) {
                replaceNum = decimal;
                decimal = one;
                one = replaceNum;
            }
            if (decimal < hundred) {
                replaceNum = hundred;
                hundred = decimal;
                decimal = replaceNum;
            }
            numberSort++;
        }
        System.out.println("MAX " + one);


    }

    public static void classWork5() {
        int findNumber, getNumber;
        int popitka = 0;
        getNumber = 0;
        Random random = new Random();
        findNumber = random.nextInt(100);
        System.out.println(findNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число искомое у Вас будет 7 попыток.");
        while (popitka <= 7) {
            if (popitka <= 7)
                getNumber = scanner.nextInt();
            if (findNumber == getNumber) {
                System.out.println("Yes yes yes");
                scanner.close();
                break;

            }
            if (findNumber > getNumber) {
                System.out.println("Искомое число больше введеного");
            } else {
                System.out.println("Искомое число меньше введёного");
            }
            popitka++;

            if ((popitka == 7)&&(findNumber != getNumber)) {
                System.out.println("Увы вы не угадали. Загадано было " + findNumber);
                break;
                //scanner.close();

            }

        }

        scanner.close();
    }
    public static void homeWork1(){
        int happy6,happy5,happy4,happy3,happy2,happy1;
        int getHappy;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите номер Вашего билетика");
        getHappy=scanner.nextInt();
        happy6=getHappy/100000;
        happy5=getHappy/10000%10;
        happy4=getHappy/1000%10;
        happy3=getHappy/100%10;
        happy2=getHappy/10%10;
        happy1=getHappy%10;
        //System.out.println(happy6+" " +happy5+" "+happy4+" "+happy3+" "+happy2+" "+happy1);
        scanner.close();
        if ((happy1+happy2+happy3)==(happy6+happy5+happy4)){
            System.out.println("Ваш билет счастливый  " +getHappy);
        }else System.out.println("Увы вам не повезло он не счастливый "+ getHappy);
    }
    public static void homeChess(){
        int kordX, kordChessX;
        int kordY, kordChessY;
        int chessItem;
        int endProgram=1;
        System.out.println("Введите");
        Scanner scanner = new Scanner(System.in);
        System.out.println("координату X от 1 до 8");
        kordX=scanner.nextInt();
        System.out.println("координату Y  от 1 до 8");
        kordY=scanner.nextInt();
        System.out.println("Введите кординату другой фигуры");
        System.out.println("координату X от 1 до 8");
        kordChessX=scanner.nextInt();
        System.out.println("координату Y  от 1 до 8");
        kordChessY=scanner.nextInt();
        if ((kordX>9)||(kordY>9)||(kordX<1)||(kordY<1)||(kordChessX>9)||(kordChessY>9)||(kordChessX<1)||(kordChessY<1)) {
            System.out.println("Вы ввели неверные координаты");
            endProgram=0;
            }
        System.out.println("Ваши введенные координаты (" +kordX+":"+kordY+")"+ " "+"("+kordChessX+":"+kordChessY+")");
        if (endProgram==0){
            System.out.println("Не могу составить задание");

        }

        else{
            if ((kordChessX-kordX==1)&&(kordChessY-kordY==1)|| ((kordX-kordChessX==1)&&(kordChessY-kordY==1))){
                System.out.println("Пешка угрожает фигуре c координатами"+ "("+kordChessX+":"+kordChessY+")");
                endProgram++;
            }
            if((kordChessX==kordX)||(kordChessY==kordX)){
                System.out.println("Ладья угрожает фигуре с координатами"+ "("+kordChessX+":"+kordChessY+")");
                endProgram++;
            }
            if((kordChessX-kordX==1)&&(kordChessY-kordY==2) ||((kordChessX-kordX==2)&&(kordChessY-kordY==1))
                    ||((kordChessX-kordX==2)&&(kordY-kordChessY==1))||((kordChessX-kordX==1)&&(kordY-kordChessY==2))||
            ((kordX-kordChessX==1)&&(kordY-kordChessY==2))||((kordX-kordChessX==2)&&(kordY-kordChessY==1))
            ||((kordX-kordChessX==2)&&(kordChessY-kordY==1))||((kordX-kordChessX==1)&&(kordChessY-kordY==2)))
                    {
                        System.out.println("Конь угрожает фигуре с координатами"+ "("+kordChessX+":"+kordChessY+")");
                        endProgram++;

            }
            if (((kordX-kordChessX==1)&&(kordY-kordChessY==1))||
                    ((kordX-kordChessX==2)&&(kordY-kordChessY==2))||
                    ((kordX-kordChessX==3)&&(kordY-kordChessY==3))||
                    ((kordX-kordChessX==4)&&(kordY-kordChessY==4))||
                    ((kordX-kordChessX==5)&&(kordY-kordChessY==5))||
                    ((kordX-kordChessX==6)&&(kordY-kordChessY==6))||
                    ((kordX-kordChessX==7)&&(kordY-kordChessY==7))||
                    ((kordChessX-kordX==1)&&(kordChessY-kordY==1))||
                    ((kordChessX-kordX==2)&&(kordChessY-kordY==2))||
                    ((kordChessX-kordX==3)&&(kordChessY-kordY==3))||
                    ((kordChessX-kordX==4)&&(kordChessY-kordY==4))||
                    ((kordChessX-kordX==5)&&(kordChessY-kordY==5))||
                    ((kordChessX-kordX==6)&&(kordChessY-kordY==6))||
                    ((kordChessX-kordX==7)&&(kordChessY-kordY==7))||
                    ((kordChessX-kordX==1)&&(kordY-kordChessY==1))||
                    ((kordChessX-kordX==2)&&(kordY-kordChessY==2))||
                    ((kordChessX-kordX==3)&&(kordY-kordChessY==3))||
                    ((kordChessX-kordX==4)&&(kordY-kordChessY==4))||
                    ((kordChessX-kordX==5)&&(kordY-kordChessY==5))||
                    ((kordChessX-kordX==6)&&(kordY-kordChessY==6))||
                    ((kordChessX-kordX==7)&&(kordY-kordChessY==7))||
                    ((kordX-kordChessX==1)&&(kordChessY-kordY==1))||
                    ((kordX-kordChessX==2)&&(kordChessY-kordY==2))||
                    ((kordX-kordChessX==3)&&(kordChessY-kordY==3))||
                    ((kordX-kordChessX==4)&&(kordChessY-kordY==4))||
                    ((kordX-kordChessX==5)&&(kordChessY-kordY==5))||
                    ((kordX-kordChessX==6)&&(kordChessY-kordY==6))||
                    ((kordX-kordChessX==7)&&(kordChessY-kordY==7))){

                System.out.println("Слон угрожает фигуре с координатами"+ "("+kordChessX+":"+kordChessY+")");
                endProgram++;

            }

            if (((kordX-kordChessX==1)&&(kordY-kordChessY==1))||
                ((kordChessX-kordX==1)&&(kordChessY-kordY==1))||
                ((kordX-kordChessX==1)&&(kordChessY-kordY==1))||
                ((kordX-kordChessX==1)&&(kordChessY-kordY==1))||
                ((kordX-kordChessX==1)&&(kordChessY-kordY==0))||
                ((kordX-kordChessX==0)&&(kordChessY-kordY==1))||
                ((kordChessX-kordX==1)&&(kordChessY-kordY==0))||
                ((kordX-kordChessX==0)&&(kordY-kordChessY==1))){
                System.out.println("Кароль угрожает фигуре с координатами"+ "("+kordChessX+":"+kordChessY+")");
                endProgram++;
            }
            if(((kordChessX==kordX)||(kordChessY==kordX))||

                    ((kordX-kordChessX==1)&&(kordY-kordChessY==1))||
                    ((kordX-kordChessX==2)&&(kordY-kordChessY==2))||
                    ((kordX-kordChessX==3)&&(kordY-kordChessY==3))||
                    ((kordX-kordChessX==4)&&(kordY-kordChessY==4))||
                    ((kordX-kordChessX==5)&&(kordY-kordChessY==5))||
                    ((kordX-kordChessX==6)&&(kordY-kordChessY==6))||
                    ((kordX-kordChessX==7)&&(kordY-kordChessY==7))||
                    ((kordChessX-kordX==1)&&(kordChessY-kordY==1))||
                    ((kordChessX-kordX==2)&&(kordChessY-kordY==2))||
                    ((kordChessX-kordX==3)&&(kordChessY-kordY==3))||
                    ((kordChessX-kordX==4)&&(kordChessY-kordY==4))||
                    ((kordChessX-kordX==5)&&(kordChessY-kordY==5))||
                    ((kordChessX-kordX==6)&&(kordChessY-kordY==6))||
                    ((kordChessX-kordX==7)&&(kordChessY-kordY==7))||
                    ((kordChessX-kordX==1)&&(kordY-kordChessY==1))||
                    ((kordChessX-kordX==2)&&(kordY-kordChessY==2))||
                    ((kordChessX-kordX==3)&&(kordY-kordChessY==3))||
                    ((kordChessX-kordX==4)&&(kordY-kordChessY==4))||
                    ((kordChessX-kordX==5)&&(kordY-kordChessY==5))||
                    ((kordChessX-kordX==6)&&(kordY-kordChessY==6))||
                    ((kordChessX-kordX==7)&&(kordY-kordChessY==7))||
                    ((kordX-kordChessX==1)&&(kordChessY-kordY==1))||
                    ((kordX-kordChessX==2)&&(kordChessY-kordY==2))||
                    ((kordX-kordChessX==3)&&(kordChessY-kordY==3))||
                    ((kordX-kordChessX==4)&&(kordChessY-kordY==4))||
                    ((kordX-kordChessX==5)&&(kordChessY-kordY==5))||
                    ((kordX-kordChessX==6)&&(kordChessY-kordY==6))||
                    ((kordX-kordChessX==7)&&(kordChessY-kordY==7)))


                    {System.out.println("Королева угрожает фигуре с координатами"+ "("+kordChessX+":"+kordChessY+")");
                    endProgram++;}


        }
       // System.out.println(endProgram+"mmmmm");
        if(endProgram==1){
            System.out.println("Никто не угрожает!!!!");
        }


    }

    }



