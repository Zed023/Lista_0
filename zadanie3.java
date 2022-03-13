public class zadanie3
{
    //funckja znajdujaca najwiekszy dzielnik
    public static int div(int k)
    {
        for(int x = k/2; x >= 2; x--)
        {
            if(k % x == 0)
            {
                return x;
            }
        }
        return 1;
    }

    //tworzenie tablicy wartosci i przypisanie im dzielnikow a nastepnie ladne sprintowanie
    public static void main(String[] args)
    {
        int n;
        for(int i = 0; i < args.length; i++)
        {
            try
            {
                n = Integer.parseInt(args[i]);
                System.out.print("Dla liczby naturalnej n = "+n+", ");
                System.out.println("najwiekszy dzielnik to: "+div(n));
            }
            catch (NumberFormatException ex)
            {
                System.out.println(args[i] + " nie jest liczba calkowita");
            }
        }
    }
}
//Adam Zeid INA sem 2 Lista 0 zadanie 3 09.03.21
