
package com.mycompany.numberdivisible;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class NumberDivisible {

    public static void main(String[] args) {
        
        String Option;
        int number, divisible;
        Scanner InDate=new Scanner(System.in);
        
        
        do{
            System.out.println("enter divisible number");
            divisible=InDate.nextInt();
            System.out.println("Enter number");
            number=InDate.nextInt();
            if(number%divisible==0){
                System.out.println("The number is divisible by : "+divisible);
            }else{
                System.out.println("The number not is divisible by :"+divisible);
            }
            System.out.println("Do you wish to continue? Y / N ");
            Option=InDate.next();
        }while(!"N".equals(Option));
    }
}
