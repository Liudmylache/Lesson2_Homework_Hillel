import java.util.*;

public class MyArrayList implements List<Object> {

    boolean isInitialCapacity;
    public int sizeOfElements = 0;
    public Object element;
    private static Object[] defaultArray;


    public MyArrayList(int initialCapacity) {
        this.defaultArray = new Object[initialCapacity];
        isInitialCapacity = true;
    }

    public MyArrayList() {
        this.defaultArray = new Object[0];
        isInitialCapacity = false;
    }


    @Override
    public int size() {
        return defaultArray.length;
    }

    @Override
    public boolean isEmpty() {
        if (sizeOfElements <= 0) {
            return true;
        } return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < defaultArray.length; i++){
            if (defaultArray[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Object myArrayList) {
        Object[] newArray = new Object[defaultArray.length + 1];

        return false;
    }

    void add(int element) {
        Object[] newArray = new Object[defaultArray.length + 1];
        System.arraycopy(defaultArray, 0, newArray, 1, defaultArray.length);
        newArray[0] = element;
        defaultArray = newArray;
        sizeOfElements++;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return defaultArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        Object[] newArray = new Object[defaultArray.length + 1];
        System.arraycopy(defaultArray, 0, newArray, 0, index);
        System.arraycopy(defaultArray, index, newArray, index + 1, defaultArray.length - index);
        newArray[index] = element;
        defaultArray = newArray;
        sizeOfElements++;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Object> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return null;
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
            return Arrays.toString(defaultArray);
        }
    }



