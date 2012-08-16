package day8_16_rcpswt;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;

public class ViewPart2 extends ViewPart {
	private Text text;

	public ViewPart2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		FillLayout fillLayout = (FillLayout) parent.getLayout();
		fillLayout.type = SWT.VERTICAL;
		
		List list = new List(parent, SWT.BORDER);
		
		Combo combo = new Combo(parent, SWT.NONE);
		
		DateTime dateTime = new DateTime(parent, SWT.BORDER);
		
		Spinner spinner = new Spinner(parent, SWT.BORDER);
		
		text = new Text(parent, SWT.BORDER);
		
		Button btnRadioButton = new Button(parent, SWT.RADIO);
		btnRadioButton.setText("Radio Button");
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
