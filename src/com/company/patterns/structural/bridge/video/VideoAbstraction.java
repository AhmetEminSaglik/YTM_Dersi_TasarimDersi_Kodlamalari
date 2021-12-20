package com.company.patterns.structural.bridge.video;

import com.company.patterns.structural.bridge.video.videomod.IVideoMod;

public abstract class VideoAbstraction {
    protected IVideoMod videoMode;

    public void showScreen() {
        System.out.println(videoMode.getScreen());
    }
}

