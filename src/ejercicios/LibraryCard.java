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
public class LibraryCard {
private Student owner;
private int borrowCnt;
private int NumberofBooks;
    public LibraryCard() {
     
    }
    public void Checkout(int numero){
    this.borrowCnt=numero;
        
    }

    public int getNumberofBooks() {
        return NumberofBooks;
    }

    public String getOwner() {
        return owner.getName();
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "LibraryCard{" + "owner=" + owner + ", borrowCnt=" + borrowCnt + ", NumberofBooks=" + NumberofBooks + '}';
    }
    

    
    
}
