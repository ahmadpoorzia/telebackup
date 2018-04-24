package org.backgram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.backgram.messenger.AndroidUtilities;
import org.backgram.messenger.LocaleController;
import org.backgram.messenger.MessagesController;
import org.backgram.messenger.R;
import org.backgram.tgnet.ConnectionsManager;
import org.backgram.tgnet.RequestDelegate;
import org.backgram.tgnet.TLObject;
import org.backgram.tgnet.TLRPC;
import org.backgram.ui.ActionBar.AlertDialog;
import org.backgram.ui.ActionBar.Theme;
import org.backgram.ui.Components.BetterRatingView;
import org.backgram.ui.Components.LayoutHelper;
import org.backgram.ui.Components.voip.VoIPHelper;

public class VoIPFeedbackActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		super.onCreate(savedInstanceState);

		overridePendingTransition(0, 0);

		setContentView(new View(this));

		VoIPHelper.showRateAlert(this, new Runnable(){
			@Override
			public void run(){
				finish();
			}
		}, getIntent().getLongExtra("call_id", 0), getIntent().getLongExtra("call_access_hash", 0));
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(0, 0);
	}
}
