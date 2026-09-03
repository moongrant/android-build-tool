package com.zego.zegoliveroom.constants;

import com.uc.crashsdk.export.LogType;

/* JADX INFO: loaded from: classes3.dex */
public final class ZegoAvConfig {
    private int mVideoBitrate;
    private int mVideoCaptureResolutionHeight;
    private int mVideoCaptureResolutionWidth;
    private int mVideoEncodeResolutionHeight;
    private int mVideoEncodeResolutionWidth;
    private int mVideoFPS;
    public static final int[] VIDEO_FPSS = {5, 10, 15, 20, 25, 30};
    public static final int[] VIDEO_BITRATES = {300000, 400000, 600000, 1200000, 1500000, 3000000};

    public static final class Level {
        public static final int Generic = 2;
        public static final int High = 3;
        public static final int Low = 1;
        public static final int SuperHigh = 5;
        public static final int VeryHigh = 4;
        public static final int VeryLow = 0;
    }

    public ZegoAvConfig(int i) {
        int i2;
        int i3;
        i = (i < 0 || i > 5) ? 2 : i;
        if (i == 0) {
            i2 = 180;
            this.mVideoEncodeResolutionWidth = 180;
            i3 = 320;
        } else if (i == 1) {
            i2 = 270;
            this.mVideoEncodeResolutionWidth = 270;
            i3 = 480;
        } else if (i == 2) {
            i2 = 360;
            this.mVideoEncodeResolutionWidth = 360;
            i3 = 640;
        } else if (i == 3) {
            i2 = 540;
            this.mVideoEncodeResolutionWidth = 540;
            i3 = 960;
        } else {
            if (i != 4) {
                if (i == 5) {
                    i2 = 1080;
                    this.mVideoEncodeResolutionWidth = 1080;
                    i3 = 1920;
                }
                this.mVideoFPS = 15;
                this.mVideoBitrate = VIDEO_BITRATES[i];
            }
            i2 = 720;
            this.mVideoEncodeResolutionWidth = 720;
            i3 = LogType.UNEXP_ANR;
        }
        this.mVideoEncodeResolutionHeight = i3;
        this.mVideoCaptureResolutionWidth = i2;
        this.mVideoCaptureResolutionHeight = i3;
        this.mVideoFPS = 15;
        this.mVideoBitrate = VIDEO_BITRATES[i];
    }

    public int getVideoBitrate() {
        return this.mVideoBitrate;
    }

    public int getVideoCaptureResolutionHeight() {
        return this.mVideoCaptureResolutionHeight;
    }

    public int getVideoCaptureResolutionWidth() {
        return this.mVideoCaptureResolutionWidth;
    }

    public int getVideoEncodeResolutionHeight() {
        return this.mVideoEncodeResolutionHeight;
    }

    public int getVideoEncodeResolutionWidth() {
        return this.mVideoEncodeResolutionWidth;
    }

    public int getVideoFPS() {
        return this.mVideoFPS;
    }

    public void setVideoBitrate(int i) {
        this.mVideoBitrate = i;
    }

    public void setVideoCaptureResolution(int i, int i2) {
        this.mVideoCaptureResolutionWidth = i;
        this.mVideoCaptureResolutionHeight = i2;
    }

    public void setVideoEncodeResolution(int i, int i2) {
        this.mVideoEncodeResolutionWidth = i;
        this.mVideoEncodeResolutionHeight = i2;
    }

    public void setVideoFPS(int i) {
        this.mVideoFPS = i;
    }
}
