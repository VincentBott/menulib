package com.company.menu;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends MenuItem {


    List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String titel) {
        super(titel);
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    @Override
    public void uitvoeren() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        for (int i = 0; i < menuItems.size(); i++) {

            System.out.printf("%d. %s%n", i + 1, menuItems.get(i).getTitel());

        }

        System.out.println("0. Stoppen");

        System.out.print("\nUw keuze: ");

        int keuze = Integer.parseInt(scanner.nextLine());

        while (keuze != 0) {

            if (keuze >= 1 && keuze <= menuItems.size()) {

                System.out.println();
                menuItems.get(keuze - 1).uitvoeren();
                System.out.println();

            } else {
                System.out.println();
                System.out.println("Foute keuze. Opnieuw.");
                System.out.println();
            }

            for (int i = 0; i < menuItems.size(); i++) {

                System.out.printf("%d. %s%n", i + 1, menuItems.get(i).getTitel());

            }

            System.out.println("0. Stoppen");

            System.out.print("\nUw keuze: ");

            keuze = Integer.parseInt(scanner.nextLine());

        }

    }
}
