/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragons;

import java.util.*;

/**
 *
 * @author Sean
 */
public class Rolls
{
    Random roll = new Random();
    
    public int d4()
    {
    int d4 = roll.nextInt(4) + 1;
    return d4;
    }
    
    public int d6()
    {
    int d6 = roll.nextInt(6) + 1;
     return d6;
    
    }
    
    public int d8()
    {
        Random Single = new Random();
        int d8 = Single.nextInt(8) + 1;
        return d8;
    }
    
    public int d10()
    {
        Random Single = new Random();
        int d10 = Single.nextInt(10) + 1;
        return d10;
    }
    
    public int d12()
    {
        Random Single = new Random();
        int d12 = Single.nextInt(12) + 1;
        return d12;
    }
    
    public int d20()
    {
        Random Single = new Random();
        int d20 = Single.nextInt(20) + 1;
       return d20;
    }
    
//    public int cHit()
//    {
//        Random Hit = new Random();
//        int d100 = Hit.nextInt(100) + 1;
//        return d100;
//        
//    }
//    
//    public int cFail()
//    {
//        Random Fail = new Random();
//        int d100 = Fail.nextInt(100) + 1;
//        return d100;
//        
//    }
    public int d100()
    {
        Random Single = new Random();
        int d100 = Single.nextInt(100) + 1;
        return d100;
    }
    
    
    
            
}
