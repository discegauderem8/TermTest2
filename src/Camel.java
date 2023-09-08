import java.util.HashSet;

public class Camel extends BaggageAnimal{


    public static HashSet<String> getCommands() {
        return commands;
    }

    public static void addCommand(String command) {
        Camel.commands.add(command);
    }

    private static HashSet<String> commands = new HashSet<>();
    public static Counter counter = new Counter();

    public Camel() {
    }
}