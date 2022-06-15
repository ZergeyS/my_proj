package Homework02;

public class Homework_base {
    public static void main(String[] args) {
// Задание №1 вариант 1
        for (int i = 1; i < 101; i++) {
        System.out.print(i + "a" + " ");
        }
        System.out.println("%n");
// Задание №1 вариант 2
        int number = 1;
        while (number < 101) {
            System.out.print(number + "a" + " ");
            number += 1;
        }
        System.out.println("%n");
// Задание №2
        int ageChildren = 10;
        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел  в университет");
        }
// Задание №3
//        boolean chicken = false;
//        boolean vegetables = true;
//        boolean sour = true;
//        boolean toast = true;
//        boolean sausage = true;
//        boolean eggs = true;
//---------------------------------
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        if (chicken && vegetables && sour && toast) {
            System.out.println("готовим Цезарь");
        } else if (vegetables && (chicken || sausage) && eggs) {
            System.out.println("готовим Оливье");
        } else if (vegetables) {
            System.out.println("готовим овощной салат");
        } else {
            System.out.println("У меня ничего нет");
        }
// Задание №4
        Animal firstAnimal = new Animal("Horse", 4);
        Animal secondAnimal = new Animal("Spider", 8);
        System.out.println(firstAnimal.getAnimalInfo());
        System.out.println(secondAnimal.getAnimalInfo());
        System.out.println("удвоим количество ног");
        firstAnimal.legsMultiplier(2);
        secondAnimal.legsMultiplier(2);
        System.out.println("A mutant " + firstAnimal.getAnimalInfo());
        System.out.println("A mutant " + secondAnimal.getAnimalInfo());
    }
}
