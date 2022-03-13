public class zadanie3
{
    //funckja znajdujaca najwiekszy dzielnik własciwy
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

    //funkcja main zczytuje wartości tablicy args sprawdza czy podany został int i jeśli tak przypisuje mu największy dzielnik własciwy chyba, ze to liczba ujemna lub 0 albo 1
    public static void main(String[] args)
    {
        int n;
        for(int i = 0; i < args.length; i++)
        {
            try
            {
                n = Integer.parseInt(args[i]);
                if (n > 1)
                {
                    System.out.print("Dla liczby naturalnej n = " + n + ", ");
                    System.out.println("największy dzielnik własciwy to: " + div(n));
                }
                else if(n >= 0)
                {
                    System.out.println("Liczba naturalna n = " + args[i] + " nie ma dzielnika własciwego");
                }
                else
                {
                    System.out.println("Liczba " + args[i] + " nie jest liczba naturalna");
                }
            }
            catch (NumberFormatException ex)
            {
                System.out.println(args[i] + " nie jest liczba naturalna");
            }
        }
    }
}
//Adam Zeid INA sem 2 Lista 0 zadanie 3 09.03.21
