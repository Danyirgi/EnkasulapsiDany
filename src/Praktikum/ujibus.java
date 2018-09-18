/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author DANYAV
 */
public class ujibus {
   public static void main(String[]args){
         //membuat objek busBesar dari class Bus
        
         bus busBesar = new bus(40);
        
         busBesar.getPenumpang(15);
         busBesar.getPenumpang(5);
         busBesar.getPenumpang(26);         
   }
}
