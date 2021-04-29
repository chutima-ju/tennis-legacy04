/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.summitthai.tennis.legacy04;

import java.util.Scanner;

/**
 *
 * @author Chutima
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ply1 = readInt(sc,1);
        int ply2 = readInt(sc,2);
        
        String score = "";
        score = Compare(ply1,ply2);
        
        System.out.print("Score : "+score);
        
    }
    
    public static int readInt(Scanner sc ,int ply){
        System.out.print("Please enter score player "+ply+" : ");
        int val = sc.nextInt();
        return val;
    }
    
    public static String Compare(int ply1, int ply2){
        String results = "";
        String results1 = "";
        String results2 = "";
        
        if(ply1 == 0 && ply2 == 0){
            results = "love , love";
        }else{
            if(ply1 > 0 && ply1 < 40){
                results1 = Integer.toString(ply1);
            }else{
                results1 = "love";
            }
            
            if(ply2 > 0 && ply2 < 40){
                results2 = Integer.toString(ply2);
            }else{
                results2 = "love";
            }
            
            if(ply1 == 40 && ply2 == 40){
                results1 = "deuce";
            }
            
        }
        
        results = results1+" , "+results2;
        
        
        return results;
    }
    
}
