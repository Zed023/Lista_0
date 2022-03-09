import java.util.Scanner;
public class zadanie3
{
    //funckja znajdujaca najwiekszy dzielnik
    public static int div(int n)
    {
        for(int i = n/2; i >= 2; i--)
        {
            if(n % i == 0)
            {
                return i;
            }
        }
        return 1;
    }

    //tworzenie tablicy dzielnikow
    static int[] gdc(int[] numbers)
    {
        int x = numbers.length;
        int[] divisors = new int[x];
        for(int i = 0; i < x; i++)
        {
            int k = div(numbers[i]);
            divisors[i] = k;
        }
        return divisors;
    }

    //tworzenie tablicy wartosci i przypisanie im dzielnikow a nastepnie ladne sprintowanie
    public static void run()
    {
        int x;
        System.out.println("Ile liczb naturalnych podasz? : ");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        int[] numbers = new int[x];
        int i = 0;
        while(i < x)
        {
            String n;
            int k;
            System.out.println("Podaj liczbe naturalna n : ");
            Scanner z = new Scanner(System.in);
            n = z.nextLine();
            try
            {
                k=Integer.parseInt(n);
                numbers[i] = k;
                i++;
            }
            catch (NumberFormatException ex)
            {
                System.out.println(n + " nie jest liczba calkowita");
            }

        }
        int [] divisors = gdc(numbers);
        for(int w = 0; w < x; w++)
        {
            System.out.print("Dla liczby naturalnej n = "+numbers[w]+", ");
            System.out.println("najwiekszy dzielnik to: "+divisors[w]+", ");
        }
    }
    public static void main(String[] args)
    {
        run();
    }
}
//Adam Zeid INA sem 2 Lista 0 zadabie 3 09.03.21
