package Assignment29feb.Assignment310feb;
class ArrayList22<T>{
    private T data[];
    private int size;
    ArrayList22(){
        data=(T[]) new Object[4];
        size=0;
    }
    public void add(T val){
        if(size==data.length){
            resize();

        }
        data[size++]=val;
    }
    private void resize(){
        T[] newData=(T[])new Object[size*2];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        data=newData;

    }
    public int size(){
        return size;
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
         }
    }
    public T get(int i){
        if(i<0 && i>=size){
            throw new IndexOutOfBoundsException();
        }
        return data[i];
    }
    
    public void remove(int curr){
        for(int i=curr;i<size-1;i++){
            data[i]=data[i+1];

        }
        size--;
    }

    public void find(T val){
        for(int i=0;i<size;i++){
            if(data[i]==val){
                System.out.println("yes it is present");
                return;
            }

        }
        System.out.println("no,it is not present in the entire loop");
    }

    // public void sort(){
    //     int n=size;
    //     for(int i=0;i<size-1;i++){
    //         for(int j=0;j<size-i-1;j++){
    //             if(data[j]>data[j+1]){
    //                 int temp=data[j];
    //                 data[j]=data[j+1];
    //                 data[j+1]=temp;
    //             }
    //         }

            
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.println(data[i]+" ");
    //     }

    // }
 

}
public class ArrayImplementation {
    public static void main(String[] args) {
        ArrayList22 a1=new ArrayList22();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        a1.add("e");

         System.out.println(a1.size());
         a1.print();
         System.out.println();
         System.out.println(a1.get(3));
         a1.remove(1);
         a1.print();
         System.out.println();
         a1.find("b");
         


    
    }
   
    
}
