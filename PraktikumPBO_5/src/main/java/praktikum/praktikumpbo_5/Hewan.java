/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikumpbo_5;

/**
 *
 * @author Raymond
 */
public class Hewan {
    public String nama;
    public String jenis;
    
    public void info(){
        System.out.println("Hewan "+this.nama+" berjenis "+this.jenis);
    }
}

class Kucing extends Hewan {
    public String namaKucing;
    
    @Override
    public void info(){
        super.info(); 
        System.out.println("Kucing "+this.namaKucing);
    }
}

class Anjing extends Hewan {
    public String namaAnjing;
    
    @Override
    public void info(){
        super.info(); 
        System.out.println("Anjing "+this.namaAnjing);
    }
}