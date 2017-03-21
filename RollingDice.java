/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prery Doll
 */
public class RollingDice {
    
    public static void main(String[] args)
    {
        Die die1, die2;
        int sum;
        die1=new Die();
        die2=new Die();
        die1.roll();
        die2.roll();
        System.out.print("Die one:"+die1+", Die two:"+die2);
        die1.roll();
        die2.setfacevalue(4);
           System.out.print("Die one:"+die1+", Die two:"+die2);
           sum=die1.getfacevalue()+die2.getfacevalue();
           System.out.println("sum:"+sum);
           sum=die1.roll()+die2.roll();
           
              System.out.print("Die one:"+die1+", Die two:"+die2);
                 System.out.print("new sum:"+sum);
    }
}

        
               
       
    
    

