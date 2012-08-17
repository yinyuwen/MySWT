package jfreechartrcp;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		IFolderLayout navFold = layout.createFolder("Navigator",
				IPageLayout.LEFT, 0.65f, layout.getEditorArea());
		navFold.addView("JfreeChartRcp.view1");
	}
}
