public class Exception1 {
      public static void main(String[] args) {
            int a[] = new int[5];
            try {
                  a[7] = 100;
            } catch (Exception e) {
                  System.out.println("Array index out of bounds.");
            }
      }
}
