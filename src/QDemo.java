class QDemo {
    public static void main(String[] args) {
        Queue biqQ = new Queue(100);
        Queue smallQ = new Queue(4);
        int ch;
        int i;

        System.out.println("To use queue bigQ to store numbers.");
        for (i = 0; i < 100; i++) {
            biqQ.put((int) (i));
        }

        System.out.println("Content bigQ: ");
        for (i = 0; i < 100; i++) {
            ch = biqQ.get();
            if (ch != (int) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("To use queue smallQ to generate error");
        for (i = 0; i < 5; i++) {
            System.out.println("Try store to queue char" + (int) (i));

            smallQ.put((int) (i));
            System.out.println();
        }
        System.out.println();

        System.out.println("Content queue smallQ:");
        for (i=0; i<5; i++){
            ch = smallQ.get();
            if (ch != (int) 0) System.out.println(ch);
        }

    }
}
