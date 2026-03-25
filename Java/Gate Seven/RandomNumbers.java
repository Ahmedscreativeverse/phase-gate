



public class RandomNumbers {
    public static int generateRandomNumbers(int userGuess) {

        for (int attempt = 0; attempt < 6; attempt++) {

            int number = (int) (Math.random() * 101);

            if (number > userGuess) {
                return 0;
            }
        }

        return 1;
    }
}


