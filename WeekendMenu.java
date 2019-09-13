
package restaurant;
import java.util.ArrayList;
import java.util.Random; 

import java.util.List;

public class WeekendMenu implements Menu {
    
    private String description;
    private List<Dish> dishes = new ArrayList<Dish>();

    public WeekendMenu(String description) {
        this.description = description;
    }
    
    public void dishesList(List<Dish> dishes){
        for (Dish dish : dishes){
            System.out.println("\t"+dish.getName());
        }
    }
    
    public List<Dish> getDishes() {
        return dishes;
    }
    
     public void addDish(Dish dish){ 
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return description;
    }

    @Override
    public Dish randomSelect() {
        Random rand = new Random();   
        Dish element = dishes.get(rand.nextInt(dishes.size()-1));
        return element;
    }

//        public void givenList_shouldReturnARandomElement() {
//    List<Integer> givenList = Arrays.asList(1, 2, 3);
//    Random rand = new Random();
//    int randomElement = givenList.get(rand.nextInt(givenList.size()));
//}
}
