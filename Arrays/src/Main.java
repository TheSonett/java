import java.util.Random;
import java.util.Scanner;

class Student {
    public String name;
    public int rollno;
    public int marks;

    Student() {}

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return ("Name: " + name + " || Roll: " + rollno + " || Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        //OneDimentionalArray();
        //MultiDimentionalArray();
        //JaggedArray();
        ArrayOfObjects();
    }

    public static void ArrayOfObjects() {
        Student s1 = new Student("Joy", 5, 98);
        Student s2 = new Student("Sonett", 6, 78);
        Student s3 = new Student("Achal", 8, 67);

        Student[] students = new Student[3]; // It will only create an array of student type of size 3, will not create any student object
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void JaggedArray() {
        int[][] nums = new int[3][]; // number of columns we don't know

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        
        for(int i = 0; i < nums.length; i++) { // number of rows
            for(int j = 0; j < nums[i].length; j++) { // for each row, the number of col
                nums[i][j] = (int) new Random().nextInt(5) + 1;
            }
        }

        for(int i[] : nums) { // number of rows
            for(int j : i) { // for each row, the number of col
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void MultiDimentionalArray() {
        // row -> We have 3 arrays
        // col -> Each array has 4 elements

        // [0][0] [0][1] [0][2] [0][3]
        // [1][0] [1][1] [1][2] [1][3]
        // [2][0] [2][1] [2][2] [2][3]
        int row = 3;
        int col = 4;
        int[][] nums = new int[row][col]; // int[row][col]

        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < col; j++) {
                nums[i][j] = (int) new Random().nextInt(5) + 1;
            }
        }

        for(int i = 0; i < row; i++) { 
            for(int j = 0; j < col; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

    
    public static void OneDimentionalArray() {
        try (//int[] nums = {1, 2, 3, 4};
        Scanner input = new Scanner(System.in)) {
            int SIZE = 5;
            int[] nums = new int[SIZE];
            System.out.println("Enter total " + SIZE + " elements ==> ");
            for(int i = 0; i < SIZE; i++) {
                nums[i] = input.nextInt();
            }

            System.out.println("The array elements are ==> ");
            for(int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
        
    }
}
