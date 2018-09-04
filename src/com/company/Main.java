package com.company;


import com.company.menu.Menu;
import com.company.menu.MenuItem;


public class Main {

    public static void main(String[] args) {


        Menu menu = new Menu("Hoofdmenu");


        menu.addMenuItem(new MenuItem("Item 1", () -> System.out.println("Dag allemaal")));
        menu.addMenuItem(new MenuItem("Item 2", () -> System.out.println("Tot ziens allemaal")));

        Menu submenu = new Menu("Submenu");

        submenu.addMenuItem(new MenuItem("Doe iets",
        () -> System.out.println("Ik doe iets")));

        submenu.addMenuItem(new MenuItem("Doe niets",
        () -> System.out.println("Ik doe niets")));

        menu.addMenuItem(submenu);

        menu.uitvoeren();
    }
}
