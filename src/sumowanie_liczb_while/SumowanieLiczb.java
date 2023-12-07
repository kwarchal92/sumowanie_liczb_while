package sumowanie_liczb_while;

import java.io.*;

public class SumowanieLiczb {

    public static void main(String[] arg)
            throws IOException
    {
        int a, b, suma = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {

            System.out.println("Podaj liczbe poczatkowa: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Podaj liczbe koncowa: ");
            b = Integer.parseInt(br.readLine());

            while (a <= b)
            {
                a++;
                suma += a;
            }

            System.out.print("Suma liczb z przedzialu " + a + " - " + b + " wynosi:\t" + suma);

        }
        catch(NumberFormatException exception)
        {
            System.out.println("Podano zle wartosci, wprowadz liczby.");
        }
    }
}
