// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


package main.DarraghBoylan;

import DarraghBoylan.Voiture;
public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Toyota", 25000);
        Voiture voiture2 = new Voiture("Renault", 18000);

        System.out.println("Voiture 1 :");
        System.out.println("Marque : " + voiture1.getMarque());
        System.out.println("Prix : " + voiture1.getPrix() + " €");

        System.out.println("\nVoiture 2 :");
        System.out.println("Marque : " + voiture2.getMarque());
        System.out.println("Prix : " + voiture2.getPrix() + " €");

        // Modification du prix de la voiture1
        voiture1.setPrix(27000.00f);
        System.out.println("\nAprès modification du prix de la voiture1 :");
        System.out.println("Nouveau prix : " + voiture1.getPrix() + " €");
    }
}