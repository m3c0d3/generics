package com.mantal.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fruits
{
    public static void main( String[] args )
    {
        List<Fruit1> fs = Arrays.asList( new Fruit1( 1 ), new Orange1( 3 ), new Apple1( 20 ) );
        System.out.println( Collections.max( fs ) );
    }
}

class Fruit1 implements Comparable<Fruit1>
{
    int size;

    public Fruit1( )
    {
    }

    public Fruit1( int size )
    {
        this.size = size;
    }

    public int compareTo( Fruit1 o )
    {
        return size < o.size ? -1 : size == o.size ? 0 : 1;
    }

    @Override
    public String toString( )
    {
        return "Fruit [size=" + size + "]";
    }
}

class Apple1 extends Fruit1
{

    public Apple1( int i )
    {
        this.size = i;
    }

}

class Orange1 extends Fruit1
{

    public Orange1( int i )
    {
        this.size = i;
    }

}
