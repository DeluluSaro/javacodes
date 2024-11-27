import java.util.Scanner;

class Toggle {
    public static void main(String[] args) {
        int ndoor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of doors: ");
        ndoor = sc.nextInt();
        boolean[] cou = new boolean[ndoor + 1]; // Array for doors, index 0 is unused
        int c = 0, o = 0;

        // Toggle doors
        for (int i = 1; i <= ndoor; i++) { // Start from 1 (door 0 is not considered)
            for (int j = i; j <= ndoor; j += i) { // Increment by i
                cou[j] = !cou[j]; // Toggle the state of the door
            }
        }

        // Count open and closed doors
        for (int i = 1; i <= ndoor; i++) { // Start from 1
            if (cou[i]) {
                o++;
            } else {
                c++;
            }
        }

        System.out.println("Number of doors open: " + o);
        System.out.println("Number of doors closed: " + c);
    }
}
