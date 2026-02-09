package Assignment29feb;

class StudentN {
    String name;
    int[] marks;

    StudentN(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int total() {
        int sum = 0;
        for(int x : marks) sum += x;
        return sum;
    }
}

public class SelectionNMarks {
    public static void main(String[] args) {

        StudentN s1 = new StudentN("Ishita", new int[]{10, 20, 30, 40});
        StudentN s2 = new StudentN("Ashu", new int[]{90, 10, 10, 5});
        StudentN s3 = new StudentN("Sarthak", new int[]{40, 40, 40, 40});

        StudentN[] arr = {s1, s2, s3};

        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].total() < arr[minIndex].total()) {
                    minIndex = j;
                }
            }

            StudentN temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(StudentN s : arr) {
            System.out.println(s.name + " Total=" + s.total());
        }
    }
}
