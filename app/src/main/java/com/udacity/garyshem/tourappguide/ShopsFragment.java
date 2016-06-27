package com.udacity.garyshem.tourappguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.shop_auchan_name), getString(R.string.shop_auchan_description)));
        attractions.add(new Attraction(getString(R.string.shop_ikea_name), getString(R.string.shop_ikea_description)));
        attractions.add(new Attraction(getString(R.string.shop_perekrjostok_name), getString(R.string.shop_perekrjostok_description)));

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        AttractionAdapter adapter =
                new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryLight);
        listView.setAdapter(adapter);


        return rootView;
    }
}
