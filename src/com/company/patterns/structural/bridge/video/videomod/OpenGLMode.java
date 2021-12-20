package com.company.patterns.structural.bridge.video.videomod;

public class OpenGLMode implements IVideoMod {
    final String MODE_NAME = "OpenGL Mode";

    @Override
    public String getScreen() {
        return "Video started with : " + MODE_NAME;
    }
}
