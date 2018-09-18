/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author DANYAV
 */
public class Bus {
            public int Penumpang;
            public int maxPenumpang;
            //konsktuktor
            public Bus(int maxPenumpang) {
                this.maxPenumpang = maxPenumpang;
                Penumpang = 0;
            }
            public void addPenumpang(int penumpang){
                int temp;
                temp = this.Penumpang+penumpang;
                if (temp >= maxPenumpang){
                    System.out.println("Penumpang melebihi kuota");
                }else{
                    this.Penumpang = temp;
                }
            }
            public void cetak() {
                System.out.println("Penumpang Bus sekarang adalah"+ Penumpang);
                System.out.println("Penumpang maksimum seharusnya adalah"+maxPenumpang);
            }

  
        }
   

    

