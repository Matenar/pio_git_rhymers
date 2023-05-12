package edu.kis.vh.nursery.list;

/**
 * Ta klasa posiada trzy atrybuty: wartość liczbową VALUE oraz dwie instancje samej siebie - prev i next.
 * Dodatkowo, zawiera metody umożliwiające pobieranie i ustawianie wartości prev i next,
 * a także metody zwracające wartość VALUE oraz aktualne instancje prev i next.
 * Konstruktor tej klasy tworzy nowy obiekt, ustawiając wartość VALUE oraz
 * inicjując prev i next na wartości domyślne (null).
 */
public class Node {

    private int value;
    private Node prev, next;

    /**
     * Konstruktor Node który przyjmuje 1 argument (i)
     * @param i jest argumentem typu int oraz jest przepisywany do zmiennej value
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Metoda ustawia wartość value dla tego obiektu
     * @param value jest intem
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return zwraca wartość next danego obiektu
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @return zwraca wartość value danego obiektu
     */
    public int getValue() {
        return value;
    }

    /**
     * Metoda ustawia nexta obiektu.
     * @param next jest ustawiony na obiekt pobrany jako argument
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     *
     * 
     * @return zwraca obiekt prev
     */
    public Node getPrev(Node last) {
        return prev;
    }
    
}
