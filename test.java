public class test{

    public static void main(String[]args){

        int [] bums = {1,2,3,4,5};

        int max = bums[0];

        for(int i = 0;bums.length>i;i++){

            if(bums[i]>max){

                max = bums[i];

            }

        }

        System.out.println(max);

    }

}
