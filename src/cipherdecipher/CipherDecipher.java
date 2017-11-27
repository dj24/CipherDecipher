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
    static public String encipher(String in, String key)
    {
        char[] output = new char[in.length()];
        for(int i = 0; i < in.length(); i++)
        {
            output[i] = getCipherChar(in.charAt(i),key.charAt(i));
        }
        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(encipher("mess","lock"));
    }
    
}
