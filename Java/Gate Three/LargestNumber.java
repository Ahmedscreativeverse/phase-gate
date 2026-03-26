
                       
                       
public class LargestNumber {

    public static int[] getLargestNumberAtIndex(double[][] numbers) {

      

        int row = 0;
        int column = 0;

       
        for (int count = 0; count < numbers.length; count ++) {

            
            for (int index = 0; index < numbers[count].length; index++) {

                
                if (numbers[count][index] > largest) {
                    largest = numbers[count][index];
                    row = count;
                    column = index;
                }
            }
        }

       
        return {row, column};
    }
}






