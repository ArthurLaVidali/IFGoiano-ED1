import java.util.Stack;

public class Pilha {
    private Stack<Character> stack;

    public Pilha() {
        this.stack = new Stack<Character>();
    }

    public void push(Character c) {
        this.stack.push(c);
    }

    public Character pop() {
        return this.stack.pop();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}