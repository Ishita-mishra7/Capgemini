package Assignment29feb;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class BubbleObject {
    public static void main(String[] args) {

        Student s1 = new Student("Ishita", 100);
        Student s2 = new Student("Ashu", 10);
        Student s3 = new Student("Sarthak", 70);

        Student[] arr = {s1, s2, s3};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j].marks > arr[j+1].marks) {
                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(Student s : arr) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
