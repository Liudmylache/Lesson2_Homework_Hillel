import java.util.*;

public class MyArrayList implements List<Object> {

    boolean isInitialCapacity;
    public int sizeOfElements = 0;
    private static Object[] defaultArray;


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
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object value : defaultArray) {
            if (value == o) {
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
        return Arrays.copyOf(defaultArray,sizeOfElements);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < defaultArray.length)
            return (T[]) Arrays.copyOf(defaultArray, defaultArray.length, a.getClass());
        System.arraycopy(defaultArray, 0, a, 0, defaultArray.length);
        if (a.length > defaultArray.length)
            a[defaultArray.length] = null;
        return a;
    }

    @Override
    public boolean add(Object myArrayList) {
        Object[] newArray = new Object[defaultArray.length + 1];
        System.arraycopy(defaultArray, 0, newArray, 1, defaultArray.length);
        newArray[0] = myArrayList;
        defaultArray = newArray;
        return true;
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
        for (int i = 0; i <= defaultArray.length-1; i++) {
            if (defaultArray[i].equals(o)) {
                Object[] newArray = new Object[defaultArray.length - 1];

                System.arraycopy(defaultArray, 0, newArray, 0, i);
                System.arraycopy(defaultArray, i + 1, newArray, i, defaultArray.length - (i + 1));

                defaultArray = newArray;
                sizeOfElements--;
                return true;
            }
        } return false;
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
        defaultArray = new Object[0];
        sizeOfElements = 0;
    }

    @Override
    public Object get(int index) {
        return defaultArray[index];
    }

    @Override
    public Object set(int index, Object element) {
        defaultArray[index] = element;
        return defaultArray[index];
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
        if (defaultArray.length > index){
            Object temp = defaultArray[index];
            Object[] newArray = new Object[defaultArray.length - 1];
            System.arraycopy(defaultArray, 0, newArray, 0, index);
            System.arraycopy(defaultArray, index+1, newArray, index, defaultArray.length - (index+1));
            defaultArray = newArray;
            sizeOfElements--;
            return temp;
        }
        if (index == 0){
            Object temp = defaultArray[0];
            Object[] newArray = new Object[defaultArray.length - 1];
            System.arraycopy(defaultArray, 0, newArray, 1, defaultArray.length-1);
            defaultArray = newArray;
            sizeOfElements--;
            return temp;
        }
        return null;
    }


    @Override
    public int indexOf(Object o) {
        for (int i = 0; i <defaultArray.length; i++){
            if (defaultArray[i] == o) {
                return i;
            }
        } return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int temp = -1;
        for (int i = 0; i <defaultArray.length; i++){
            if (defaultArray[i] == o) {
                temp = i;
            }
        } return temp;
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
        Object[] subList = new Object[toIndex];
        System.arraycopy(defaultArray, fromIndex, subList,0, toIndex);
        return Arrays.asList(subList);
    }

    @Override
    public String toString() {
            return Arrays.toString(defaultArray);
        }
    }



