package Assignment29feb.Assignment310feb.Assignment411feb;
interface Comparator <T>{
    int compare(T a, T b);
}

class UniComparator<T> implements Comparator<T>{
    public int compare(T a,T b){
        if(a==null && b==null)return 0;
        if(a==null)return -1;
        if(b==null)return 1;

        if(a instanceof Integer && b instanceof Integer){
            return(Integer)a - (Integer)b;
        }
        if(a instanceof String && b instanceof String){

        }

        throw new RuntimeException("Unsupported type");
    }
}
// class IntegerCompare implements Comparator<Integer>{
//     public int compare(Integer a,Integer b){
//         return a-b;
//     }
// }
// class StringCompare implements Comparator<String>{
//     public int compare(String a, String b){
//         int len=Math.min(a.length(),b.length());

//         for(int i=0;i<len; i++){
//             if(a.charAt(i)!=b.charAt(i)){
//                 return a.charAt(i)-b.charAt(i);
//             }
//         }
//         return a.length()-b.length();
//     }
// }



// public class Main {
//     public static void main(String[] args) {
//         Comparator<Integer>intCmp=new IntegerCompare();
//         System.out.println(intCmp.compare(10,20));

//         Comparator<String> strCmp=new StringCompare();
//         System.out.println(strCmp.compare("ABC","BCD"));
//     }
    
// }
