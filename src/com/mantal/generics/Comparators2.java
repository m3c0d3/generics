package com.mantal.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Fruit implements Comparable<Fruit>
{
    protected String name;
    protected int    size;

    protected Fruit( String name,
                     int size )
    {
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode( )
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode( ) );
        result = prime * result + size;
        return result;
    }

    @Override
    public boolean equals( Object obj )
    {
        if( this == obj )
            return true;
        if( obj == null )
            return false;
        if( getClass( ) != obj.getClass( ) )
            return false;
        Fruit other = (Fruit)obj;
        if( name == null )
        {
            if( other.name != null )
                return false;
        }
        else if( !name.equals( other.name ) )
            return false;
        if( size != other.size )
            return false;
        return true;
    }

    @Override
    public String toString( )
    {
        return "Fruit [name=" + name + ", size=" + size + "]";
    }

    public int compareTo( Fruit f )
    {
        return size < f.size ? -1 : size == f.size ? 0 : 1;
    }
}

class Apple extends Fruit
{

    protected Apple( int size )
    {
        super( "Apple", size );
    }
}

class Orange extends Fruit
{

    protected Orange( int size )
    {
        super( "Orange", size );
    }
}

public class Comparators2
{
    public static void main( String[] args )
    {
        Apple a1 = new Apple( 1 );
        Apple a2 = new Apple( 2 );
        List<Apple> l1 = Arrays.asList( a1, a2 );
        boolean equals1 = Collections.max( l1 ).equals( a2 );
        System.out.println( equals1 );
        assert equals1;

        Orange o3 = new Orange( 3 );
        Orange o4 = new Orange( 4 );
        List<Orange> l2 = Arrays.asList( o3, o4 );
        boolean equals2 = Collections.max( l2 ).equals( o4 );
        System.out.println( equals2 );
        assert equals2;

        List<? extends Fruit> mixed = Arrays.asList( a1, o3 );
        boolean equals3 = Collections.max( mixed ).equals( o3 );
        System.out.println( equals3 );
        assert equals3;

        System.out.println( "min=" + Collections.max( mixed, new Comparator<Fruit>( )
        {

            public int compare( Fruit o1,
                                Fruit o2 )
            {
                return o1.size < o2.size ? 1 : o1.size == o2.size ? 0 : -1;
            }
        } ) );
    }
}
