package com.udacity.garyshem.tourappguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.restaurant_yakitoriya_name), getString(R.string.restaurant_yakitoriya_description)));
        attractions.add(new Attraction(getString(R.string.restaurant_papa_johns_name), getString(R.string.restaurant_papa_johns_description)));
        attractions.add(new Attraction(getString(R.string.restaurants_hard_rock_cafe_name), getString(R.string.restaurant_hard_rock_cafe_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        AttractionAdapter adapter =
                new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryLight);
        listView.setAdapter(adapter);


        return rootView;
    }
}
