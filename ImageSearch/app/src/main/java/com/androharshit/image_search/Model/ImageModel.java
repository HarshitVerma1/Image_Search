package com.androharshit.image_search.Model;


public class ImageModel {
    private URLModel urls;

    public ImageModel(URLModel urls) {
        this.urls = urls;
    }

    public URLModel getUrls() {
        return urls;
    }

    public void setUrls(URLModel urls) {
        this.urls = urls;
    }
}
