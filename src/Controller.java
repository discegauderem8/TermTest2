import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
        System.out.println("Добро пожаловать в меню управления питомником!");


        Counter counter = new Counter(); //Счетчик, который надо было сделать согласно заданию.
        // Внутренние статические счетчики внутри каждого класса не имеют к этому отношения
        while (true) {

            System.out.println("1 - Завести новое животное \n2 - Вывести список животных \n3 - Вывести команды \n4 - Обучить новым командам \n0 - Выйти из программы");

            try {
            Scanner scanner = new Scanner(System.in);
               int choice = scanner.nextInt();


                if (choice == 1) {
                    System.out.println("Сервис заведения нового животного.\n");
                    System.out.println("Выберите, какое животное вы хотите создать.\n1 - Кошка 2 - Cобака 3 - Хомяк\n4 - Лошадь 5 - Верблюд 6 - Осёл");

                    choice = scanner.nextInt();

                    if (choice == 1) {
                        model.addAnimal(new Cat());
                        System.out.println("Кошка добавлена");
                        Cat.counter.add();
                        try (counter){
                            counter.add();
                        }
                    }
                    else if (choice == 2) {
                        model.addAnimal(new Dog());
                        System.out.println("Собака добавлена");
                        Dog.counter.add();
                        try (counter){
                            counter.add();
                        }
                    } else if (choice == 3) {
                        model.addAnimal(new Hamster());
                        System.out.println("Хомяк добавлен");
                        Hamster.counter.add();
                        try (counter){
                            counter.add();
                        }
                    } else if (choice == 4) {
                        model.addAnimal(new Horse());
                        System.out.println("Лошадь добавлена");
                        Horse.counter.add();
                        try (counter){
                            counter.add();
                        }
                    } else if (choice == 5) {
                        model.addAnimal(new Camel());
                        System.out.println("Верблюд добавлен");
                        Camel.counter.add();
                        try (counter){
                            counter.add();
                        }
                    } else if (choice == 6) {
                        model.addAnimal(new Donkey());
                        System.out.println("Осёл добавлен");
                        Donkey.counter.add();
                        try (counter){
                            counter.add();
                        }
                    }
                } else if (choice == 2) {
                    System.out.println("Список животных: \n");
                    System.out.println(model.printAnimals());
                    System.out.println("Всего животных: " + counter.getCount());
                } else if (choice == 3) {
                    System.out.println(model.printAnimalsCommands());

                } else if (choice == 4) {

                    System.out.println("Выберите животное, которое вы хотите обучить командам:\n1 - Кошка 2 - Cобака 3 - Хомяк\n" +
                            "4 - Лошадь 5 - Верблюд 6 - Осёл");
                    try {
                        choice = scanner.nextInt();
                        System.out.println("Введите команду, которой вы хотите обучить животное: ");
                        String newCommand = scanner.next();
                        model.addCommand(choice, newCommand);
                    } catch (Exception e){

                    }

                } else if (choice == 0) {
                    scanner.close();
                    break;
                }
            } catch (Exception e) {
                System.out.println("проблема с бесконечным циклом controller");
            }
        }
    }
}