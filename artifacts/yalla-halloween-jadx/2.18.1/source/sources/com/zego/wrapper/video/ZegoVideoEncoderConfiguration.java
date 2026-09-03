package com.zego.wrapper.video;

import OooO00o.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoVideoEncoderConfiguration{dimensions=");
        sbOooO0o0.append(this.dimensions);
        sbOooO0o0.append(", frameRate=");
        sbOooO0o0.append(this.frameRate);
        sbOooO0o0.append(", bitrate=");
        sbOooO0o0.append(this.bitrate);
        sbOooO0o0.append(", minBitrate=");
        sbOooO0o0.append(this.minBitrate);
        sbOooO0o0.append(", degradationPrefer=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.degradationPrefer, '}');
    }

    public static class VideoDimensions {
        public int height;
        public int width;

        public VideoDimensions(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VideoDimensions{width=");
            sbOooO0o0.append(this.width);
            sbOooO0o0.append(", height=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.height, '}');
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
