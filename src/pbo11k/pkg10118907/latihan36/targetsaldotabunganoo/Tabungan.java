/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan36.targetsaldotabunganoo;

/**
 *
 * @author programmer
 */
public class Tabungan {
    private int saldoawal, bunga, saldotarget, saldotmp, saldoakhir, i;
    
    public void setSaldoAwalTarget(int saldoawal, int saldotarget) {
        this.saldoawal = saldoawal;
        this.saldotarget = saldotarget;
    }
    
    public void setBungaPerBulan(int bunga) {
        this.bunga = bunga;
    }
    
    public void hitungWaktuTarget() {
        saldoakhir = saldoawal;
        i = 1;
        do {
            saldotmp = saldoakhir * bunga/100;
            saldoakhir += saldotmp;
            System.out.println("Saldo dibulan ke-"+i+" Rp"+String.format("%,d", saldoakhir).replace(",", "."));
            i++;
        } while(saldoakhir < saldotarget);
    }
}
