package com.udacity.garyshem.tourappguide;

public class Attraction {
    private String name;
    private String description;
    private int imageResourceId;

    private static final int NO_RESOURCE_PROVIDED = -1;

    /**
     * Constructor for entries with image
     *
     * @param name            is the name of the object or event
     * @param description     is the text description of a place or event
     * @param imageResourceId related image
     */
    public Attraction(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Constructor for entries without image
     *
     * @param name        is the name of the object or event
     * @param description is the text description of a place or event
     */
    public Attraction(String name, String description) {
        this.name = name;
        this.description = description;
        imageResourceId = NO_RESOURCE_PROVIDED;
    }

    /**
     * Method to determine whether an entry has an associated image resource
     *
     * @return true if there is an associated image, false otherwise
     */
    public boolean hasImage() {
        return imageResourceId != NO_RESOURCE_PROVIDED;
    }

    /**
     * @return name of the event or location
     */
    public String getName() {
        return name;
    }

    /**
     * @return description of the event or location
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return image resource ID
     */
    public int getImageResourceId() {
        return imageResourceId;
    }
}
