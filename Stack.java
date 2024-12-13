import java . util .*;
class Stack {
    int stackArray[];
    int top;
    int maxSize;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates an empty stack
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // public boolean isFull() {
    //     return (top == maxSize - 1);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack stack = new Stack(n); 

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // stack.push(60);
        
        for(int i  = 0 ; i < n ; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popping elements from the stack:");
        while (stack.isEmpty() == false ) {
            System.out.println(stack.pop());
        }

        sc.close();

        //stack.pop(); 
    }
}
