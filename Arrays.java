public class Arrays {
    public static void main(String[] args) {
        int[][][] cube = {
            {
                {1, 2}, {3, 4}
            },
            {
                {5, 6}, {7, 8}
            }
        };

        System.out.println("Access element [1][0][1]: " + cube[1][0][1]); // Output: 6
    }
}
