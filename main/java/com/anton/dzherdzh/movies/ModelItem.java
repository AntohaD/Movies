package com.anton.dzherdzh.movies;

import java.util.ArrayList;
import java.util.List;

public class ModelItem {

    private String name;
    private int imgId;

    public ModelItem(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public String getName() {
        return  name;
    }

    public static List<ModelItem> getFakeItems() {
        ArrayList<ModelItem> itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("Films1", R.drawable.image));
        itemsList.add(new ModelItem("Films2", R.drawable.image1));
        itemsList.add(new ModelItem("Films3", R.drawable.image2));
        itemsList.add(new ModelItem("Films4", R.drawable.image3));
        itemsList.add(new ModelItem("Films5", R.drawable.image4));
        itemsList.add(new ModelItem("Films6", R.drawable.image5));
        itemsList.add(new ModelItem("Films7", R.drawable.image6));
        itemsList.add(new ModelItem("Films8", R.drawable.image7));
        return itemsList;
    }
}
