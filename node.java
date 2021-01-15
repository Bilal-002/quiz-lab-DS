/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructurelabquiz;

/**
 *
 * @author mahmoud
 */
public class node {
     private Object value;
    private node next;
         public node() {
    }

    public node(Object value) {
        this.value = value;
    }

    public node(Object value, node next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';
    }
}

