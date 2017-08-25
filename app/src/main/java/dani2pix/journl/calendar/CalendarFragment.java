package dani2pix.journl.calendar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageButton;


import dani2pix.journl.R;

/**
 * Created by dandomnica on 2017-08-18.
 */

public class CalendarFragment extends Fragment {


	public static CalendarFragment createInstance() {
		return new CalendarFragment();
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.calendar_fragment, container, false);

		final CalendarView calendar = view.findViewById(R.id.calendar);
		final View today = view.findViewById(R.id.today);
		ImageButton toggleCalendar = view.findViewById(R.id.toggleCalendar);

		toggleCalendar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				today.setVisibility(View.GONE);
			}
		});

		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}
}
