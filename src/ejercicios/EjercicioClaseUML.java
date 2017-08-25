/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Estudiante
 */
public class EjercicioClaseUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibraryCard card1=new LibraryCard();
        LibraryCard card2=new LibraryCard();
        Student student=new Student();
        student.setName("Jon Java");
        student.setEmail("jj@java.univ.edu");
            
        card1.setOwner(student);
        card1.Checkout(3);
         card2.setOwner(student);
        card2.Checkout(0);
        
    }
    
}
