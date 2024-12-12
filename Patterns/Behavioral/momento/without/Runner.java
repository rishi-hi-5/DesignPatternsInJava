package Behavioral.momento.without;


class TextEditor {
    String text="";

    void type(String word) {
        text+=word;
    }

    void clear() {
        text="";
    }

    void print() {
        System.out.println("Text contains following"+text);
    }
}
public class Runner {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.type("Hello");
        textEditor.type(" World!");

        textEditor.print();

        textEditor.clear();
        textEditor.print();
    }
}
