package Assignment29feb;

class Student3Marks {
    String name;
    int m1, m2, m3;

    Student3Marks(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }
}

class Bubble3Marks {
    public static void main(String[] args) {

        Student3Marks s1 = new Student3Marks("Ishita", 10, 20, 30);
        Student3Marks s2 = new Student3Marks("Ashu", 90, 10, 10);
        Student3Marks s3 = new Student3Marks("Sarthak", 40, 40, 40);

        Student3Marks[] arr = {s1, s2, s3};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j].total() > arr[j+1].total()) {
                    Student3Marks temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(Student3Marks s : arr) {
            System.out.println(s.name + " Total=" + s.total());
        }
    }
}
