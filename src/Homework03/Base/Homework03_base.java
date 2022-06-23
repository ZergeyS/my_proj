package Homework03.Base;

import java.io.*;

public class Homework03_base {
    public static void main(String[] args) throws IOException {
        Car ladaPriora = new Zhiguli();
        Car landCruiser = new Toyota();

        Car[] cars = {ladaPriora, landCruiser};
        for (Car car: cars) {
            if (car instanceof Zhiguli) {
                Zhiguli carZhiguli = (Zhiguli) car;
                carZhiguli.breakDown();
            } else if (car instanceof Toyota) {
                Toyota carToyota = (Toyota) car;
                carToyota.turnOnTheMusic();
            }

        }
//------------------------------------------------------------------------------------
        FileReader fileReader = new FileReader("resours/my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String textFromFile = "";
        while (bufferedReader.ready()) {
            textFromFile += bufferedReader.readLine() + " ";
        }
        System.out.println(textFromFile);
        fileReader.close();
//-------------------------------------------------------------------------------------
        Financial_record financial_record = new Financial_record(500, 300);
        FileWriter fileWriter = new FileWriter("resours/report.txt");
        fileWriter.write("доходы = " + financial_record.getIncomes() + ", расходы = " + financial_record.getOutcomes());
        fileWriter.close();

    }

}
