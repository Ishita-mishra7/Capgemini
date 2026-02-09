package Assignment29feb;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class InsertionObject {
    public static void main(String[] args) {

        Student s1 = new Student("Ishita", 100);
        Student s2 = new Student("Ashu", 10);
        Student s3 = new Student("Sarthak", 70);

        Student[] arr = {s1, s2, s3};

        for(int i = 1; i < arr.length; i++) {

            Student key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].marks > key.marks) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(Student s : arr) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
