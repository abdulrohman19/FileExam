/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujian_tengah_semester;

/**
 *
 * @author User
 */
import java.util.LinkedList;
public class add {

    public static void main(String[] args) {
    
        LinkedList<String> nilai = new LinkedList<>();
    
    nilai.add("Matematika");
    nilai.add("Biologi");
    nilai.add("Bahasa Inggris");
    nilai.add("Fisika");
    nilai.add("Kimia");
    nilai.add("Bahasa Indonesia");
    nilai.add("Sejarah");
        
    System.out.println("Nama Pelajaran  : "+nilai);
        
    System.out.println("Jumlah Pelajaran: "+nilai.size());
    
    
    
        System.out.println("Nama Pelajaran: "+nilai);
        
    nilai.add("Matematika");
    nilai.add("Biologi");
    nilai.add("Bahasa Inggris");
    nilai.add("Fisika");
    nilai.add("Kimia");
    
        System.out.println("Data Teratas  : "+nilai.getFirst());
        System.out.println("Data Terbawah : "+nilai.getLast());
        System.out.println("Data NoIndex 1: "+nilai.get(1));
        System.out.println("Data NoIndex 3: "+nilai.get(3));
     
      
    }
    
}
