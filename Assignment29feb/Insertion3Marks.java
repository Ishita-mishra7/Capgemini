package Assignment29feb;

class Student3 {
    String name;
    int m1, m2, m3;

    Student3(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }
}

public class Insertion3Marks {
    public static void main(String[] args) {

        Student3 s1 = new Student3("Ishita", 10, 20, 30);
        Student3 s2 = new Student3("Ashu", 90, 10, 10);
        Student3 s3 = new Student3("Sarthak", 40, 40, 40);

        Student3[] arr = {s1, s2, s3};

        for(int i = 1; i < arr.length; i++) {

            Student3 key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j].total() > key.total()) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(Student3 s : arr) {
            System.out.println(s.name + " Total=" + s.total());
        }
    }
}
