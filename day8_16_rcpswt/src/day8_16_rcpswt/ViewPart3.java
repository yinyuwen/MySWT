package day8_16_rcpswt;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.OpenInNewWindowAction;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.jface.viewers.TreeViewerColumn;

public class ViewPart3 extends ViewPart {

	public ViewPart3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		Tree tree = new Tree(parent, SWT.BORDER);
		tree.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));

		tree.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				try {
					PlatformUI
							.getWorkbench()
							.getActiveWorkbenchWindow()
							.getActivePage()
							.openEditor(new MyEditorInput(),
									"day8_16_rcpswt.editor1", true);
				} catch (PartInitException e1) {
					e1.printStackTrace();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		TreeItem trtmRoot = new TreeItem(tree, SWT.NONE);
		trtmRoot.setText("Root");

		TreeItem trtmNewTreeitem_1 = new TreeItem(trtmRoot, SWT.NONE);
		trtmNewTreeitem_1.setText("dada");

		TreeItem trtmDsa = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmDsa.setText("dsa");

		TreeItem trtmSfs = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmSfs.setText("sfs");

		TreeItem trtmNewTreeitem_2 = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmNewTreeitem_2.setText("New TreeItem");
		trtmNewTreeitem_1.setExpanded(true);

		TreeItem trtmSfsf = new TreeItem(trtmRoot, SWT.NONE);
		trtmSfsf.setText("sfsf");
		trtmRoot.setExpanded(true);

		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setText("test2");

		TreeItem trtmAdada = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmAdada.setText("adada");
		trtmNewTreeitem.setExpanded(true);

		TreeItem trtmTest = new TreeItem(tree, SWT.NONE);
		trtmTest.setText("test");

		TreeItem trtmSfsdf = new TreeItem(trtmTest, SWT.NONE);
		trtmSfsdf.setText("sfsdf");

		TreeItem trtmSfst = new TreeItem(trtmTest, SWT.NONE);
		trtmSfst.setText("sfst");
		trtmTest.setExpanded(true);

	}

	@Override
	public void setFocus() {

	}

}
