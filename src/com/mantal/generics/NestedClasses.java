package com.mantal.generics;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NestedClasses
{

}

class LinkedCollection<E> extends AbstractCollection<E>
{
    private class Node
    {
        private E    element;
        private Node next = null;

        public Node( E e )
        {
            element = e;
        }
    }

    private Node first = new Node( null );
    private Node last  = first;
    private int  size  = 0;

    public LinkedCollection( )
    {
    }

    public LinkedCollection( Collection<? extends E> c )
    {
        addAll( c );
    }

    @Override
    public int size( )
    {
        return size;
    }

    public boolean add( E elt )
    {
        last.next = new Node( elt );
        last = last.next;
        size++;
        return true;
    }

    @Override
    public Iterator<E> iterator( )
    {

        return new Iterator<E>( )
        {
            private Node current = first;

            public boolean hasNext( )
            {
                return current.next != null;
            }

            public E next( )
            {
                if( current.next != null )
                {
                    current = current.next;
                    return current.element;
                }
                else
                {
                    throw new NoSuchElementException( );
                }
            }

            public void remove( )
            {
                throw new UnsupportedOperationException( );

            }
        };
    }
}
