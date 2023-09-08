import java.util.ArrayList;
import java.util.HashSet;

public class Donkey extends BaggageAnimal{

    public static HashSet<String> getCommands() {
        return commands;
    }

    public static void addCommand(String command) {
        Donkey.commands.add(command);
    }

    private static HashSet<String> commands = new HashSet<>();
    public static Counter counter = new Counter();

    public Donkey() {
    }
}