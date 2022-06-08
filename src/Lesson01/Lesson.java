package Lesson01;

public class Lesson {
    public static void main(String[] args) {
// Объявляем переменные
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
// Преобразуем переменные в требуемый вид и объединяем
        String result1 = (hi.trim() + "" + world.toLowerCase() + newLine);
// Вывод результата
        System.out.println(result1.repeat(3));



// Объявляем переменные (рост м или см ?)
        int height = 183;
        int weight = 83;
// Вычисляем результат
        double result2 = (double) weight / (height * height);

// Вывод результата
        System.out.println(result2);



// Создаем массив
        char[] array = new char[5];
            array[0] = 'a';
            array[1] = 'b';
            array[2] = 'c';
            array[3] = 'd';
            array[4] = 'e';
// массив в строку
                String text = String.copyValueOf(array);
// вывод
        System.out.println(text);
// меняем букву
            array[3] = 'h';
// снова в строку
        String text2 = String.copyValueOf(array);
// снова вывод
        System.out.println(text2);
    }
}
