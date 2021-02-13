public class HomeWork1
{
    public static void main(String[] args)
    {
        ex2();
        System.out.println("a * (b+(c/d)) = "+ex3(1,2,3,4));
        System.out.println(ex4(15,6));
        ex5(-5);
        System.out.println(ex6(-6));
        ex7("Denis");
        ex8(2000);



    }
    static void ex2()
    {
        System.out.println("Задание 2:");
        byte b= 5;
        short s= 567;
        int i= 55;
        long l= 4534;
        float f = 123.4f;
        double d = 1.4;
        char c = 'v';
        boolean bo= false;
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bo);

    }
    static float ex3(float a,float b,float c,float d)
    {
        System.out.println("\nЗадание 3: ");
        return a * (b+(c/d));
    }
    static boolean ex4(int a, int b)
    {
        System.out.println("\nЗадание 4:");
        int sum= a + b;
        if (sum <=20 && sum >= 10 )
            return true;
        else
            return false;
    }
    static void ex5(int a)
    {
        System.out.println("\nЗадание 5:");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    static boolean ex6(int a)
    {
        System.out.println("\nЗадание 6:");
        if(a < 0) return true;
        return false;
    }
    static void ex7(String name)
    {
        System.out.println("\nЗадание 7:");
        System.out.println("Привет, " + name+ "!");
    }
    static void ex8(int y)
    {
        System.out.println("\nЗадание 8:");
        if((y % 4 == 0) ||(y%100==0) && (y %400 == 0)) System.out.println(y + " год не високосный");
        else System.out.println(y + "год  високосный");

    }



}
