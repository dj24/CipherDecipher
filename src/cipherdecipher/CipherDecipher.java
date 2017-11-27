/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipherdecipher;

/**
 *
 * @author User
 */
public class CipherDecipher {

    static public char getCipherChar(char in, char key)
    {
        if(in < key)
                return (char) ('z' + in + key);
        else
                return (char) (in - key);
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
