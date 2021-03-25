package at.campus02.zam21.pr1;

public class ArrayDemo2D {
    public static void main(String[] args) {

        // declare and initialize in one line
        String [] favoriteFood = {"Chocolate", "Carrots", "Gras"};
        // declare and create array of type string with 5 elements
        // index running from 0 to 4 (length - 1 )
        String [] allergicFood = new String[5];

        // access
        allergicFood[0] = "cabbage";
        allergicFood[1] = "ligusta";


        // how to iterate over an array
        for(int f = 0; f < favoriteFood.length; ++f){
            System.out.println(favoriteFood[f]);
        }

        // 2 dim array
        // for every bunny we have a line with their favorit food
        // this is also possibl String foods[][] = ...

        // with direct init - 2 rows and 3 columns
        String [][]food = {{"Chocolate", "Carrots", "Gras", "Strawberries"},{"Bananas", "Strawberries", "Cranberries"}};
        //alternative: String [][] food = new String[2][3];
        // but we would have to initalize it

        // access with 2 [][]
        food[0][2] = "Pineapple";
        System.out.println("Start 2d array example");
        // how do i iterate over it
        for(int row = 0; row < food.length; ++row){
            for(int col = 0; col < food[row].length ; ++col){
                System.out.println(food[row][col]);
            }
            System.out.println("---");
        }

        // Blackjack game - so the goal is to have the highest number
        // but not higher than 21
        // So write a method blackjackWinner who gets a 2 dim array as a parameter
        // every row stands for one game: [17, 21, 23, 14]
        // you should calculate for every game who is the winner
        // return value: an array which counts how often every player has won:
        // in the first game player 2 would have won -> this means the counter of the
        // returning array should be like that [0, 1, 0, 0]
        // assume: every row has the same length and we do not know how many rows
        // if it is a draw -> nobody gets a point for winning


        System.out.println("Blackjack - Welcome to our casino");

        int [][]games = {{15, 10, 21, 3},{15, 10, 21, 3},{22, 22, 22, 22},{21, 22, 3, 4},{2, 2, 22, 2}};
        int [] w = blackJackWinner(games);
        for(int i = 0; i < w.length; ++i){
            System.out.println(w[i]);
        }

    }
    public static int[] blackJackWinner(int[][] games)
    {
        // array that counts the winners
        int []winners = new int[games[0].length];

        for(int g = 0; g < games.length; ++g){

            // start with a negative value so every correct
            // value under 21 is higher
            int winnerIdx = -1;
            int highestNumber = -1;
            boolean draw = false;
            for(int p = 0; p < games[g].length; ++p){
                // is there a value
                if (games[g][p] <= 21 && games[g][p] >= highestNumber)
                {
                    if (highestNumber == games[g][p]) {
                        draw = true;
                    }
                    else {
                        winnerIdx = p;
                        highestNumber = games[g][p];
                        draw = false;
                    }
                }

            }
            if(winnerIdx != -1 && !draw)
            {
                ++winners[winnerIdx];
            }
        }
        return winners;
    }
}
