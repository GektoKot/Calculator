import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){

        //начало программы. Заводим Баффэрэдридер для чтения из консоли
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //приветствие
            System.out.println("Welcome to Calculator!");
            System.out.println("For exit write \"stop\"");
            System.out.print("Write your expression: ");
            //первичный ввод из консоли
            String expression = reader.readLine();
            //вечный цикл с условием для остановки по желанию
            while (!expression.equalsIgnoreCase("stop")) {
                //вывод ответа на основе ОПН(Обратная Польская Нотация). Что бы понять магию проваливаемся в метод
                System.out.println("Answer is: " + expression + "=" + Calculator.calculateIt(expression));
                //предложение ввести еще выражение
                System.out.print("Write your expression: ");
                //ввод нового выражения
                expression = reader.readLine();
            }
            System.out.println("goodbye");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
