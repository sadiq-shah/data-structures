package Stack;

public class StackDemo {

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop().toString());
        stack.pop();
        System.out.println(stack.peek().toString());
        System.out.println(stack.getSize());
    }

}
