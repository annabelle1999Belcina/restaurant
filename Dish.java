
package restaurant;

import java.util.ArrayList;
import java.util.List;


public class Dish {
    private List<Ingredient> ingList = new ArrayList<Ingredient>();

    private String name;
    private int time;
    
    public Dish() {
    }
    
    public Dish(String name,int time) {
        this.name = name;
        this.time = time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngList() {
        return ingList;
    }
    
    public void addIng(Ingredient newIng){
        ingList.add(newIng);
    }

    public void ingredients(List<Ingredient> newIngs){
            System.out.print(newIngs+"\n\n");
    } 
    
    @Override
    public String toString() {
        return name + " will be cooked after " + time + " minutes.";
    }
}
