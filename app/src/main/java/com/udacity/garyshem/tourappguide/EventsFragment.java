package com.udacity.garyshem.tourappguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.moscow_founding_name), getString(R.string.moscow_founding_description)));
        attractions.add(new Attraction(getString(R.string.event_capital_name), getString(R.string.event_capital_description)));
        attractions.add(new Attraction(getString(R.string.event_capital_loss_name), getString(R.string.event_capital_loss_description)));
        attractions.add(new Attraction(getString(R.string.event_capital_regain_name), getString(R.string.event_capital_regain_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        AttractionAdapter adapter =
                new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryLight);
        listView.setAdapter(adapter);


        return rootView;
    }
}
