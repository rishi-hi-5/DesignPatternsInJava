package Structural.composite.without;


import java.util.ArrayList;
import java.util.List;

class Dish {
    private String name;
    public Dish(String name) {
        this.name= name;
    }

    public void showDish(){
        System.out.println("The dish is "+name);
    }
}

class MenuCategory {
    private String menuCategory;
    private List<Dish> dishes= new ArrayList<>();

    public MenuCategory(String menuCategory) {
        this.menuCategory= menuCategory;
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void showMenu() {
        System.out.println("Printing menu category"+menuCategory);
        for (Dish dish:dishes) {
            dish.showDish();
        }
    }
}

public class Runner {
    public static void main(String[] args) {
        MenuCategory starters = new MenuCategory("Starters");
        starters.addDish(new Dish("Spring rolls"));
        starters.addDish(new Dish("Nachos"));

        MenuCategory mainCourse = new MenuCategory("Main Course");
        mainCourse.addDish(new Dish("Paneer butter masala"));
        mainCourse.addDish(new Dish("Dal Tadka"));

        starters.showMenu();
        mainCourse.showMenu();
    }
}
