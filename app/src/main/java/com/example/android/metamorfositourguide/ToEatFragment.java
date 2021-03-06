package com.example.android.metamorfositourguide;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToEatFragment extends Fragment {


    public ToEatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.business_list, container, false);

        //Create list of restaurants
        final ArrayList<Business> businesses = new ArrayList<Business>();

        businesses.add(new Business(getString(R.string.cup_grill_bar), 200+getString(R.string.distance_in_meters), 5.0, R.drawable.ic_restaurant));
        businesses.add(new Business(getString(R.string.vassilis), 5+getString(R.string.distance_in_meters), 4.9, R.drawable.ic_restaurant));
        businesses.add(new Business(getString(R.string.la_strada), 10+getString(R.string.distance_in_meters), 4.8, R.drawable.ic_local_pizza));
        businesses.add(new Business(getString(R.string.liana), 70+getString(R.string.distance_in_meters), 4.7, R.drawable.ic_restaurant));
        businesses.add(new Business(getString(R.string.giota), 120+getString(R.string.distance_in_meters), 4.6, R.drawable.ic_local_pizza));
        businesses.add(new Business(getString(R.string.gyrobank), 40+getString(R.string.distance_in_meters), 4.5, R.drawable.ic_restaurant));
        businesses.add(new Business(getString(R.string.brothers), 30+getString(R.string.distance_in_meters), 4.4, R.drawable.ic_restaurant));

        // Create an Business Adapter, whose data is the list of item above, the item knows how to create the list of items
        BusinessAdapter adapter = new BusinessAdapter(getActivity(), businesses, R.color.backgroundColorEatSleep);

        //find the list id to store the arraylist contents
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the listView use the Adapter we create above to list the items of the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
