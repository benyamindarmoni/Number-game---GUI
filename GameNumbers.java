import javax.swing.JOptionPane;

/**
 * 
 * @author BENYAMIN DARMONI
 *
 *Game Numbers
 */
public class GameNumbers {
	public static int begin=0;
	static int end=7;
	public static  int[] array;
	static int sumOdd;
	static int sumEven;
	static  int sumPlayer1;
	static  int sumPlayer2;
	static boolean myTurn=true;

	/**
	 * computer's turn
	 */
	public static void player1_turn() {
		if(!myTurn)return;
		myTurn=false;
		if(end<=begin) {
			JOptionPane.showMessageDialog(null, "End game! I have "+sumPlayer1+" points, and you have "+sumPlayer2+" points, I won!");
			System.exit(0);
		}

		calculateOddEvenSum();      //every turn  the computer calculate what is better- odd places or even 

		if(sumEven>sumOdd) {
			if(begin%2==0) {
				sumPlayer1+=array[begin];

				begin++;
				Game_computer.arr[ begin-1].setText("X");
			}
			else {
				sumPlayer1+=array[end];
				end--;
				Game_computer.arr[ end+1].setText("X");
			}
		}
		else {
			if(begin%2==1) {
				sumPlayer1+=array[begin];
				begin++;
				Game_computer.arr[ begin-1].setText("X");
			}
			else {
				sumPlayer1+=array[end];
				end--;
				Game_computer.arr[ end+1].setText("X");		
			}

		}

	}

	/**
	 * calculate sum in odd paces and even places
	 */
	public static void calculateOddEvenSum() {
		sumEven=sumOdd=0;
		for(int i = begin; i <= end; i++) {
			if(i%2==0)	sumEven += array[i];
			else
				sumOdd +=  array[i];
		}
	}
	/**
	 * Build the series of random numbers
	 * @return array
	 */
	public static int[] buildArray(){
		int arr[] = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) ((Math.random()*(100))+1);  
		}
		return arr;
	}


}


