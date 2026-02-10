 package Assignment29feb.Assignment310feb;
 import java.util.*;
 class Student{
    
    int marks;

    Student(int marks){
        
        this.marks=marks;
    }


 }
 public class Task2 {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<Student>();
        Student s1=new Student(100);
        Student s2=new Student(90);
        Student s3=new Student(10);
        Student s4=new Student(20);
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(2,new Student(40));

        int minMarks=s.get(0).marks;
        int minIndex=0;

        for(int i=1;i<s.size();i++){
            if(s.get(i).marks<minMarks){
                minMarks=s.get(i).marks;
                minIndex=i;
            }

            s.remove(minIndex);
        }
        

        for(Student st:s){
            System.out.println(st.marks);

        }
        




    }

}
