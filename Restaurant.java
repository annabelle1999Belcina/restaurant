
package restaurant;


public class Restaurant {

    public static void main(String[] args) {
        
        System.out.println("~~~~~~~~~~~~~~~WELCOME TO OUR RESTAURANT~~~~~~~~~~~~~~~~ \n");
  
//My INGREDIENTS:::::::::::::::::
        System.out.println("**DISH and INGREDIENTS:\n");
        Ingredient pork = new Ingredient("Pork ");              
        Ingredient soySauce = new Ingredient("Soy Sauce ");     
        Ingredient vinegar = new Ingredient("Vinegar ");        
        Ingredient oil = new Ingredient("Oil ");                
        Ingredient spices = new Ingredient("Spices ");                  
        Ingredient egg = new Ingredient("Egg ");
        Ingredient squash = new Ingredient("Squash");
        Ingredient stringBeans = new Ingredient("String beans ");
        Ingredient EggPlant = new Ingredient("Eggplant");


        
//My DISHES:::::::::://ADD Ingredients to My Dish:::::::::::
        Dish kare = new Dish("Kare Kare",60); 
        Dish kinilaw = new Dish("Kinilaw",60);
        Dish sinigang = new Dish("Sinigang",60);
        Dish tapsilog = new Dish("Tapsilog",60);
        
        Dish Kare = new Dish("Kare Kare",20);
        System.out.println(Kare.toString());
        System.out.println("\tIngredients:");
        //Kare.addIng(squash);
       // Kare.addIng(stringBeans); 
       // Kare.addIng(EggPlant);
       // Kare.addIng(oil); Kare.addIng(spices);
        Kare.addIng(new Ingredient ("pork")); Kare.addIng(soySauce);
        Kare.ingredients(Kare.getIngList());
        
        Dish adobo = new Dish("Adobo",30);
        System.out.println(adobo.toString());
        System.out.print("\tIngredients:");
        adobo.addIng(pork); adobo.addIng(soySauce); adobo.addIng(vinegar); 
        adobo.addIng(oil); adobo.addIng(spices); 
        adobo.ingredients(adobo.getIngList());
        
        Dish omelet = new Dish("Egg Omelet",20);
        System.out.println(omelet.toString());
        System.out.print("\tIngredients:"); 
        omelet.addIng(egg);
        omelet.addIng(spices); omelet.addIng(oil);  
        omelet.ingredients(omelet.getIngList());   
        
//My Menu For WEEKDAYS:::::::::
        System.out.println("\nMENU:\n");

        WeekdayMenu weekday = new WeekdayMenu("\n**Menu For WeekDays**");
        weekday.addDish(adobo); weekday.addDish(omelet); weekday.addDish(kare); 
        weekday.addDish(kinilaw);  
        System.out.println(weekday.toString());
        weekday.dishesList(weekday.getDishes());
        System.out.println("Special Dish of the Day: "+weekday.randomSelect().getName());

//My Menu For WEEKENDS::::::::::::::::
        WeekendMenu weekend = new WeekendMenu("\n**Menu For WeekEnds**");
        weekend.addDish(kinilaw); weekend.addDish(sinigang); weekend.addDish(kare); 
        weekend.addDish(tapsilog);  
        System.out.println(weekend.toString());
        weekend.dishesList(weekend.getDishes());
        System.out.println("Special Dish of the Day: "+weekend.randomSelect().getName());
    }
}
