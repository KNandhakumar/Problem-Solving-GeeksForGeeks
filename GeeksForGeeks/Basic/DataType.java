package GeeksForGeeks.Basic;

public class DataType {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type
        System.out.println(dataTypeSize("int"));
    }

    static int dataTypeSize(String str) {
        switch (str.toLowerCase()) {
            case "char":
            case "character":
                return Character.BYTES;
            case "int":
            case "integer":
                return Integer.BYTES;
            case "long":
                return Long.BYTES;
            case "float":
                return Float.BYTES;
            case "double":
                return Double.BYTES;
            default:
                return -1;  // Return -1 for invalid input
        }

    }
}
