package com.company.patterns.structural.bridge.video.videomod;

public class Direct3DMode implements IVideoMod {
    String MODE_NAME = "Direct3D Mode";

    @Override
    public String getScreen() {
        return "Video started with : " + MODE_NAME;
    }
}
