public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[9001]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem with code deteched: " + e);
        }
        
    }
}
