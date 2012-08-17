package day8_16_rcpswt;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		// layout.setEditorAreaVisible(false);

		// layout.addStandaloneView(WorkSpaceHeader.ID, false, IPageLayout.TOP,
		// 0.15f, layout.getEditorArea());
		IFolderLayout navFold = layout.createFolder("Navigator",
				IPageLayout.LEFT, 0.38f, layout.getEditorArea());
		navFold.addView("day8_16_rcpswt.view1");
		navFold.addView("day8_16_rcpswt.view2");
		navFold.addView("day8_16_rcpswt.view3");
		IFolderLayout layout2 = layout.createFolder("Eidtor", IPageLayout.TOP,
				0.4f, layout.getEditorArea());
		layout2.addView("day8_16_rcpswt.view4");
		layout2.addView("day8_16_rcpswt.view5");

		IFolderLayout layout3 = layout.createFolder("", IPageLayout.TOP, 0.58f,
				layout.getEditorArea());
		layout3.addView("day8_16_rcpswt.view7");
		layout3.addView("day8_16_rcpswt.view8");
		
		
		

	}
}
