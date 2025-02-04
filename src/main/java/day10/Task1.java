package day10;

public class Task1 {
    public static void main(String[] args) {
        BinarySearch bst = new BinarySearch(20);

        int [] values = {20,14,11,5,8,16,15,18,23,22,27,24,150};

        for(int value : values) {
            bst.insert(value);
        }

        System.out.print("Отсортированный вывод: ");
        bst.inOrderTraversal();

    }

}
