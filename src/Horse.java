import java.util.HashSet;

public class Horse extends BaggageAnimal{

    public static HashSet<String> getCommands() {
        return commands;
    }

    public static void addCommand(String command) {
        Horse.commands.add(command);
    }

    private static HashSet<String> commands = new HashSet<>();
    public static Counter counter = new Counter();

    public Horse() {
    }
}