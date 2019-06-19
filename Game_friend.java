import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
/**
 * 
 * @author BENYAMIN DARMONI
 *
 */
public class Game_friend {
	static Label a;
	static Label b;
	static Button arr[]=new Button[8];
	static  int counter=0;
	static int[] numbers=GameNumbers.buildArray();
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Game_friend window = new Game_friend();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * that function check if the game ended by verify end and begin
	 */
	public static void check_if_end() {
		if(GameNumbers.end<GameNumbers.begin) {
			if(GameNumbers.sumPlayer1>GameNumbers.sumPlayer2)
				JOptionPane.showMessageDialog(null, "End game! player1 have "+GameNumbers.sumPlayer1+" points, and player2 have "+GameNumbers.sumPlayer2+" points. player1 is the winner!");
			else
				JOptionPane.showMessageDialog(null, "End game! player1 have "+GameNumbers.sumPlayer1+" points, and player2 have "+GameNumbers.sumPlayer2+" points. player2 is the winner!");


			System.exit(0);
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

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(939, 492);
		shell.setText("SWT Application");

		Label lblPlayWithFriend = new Label(shell, SWT.NONE);
		lblPlayWithFriend.setBounds(378, 12, 137, 25);
		lblPlayWithFriend.setText("Play with a friend");

		Composite composite = new Composite(shell, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				a.setText("player 1: "+GameNumbers.sumPlayer1);
				b.setText("player 2: "+GameNumbers.sumPlayer2);
			}
		});
		composite.setBounds(10, 43, 907, 364);

		Button btnExit = new Button(composite, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(377, 306, 105, 35);
		btnExit.setText("EXIT");




		Button btnNewButton = new Button(composite, SWT.NONE);
		arr[0]=btnNewButton;
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.end==0) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton.getText());
					}
					GameNumbers.end--;
					btnNewButton.setText("X");
				}
				else if(GameNumbers.begin==0) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton.getText());
					}
					GameNumbers.begin++;
					btnNewButton.setText("X");
				}
				check_if_end();

			}
		});
		btnNewButton.setBounds(10, 122, 105, 35);
		btnNewButton.setText(Integer.toString(numbers[0]));



		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		arr[1]=btnNewButton_1;
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(GameNumbers.end==1) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_1.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_1.getText());
					}
					GameNumbers.end--;
					btnNewButton_1.setText("X");
				}
				else if(GameNumbers.begin==1) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_1.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_1.getText());
					}
					GameNumbers.begin++;
					btnNewButton_1.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_1.setBounds(121, 122, 105, 35);
		btnNewButton_1.setText(Integer.toString(numbers[1]));	



		Button btnNewButton_2 = new Button(composite, SWT.NONE);
		arr[2]=btnNewButton_2;
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==2) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_2.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_2.getText());
					}
					GameNumbers.end--;
					btnNewButton_2.setText("X");
				}
				else if(GameNumbers.begin==2) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_2.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_2.getText());
					}
					GameNumbers.begin++;
					btnNewButton_2.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_2.setBounds(232, 122, 105, 35);
		btnNewButton_2.setText(Integer.toString(numbers[2]));



		Button btnNewButton_3 = new Button(composite, SWT.NONE);
		arr[3]=btnNewButton_3;
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==3) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_3.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_3.getText());
					}
					GameNumbers.end--;
					btnNewButton_3.setText("X");
				}
				else if(GameNumbers.begin==3) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_3.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_3.getText());
					}
					GameNumbers.begin++;
					btnNewButton_3.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_3.setBounds(350, 122, 105, 35);
		btnNewButton_3.setText(Integer.toString(numbers[3]));


		Button btnNewButton_4 = new Button(composite, SWT.NONE);	
		arr[4]=btnNewButton_4;
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==4) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_4.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_4.getText());
					}
					GameNumbers.end--;
					btnNewButton_4.setText("X");
				}
				else if(GameNumbers.begin==4) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_4.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_4.getText());
					}
					GameNumbers.begin++;
					btnNewButton_4.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_4.setBounds(461, 122, 105, 35);
		btnNewButton_4.setText(Integer.toString(numbers[4]));



		Button btnNewButton_5 = new Button(composite, SWT.NONE);arr[5]=btnNewButton_5;
		btnNewButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==5) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_5.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_5.getText());
					}
					GameNumbers.end--;
					btnNewButton_5.setText("X");
				}
				else if(GameNumbers.begin==5) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_5.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_5.getText());
					}
					GameNumbers.begin++;
					btnNewButton_5.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_5.setBounds(572, 122, 105, 35);
		btnNewButton_5.setText(Integer.toString(numbers[5]));



		Button btnNewButton_6 = new Button(composite, SWT.NONE);arr[6]=btnNewButton_6;
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==6) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_6.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_6.getText());
					}
					GameNumbers.end--;
					btnNewButton_6.setText("X");
				}
				else if(GameNumbers.begin==6) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_6.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_6.getText());
					}
					GameNumbers.begin++;
					btnNewButton_6.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_6.setBounds(683, 122, 105, 35);
		btnNewButton_6.setText(Integer.toString(numbers[6]));


//Button 7
		Button btnNewButton_7 = new Button(composite, SWT.NONE);	
		arr[7]=btnNewButton_7;
		btnNewButton_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(GameNumbers.end==7) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_7.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_7.getText());
					}
					GameNumbers.end--;
					btnNewButton_7.setText("X");
				}
				else if(GameNumbers.begin==7) {
					counter++;
					if(counter%2==1)GameNumbers.sumPlayer1+=Integer.parseInt(btnNewButton_7.getText());
					else {
						GameNumbers.sumPlayer2+=Integer.parseInt(btnNewButton_7.getText());
					}
					GameNumbers.begin++;
					btnNewButton_7.setText("X");
				}
				check_if_end();
			}
		});
		btnNewButton_7.setBounds(794, 122, 105, 35);
		btnNewButton_7.setText(Integer.toString(numbers[7]));

		Label lblPlayer = new Label(composite, SWT.NONE);
		lblPlayer.setBounds(10, 316, 125, 25);
		a=lblPlayer;
		lblPlayer.setText("player 1: "+GameNumbers.sumPlayer1);

		Label lblPlayer_1 = new Label(composite, SWT.NONE);
		lblPlayer_1.setBounds(718, 311, 131, 25);
		b=lblPlayer_1;
		lblPlayer_1.setText("player 2: "+GameNumbers.sumPlayer2);
		
		Label lblTheArrayIs = new Label(composite, SWT.NONE);
		lblTheArrayIs.setBounds(21, 67, 114, 25);
		lblTheArrayIs.setText("The array is:");

	}
}
