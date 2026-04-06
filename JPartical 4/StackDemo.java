// Interface Stack
interface Stack {
    int size = 5;  // fixed size
    void push(int data);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Class implementing Stack
class IntegerStack implements Stack {
    int arr[] = new int[size];
    int top = -1;

    public void push(int data) {
        if (overflow()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    public void pop() {
        if (underflow()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Test Class
public class StackDemo {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();
    }
}