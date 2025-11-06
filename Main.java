//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            if (count % 2 == 0) {
                System.out.println("X is Even");
            } else {
                System.out.println("X is Odd");
            }
            System.out.println(count);
            count++;
        }

    }
}