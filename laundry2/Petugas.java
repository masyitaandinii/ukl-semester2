/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry2;

import java.util.ArrayList;

public class Petugas implements User{ // implementasi interface
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Petugas(){ // method constructor
        this.namaPetugas.add("Admin A");
        this.alamat.add("Kesatrian");
        this.telepon.add("0896754231");
        this.jabatan.add(1);
        
        this.namaPetugas.add("Admin B");
        this.alamat.add("Polehan");
        this.telepon.add("0812345678");
        this.jabatan.add(2);
    }

    @Override // overriding nama method sama tapi beda class
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override //polimorphisme
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    @Override
    public void setJabatan(Integer jabatan) {
        this.jabatan.add(jabatan);
    }

    @Override
    public Integer getJabatan(int id) {
        return this.jabatan.get(id);
    }
    
    public void tampilPetugas(){ //untuk menampilkan dan akan dipanggil di main
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getJabatan(i));
        }
    }   
}