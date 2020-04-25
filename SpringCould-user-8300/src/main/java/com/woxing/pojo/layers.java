package com.woxing.pojo;

public class layers {
    private String layer;

    private String layerName;

    private String getLayerName;

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public String getGetLayerName() {
        return getLayerName;
    }

    public void setGetLayerName(String getLayerName) {
        this.getLayerName = getLayerName;
    }

    public layers(String layer, String layerName, String getLayerName) {
        this.layer = layer;
        this.layerName = layerName;
        this.getLayerName = getLayerName;
    }

    public layers() {
    }
}
