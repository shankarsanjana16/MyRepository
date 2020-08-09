import java.util.Scanner;
class ArrayStack
{
    int stack[], stackPointer;
    ArrayStack( int maxSize )
    {
        stack = new int[maxSize];
        stackPointer = -1;
    }

    void push()
    {
        if(stackPointer<stack.length-1)
        {
            Scanner sc = new Scanner(System.in);
            int item = sc.nextInt();
            stackPointer++;
            stack[stackPointer] = item;
        }
        else
        {
            System.out.println("Stack Overflow!");
        }
    }

    void pop()
    {
        int item = 0;
        if(stackPointer>=0)
        {
            item = stack[stackPointer];
            stackPointer--;
            System.out.println("Popped Element = "+item);
        }
        else
        {
            System.out.println("Stack Underflow!");
        }
    }

    void displayData()
    {
        System.out.println("Stack Contents : ");
        if(stackPointer == -1)
        {
            System.out.println("EMPTY!");
        }
        else
        {
            for( int i = 0;i<=stackPointer;i++)
            {
                System.out.print(stack[i]+"\t");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length = ");
        int l = sc.nextInt();
        ArrayStack Stack = new ArrayStack(l);
        System.out.println("Array Implementation Of Stack : ");
        System.out.println("Type 'a' for push() operation.");
        System.out.println("Type 'b' for pop() operation.");
        System.out.println("Type 'c' to display the contents of the Stack.");
        System.out.println("Type 'd' to exit.");
        char choice;
        do
        {
            System.out.print("Choice : ");
            choice = (sc.next()).charAt(0);
            switch(choice)
            {
                case 'a':Stack.push();break;
                case 'b':Stack.pop();break;
                case 'c':Stack.displayData();break;
                case 'd':System.out.println("THANK YOU!!");return;
                default:System.out.println("INVALID CHOICE!");continue;
            }
        }
        while(true);
    }
}