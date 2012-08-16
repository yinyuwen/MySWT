package ylkj;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class SWTApplicationTest {
	private static Text text;
	private static Text text_1;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = Display.getDefault();
		final Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setBounds(86, 47, 54, 12);
		lblUsername.setText("userName");

		text = new Text(shell, SWT.BORDER);
		text.setBounds(191, 47, 70, 18);

		Label lblUserpwd = new Label(shell, SWT.PASSWORD);
		lblUserpwd.setBounds(86, 82, 54, 12);
		lblUserpwd.setText("userPwd");

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(191, 82, 70, 18);

		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (text.getText() != "" | text_1.getText() != "") {
					MessageDialog.openInformation(shell, "登录信息",
							"欢迎" + text.getText() + "进入系统！");
				} else {
					MessageDialog.openError(shell, "错误", "用户名或密码为空，请重新输入！");

				}
			}
		});
		btnSubmit.setBounds(86, 130, 72, 22);
		btnSubmit.setText("submit");

		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.setBounds(204, 130, 72, 22);
		btnReset.setText("reset");

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem menuItem = new MenuItem(menu, SWT.CASCADE);
		menuItem.setText("\u7CFB\u7EDF\u767B\u5F55");
		
		Menu menu2 = new Menu(shell,SWT.DROP_DOWN);
		menuItem.setMenu(menu2);
		
		MenuItem item = new MenuItem(menu2, SWT.DROP_DOWN);
		item.setText("&EXIT");
	
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			}
		});

		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("\u7528\u6237\u7BA1\u7406");

		MenuItem menuItem_1 = new MenuItem(menu, SWT.NONE);
		menuItem_1.setText("\u5E2E\u52A9\u6587\u6863");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
