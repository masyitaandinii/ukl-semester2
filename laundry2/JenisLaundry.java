/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry2;

/**
 *
 * @author MASTER 10
 */
import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>(); // enkapsulasi
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public int size(){
        return this.jenisLaundry.size();
    }
    
    public JenisLaundry(){ // Constructor method yang memiliki nama sama dengan class nya
        this.jenisLaundry.add("Cuci Kering @kg"); // untuk menginisiasi variabel dan akan dipanggil saat proses inisiasi menjadi objek
        this.harga.add(3000); // this digunakan untuk memanggil variabel yang ada diluar method
        this.durasi.add(2);
        
        this.jenisLaundry.add("Cuci Kering Lipat @kg");
        this.harga.add(4000);
        this.durasi.add(3);
        
        this.jenisLaundry.add("Cuci Kering Setrika @kg (include pewangi dan pelembut)");
        this.harga.add(6000);
        this.durasi.add(4);
        
        this.jenisLaundry.add("Karpet / Sprei @item");
        this.harga.add(10000);
        this.durasi.add(6);
    }
    
    public void setLaundry(String jenis){ // setter getter / enkapsulasi
        this.jenisLaundry.add(jenis);
    }
    public void setHarga(int harga){ // untuk mengisi nilai / value
        this.harga.add(harga);
    }
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public String getLaundry(int id){ //untuk mengambil nilai / value
        return this.jenisLaundry.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public int getDurasi(int id){
        return this.durasi.get(id);
    }
}

