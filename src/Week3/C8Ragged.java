package Week3;

/**
 *
 * @author 55vanzilwa27
 */


public class C8Ragged {

    public static void main(String[] args) {
        int[][] triangleArray = {
            {1, 2, 3, 4, 5},
            {20, 3, 4, 5},
            {3, 4, 5},
            {4, 5},
            {5, 0}
        };
        System.out.println("0,0 = " + triangleArray[0][0]);
        System.out.println("0,1 = " + triangleArray[0][1]);
        System.out.println("1,0 = " + triangleArray[1][0]);//Row 1(index 1 actual row is 2nd row), column 0;
        //test reassigning 
        triangleArray[4][1] = 41;
        System.out.println("4,1 = " + triangleArray[4][1]);
        //Unknown amount of data (must know how many rows are needed)
        int[][] ta = new int [5][];
        ta[0]= new int[5];
        ta[1]= new int[4]; //continue this pattern to recreate triangleArray
        
        //How to print out array (nested for loop)
        for(int row=0; row < triangleArray.length; row++){
            for(int column=0; column < triangleArray[row].length; column++){ //note [row].length
                System.out.print(triangleArray[row][column]+" ");
            }
            System.out.println("");
        }
    }
}