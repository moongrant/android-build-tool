package io.agora.rtc;

import androidx.compose.foundation.layout.OooO0O0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class VideoEncodedFrame {
    public static final int CODEC_TYPE_E264 = 4;
    public static final int CODEC_TYPE_EVP = 3;
    public static final int CODEC_TYPE_H264 = 2;
    public static final int CODEC_TYPE_VP8 = 1;
    public static final int FRAME_TYPE_B = 5;
    public static final int FRAME_TYPE_BLANK = 0;
    public static final int FRAME_TYPE_DELTA = 4;
    public static final int FRAME_TYPE_KEY = 3;
    public int codecType;
    public int frameType;
    public int height;
    public ByteBuffer imageBuffer;
    public int length;
    public long renderTimeMs;
    public int rotation;
    public int width;

    public VideoEncodedFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, int i6, long j) {
        this.codecType = i;
        this.width = i3;
        this.height = i4;
        this.imageBuffer = byteBuffer;
        this.length = i2;
        this.frameType = i5;
        this.rotation = i6;
        this.renderTimeMs = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoEncodedFrame{codecType=");
        sb.append(this.codecType);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", frameType=");
        sb.append(this.frameType);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", renderTimeMs=");
        sb.append(this.renderTimeMs);
        sb.append(", imageBuffer=");
        sb.append(this.imageBuffer);
        sb.append(", length=");
        return OooO0O0.OooO00o(sb, this.length, '}');
    }
}
