/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulo2_isabelaazevedo;

import java.util.Scanner;


/**
 *
 * @author Isabela
 */
public class Triângulo2_IsabelaAzevedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada;
       float A,B,C,x1,x2,delt = 0;
        
       entrada = new Scanner (System.in);
       
       System.out.print ("Digite o valor do A:");
       A=entrada.nextFloat ();
       
       System.out.print ("Digite o valor do B:");
       B=entrada.nextFloat();
       
       System.out.print ("Digite o valor do C:");
       C=entrada.nextFloat();
       
       if (A!=0) { 
       delt = (float) (Math.pow(B,2)-4*A*C);
       
       
     }
       
     if (delt>0);{ 
     x1 = (float) (((-B)+Math.sqrt(delt))/(2*A));
     x2 = (float) (((-B) -Math.sqrt(delt))/(2*A));
     System.out.print("As raízes são:" +x1 +x2);
     }
     else if (delt==0){
     x1= (float) ((-B)+Math.sqrt(delt))/(2*A);
     System.out.print ("As raízes são:" +x1);
    }
   
     else if (delt<0) {
     System.out.print("A equação não possui resultados reais");
             
             
}    
    
            
}
}