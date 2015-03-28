package com.mantal.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards
{
    public static void main( String[] args )
    {
        List<?> listA = new ArrayList<A>( );
        List<? extends A> listB = new ArrayList<A>( );
        List<? super A> listC = new ArrayList<A>( );
        System.out.println( "test" );
    }

    public void processElements( List<? extends A> elements )
    {
        for( A a : elements )
        {
            System.out.println( a );
        }
    }

    public static void insertElements( List<? super A> elements )
    {
        elements.add( new A( ) );
        elements.add( new B( ) );
        elements.add( new C( ) );
    }
}

class A
{
}

class B extends A
{
}

class C extends A
{
}