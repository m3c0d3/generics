package com.mantal.generics;

import java.lang.reflect.Method;

public class Bridges
{
    public static void main( String[] args )
    {
        for( Method m : com.mantal.generics.Integer1.class.getMethods( ) )
        {
            if( m.getName( ).equals( "compareTo" ) )
            {
                System.out.println( m.toGenericString( ) );
            }
        }
    }
}

interface Comparable1<T>
{
    public int compareTo( T o );
}

class Integer1 implements Comparable1<Integer1>
{
    private final int value;

    public Integer1( int value )
    {
        this.value = value;
    }

    public int compareTo( Integer1 i )
    {
        return ( value < i.value ) ? -1 : ( value == i.value ) ? 0 : 1;
    }
}