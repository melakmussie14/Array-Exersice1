/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexersice;

/**
 *
 * @author yossief-m
 */
import java.util.Scanner;
public class ArrayExersice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n=0;
        Scanner sc = new Scanner(System.in);
           System.out.println("How many numbers do you want to enter?");
                int num = sc.nextInt();//declare array
                int list[];
        list = new int[num];
                System.out.println("Enter the " + num + " numbers now.");
                for (int i = 0 ; i < list.length; i++ ) 
                    {
                        list[i] = sc.nextInt();
                    }
                for(int i=0;i<num;i++)
                {
                System.out.println(list[i]);
                }
                     for(int i=num-1;i>=0;i--)
                {
                System.out.println(list[i]);
                }
       
                
                    
                      while (n!=1) {
                          
                          System.out.println("Do you want to see an element in the array?If not enter -1");
                          n=sc.nextInt();
                         int x=n-1;
                         
                        System.out.println(list[x]);}
                      
                                          }
                    
                      
                                    
                     }
                     
    


