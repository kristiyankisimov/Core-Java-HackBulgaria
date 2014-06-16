package com.hackbulgaria.corejava;

public class LinkedListImpl implements LinkedList {
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int element) {
            data = element;
            next = null;
            prev = null;
        }
    }

    private Node start;
    private Node end;
    private int size;

    public LinkedListImpl() {
        start = null;
        end = null;
        size = 0;
    }

    @Override
    public void addAt(int index, int element) {
        if (index < 0 || index > size) {
            throw new IncorrectIndexException();
        } else {
            Node node = new Node(element);
            if (isEmpty()) {
                start = node;
                end = node;
            } else if (index == 0) {
                node.next = start;
                start.prev = node;
                start = node;
            } else if (index == size) {
                node.prev = end;
                end.next = node;
                end = node;
            } else {
                Node help = start;
                for (int i = 0; i < index - 1; i++) {
                    help = help.next;
                }
                node.next = help.next;
                node.prev = help;
                help.next.prev = node;
                help.next = node;
            }
            size++;
        }
    }

    @Override
    public int removeAt(int index) {
        if (index < 0 && index >= size) {
            throw new IncorrectIndexException();
        }
        if (isEmpty()) {
            throw new EmptyLinkedListException();
        }
        int result;
        if (size == 1) {
            result = start.data;
            start = null;
            end = null;
        } else if (index == 0) {
            result = start.data;
            start.next.prev = null;
            start = start.next;
        } else if (index == size - 1) {
            result = end.data;
            end.prev.next = null;
            end = end.prev;
        } else {
            Node help = start;
            for (int i = 0; i < index - 1; i++) {
                help = help.next;
            }
            result = help.next.data;
            help.next.next.prev = help;
            help.next = help.next.next;
        }
        size--;
        return result;
    }

    @Override
    public int removeHead() {
        return removeAt(0);
    }

    @Override
    public int removeTail() {
        return removeAt(size - 1);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getAt(int index) {
        if (index < 0 || index >= size) {
            throw new IncorrectIndexException();
        } else if (isEmpty()) {
            throw new EmptyLinkedListException();
        } else {
            Node help = start;
            for (int i = 0; i < index; i++) {
                help = help.next;
            }
            return help.data;
        }
    }

    @Override
    public int getHead() {
        return getAt(0);
    }

    @Override
    public int getTail() {
        return getAt(size - 1);
    }

    @Override
    public void addToHead(int element) {
        addAt(0, element);
    }

    @Override
    public void addToTail(int element) {
        addAt(size, element);
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node node = start;
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                builder.append(node.data + "]");
            } else {
                builder.append(node.data + ", ");
            }
            node = node.next;
        }
        if (size == 0) {
            builder.append("]");
        }
        return builder.toString();
    }
}
