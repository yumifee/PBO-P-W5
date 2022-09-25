package com.mycompany.restaurantmain;

/**
 * @author Yumi Febriana [211511063]
 * POLITEKNIK NEGERI BANDUNG
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan ("Bala - bala",1_000,20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000,20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000,0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000,20);
        menu.tampilMenuMakanan();
        
        System.out.println("\nStok Setelah Dipesan: ");
        menu.JumlahStok("Gehu", 10);
        menu.tampilMenuMakanan();
    }
}
