package implementation;

import stack.StackInterface;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackImplementation<E> implements StackInterface<E>  {
    ArrayList<E> stackArray = new ArrayList<E>();

    public StackImplementation() {
        this.stackArray = new ArrayList<E>();
    }

    @Override
    public E push(E item) {
        stackArray.add((E) item);
        return item;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            int itemIndex = stackArray.size()-1;
            E item = stackArray.remove(itemIndex);
            return item;
        }
    }

    @Override
    public E peek() {
        E item = stackArray.get(stackArray.size()-1);
        return item;
    }

    @Override
    public boolean isEmpty() {
        return stackArray.isEmpty();
    }
}
