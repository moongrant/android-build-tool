package io.agora.rtc;

import androidx.compose.foundation.layout.OooO0O0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
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
            StringBuilder sb = new StringBuilder("VideoFrame{type=");
            sb.append(this.type);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", yStride=");
            sb.append(this.yStride);
            sb.append(", uStride=");
            sb.append(this.uStride);
            sb.append(", vStride=");
            sb.append(this.vStride);
            sb.append(", yBuffer=");
            ByteBuffer byteBuffer = this.yBuffer;
            sb.append(byteBuffer == null ? "null" : byteBuffer.toString());
            sb.append(", uBuffer=");
            ByteBuffer byteBuffer2 = this.uBuffer;
            sb.append(byteBuffer2 == null ? "null" : byteBuffer2.toString());
            sb.append(", vBuffer=");
            ByteBuffer byteBuffer3 = this.vBuffer;
            sb.append(byteBuffer3 != null ? byteBuffer3.toString() : "null");
            sb.append(", rotation=");
            sb.append(this.rotation);
            sb.append(", renderTimeMs=");
            sb.append(this.renderTimeMs);
            sb.append(", avsync_type=");
            return OooO0O0.OooO00o(sb, this.avsync_type, '}');
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
