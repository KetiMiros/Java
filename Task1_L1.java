import java.util.Scanner;

public class Task1_L1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // сообщаем, что будем принимать данные
            System.out.print("Введите число x: ");
            int num_x = scanner.nextInt();       //  сообщаем, что принимаем число

            System.out.print("Введите число y: ");
            int num_y = scanner.nextInt();

            int res;

            System.out.print("Выберите действие: ");
            String action = scanner.nextLine();
            action = scanner.nextLine();
            switch (action){
                case "+":
                    res = num_x + num_y;
                    System.out.println("Результат:" + res);
                    break;
                case "-":
                    res = num_x - num_y;
                    System.out.println("Результат:" + res);
                    break;
                case "/":
                    if (num_y == 0)                      // страхуемся от деления на ноль
                    System.out.println("Error");
                else{
                    res = num_x/ num_y;
                    System.out.println("Результат:" + res);
                    break;
                }
                case "*":
                    res = num_x * num_y;
                    System.out.println("Результат:" + res);
                    break;
                default:
                    System.out.println("Вы что-то не то ввели, попробуйте еще раз");
            }

        }
    }

