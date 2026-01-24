public class Duplicate {

    public static boolean containsDuplicate(String [] arr){

        int counter = 0;

        while(counter < arr.length){

            for(int i = counter + 1; i < arr.length; i++){

                if(arr[counter].equals(arr[i])){

                    return true;

                }

            }

            counter++;

        }

        return false;

    }
    public static void main(String[]args){

        String [] happy = {"Hi", "Hello", "Greetings", "Ciao", "Hola"};
    
        System.out.println(containsDuplicate(happy));

        String [] sad = {"Hi", "Hi", "Ciao", "Ciao", "Hola"};
    
        System.out.println(containsDuplicate(sad));

    }
    
}