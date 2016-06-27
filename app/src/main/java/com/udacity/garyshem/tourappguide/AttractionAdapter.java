package com.udacity.garyshem.tourappguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private int colorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int colorId) {
        super(context, 0, attractions);
        colorResourceId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        nameTextView.setText(currentAttraction.getName());
        descriptionTextView.setText(currentAttraction.getDescription());
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);
        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
