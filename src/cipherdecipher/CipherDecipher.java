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

    static public int getCipherAscii(int in, int key)
    {
        if(in < key)
                return 132 + in - key;
        else
                return 96 + in - key;
    }
    static public int[] generateKey(int[] in,int[] key)
    {
        int buff[] = new int[255];
        int count = 0;
        while(count < in.length)
        {
            for(int i = 0;i<key.length;i++)
            {
                buff[i+count] = key[i];
            }
            count +=key.length;
        }
        return buff;
    }
    static public int[] encipher(int[]in, int[] key)
    {
        int[] output = new int[in.length];
        for(int i = 0; i < in.length; i++)
        {
            output[i] = getCipherAscii(in[i],key[i]);
        }
        return output;
    }
    
    static public char toChar(int in)
    {
        return (char) in;
    }
    
    static public int[] toInt(String in)
    {
        int[] out = new int[255];
        for(int i = 0; i< in.length();i++)
        {
            out[i] = (int) in.charAt(i);
        }
        
        return out;
    }
    
    public static void main(String[] args) {
        
        int[] input = {1,2,3,4};
        int[] key = {1,2};
        System.out.println(generateKey(input,key)[2]);
    }
    
}
