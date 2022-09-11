// Find position of word in String
public class searchInString {
    public static void main(String[] args){
        String name = "Shubham";
        char word ='m';
        //print search method
        System.out.println(searchWord(name,word));
    }
    //Search in the array :return the index if item is found
    //Otherwise if no found return false
    static boolean searchWord(String name,char word){
        //if string length is 0.then, return false.
        if(name.length()==0){
            return false;
        }
        //to run for loop and check element=target at which index
        for(int i=0;i<name.charAt(i);i++){//i=index
            if(word==name.charAt(i)){
                System.out.println(word + " is present at index no :" + i +".");
                return true;
            }
        }
        //if word is not found in sting.then,return false
        return false;
    }
}
