package com.emmanuelmess.simpleaccounting;

import android.app.Application;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
/**
 * @author Emmanuel
 *         on 2016-01-26, at 16:16.
 */
@ReportsCrashes(
		mailTo = "emmanuelbendavid@gmail.com",
		mode = ReportingInteractionMode.TOAST,
		resToastText = R.string.crash_toast_text)
public class SimpleAccountingApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		// The following line triggers the initialization of ACRA
		ACRA.init(this);
	}
}
