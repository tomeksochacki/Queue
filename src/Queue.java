class Queue {
    int q[];
    int putloc, getloc;

    Queue(int size) {
        q = new int[size];
        putloc = getloc = 0;
    }

    void put(int ch) {
        if (putloc == q.length) {
            System.out.println("-- Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    int get() {
        if (getloc == putloc) {
            System.out.println("-- Queue is empty.");
            return (int) 0;
        }
        return q[getloc++];
    }
}
