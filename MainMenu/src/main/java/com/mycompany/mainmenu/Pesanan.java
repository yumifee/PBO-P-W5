package com.mycompany.mainmenu;

/**
 * @author Yumi Febriana 211511063
 * POLITEKNIK NEGERI BANDUNG
 */
public class Pesanan{
        private static byte Id = 0;
        private String[] namaMakanan;
	private int[] quantity;
	private double[] totalHarga;
	
	
	public static void nextId(){
		Id++;
	}

	public Pesanan() {
		this.namaMakanan = new String[10];
		this.quantity = new int[10];
		this.totalHarga = new double[10];
	}

	public void tambahItemPenjualan(String namaMakanan, int quantity, double totalHarga) {
		this.namaMakanan[Id] = namaMakanan;
		this.quantity[Id] = quantity;
		this.totalHarga[Id] = totalHarga;
	}

	public void tampilPesanan() {   //menambah pesanan
		double totalPembayaran = 0;
		for(int i = 0; i < Id ; i++) {			
			System.out.println(this.namaMakanan[i] + " \t" +this.quantity[i] + "\t = " + this.totalHarga[i]);
			totalPembayaran+=this.totalHarga[i];
		}
		System.out.println("Total Bayar : " + totalPembayaran);
	}
	
}
