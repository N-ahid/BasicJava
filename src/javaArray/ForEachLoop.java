package javaArray;

public class ForEachLoop {

    public void print(int x[][]) {
        int i=0;
        for (int[] ax : x) {
            for (int anAx : ax) {
                System.out.print(i + "\t");
                i++;
            }
            System.out.println();
        }
    }
}
