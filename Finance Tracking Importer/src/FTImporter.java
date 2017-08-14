import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Point;
import org.eclipse.wb.swt.SWTResourceManager;

public class FTImporter {

	protected Shell shlFinanceTrackingImporter;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FTImporter window = new FTImporter();
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
		shlFinanceTrackingImporter.open();
		shlFinanceTrackingImporter.layout();
		while (!shlFinanceTrackingImporter.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFinanceTrackingImporter = new Shell();
		shlFinanceTrackingImporter.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		shlFinanceTrackingImporter.setMinimumSize(new Point(100, 100));
		shlFinanceTrackingImporter.setSize(450, 200);
		shlFinanceTrackingImporter.setText("Finance Tracking Importer");
		
		Group grpConfiguration = new Group(shlFinanceTrackingImporter, SWT.NONE);
		grpConfiguration.setText("Configuration");
		grpConfiguration.setBounds(30, 34, 214, 91);
		
		Combo combo = new Combo(grpConfiguration, SWT.NONE);
		combo.setBounds(139, 0, 26, 22);
		
		Label lblFinanceInstitution = new Label(grpConfiguration, SWT.NONE);
		lblFinanceInstitution.setBounds(10, 0, 123, 22);
		lblFinanceInstitution.setText("Finance Institution");

	}
}
