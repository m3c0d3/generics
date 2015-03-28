package com.mantal.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparators
{
    public static void main( String[] args )
    {
        System.out.println( "one".compareTo( "zero" ) < 0 );
        Character a = 'a';
        Character b = 'b';
        System.out.println( a.compareTo( b ) < 0 );
        Integer one = 1;
        Integer two = 2;
        System.out.println( one.compareTo( two ) < 0 );
        // assert a.compareTo(one); // compile error
        List<Integer> aa = Arrays.asList( 1, 2, 3, 4 );


        //
        System.out.println( Collections.max( aa ) );
    }
}
