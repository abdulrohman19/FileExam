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
public class remove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        LinkedList<String> nilaii = new LinkedList<>();
    nilaii.add("Matematika");
    nilaii.add("Biologi");
    nilaii.add("Bahasa Inggris");
    nilaii.add("Fisika");
    
     nilaii.removeFirst();
     nilaii.removeLast();
     nilaii.remove(1);
     
        System.out.println(nilaii);
    }
    
}
