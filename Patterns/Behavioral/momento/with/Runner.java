package Behavioral.momento.with;

class TextEditor {
    String text="";

    void type(String word) {
        text+=word;
    }

    void restore(Momento momento){
        text = momento.getState();
    }

    Momento save (){
        return new Momento(text);
    }

    void clear() {
        text="";
    }

    void print() {
        System.out.println("Text contains following"+text);
    }

    static class Momento {
        private final String state;

        public Momento(String text) {
            state = text;
        }

        public String getState() {
            return state;
        }
    }
}
public class Runner {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.type("Hello");
        textEditor.type(" World!");

        TextEditor.Momento saveState = textEditor.save();
        textEditor.print();

        textEditor.clear();
        textEditor.print();

        textEditor.restore(saveState);

        textEditor.print();
    }
}
