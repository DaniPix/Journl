package dani2pix.journl;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import dani2pix.journl.calendar.CalendarFragment;

public class JournlActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_journl);


		final ImageView background = (ImageView) findViewById(R.id.background);
		Picasso.with(this).load(R.drawable.ic_background_1)
				.fit()
				.centerCrop()
				.into(background);

		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.beginTransaction().replace(R.id.container, CalendarFragment.createInstance(), CalendarFragment.class.getName()).commit();
	}

}
