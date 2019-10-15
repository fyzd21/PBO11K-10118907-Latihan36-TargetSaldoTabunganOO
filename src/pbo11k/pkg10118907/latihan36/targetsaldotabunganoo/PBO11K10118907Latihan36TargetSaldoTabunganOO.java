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
public class PBO11K10118907Latihan36TargetSaldoTabunganOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan t = new Tabungan();
        t.setBungaPerBulan(8);
        t.setSaldoAwalTarget(3500000, 6000000);
        t.hitungWaktuTarget();
    }
    
}
