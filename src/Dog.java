import java.util.HashSet;

public class Dog extends DomesticAnimal {


    public static HashSet<String> getCommands() {
        return commands;
    }

    public static void addCommand(String command) { //добавить try-with
        Dog.commands.add(command);
    }

    private static HashSet<String> commands = new HashSet<>();
    public static Counter counter = new Counter();

    public Dog() {
    }

//    public static void increment(){
//        counter.add();
//    }
//
//    public static void getNumber(){
//        System.out.println(counter.getCount());
//    }
}