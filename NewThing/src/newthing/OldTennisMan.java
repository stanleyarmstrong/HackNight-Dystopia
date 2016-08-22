package newthing;

import java.util.*;

public class OldTennisMan{
    public OldTennisMan(){
        Scanner firstQuestion = new Scanner(System.in);
        HashMap location = new HashMap();
        location.put(10,50);
        
        System.out.println("Hello, you have met me, the Old Tennis Man.I know who you are already, Jason Bourne.What would you like to talk about? \n -Buying something\n -Selling Something \n -About the World  ");
        String answer = firstQuestion.next();
        switch(answer){
            case "Buying Something":
                System.out.println("What would you like to buy my friend?");
                answer= firstQuestion.next();
                switch(answer){
                    case "Khaki Pants":
                        KhakiPants khakis = new KhakiPants();
                        System.out.println();
                }
                        
                
                
        } 
        
    }
}