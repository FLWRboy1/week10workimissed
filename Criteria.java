public class Criteria {
    public static void main(String[]args){

        String [] names = {"Frankfurt0", "Frankfurt1", "Frankfurt2", "Frankfurt3", "Frankfurt4"};

        int num = 0;

        for(String name : names){

            if(name.length() == 4){

                num++;

            }
        }

        System.out.println(num);
    }
    
}