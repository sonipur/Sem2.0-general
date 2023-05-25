/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentinfo;

import java.util.Scanner;

/**
 *
 * @author Megha Patel,2023
 */
public class StudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] sList=new Student[5];//array of object is declared
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<sList.length;i++){
            sList[i]=new Student();
             System.out.println("Enter Student name: ");
             sList[i].setName(sc.nextLine());
        
        }
        for(int i=0;i<sList.length;i++){
             System.out.println(sList[i].getName());
             
        
        }
    }  

}
