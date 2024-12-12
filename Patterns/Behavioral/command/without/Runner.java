package Behavioral.command.without;

import java.util.Deque;
import java.util.LinkedList;

class TextEditor {
    private Deque<String> text = new LinkedList<>();

    public void type(String newText){
        text.add(newText);
        System.out.println("Word Added "+newText);
    }

    public void undo(){
        if(!text.isEmpty()) {
            String removedWord = text.pollLast();
            System.out.println("Removed word is "+removedWord );
        }
    }

    public void display(){
        if(text.isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }

        System.out.print("Displaying: ");

        for (String word: text) {
            System.out.print(word);
            System.out.print(" ");
        }
        System.out.println();
    }
}


public class Runner{
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.type("Hello");
        textEditor.type("World");

        textEditor.display();

        textEditor.undo();

        textEditor.display();

        textEditor.undo();

        textEditor.display();
    }
}
