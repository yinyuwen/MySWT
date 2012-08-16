package ylkj.swt;

import java.awt.event.MouseAdapter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class SWTDemo {
	private Display display = new Display();
	private Shell shell = new Shell(display);
	private TabFolder tabFolder;

	private TabItem tabItem;
	private TabItem tabItem1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SWTDemo demo = new SWTDemo();
		demo.init();
		// shell.pack();
		demo.shell.open();
		while (!demo.shell.isDisposed()) {
			if (!demo.display.readAndDispatch())
				demo.display.sleep();

		}
		demo.display.dispose();

	}

	private void init() {
		shell.setText("SWTDemo");
		shell.setLayout(null);
		shell.setBounds(100, 100, 500, 400);

		tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(5, 5, 480, 360);

		tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("登录界面");
		{

			Group group = new Group(tabFolder, SWT.NONE);
			group.setText("登录信息");
			tabItem.setControl(group);
			group.setBounds(120, 30, 300, 300);

			Label label = new Label(group, SWT.NONE);
			label.setText("登录信息");
			label.setFont(new Font(display, "宋体", 16, SWT.NORMAL));
			label.setForeground(Display.getCurrent().getSystemColor(
					SWT.COLOR_BLUE));
			label.setBounds(100, 20, 100, 30);

			Label label2 = new Label(group, SWT.NONE | SWT.RIGHT);
			label2.setText("用户名");
			label2.setBounds(10, 60, 60, 20);

			final Text userName = new Text(group, SWT.BORDER);
			userName.setBounds(80, 60, 100, 20);
			final Label label6 = new Label(group, SWT.NONE);
			label6.setBounds(190, 60, 60, 20);
			userName.addMouseListener(new MouseListener() {

				public void mouseUp(MouseEvent e) {
					if (userName.getText() == "") {
						label6.setText("请输入用户名");
					} else {
						label6.setText("");
					}
				}

				public void mouseDown(MouseEvent e) {

				}

				public void mouseDoubleClick(MouseEvent e) {

				}

			});

			Label label3 = new Label(group, SWT.NONE | SWT.RIGHT);
			label3.setText("密码");
			label3.setBounds(10, 90, 60, 20);
			final Text userPwd = new Text(group, SWT.BORDER | SWT.PASSWORD);
			userPwd.setBounds(80, 90, 100, 20);

			final Label label5 = new Label(group, SWT.NONE);
			label5.setForeground(Display.getCurrent().getSystemColor(
					SWT.COLOR_RED));
			label5.setBounds(80, 160, 100, 20);

			Button btn2 = new Button(group, SWT.NONE);
			btn2.setText("重置");
			btn2.setBounds(35, 130, 60, 20);
			btn2.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					userName.setText("");
					userPwd.setText("");
				}
			});

			Button btn1 = new Button(group, SWT.NONE);
			btn1.setText("登录");
			btn1.setBounds(105, 130, 60, 20);
			btn1.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					label5.setText("");
					if ("admin".equals(userName.getText())
							&& "admin".equals(userPwd.getText())) {
						NewComp();
					} else {
						label5.setText("用户名或密码错误");
						userPwd.setText("");

					}
				}

			});

		}

	}

	private void NewComp() {
		if (tabItem1 == null) {
			tabItem1 = new TabItem(tabFolder, SWT.PAGE_UP);
			tabItem1.setText("信息界面");

			{
				Composite composite = new Composite(tabFolder, SWT.BORDER);
				tabItem1.setControl(composite);
				composite.setBounds(25, 50, 450, 350);
				Label lb1 = new Label(composite, SWT.NONE);
				lb1.setBounds(40, 40, 100, 30);
				lb1.setText("登录成功");

			}
		}

	}
}
