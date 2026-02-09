package Assignment29feb;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class SelectionObject {
    public static void main(String[] args) {

        Student s1 = new Student("Ishita", 100);
        Student s2 = new Student("Ashu", 10);
        Student s3 = new Student("Sarthak", 70);

        Student[] arr = { s1, s2, s3 };

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].marks < arr[minIndex].marks) {
                    minIndex = j;
                }
            }

            // swap
            Student temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print
        for (Student s : arr) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
