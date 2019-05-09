package HAG.RKotsurLesson17;

import com.sun.prism.impl.ps.AATessArcRep;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3. задание с контрольной работы 1-2 выполнил на лекции.
 */

public class HwTaskTest {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
       String line = "Проверка вхождений на основе регулярных выражений!";
        //String line = "а А я Я";


        char charArr [] =new char[line.length()];
        for (int i=0; i<charArr.length;i++){

            char c=line.charAt(i);
           // System.out.println((int)c+" "+c);

            if(((int)c>=1072)&&((int)c<=1103)){
                charArr[i]=line.charAt(i);
                System.out.print(charArr[i]+" ");
            }

            if(((int)c>=1040)&&((int)c<=1071)){
                charArr[i]=(char)((int)c+32);
                System.out.print(charArr[i]+" ");
            }
            char c1=charArr[1];
            int countValue=0;

              }

        Arrays.sort(charArr);

        int countDone=0;
        char c=0;
        char done=0;

        for (int i = 1072; i <= 1103; i++) {
            int count=0;
            for (int ii=0; ii<charArr.length;ii++){

                if(charArr[ii]==(char)i){
                    //System.out.println(charArr[ii]+"  "+(char)i);
                    count++;
                    c=(char)i;
                }if (count>countDone){
                    done=(char)i;
                    countDone=count;
                    System.out.println("done  ="+done +" countDone ="+countDone);
                }
            }

        }
        System.out.println("Буква  "+done+"  встечается в строке "+countDone+" раз");





    }

    }



