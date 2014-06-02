import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UILabel;
import org.robovm.apple.uikit.UIScreen;
import org.robovm.apple.uikit.UIWindow;

public class HelloWorld extends UIApplicationDelegateAdapter {

	@Override
	public boolean didFinishLaunching(UIApplication application,
			NSDictionary<NSString, ?> launchOptions) {
		UIWindow window = new UIWindow(UIScreen.getMainScreen().getBounds());
		UILabel label = new UILabel(new CGRect(50, 50, 100, 50));
		label.setText("Hello World");
		window.addSubview(label);
		window.setBackgroundColor(UIColor.colorGreen());
		window.makeKeyAndVisible();
		return true;
	}

	public static void main(String[] args) {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		UIApplication.main(args, null, HelloWorld.class);
		pool.close();
	}

}
