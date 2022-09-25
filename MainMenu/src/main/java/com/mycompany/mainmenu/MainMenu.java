package com.mycompany.mainmenu;

import java.util.Scanner;

/**
 * @author Yumi Febriana 211511063
 * POLITEKNIK NEGERI BANDUNG
 */
public class MainMenu {
    
        private static Restaurant[] generateMakanan() {
		Restaurant[] listMakanan = new Restaurant[10];
		String[] namaMakanan = 
                                {
				"Kerang", 
                                "Udang", 
                                "Cumi", 
                                "Kerapu", 
                                "Lobster",
				"Gurita", 
                                "Kakap", 
                                "Bawal", 
                                "Kangkung", 
                                "Capcay" };
		double[] harga = {
				25_000, 
                                22_000,
                                20_000,
                                32_000,
                                42_000,
				43_000,
                                34_000,
                                28_000,
                                15_000,
                                15_000 };
		int[] qty = {
				20, 35, 0, 10, 25,
				10, 30, 10, 10, 30
				};
		for(int i = 0; i<10; i++) {
			listMakanan[i] = new Restaurant(namaMakanan[i], harga[i], qty[1]);
		}
		return listMakanan;
	}

	public static void main(String[] args) {
		Restaurant[] listMakanan = generateMakanan();
		Pesanan list_penjualan = new Pesanan();

		
		System.out.println("Daftar Menu Makanan");
		System.out.println("==============================");
		for(int i = 0; i<10; i++) {
			listMakanan[i].print();
		}
		
                //Transaksi pembelian
		Scanner in = new Scanner(System.in);
		char confirm = 'n';
		byte hitungPembelian = 1;
		do {
                    System.out.print("Silahkan pilih nomor makanan : ");
                    int id = in.nextInt();
                    System.out.print("Jumlah makanan yang dibeli : ");
                    int qtyBeli = in.nextInt();
                    String namaMakanan = listMakanan[id-1].getnamaMakanan();
                    double harga = listMakanan[id-1].getHarga();
                    list_penjualan.tambahItemPenjualan(namaMakanan, qtyBeli, qtyBeli * harga);
                    list_penjualan.nextId();
                    System.out.println("ingin menambah pesanan? (Y/N)");
                    confirm = in.next().charAt(0);
                    hitungPembelian++;
		}while((confirm=='y'||confirm=='Y') && hitungPembelian <= 10);
		
		list_penjualan.tampilPesanan();
	}

}
