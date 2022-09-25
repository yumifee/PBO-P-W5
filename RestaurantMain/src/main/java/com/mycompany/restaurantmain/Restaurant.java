package com.mycompany.restaurantmain;

/**
 * @author Yumi Febriana [211511063]
 * POLITEKNIK NEGERI BANDUNG
 */
public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id = 0;
    
    //Setter
    
    public void setNamaMakanan(String[] nama_makanan){
        this.nama_makanan = nama_makanan;
    }
    
    public void setHargaMakanan(double[] harga_makanan){
        this.harga_makanan = harga_makanan;
    }
    
    public void setStok(int[]stok){
        this.stok = stok;
    }
    
    public static void setID(byte id){
        Restaurant.id = id;
    }
    
    public void setStok(int stok, int id){
        this.stok[id] = stok;
    }
    
    public Restaurant(){
        nama_makanan = new String [10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    //getter
    public String[] getNamaMakanan(){
        return nama_makanan;
    }
    
    public String getNamaMakanan(int id){
        return nama_makanan[id];
    }
    
    public double[] getHargaMakanan(){
        return harga_makanan;
    }
    
    public double getHargaMakanan(int id){
        return harga_makanan[id];
    }
    
    public int[] getStok(){
        return stok;
    }
    
    public int getStok(int id){
        return stok[id];
    }
    
    public static byte getId(){
        return id;
    }
    
    
    //method
    public void tambahMenuMakanan(String nama, double harga,int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    //searching
    public void JumlahStok(String nama_makanan, int banyak){
        for(int i=0; i<=id ; i++){
            if(nama_makanan == getNamaMakanan(i)){
                if(!isOutOfStock(i)){
                    setStok(getStok(i)- banyak, i);
                }
            }
        }
    }
    
    public void tampilMenuMakanan(){
        for (int i = 0 ; i <= id ; i++)
        {
            if(!isOutOfStock(i))
            {
                System.out.println(nama_makanan[i] + "["+stok[i]+"]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}
