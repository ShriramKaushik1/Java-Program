class Loops{
        public static void main(String arg[]){

                //For Loop ----break
                // int i;
                // for(i=1;i<=10;i++){
                //         if(i==4){
                //             System.out.println(i);
                //             break;
                //         }
                //         System.out.println(i);
                // }


                // For Loop ----CONTINUE
                int i;
                for(i=1;i<=10;i++){
                        if(i==4){
                            
                            continue;
                        }
                        System.out.println(i);
                }


                // //While Loops------continue

                // int i=0;
                // while(i<=10){
                //         if(i==3){   
                //                         //Error is that here i is not increment that why i==3 run infinite time; 
                //                         //To resolve this problem we have to increment i++ before continue;
                //          continue;   
                            
                //         }
                //         System.out.println(i);
                //         i++;
                

                // }

                //Solution

                // int i=0;
                // while(i<=10){
                //         if(i==3){
                //                 i++;
                //                 continue;
                //         }
                //         System.out.println(i);
                //         i++;
                // }

                //While Loops------break;

                // int i=0;
                // while(i<=10){
                //         if(i==2){
                //             System.out.println("I :"+i);
                //             i=i+2;
                //             break;
                //         }
                //         System.out.println(i);

                // }
        }
}