package GeeksForGeeks.Array;

public class MinAndMaxArray {
    // https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        Pair<Long, Long> ans = getMinMax(arr);
        System.out.println("Min Value =" + " " + ans.getKey() + " " + "Max Value = " + " " + ans.getValue());
    }

    public static Pair<Long, Long> getMinMax(int[] arr) {
        long min = arr[0];
        long max = arr[0];

        for (int i = 0; i <arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return new Pair<>(min, max);
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
