public class Lab12 {

    public static String[] doubleArray (String[][] testArray){
        String[] result = new String[testArray.length];

    for(int row = 0; row < testArray.length; row++){
        String max = testArray[row][0];

        for(int col = 0; col < testArray[row].length; col++){

            if(testArray[row][col].length() > max.length()){
                max = testArray[row][col];



            }
        }
       result[row] = max;
    }
    return result;
    }





    public static void main (String[] args){
        String[][] sentenceArray = {{"hi", "how", "are", "you"},
                                    {"Java", "is", "so", "fun"},
                                    {"exam", "is", "next", "week"}
        };

        String[] result = doubleArray(sentenceArray);

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }
    }
}
