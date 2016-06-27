package com.udacity.garyshem.tourappguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.red_square_name), getString(R.string.red_square_description), R.drawable.red_square));
        attractions.add(new Attraction(getString(R.string.bolshoi_theatre_name), getString(R.string.bolshoi_theatre_description), R.drawable.bolshoy_theatre));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        AttractionAdapter adapter =
                new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryLight);
        listView.setAdapter(adapter);


        return rootView;
    }
}
