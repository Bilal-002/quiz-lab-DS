/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurelabquiz;

/**
 *
 * @author mahmoud
 */
public interface queueinterface {
    
    boolean isEmpty();

    void makeEmpty();

   
    void enqueue(Object value);

    void getMinValue();
   
    void dequeue();

    void print();
}
