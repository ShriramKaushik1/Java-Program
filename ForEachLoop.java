public class ForEachLoop {
        public static void main(String[] args) {
            
                int arr[]={1,2,3,4,5,6};

                // //For loop
                // for(int i=0;i<6;i++){

                //         System.out.println(arr[i]);

                // }

                //Simplified version of For --- for each

                for(int i : arr){
                        System.out.print("\t"+i);
                }
        }
    
}
