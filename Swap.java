class Swap {
    public static void main(String[] args)
    {
        int a = 4;
        int b = 5;
        System.out.println("Before Swapping :");
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}