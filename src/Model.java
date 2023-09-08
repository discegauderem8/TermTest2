import java.util.HashSet;
import java.util.Iterator;

public class Model {

    private MyHashSet<Animal> animals;

    public void addAnimal(Animal animal) {

        animals.add(animal);
    }

    public HashSet<Animal> getAnimals() {
        return animals;
    }

    public void addCommand(int thisChoice, String command) {

        if (thisChoice == 1) {
            try {
                animalCheck(new Cat());
                Cat.addCommand(command);
                System.out.println("Кошка(и) освоила(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Кошки ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (thisChoice == 2) { //СОБАКА
            try {
                animalCheck(new Dog());
                Dog.addCommand(command);
                System.out.println("Собака(и) освоила(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Собаки ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (thisChoice == 3) { //ХОМЯК
            try {
                animalCheck(new Hamster());
                Hamster.addCommand(command);
                System.out.println("Хомяк(и) освоил(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Хомяки ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (thisChoice == 4) { //ЛОШАДЬ
            try {
                animalCheck(new Horse());
                Horse.addCommand(command);
                System.out.println("Лошадь(и) освоил(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Лошади ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (thisChoice == 5) { //ВЕРБЛЮД
            try {
                animalCheck(new Camel());
                Camel.addCommand(command);
                System.out.println("Верблюд(ы) освоил(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Верблюды ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (thisChoice == 6) { //ОСЁЛ
            try {
                animalCheck(new Donkey());
                Donkey.addCommand(command);
                System.out.println("Осёл(ослы) освоил(и) команду " + command);
            } catch (NullPointerException e) {
                System.out.println("ОШИБКА: Ослы ещё не заведены");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }

    public String printAnimalsCommands(){
        StringBuilder stb = new StringBuilder();

        Iterator<Animal> iter = animals.iterator();

        Animal item;

        while (iter.hasNext()) {
            item = iter.next();
            if (item instanceof Cat) {
                stb.append("Команды кошки(кошек): " + Cat.getCommands());
            } else if (item instanceof Dog) {
                stb.append("Команды собаки(собак): " + Dog.getCommands());
            } else if (item instanceof Hamster) {
                stb.append("Команды хомяка(хомяков): " + Hamster.getCommands());
            } else if (item instanceof Horse) {
                stb.append("Команды лошади(лошадей): " + Horse.getCommands());
            } else if (item instanceof Donkey) {
                stb.append("Команды осла(ослов): " + Donkey.getCommands());
            } else if (item instanceof Camel) {
                stb.append("Команды верблюда(верблюдов): " + Camel.getCommands());
            }

            if (!iter.hasNext()) {
                stb.append(".");
            } else {
                stb.append(", ");
            }
        }
        return stb.toString();
    }

    public String printAnimals() {

        StringBuilder stb = new StringBuilder();

        Iterator<Animal> iter = animals.iterator();

        Animal item;

        while (iter.hasNext()) {
            item = iter.next();
            if (item instanceof Cat) {
                stb.append(Cat.counter.getCount() + " кошка(кошек)");
            } else if (item instanceof Dog) {
                stb.append(Dog.counter.getCount() + " собак(а)");
            } else if (item instanceof Hamster) {
                stb.append(Hamster.counter.getCount() + " хомяк(ов)");
            } else if (item instanceof Horse) {
                stb.append(Horse.counter.getCount() + " лошадь(лошадей)");
            } else if (item instanceof Donkey) {
                stb.append(Donkey.counter.getCount() + " осёл(ослов)");
            } else if (item instanceof Camel) {
                stb.append(Camel.counter.getCount() + " верблюд(ов)");
            }

            if (!iter.hasNext()) {
                stb.append(".");
            } else {
                stb.append(", ");
            }
        }
        return stb.toString();
    }

    public void animalCheck(Animal animal) throws NullPointerException{
        if (animals.contains(animal)){
            System.out.println("Животное уже есть в питомнике, обучение началось.\n");
        } else throw new NullPointerException();
    }

    public Model() {
        this.animals = new MyHashSet<>();

    }
}
