import java.util.HashSet;

public class Hamster extends DomesticAnimal{


    public static HashSet<String> getCommands() {
        return commands;
    }

    public static void addCommand(String command) {
        Hamster.commands.add(command);
    }

    private static HashSet<String> commands = new HashSet<>();
    public static Counter counter = new Counter();

    public Hamster(){
    }
}