/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan42.tabungan;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program ini untuk menghitung Tabungan
 */
class Tabungan {
    private int saldo;

    public void Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
    int total = saldo-jumlah; 
    return total;    
    }
    
}
