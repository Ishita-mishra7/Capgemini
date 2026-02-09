package Assignment29feb;

class StudentNMarks {
    String name;
    int[] marks;

    StudentNMarks(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int total() {
        int sum = 0;
        for(int x : marks) sum += x;
        return sum;
    }
}

class BubbleNMarks {
    public static void main(String[] args) {

        StudentNMarks s1 = new StudentNMarks("Ishita", new int[]{10, 20, 30, 40});
        StudentNMarks s2 = new StudentNMarks("Ashu", new int[]{90, 10, 10, 5});
        StudentNMarks s3 = new StudentNMarks("Sarthak", new int[]{40, 40, 40, 40});

        StudentNMarks[] arr = {s1, s2, s3};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j].total() > arr[j+1].total()) {
                    StudentNMarks temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(StudentNMarks s : arr) {
            System.out.println(s.name + " Total=" + s.total());
        }
    }
}
