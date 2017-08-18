package dani2pix.journl;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dani2pix.journl.calendar.CalendarFragment;

public class JournlActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_journl);
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.container, CalendarFragment.createInstance(), CalendarFragment.class.getName()).commit();
	}

}
