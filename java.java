public class Replace {
     public static void main(String[] args) {

        
        int[] a = {10,7,47,23,11,20};

        for(int i = 0; i<a.length;i++){
            if(a[i]%2 == 0) {
                a[i] = 1;
            
            }
            else{
                a[i] = 0;
            }
        }
    for(int i = 0;i < a.length;i++){
        System.out.println(a[i]);

    }


}
    

}