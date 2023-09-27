import java.util.ArrayList;

public class Mod3Zad2 {
    private final ArrayList<String> ToDoList = new ArrayList<>();

    public void ToDoList(){
    }

    public void add(String task){
        ToDoList.add(task);
    }

    public void print(){
        int size = ToDoList.size();
        for (int i = 0; i < size; i++){
            System.out.println(i + ". " + ToDoList.get(i));
        }
    }
    public void remove(int number){
        if (number < ToDoList.size()){
            ToDoList.remove(number);
        } else {
            System.out.println("Lista nie ma tyle elementow");
            System.out.println("Ilosc elementow listy to: " + ToDoList.size());
        }
    }
}
