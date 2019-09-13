package restaurant;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class WeekdayMenu implements Menu {
    private String description;
    private List<Dish> dishes = new ArrayList<Dish>();

    public WeekdayMenu(String description) {
        this.description = description;
    }

    public void dishesList(List<Dish> dishes) {
        for (Dish dish : dishes) {
            System.out.println("\t" + dish.getName());
        }
    }
    
    public List<Dish> getDishes() {
        return dishes;
    }
    
     public void addDish(Dish dish){ 
        dishes.add(dish);
    }
     
     @Override
    public Dish randomSelect() {
        Random rand = new Random();   
        Dish element = dishes.get(rand.nextInt(dishes.size()-1));
       
        return element; 
    }

    @Override
    public String toString() {
        return description;
    }
}
