
/*
* File: App.java
* Author: Mihelik Tamás
* Copyright: 2021, Mihelik Tamás
* Date: 2024-10-07
* Web: -
* Licenc: MIT
*
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ez az alkalmazás egy rombusz területét számolja ki (két tizedesre kerekítve) két átlójából, amiket a felhasználó ad meg.\nMihelik Tamás, ii-1-n\n");

        System.out.print("Írd be az első átló hosszát: ");
        String in = sc.nextLine();
        a = Double.parseDouble(in);

        System.out.print("Írd be az első átló hosszát: ");
        in = sc.nextLine();
        sc.close();
        b = Double.parseDouble(in);

        Double area = 0.5*a*b;
        System.out.printf("A rombusz területe: %.2f",area);
    }
}
