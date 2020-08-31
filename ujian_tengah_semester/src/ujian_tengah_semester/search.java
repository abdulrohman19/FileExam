/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_tengah_semester;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LinkedList<String> barang = new LinkedList<>();
    barang.add("Buku");
    barang.add("Tas");
    barang.add("Laptop");
    
if(barang.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            System.out.println("Data Penuh");
        }
if(barang.contains("Komputer")){
            System.out.println("Barang Ditemukan");
        }else{
            System.out.println("Barang Tidak Ditemukan");
    }
    
}
