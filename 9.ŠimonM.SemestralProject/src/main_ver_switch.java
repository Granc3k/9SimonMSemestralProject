import java.util.Scanner;

/**
 * 9. Program sorts inputed points based on distance between inputed points and
 * inputed line
 * 
 * @author marts
 * @version 1.4 5/1/23
 */

public class main_ver_switch {
    static Scanner sc = new Scanner(System.in);

    public static void SemestralProjectSwitch(String[] args) {
        boolean endProgram = false; // boolean for stopping program

        while (endProgram == false) { // while where whole program operates
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String inRozhodnuti = sc.nextLine(); // user input of choice for continue/stop
            switch (inRozhodnuti) { // switch for input
                case "a", "A" -> { // continue
                    // main function
                    double[][] primka = tools.inputPrimky();
                    double[] rce = tools.vypocetRcePrimky(primka);
                    double[][] body = tools.inputSouradnic();
                    double[][] bodySeVzdalenosti = tools.vypocetVzdalenosti(body, rce);
                    double[][] vypis = tools.sortVzdalenosti(bodySeVzdalenosti);
                    tools.vypisSouradnic(vypis);
                }
                case "n", "N" -> { // stop
                    // program stops
                    System.out.println("Ukoncuji program");
                    endProgram = true;
                }
                default -> { // invaild input
                    // invalid input for continue/stop
                    System.out.println("Nezadal jste spravny parametr");
                    System.out.println("Zkuste akci opakovat znovu");
                }
            }
        }
        System.out.println("Program ukoncen");
    }
}