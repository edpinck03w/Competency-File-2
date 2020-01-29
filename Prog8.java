public class Prog8{

    public static void main(String args[]){

        int [] numbers = {3,5,7,3,2,9};

        for(int i=0;i<numbers.length;i++){
            System.out.print("number: " + numbers[i] + "  \n");                  
            }

        int sum = 0;
        for(int i:numbers){
        sum=sum+i;
        }
        
        System.out.println("The sum is " + (sum));
        
        int i=0;
        //do{
         //   System.out.print("number: " + numbers[i] + "  \n");
           // i++;
           //}

        while(i<2){
        System.out.println("number: " + numbers[i]);
        i++;}
        System.out.print("Hi Everyone");
    }
}