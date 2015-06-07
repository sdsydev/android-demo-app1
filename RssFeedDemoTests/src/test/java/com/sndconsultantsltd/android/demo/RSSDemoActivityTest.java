package com.sndconsultantsltd.android.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.os.Build;
import android.widget.TextView;



@RunWith(RobolectricTestRunner.class)
@Config(manifest = "../RssFeedDemo/AndroidManifest.xml", emulateSdk = Build.VERSION_CODES.JELLY_BEAN_MR2)
public class RSSDemoActivityTest {

	private RSSDemoActivity rssDemoAct;

	@Test
	public void shouldPass() {
		assertTrue(true);
	}

	@Before
	public void setup() {

		rssDemoAct = Robolectric.buildActivity(RSSDemoActivity.class).create()
				.get();

	}

	@Test
	public void allViewsPresent() {

		assertThat(rssDemoAct).isNotNull();
		TextView hwTV = (TextView) rssDemoAct.findViewById(R.id.hwTV);
		TextView hw2TV = (TextView) rssDemoAct.findViewById(R.id.hw2TV);

		assertThat(hwTV).isNotNull();
		assertThat(hw2TV).isNotNull();

	}

	@Test
	public void manipulate_HWTV() {

		final TextView hwTV = (TextView) rssDemoAct.findViewById(R.id.hwTV);
		final String tmpText = "Test Text";
		// enter a text in the text field
		rssDemoAct.runOnUiThread(new Runnable() {
			@Override
			public void run() {
				hwTV.requestFocus();
				hwTV.setText(tmpText);
			}
		});
		
		assertThat(hwTV.getText()).isEqualTo(tmpText);

	}
	
	@Test
	public void validateHWText_OnlyMe_returnTrue(){

		final TextView hwTV = (TextView) rssDemoAct.findViewById(R.id.hwTV);
		assertThat(hwTV.getText()).isEqualTo("Only Me");
	}

}
