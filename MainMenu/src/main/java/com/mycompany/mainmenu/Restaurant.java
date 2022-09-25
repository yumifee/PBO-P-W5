package com.mycompany.mainmenu;

/**
 * @author Yumi Febriana 211511063
 * POLITEKNIK NEGERI BANDUNG
 */
public class Restaurant {
    private String namaMakanan; 
	private double harga;
	private int qty;
	private int id;
	private static int nextId;
	

	{
		id = nextId;
		nextId++;
	}

	public String getnamaMakanan() {
		return namaMakanan;
	}
	public void setnamaMakanan(String namaMakanan) {
		this.namaMakanan = namaMakanan;
	}
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getId() {
		return id;
	}

	public Restaurant (String nama, double harga, int qty){
		this.namaMakanan = nama;
		this.harga = harga;
		this.qty = qty;
	}

	public void print() {
		System.out.println(this.id + 1 + ". " + this.namaMakanan + " = Rp. " + this.harga);
	}
}
