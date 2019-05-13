import java.util.Scanner;
public class valueOfStr {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String name;
        boolean chose = false;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien: ");
        name = input.nextLine();

        for(i = 0; i < students.length; i ++) {
            if(students[i].equals(name)) {
                chose = true;
                break;
            }
        }

        if (chose) {
            System.out.println("Sinh vien " + name+ " o vi tri thu " + (i +1));

        } else {
            System.out.println("Khong thay sinh vien " + name);
        }
    }
}
