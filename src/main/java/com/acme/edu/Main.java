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
public class Main {
    static int result;
    
    public static void main(String[] args) {
        System.out.println(result);
    }

    private static void add(int a, int b) {
        result =  a + b;
    }
}
