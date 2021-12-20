package com.company.patterns.structural.bridge.video;

import com.company.patterns.structural.bridge.video.videomod.Direct3DMode;
import com.company.patterns.structural.bridge.video.videomod.OpenGLMode;

public class Main {
    public static void main(String[] args) {
        VideoAbstraction video = new VideoRefinedAbstraction();
        video.videoMode = new OpenGLMode();
        video.showScreen();

        video.videoMode = new Direct3DMode();
        video.showScreen();

    }
}
