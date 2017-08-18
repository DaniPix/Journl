package dani2pix.journl.calendar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

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
		View view = inflater.inflate(R.layout.calendar_fragment_layout, container, false);

		final ImageView calendarContainer = view.findViewById(R.id.calendarBackground);
		Picasso.with(getContext()).load(R.drawable.ic_background_1)
				.fit()
				.centerCrop()
				.into(calendarContainer);


		final CalendarView calendarView = view.findViewById(R.id.calendar);
		final View currentDay = view.findViewById(R.id.currentDay);
		FloatingActionButton fab = view.findViewById(R.id.openCalendar);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				calendarView.setVisibility(View.VISIBLE);
				currentDay.setVisibility(View.INVISIBLE);
			}
		});


		return view;
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}
}
