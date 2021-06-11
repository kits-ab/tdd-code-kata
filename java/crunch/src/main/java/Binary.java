public class Binary {

    public static int find(int item, int ... arr) {
        int down = 0, up = arr.length;
        int index = -1;

        while (down < up) {
            index--;
            if (arr.length + index < 0) break;
            int candidate = (down + up) / 2;

            System.out.println(down + "," + up + "," + candidate);

            if (arr[candidate] < item) { down = candidate; }
            else if (arr[candidate] > item) { up = candidate; }
            else {
                index = candidate;
                break;
            }
        }
        return index;
    }

    public static int find2(int item, int ... arr) {
        return findRec(item, arr, 0, arr.length, 0);
    }
    private static int findRec(int item, int[] arr, int down, int up, int index) {
        index--;
        if (arr.length + index < 0) return index;
        int candidate = (down + up) / 2;

        System.out.println(down + "," + up + "," + candidate);

        if (arr[candidate] < item) { down = candidate; }
        else if (arr[candidate] > item) { up = candidate; }
        else {
            index = candidate;
            return index;
        }
        return findRec(item, arr, down, up, index);
    }
    public static int find3(int item, int ... arr) {
        return findRec3(item, arr, 0, 0);
    }

    private static int findRec3(int item, int[] arr, int index, int pos) {
        index--;
        if (arr.length + index < 0) return pos + index;
        int candidate = (arr.length) / 2;

        System.out.println(arr.length +  "," + candidate);

//        if (arr[arr.length -1] > item) { return findRec3(item, lower(arr), index, pos); }
//        else if (arr[candidate] > item) { up = candidate; }
//        else {
//            index = candidate;
//            return index;
//        }
        return 412; // findRec(item, arr, down, up, index);
    }
}
