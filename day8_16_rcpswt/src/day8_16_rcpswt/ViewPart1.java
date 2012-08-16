package day8_16_rcpswt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class ViewPart1 extends ViewPart {

	public ViewPart1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		
		Tree tree = new Tree(parent, SWT.BORDER);
		tree.setForeground(Display.getCurrent().getSystemColor(
				SWT.COLOR_BLUE));
		
		TreeItem trtmSd = new TreeItem(tree, SWT.NONE);
		trtmSd.setText("sd");
		
		TreeItem trtmDad = new TreeItem(trtmSd, SWT.NONE);
		trtmDad.setText("dad");
		trtmSd.setExpanded(true);
		
		TreeItem trtmNewTreeitem_2 = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem_2.setText("New TreeItem");
		
		TreeItem trtmAdsa = new TreeItem(tree, SWT.NONE);
		trtmAdsa.setText("adsa");
		
		Tree tree_1 = new Tree(parent, SWT.BORDER);
		tree_1.setForeground(Display.getCurrent().getSystemColor(
				SWT.COLOR_BLUE));
		
		
		TreeItem trtmNewTreeitem_5 = new TreeItem(tree_1, SWT.NONE);
		trtmNewTreeitem_5.setText("New TreeItem");
		
		TreeItem trtmAsdsa = new TreeItem(tree_1, SWT.NONE);
		trtmAsdsa.setText("asdsa");
		
		TreeItem trtmNewTreeitem_6 = new TreeItem(trtmAsdsa, SWT.NONE);
		trtmNewTreeitem_6.setText("New TreeItem");
		trtmAsdsa.setExpanded(true);
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(tree_1, SWT.NONE);
		trtmNewTreeitem_1.setText("New TreeItem");
		
		Tree tree_2 = new Tree(parent, SWT.BORDER);
		tree_2.setForeground(Display.getCurrent().getSystemColor(
				SWT.COLOR_BLUE));
		
		
		TreeItem trtmNewTreeitem = new TreeItem(tree_2, SWT.NONE);
		trtmNewTreeitem.setText("New TreeItem");
		
		TreeItem trtmNewTreeitem_4 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_4.setText("New TreeItem");
		trtmNewTreeitem.setExpanded(true);
		
		TreeItem trtmNewTreeitem_3 = new TreeItem(tree_2, SWT.NONE);
		trtmNewTreeitem_3.setText("New TreeItem");
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
