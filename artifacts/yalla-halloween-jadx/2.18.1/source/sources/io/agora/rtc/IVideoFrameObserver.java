package io.agora.rtc;

import OooO00o.OooO00o;
import java.nio.ByteBuffer;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IVideoFrameObserver {
    public static final int FRAME_TYPE_RGBA = 2;
    public static final int FRAME_TYPE_YUV420 = 0;
    public static final int FRAME_TYPE_YUV422 = 1;
    public static final int POSITION_POST_CAPTURER = 1;
    public static final int POSITION_PRE_ENCODER = 4;
    public static final int POSITION_PRE_RENDERER = 2;

    public static class VideoFrame {
        public int avsync_type;
        public int height;
        public long renderTimeMs;
        public int rotation;
        public int type;
        public ByteBuffer uBuffer;
        public int uStride;
        public ByteBuffer vBuffer;
        public int vStride;
        public int width;
        public ByteBuffer yBuffer;
        public int yStride;

        public VideoFrame(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7, long j, int i8) {
            this.type = i;
            this.width = i2;
            this.height = i3;
            this.yStride = i4;
            this.uStride = i5;
            this.vStride = i6;
            this.yBuffer = byteBuffer;
            this.uBuffer = byteBuffer2;
            this.vBuffer = byteBuffer3;
            this.rotation = i7;
            this.renderTimeMs = j;
            this.avsync_type = i8;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VideoFrame{type=");
            sbOooO0o0.append(this.type);
            sbOooO0o0.append(", width=");
            sbOooO0o0.append(this.width);
            sbOooO0o0.append(", height=");
            sbOooO0o0.append(this.height);
            sbOooO0o0.append(", yStride=");
            sbOooO0o0.append(this.yStride);
            sbOooO0o0.append(", uStride=");
            sbOooO0o0.append(this.uStride);
            sbOooO0o0.append(", vStride=");
            sbOooO0o0.append(this.vStride);
            sbOooO0o0.append(", yBuffer=");
            ByteBuffer byteBuffer = this.yBuffer;
            sbOooO0o0.append(byteBuffer == null ? "null" : byteBuffer.toString());
            sbOooO0o0.append(", uBuffer=");
            ByteBuffer byteBuffer2 = this.uBuffer;
            sbOooO0o0.append(byteBuffer2 == null ? "null" : byteBuffer2.toString());
            sbOooO0o0.append(", vBuffer=");
            ByteBuffer byteBuffer3 = this.vBuffer;
            sbOooO0o0.append(byteBuffer3 != null ? byteBuffer3.toString() : "null");
            sbOooO0o0.append(", rotation=");
            sbOooO0o0.append(this.rotation);
            sbOooO0o0.append(", renderTimeMs=");
            sbOooO0o0.append(this.renderTimeMs);
            sbOooO0o0.append(", avsync_type=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.avsync_type, '}');
        }
    }

    public boolean getMirrorApplied() {
        return false;
    }

    public int getObservedFramePosition() {
        return 3;
    }

    public boolean getRotationApplied() {
        return false;
    }

    public int getVideoFormatPreference() {
        return 0;
    }

    public boolean isMultipleChannelFrameWanted() {
        return false;
    }

    public abstract boolean onCaptureVideoFrame(VideoFrame videoFrame);

    public boolean onPreEncodeVideoFrame(VideoFrame videoFrame) {
        return true;
    }

    public abstract boolean onRenderVideoFrame(int i, VideoFrame videoFrame);

    public boolean onRenderVideoFrameEx(String str, int i, VideoFrame videoFrame) {
        return true;
    }
}
