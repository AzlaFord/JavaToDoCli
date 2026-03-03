import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

public class ToDoList {
    private ArrayList<String> tasks = new ArrayList<>();
    private static final String FILE = "tasks.json";
    private Gson gson = new Gson();
    public ToDoList(){
        load();
    }

    public void add(String task){
        tasks.add(task);
        save();
    }
    public void delete(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }
    }
    public void list(){
        for (int i = 0;i< tasks.size();i++){
            System.out.println(i + ": "+ tasks.get(i));
            save();
        }
    }
    public void clear(){
        tasks.clear();
    }
    private void save(){
        try(FileWriter writer = new FileWriter(FILE)){
            gson.toJson(tasks,writer);
        }catch (IOException e){
            System.out.println("Erroare la salvare: " + e.getMessage());
        }
    }
    private void load(){
        try (FileReader reader = new FileReader(FILE)){
            tasks = gson.fromJson(reader,ArrayList.class);
            if (tasks == null ) tasks = new ArrayList<>();
        }catch (FileNotFoundException e){
            tasks = new ArrayList<>();
        } catch (IOException e){
            System.out.println("Erroare la salvare: " + e.getMessage());
        }
    }
}
