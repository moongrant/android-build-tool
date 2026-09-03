package io.agora.rtc;

import OooO00o.OooO00o;
import java.nio.ByteBuffer;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("VideoEncodedFrame{codecType=");
        sbOooO0o0.append(this.codecType);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", height=");
        sbOooO0o0.append(this.height);
        sbOooO0o0.append(", frameType=");
        sbOooO0o0.append(this.frameType);
        sbOooO0o0.append(", rotation=");
        sbOooO0o0.append(this.rotation);
        sbOooO0o0.append(", renderTimeMs=");
        sbOooO0o0.append(this.renderTimeMs);
        sbOooO0o0.append(", imageBuffer=");
        sbOooO0o0.append(this.imageBuffer);
        sbOooO0o0.append(", length=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.length, '}');
    }
}
