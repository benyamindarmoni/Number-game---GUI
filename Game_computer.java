import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
/**
 * 
 * @author BENYAMIN DARMONI 
 *
 */
public class Game_computer {
	static Button score1;
	static Button score2;
	static Button[] arr=new Button[8]; 

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Game_computer window = new Game_computer();
			window.open();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public static void delete(Button  b) {
		b.setText("X");
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				score1.setText(Integer.toString(GameNumbers.sumPlayer1));
				score2.setText(Integer.toString(GameNumbers.sumPlayer2));

			}
		});
		shell.setSize(1011, 559);
		shell.setText("Game Number");



		Label lblPlayWithComputer = new Label(shell, SWT.NONE);
		lblPlayWithComputer.setBounds(384, 15, 191, 25);
		lblPlayWithComputer.setText("play with computer");



		Label lblMySumIs = new Label(shell, SWT.NONE);
		lblMySumIs.setBounds(56, 438, 110, 25);
		lblMySumIs.setText("my sum is:   ");



		Label lblYourSumIs = new Label(shell, SWT.NONE);
		lblYourSumIs.setBounds(770, 438, 110, 25);
		lblYourSumIs.setText("your sum is: ");


		///////////////////////////////////////////////////////////////
		Button btnStart = new Button(shell, SWT.NONE);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)
					GameNumbers.player1_turn();
				btnStart.setText("Started!");
			}
		});
		btnStart.setBounds(316, 66, 307, 66);
		btnStart.setText("PRESS TO START!");


		//////////////////////////////////////////////////////////////////
		Label lblTheArrayIs = new Label(shell, SWT.NONE);
		lblTheArrayIs.setBounds(10, 135, 133, 25);
		lblTheArrayIs.setText("The array is:");



		//////////////////////////////////////////////////////////////////////////


		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(789, 203, 105, 35);
		button_7.setText(Integer.toString(GameNumbers.array[7]));
		arr[7]=button_7;
		button_7.addSelectionListener(new SelectionAdapter() {//7
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.myTurn)return;

				if(GameNumbers.end==7) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_7.getText());
					//GameNumbers.myTurn=true;
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_7.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.begin==7) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_7.getText());
					//GameNumbers.myTurn=true;
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_7.setText("X");
					GameNumbers.player1_turn();


				}
			}

		});




		////////////////////////////////////////////////////////////////////////////
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(678, 203, 105, 35);
		button_6.setText(Integer.toString(GameNumbers.array[6]));
		arr[6]=button_6;
		button_6.addSelectionListener(new SelectionAdapter() {      //6
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.end==6) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_6.getText());

					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_6.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[6]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_6.getText());

					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_6.setText("X");
					GameNumbers.player1_turn();

				}

			}
		});




		/////////////////////////////////////////////////////////////////////////////
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setBounds(567, 203, 105, 35);
		button_5.setText(Integer.toString(GameNumbers.array[5]));
		arr[5]=button_5;
		button_5.addSelectionListener(new SelectionAdapter() {//5
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.array[GameNumbers.end]==GameNumbers.array[5]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_5.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_5.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[5]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_5.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_5.setText("X");
					GameNumbers.player1_turn();


				}
			}
		});



		//////////////////////////////////////////////////////////////////////////////
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(456, 203, 105, 35);
		button_4.setText(Integer.toString(GameNumbers.array[4]));
		arr[4]=button_4;
		button_4.addSelectionListener(new SelectionAdapter() {//4
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.array[GameNumbers.end]==GameNumbers.array[4]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_4.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_4.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[4]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_4.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_4.setText("X");
					GameNumbers.player1_turn();


				}
			}
		});


		///////////////////////////////////////////////////////////////////
		Button button_3 = new Button(shell, SWT.NONE);
		arr[3]=button_3;
		button_3.addSelectionListener(new SelectionAdapter() {//3
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.array[GameNumbers.end]==GameNumbers.array[3]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_3.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_3.setText("X");
					GameNumbers.player1_turn();
				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[3]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_3.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_3.setText("X");
					GameNumbers.player1_turn();


				}
			}
		});button_3.setBounds(344, 203, 105, 35);
		button_3.setText(Integer.toString(GameNumbers.array[3]));


		////////////////////////////////////////////////////////
		Button button_2 = new Button(shell, SWT.NONE);
		arr[2]=button_2;
		button_2.addSelectionListener(new SelectionAdapter() {//2
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.array[GameNumbers.end]==GameNumbers.array[2]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_2.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_2.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[2]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_2.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_2.setText("X");
					GameNumbers.player1_turn();

				}

			}
		});button_2.setBounds(233, 203, 105, 35);
		button_2.setText(Integer.toString(GameNumbers.array[2]));


		//////////////////////////////////////////////////////////////////////////
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(121, 203, 105, 35);
		arr[1]=button_1;
		button_1.setText(Integer.toString(GameNumbers.array[1]));
		button_1.addSelectionListener(new SelectionAdapter() {//1
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.end==GameNumbers.array[1]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_1.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_1.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[1]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_1.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_1.setText("X");
					GameNumbers.player1_turn();


				}
			}
		});


		//////////////////////////////////////////////////////////////////////
		Button button_0 = new Button(shell, SWT.NONE);
		button_0.setBounds(10, 203, 105, 35);
		arr[0]=button_0;
		button_0.setText(Integer.toString(GameNumbers.array[0]));
		button_0.addSelectionListener(new SelectionAdapter() {//0
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.myTurn)return;

				if(GameNumbers.array[GameNumbers.end]==GameNumbers.array[0]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_0.getText());
					GameNumbers.end--;
					GameNumbers.myTurn=true;
					button_0.setText("X");
					GameNumbers.player1_turn();

				}
				else if(GameNumbers.array[GameNumbers.begin]==GameNumbers.array[0]) {
					GameNumbers.sumPlayer2+=Integer.parseInt( button_0.getText());
					GameNumbers.begin++;
					GameNumbers.myTurn=true;
					button_0.setText("X");
					GameNumbers.player1_turn();

				}
			}
		});
		///////////////////////////////////////////////////////////

		Button btnNewButton_2 = new Button(shell, SWT.NONE);    //sum1
		score1=btnNewButton_2;
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				btnNewButton_2.setText(Integer.toString(GameNumbers.sumPlayer1));
			}
		});
		btnNewButton_2.setBounds(169, 433, 55, 35);
		btnNewButton_2.setText(Integer.toString(GameNumbers.sumPlayer1));

		/////////////////////////////////////////////////////////////////

		Button btnNewButton_3 = new Button(shell, SWT.NONE);    //sum2
		score2=btnNewButton_3;
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btnNewButton_3.setText(Integer.toString(GameNumbers.sumPlayer2));
			}
		});
		btnNewButton_3.setBounds(894, 433, 55, 35);
		btnNewButton_3.setText(Integer.toString(GameNumbers.sumPlayer2));

		//////////////////////////////////////////////////////

		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(431, 433, 105, 35);
		btnExit.setText("EXIT");


		//

	}
}
