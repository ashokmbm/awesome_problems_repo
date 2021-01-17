package com.practise.datastructure.map;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomHashMap {
    private class Entry {
        Integer key;
        String value;

        public Entry(Integer key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public java.lang.String toString() {
            return "[" + this.key + ", " + this.value + " ]";
        }

        @Override
        public boolean equals(Object obj) {
            Entry input = (Entry) obj;
            return this.key.equals(input.key);
        }
    }

    private LinkedList<Entry>[] buckets;
    private int capacity;
    private static int INITIAL_CAPACITY = 16;
    private int size;
    private float loadFactor = 0.75f;

    public CustomHashMap() {
        this(INITIAL_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = (LinkedList<Entry>[]) new LinkedList[capacity];
        this.size = 0;
    }

    private int hashValue(Entry entry) {
        int hashCode = entry.key.hashCode();
        return hashCode % this.capacity;
    }

    public void put(Integer key, String value) {
        if (this.size / this.buckets.length > this.loadFactor) {
            rehashing();
        }
        Entry entry = new Entry(key, value);
        int bucketIndex = this.hashValue(entry);
        LinkedList<Entry> bucket = buckets[bucketIndex];

        if (bucket == null) {
            bucket = new LinkedList<>();
            bucket.add(entry);
            buckets[bucketIndex] = bucket;
        } else {
            for (Entry existingEntry : bucket) {
                if (existingEntry.key.equals(key)) {
                    existingEntry.value = value;
                    return;
                }
            }
            bucket.addLast(entry);
        }
        this.size++;
    }

    public void display() {
        int i = 0;
        for (LinkedList bucket : buckets) {
            if (bucket != null) {
                System.out.print("B" + i + " ");
                Iterator it = bucket.iterator();
                while (it.hasNext()) {
                    System.out.print("-->" + it.next() + " ");

                }
                System.out.println();
            }
            i++;
        }
    }

    public String get(Integer k) {
        String rv = null;
        Entry entry = new Entry(k, null);
        int bucketIndex = this.hashValue(entry);
        LinkedList<Entry> bucket = buckets[bucketIndex];
        if (bucket == null) {
            return null;
        } else {
            for (Entry existing : bucket) {
                if (existing.equals(entry)) {
                    return existing.value;
                }
            }
        }

        return rv;
    }

    private void rehashing() {
        this.capacity = this.capacity * 2;
        LinkedList<Entry>[] oldBuckets = buckets;
        LinkedList<Entry>[] newBuckets = new LinkedList[this.capacity];
        buckets = newBuckets;
        for (LinkedList<Entry> oldBucket : oldBuckets) {
            if (oldBucket != null) {
                for (Entry entry : oldBucket) {
                    put(entry.key, entry.value);
                }
            }
        }
    }
}