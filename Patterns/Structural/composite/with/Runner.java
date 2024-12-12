package Structural.composite.with;


import java.util.ArrayList;
import java.util.List;

interface MenuComponent{
    void show();
}

class Dish implements MenuComponent{
    private String name;
    public Dish(String name) {
        this.name= name;
    }

    public void show(){
        System.out.println("The dish is "+name);
    }
}

class MenuCategory implements MenuComponent{
    private String menuCategory;
    private List<MenuComponent> components = new ArrayList<>();

    public MenuCategory(String menuCategory) {
        this.menuCategory= menuCategory;
    }

    public void add(MenuComponent component){
        components.add(component);
    }

    public void show() {
        System.out.println("Printing menu category"+menuCategory);
        for (MenuComponent component: components) {
            component.show();
        }
    }
}

public class Runner {
    public static void main(String[] args) {

        MenuCategory menu = new MenuCategory("Main Menu");

        MenuCategory starters = new MenuCategory("Starters");
        starters.add(new Dish("Spring rolls"));
        starters.add(new Dish("Nachos"));

        MenuCategory mainCourse = new MenuCategory("Main Course");
        mainCourse.add(new Dish("Paneer butter masala"));
        mainCourse.add(new Dish("Dal Tadka"));

        menu.add(starters);
        menu.add(mainCourse);

        menu.show();
    }
}
