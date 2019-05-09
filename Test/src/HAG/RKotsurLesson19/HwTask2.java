package HAG.RKotsurLesson19;

import java.util.Scanner;

/**
 *2)	Пользователь вводит слово. Сделать проверку на то чтобы слово состояло
 * из четного числа букв. Поменять местами его половины.
 */
public class HwTask2 {
    public static void main(String[] args) {
        HwTask2();
    }
    public static void HwTask2(){
        String s;
        do {
            System.out.println("Введите слово с четным количеством букв");
            Scanner scanner = new Scanner(System.in);
            s=scanner.next();
        }while (s.length()%2!=0);
        char c []= new char[s.length()];
        for (int i=0;i<s.length();i++){
            if (i<s.length()/2){
                c[i+(s.length()/2)]=s.charAt(i);

            }else{
                c[i-(s.length()/2)]=s.charAt(i);
            }

        }
        for (char c1:
                c){
            System.out.print(c1+" ");
        }

    }
}
