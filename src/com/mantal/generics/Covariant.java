package com.mantal.generics;

import java.lang.reflect.Method;

public class Covariant
{
    public static void main( String[] args )
    {
        for( Method m : Point.class.getMethods( ) )
        {
            if( m.getName( ).equals( "clone" ) )
            {
                System.out.println( m.toGenericString( ) );
            }
        }
    }
}

class Point
{
    public int x;
    public int y;

    public Point( int x,
                  int y )
    {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Point clone( )
    {
        return new Point( x, y );
    }
}