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

        // Get the required variables:
        // Current attraction
        Attraction currentAttraction = getItem(position);
        // Text view for its name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Text view for its description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Then the container - so that we can change the background color if we want
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        // And the image view to put image into or hide
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Set the relevant text
        nameTextView.setText(currentAttraction.getName());
        descriptionTextView.setText(currentAttraction.getDescription());
        // Set the background color for the container
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);
        if (currentAttraction.hasImage()) {
            // if there is an image associated with the entry - show it
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            // otherwise hide the imageview so it doesn't ruin our layout
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
