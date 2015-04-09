package com.mantal.generics;

import java.util.List;

public class Overloaded2
{
    public static boolean allZero( List<Integer> ints )
    {
        for( int i : ints )
            if( i != 0 )
                return false;
        return true;
    }

    // Compile error - Erasure of method allZero(List<String>) is the same as another method in type Overloaded2
    // public static boolean allZero( List<String> strings )
    // {
    // for( String s : strings )
    // {
    // if( !s.equals( "0" ) )
    // {
    // return false;
    // }
    // }
    // return true;
    // }
}
