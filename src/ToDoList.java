import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks = new ArrayList<>();
    public void add(String task){
        tasks.add(task);
    }
    public void delete(int index){
        if(index >= 0 && index < tasks.size()){
            tasks.remove(index);
        }
    }
    public void list(){
        for (int i = 0;i< tasks.size();i++){
            System.out.println(i + ": "+ tasks.get(i));
        }
    }
    public void clear(){
        tasks.clear();
    }
}
