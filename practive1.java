public class practive1 {

    public static void main(String[]args){

        //average

        int [] nums = {-2, 0, 5, 7, 9};

        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            sum = sum + nums[i];
            
        }

        double av = (double)sum / nums.length;
        
        System.out.println(av);

        //finding max

        int [] bums = {1,2,3,4,5};
        int max = bums[1];

        for(int i = 0;bums.length>i;i++)
            if(bums[i]>max)
                max = bums[i];
    
    }
    
}