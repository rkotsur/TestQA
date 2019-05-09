package HAG.RKotsurLesson29;

/**
 * 1) Задача: создать программу, которая отображает следующее меню и запрашивает у пользователя соответствующую информацию:
 1) Введите блок
 2) Введите сферу
 3) Введите пирамиду
 4) Показать данные
 5) Выход
 Если пользователь выбирает
 вариант 1, попросите пользователя ввести длину блока, ширину и высоту
 Вариант 2, попросите пользователя ввести радиус сферы
 Вариант 3, попросите пользователя ввести длину и ширину основания, а затем высоту пирамиды
 Вариант 4 должен отображать все введенные фигуры, а также объем и площадь каждой фигуры. После отображения всех данных также отображается средний объем и средняя площадь поверхности всех введенных фигур.
 * Пользователь должен иметь возможность вводить до 10 фигур. Предположим, что все введенные данные действительны (т. е. Вам не нужно проверять наличие отрицательных чисел для размеров фигуры или «плохих» символов и т. Д.).
 ** Иерархия наследования классов должна быть реализована, и основная программа должна использовать полиморфизм для управления и отображения данных формы. Вы можете использовать либо интерфейсы Java, либо абстрактные классы, и абстрактные методы.


 */
public class Run {
    public static void main(String[] args) {
        Menu menu= new Menu();
        menu.menuDo();
    }
}
