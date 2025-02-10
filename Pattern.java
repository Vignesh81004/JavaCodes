public class Pattern {
    public static void main(String[] args) {
        int n_046 = 5; 

        
        for (int i = 1; i <= n_046; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for (int i = n_046 - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

