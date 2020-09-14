/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg1.abella;

/**
 *
 * @author asus
 */
public class Praktek {
    /*MEMBUAT ATRIBUT*/
    int panjang, lebar, isi, harga ;
    int luasBangunan = 1000000;
    float jmlhKeramik, totalKotakKeramik , hargaAkhir ;
            
    /*MEMBUAT METHODS*/
    void Menghitung() {
        float jmlhKeramik;
        jmlhKeramik = luasBangunan / (panjang * lebar);
        System.out.println("Jadi jumlah keramik yang dibutuhkan, berjumlah " + (int) jmlhKeramik + " pcs");
    
        float totalKotakKeramik;
        totalKotakKeramik = jmlhKeramik / isi;
        System.out.println("Jadi total kotak keramik yang dibutuhkan ada " + (int) totalKotakKeramik + " pcs");
        
        float hargaAkhir;
        hargaAkhir = totalKotakKeramik * harga;
        System.out.println("Jadi harga akhir keramik yang diperlukan berjumlah " + (int) hargaAkhir + " rupiah");
    }
}
