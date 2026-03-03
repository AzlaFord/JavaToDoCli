import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ToDoList list  = new ToDoList();
        Map<String,Command> commands = new HashMap<>();
        commands.put("add",new AddCommand());
        commands.put("delete",new DeleteCommand());
        if (args.length > 0){
            Command cmd = commands.get(args[0]);
            if (cmd != null) {
                cmd.execute(list, args);
            }else{
                System.out.println("Commanda necunoscuta: "+ args[0]);
            }
        }else{
            System.out.println("Nici o commanda  introdusa!");
        }
    }
}