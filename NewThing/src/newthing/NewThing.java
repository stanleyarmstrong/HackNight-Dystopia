/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newthing;


import java.util.Scanner ; 


/**
 *
 * @author Stanley
 */
public class NewThing {
    public NewThing(){
        String person = "Jason Bourne";
        System.out.println("Hello I am the savior " + person + ". I was Bourne out of a meme.");
    }
    void walks(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("How many steps are you taking?");
        String steps = getInput.next() ;
        double step = Double.parseDouble(steps) ;
        
        System.out.println("What direction are you heading(North,West,South,East)?");
        String direction = getInput.next();
        direction = direction.toLowerCase();
        if(direction == "east" || direction == "south"){
            step = -step ;
        }
        
        
        
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The world has flipped upside down. \n The world needed a hero. \n Someone they could trust that man was... \n Jason Bourne ");
        NewThing jason = new NewThing();
        Sword sword = new Sword() ;
        System.out.println("I have started looking for a weapon. I hope I can find one.");
        System.out.println("Looks like it will be just fists. For now. heh heh heh");
        jason.walks();
        

    }
    
    
}
