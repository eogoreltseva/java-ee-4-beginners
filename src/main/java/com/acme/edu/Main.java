/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.edu;

/**
 *
 * @author eugene
 */

enum Day {
    Monday(1), T(2), W(3);
    
    private int age;
    Day(int arg) {
        this.age = arg;
    }
    
}

public class Main {
    public static void main(String[] args) { 
       Day day = Day.M;
       Day day2 = Day.T;
       
       Day.values()
       
        System.out.println(day == day2);
        
    }
}