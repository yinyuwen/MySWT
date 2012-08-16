package day8_16_rcpswt;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;

public class ViewPart4 extends ViewPart {
	private Text text;
	private Text text_1;

	public ViewPart4() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FormLayout());
		
		Label label = new Label(parent, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 76);
		fd_label.left = new FormAttachment(0, 186);
		fd_label.bottom = new FormAttachment(0, 88);
		label.setLayoutData(fd_label);
		label.setText("\u7528\u6237\u540D");
		
		text = new Text(parent, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(label, -3, SWT.TOP);
		fd_text.left = new FormAttachment(label, 12);
		text.setLayoutData(fd_text);
		
		Label label_1 = new Label(parent, SWT.NONE);
		FormData fd_label_1 = new FormData();
		fd_label_1.top = new FormAttachment(label, 19);
		fd_label_1.left = new FormAttachment(label, 0, SWT.LEFT);
		label_1.setLayoutData(fd_label_1);
		label_1.setText("\u5BC6\u7801");
		
		text_1 = new Text(parent, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.top = new FormAttachment(label_1, 0, SWT.TOP);
		fd_text_1.left = new FormAttachment(text, 0, SWT.LEFT);
		text_1.setLayoutData(fd_text_1);
		
		Button button = new Button(parent, SWT.NONE);
		FormData fd_button = new FormData();
		fd_button.right = new FormAttachment(0, 287);
		fd_button.top = new FormAttachment(text_1, 35);
		fd_button.left = new FormAttachment(0, 200);
		button.setLayoutData(fd_button);
		button.setText("\u63D0\u4EA4");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {

	}

}
