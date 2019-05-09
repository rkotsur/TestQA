package RKotsurLesson37;
/**
 * Напишите класс, реализующий интерфейс Runnable, содержащий поле-счетчик. Метод runnableClass() должен наращивать этот
 * счетчик.
 * Создайте пять экземпляров этого класса и запустите их в пяти потоках с разными приоритетами. После 3 секунд работы
 * остановите потоки и сравните значения счетчиков.
 */

//class MyThreadClass implements Runnable {
//    private int counter = 0;
//
//    @Override
//
//        System.out.println("Count start = " + counter);
//        while (!Thread.currentThread().isInterrupted()) {
//            counter++;
//        }
//        System.out.println("Count finish = " + counter);
//    }
//}
//
//    public class TherdClass {
//        public static void main(String[] args) {
//            Thread t[] = new Thread[5];
//            for (int i = 0; i < t.length; i++) {
//                t[i] = new Thread(new MyThreadClass());
//                System.out.println("Thread " + (i + 1) + " created");
//                t[i].setPriority(Thread.MIN_PRIORITY + i * 2);
//            }
//            System.out.println();
//            for (int i = 0; i < t.length; i++) {
//                Thread thread = t[i];
//                System.out.println("Thread " + (i + 1) + " started");
//                thread.start();
//                try {
//                    thread.join(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                thread.interrupt();
//                System.out.println("Thread " + (i + 1) + " finished");
//            }
//        }
//    }

