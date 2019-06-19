import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
/**
 * 
 * @author BENYAMIN DARMONI
 *
 */
public class Gui_main_game {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Gui_main_game window = new Gui_main_game();
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

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(845, 326);
		shell.setText("SWT Application");

		Label lblWhe = new Label(shell, SWT.NONE);
		lblWhe.setBounds(264, 22, 276, 25);
		lblWhe.setText("Welcome to the number game!");

		Button btnPlayWithA = new Button(shell, SWT.NONE);
		btnPlayWithA.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Game_friend window = new Game_friend();
				window.open();
				Display display = Display.getDefault();
				createContents();
				shell.open();
				shell.layout();
			}
		});
		btnPlayWithA.setBounds(142, 124, 191, 62);
		btnPlayWithA.setText("Play with a friend");

		Button btnPlayWithComputer = new Button(shell, SWT.NONE);
		btnPlayWithComputer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				GameNumbers.array=GameNumbers.buildArray();
				Game_computer window = new Game_computer();
				window.open();
				Display display = Display.getDefault();
				createContents();
				shell.open();
				shell.layout();
				
			}
		});
		btnPlayWithComputer.setBounds(480, 124, 191, 62);
		btnPlayWithComputer.setText("play with computer");
		
		Label lblOr = new Label(shell, SWT.NONE);
		lblOr.setBounds(393, 143, 46, 25);
		lblOr.setText("or");

	}
}
