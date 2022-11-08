/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author veerc
 */
public class mathfunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        double x=28;
        double y=4;
        //maximum
        System.out.println("maximum of x and y is " +Math.max(x,y));
        
        //square root
        System.out.println("Square root of y is " +Math.sqrt(y));
        System.out.println("Square root of x is " +Math.sqrt(x));
        
        //Power
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        
        //Logarithm
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
        
        //Logarithm when base is 20
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));
        
        //log x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));
        
        //return power of 2
        System.out.println("exp of a is: " +Math.exp(x));
        
        //return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(x));
       
        
        
        
        
        
        
        
        
    }
    
}
