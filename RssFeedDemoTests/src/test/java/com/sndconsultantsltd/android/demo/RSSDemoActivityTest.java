package com.sndconsultantsltd.android.demo;

import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.os.Build;

import com.example.rssfeeddemo.RSSDemoActivity;

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
	public void allViewsPresent(){
		
		assertThat(rssDemoAct).isNotNull();
	}

}
