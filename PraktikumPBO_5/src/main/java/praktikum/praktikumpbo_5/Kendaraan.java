/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_5;

/**
 *
 * @author Raymond
 */
public class Kendaraan {
    public String namaKendaraan;
    
    public void info(){
        System.out.println("Kendaraan :"+ this.namaKendaraan);
    }
}

class kendaraanDarat extends Kendaraan{
    public int rodaKendaraan;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Roda kendaraan :"+ this.rodaKendaraan);
    }
}

class mobil extends kendaraanDarat{
    public String merekMobil;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Merek mobil :"+ this.merekMobil);
    }
}

class motor extends kendaraanDarat{
    public String merekMotor;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Merek motor :"+ this.merekMotor);
    }
}
