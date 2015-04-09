package com.mantal.generics;

import java.util.List;

public class ReifiableTypes<E>
{
    public static void main( String[] args )
    {

    }

    private void test( )
    {
        Object o = new Object( );
        /*
         * if( o instanceof List<E> )// compile error
         * {
         * List<E> e = (List<E>)o;
         * }
         */

        if( o instanceof List<?> )
        {
            List<?> e = (List<?>)o;
        }
    }
}
