package day8_16_rcpswt;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;

public class ViewPart8 extends ViewPart {
	private Text txtQiu;

	public ViewPart8() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {

		txtQiu = new Text(parent, SWT.BORDER);
		txtQiu.setText("qiu ");
   
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
