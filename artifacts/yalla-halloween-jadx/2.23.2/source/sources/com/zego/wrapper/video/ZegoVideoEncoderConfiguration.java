package com.zego.wrapper.video;

import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public class ZegoVideoEncoderConfiguration {
    public int bitrate;
    public int degradationPrefer;
    public VideoDimensions dimensions;
    public int frameRate;
    public int minBitrate;
    public int orientationMode;

    public static final class DegradationPreference {
        public static final int MAINTAIN_FRAMERATE = 1;
        public static final int MAINTAIN_QUALITY = 0;
    }

    public static final class OrientationMode {
        public static final int ADAPTIVE = 0;
        public static final int FIXED_LANDSCAPE = 1;
        public static final int FIXED_PORTRAIT = 2;
    }

    public ZegoVideoEncoderConfiguration() {
        this.dimensions = new VideoDimensions(360, 640);
        this.frameRate = 15;
        this.bitrate = 600;
        this.minBitrate = -1;
        this.orientationMode = 0;
        this.degradationPrefer = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZegoVideoEncoderConfiguration{dimensions=");
        sb.append(this.dimensions);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", minBitrate=");
        sb.append(this.minBitrate);
        sb.append(", degradationPrefer=");
        return OooO0O0.OooO00o(sb, this.degradationPrefer, '}');
    }

    public static class VideoDimensions {
        public int height;
        public int width;

        public VideoDimensions(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VideoDimensions{width=");
            sb.append(this.width);
            sb.append(", height=");
            return OooO0O0.OooO00o(sb, this.height, '}');
        }

        public VideoDimensions() {
            this.width = 360;
            this.height = 640;
        }
    }

    public ZegoVideoEncoderConfiguration(VideoDimensions videoDimensions, int i, int i2, int i3) {
        this.dimensions = videoDimensions;
        this.frameRate = i;
        this.bitrate = i2;
        this.minBitrate = -1;
        this.orientationMode = i3;
        this.degradationPrefer = 0;
    }

    public ZegoVideoEncoderConfiguration(int i, int i2, int i3, int i4, int i5) {
        this.dimensions = new VideoDimensions(i, i2);
        this.frameRate = i3;
        this.bitrate = i4;
        this.minBitrate = -1;
        this.orientationMode = i5;
        this.degradationPrefer = 0;
    }
}
