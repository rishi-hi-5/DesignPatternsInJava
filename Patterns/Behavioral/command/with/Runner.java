package Behavioral.command.with;


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

interface Command {
    void execute();
    void unexecute();
}

class TypeCommand implements Command {
    private TextEditor textEditor;
    private String text;

    public TypeCommand(TextEditor textEditor, String text){
        this.textEditor=textEditor;
        this.text=text;
    }

    @Override
    public void execute() {
        textEditor.type(text);
    }

    @Override
    public void unexecute() {
        textEditor.undo();
    }
}

class CommandInvoker {
    private Deque<Command> commandHistory = new LinkedList<>();

    public void invokeCommand(Command command){
        command.execute();
        commandHistory.add(command);
    }

    public void undoCommand() {
        if(!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pollLast();
            lastCommand.unexecute();
        }else {
            System.out.println("Nothing to undo!");
        }
    }
}


public class Runner {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandInvoker commandInvoker = new CommandInvoker();

        Command typeCommand1 = new TypeCommand(editor,"Hello");
        Command typeCommand2 = new TypeCommand(editor,"World");

        commandInvoker.invokeCommand(typeCommand1);
        commandInvoker.invokeCommand(typeCommand2);

        editor.display();

        commandInvoker.undoCommand();

        editor.display();

        commandInvoker.undoCommand();

        editor.display();

        commandInvoker.undoCommand();
        editor.display();
    }
}