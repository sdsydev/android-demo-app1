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
import android.widget.ImageView;
import android.widget.ScrollView;
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
		ImageView imgIV = (ImageView)rssDemoAct.findViewById(R.id.imgIV);
		TextView titleTV = (TextView) rssDemoAct.findViewById(R.id.titleTV);
		TextView dateTV	= (TextView) rssDemoAct.findViewById(R.id.dateTV);
		ScrollView descScrV = (ScrollView) rssDemoAct.findViewById(R.id.descScrV);
		TextView descTV = (TextView) rssDemoAct.findViewById(R.id.descTV);
	
		assertThat(imgIV).isNotNull();
		assertThat(titleTV).isNotNull();
		assertThat(dateTV).isNotNull();
		assertThat(descScrV).isNotNull();
		assertThat(descTV).isNotNull();

	}

	@Test
	public void manipulate_titleTV() {

		final TextView hwTV = (TextView) rssDemoAct.findViewById(R.id.titleTV);
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
	public void validateTitleText_Test_Title_returnTrue(){

		final TextView hwTV = (TextView) rssDemoAct.findViewById(R.id.titleTV);
		assertThat(hwTV.getText()).isEqualTo("Test Title");
	}

}
