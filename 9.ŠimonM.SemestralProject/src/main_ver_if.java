import java.util.Scanner;

/**
 * 9. Program sorts inputed points based on distance between inputed points and
 * inputed line
 * 
 * @author marts
 * @version 1.0 15/12/22
 */

public class main_ver_if {
    static Scanner sc = new Scanner(System.in);

    public static void SemestralProjectIf(String[] args) {
        boolean endProgram = false;
        while (endProgram == false) { // while where whole program operates
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String inRozhodnuti = sc.nextLine(); // user input of choice for contine/stop
            if (inRozhodnuti.equals("a") || inRozhodnuti.equals("A")) { // if for continue
                // main function
                double[][] primka = tools.inputPrimky();
                double[] rce = tools.vypocetRcePrimky(primka);
                double[][] body = tools.inputSouradnic();
                double[][] bodySeVzdalenosti = tools.vypocetVzdalenosti(body, rce);
                double[][] vypis = tools.sortVzdalenosti(bodySeVzdalenosti);
                tools.vypisSouradnic(vypis);

            } else if (inRozhodnuti.equals("n") || inRozhodnuti.equals("N")) { // if for stop
                // program stops
                System.out.println("Ukoncuji program...");
                endProgram = true;
            } else { // invalid input
                // invalid input for continue/stop
                System.out.println("Nezadal jste spravny parametr");
                System.out.println("Zkuste akci opakovat znovu");
            }
        }
        System.out.println("Program ukoncen");
    }
}