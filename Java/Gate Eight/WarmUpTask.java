public class WarmUpTask {

    public static int[] getTheDuplicate(int[] values) {

        
        int[] temporaryResultArray = new int[values.length];

        int numberOfUniqueValuesFound = 0;

       
        for (int currentIndex = 0; currentIndex < values.length; currentIndex++) {

            int currentNumber = values[currentIndex];
            int occurrenceCount = 0;

            
            for (int comparisonIndex = 0; comparisonIndex < values.length; comparisonIndex++) {

             
