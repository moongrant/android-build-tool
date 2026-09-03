package io.agora.rtc.mediaio;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLException;
import android.support.v4.media.OooO00o;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class VideoFrameConsumerImpl implements IVideoFrameConsumer {
    private long mCaptureHandle;

    public VideoFrameConsumerImpl(long j) {
        this.mCaptureHandle = j;
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        int i5;
        int i6;
        if (i == 8 || i == 3 || i == 1) {
            i5 = (((i2 + 1) >> 1) * ((i3 + 1) >> 1) * 2) + (i2 * i3);
        } else {
            i5 = (i == 4 || i == 2 || i == 7) ? 4 * i2 * i3 : -1;
        }
        if (i4 % 90 != 0) {
            Log.e("IVideoFrameConsumer", "consumeByteArrayFrame rotation is not times of 90, set rotation to 0!");
            i6 = 0;
        } else {
            i6 = i4;
        }
        if (i5 != 0 && (i5 <= 0 || bArr.length >= i5)) {
            provideByteArrayFrame(this.mCaptureHandle, bArr, i, i2, i3, i6, j);
            return;
        }
        Log.e("IVideoFrameConsumer", "The size of consumeByteArrayFrame is illegal, format " + i);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        int i5;
        if (i4 % 90 != 0) {
            Log.e("IVideoFrameConsumer", "consumeByteArrayFrame rotation is not times of 90, set rotation to 0!");
            i5 = 0;
        } else {
            i5 = i4;
        }
        provideByteBufferFrame(this.mCaptureHandle, byteBuffer, i, i2, i3, i5, j);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        int i6;
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new GLException(iEglGetError, OooO00o.OooO00o("eglError: ", iEglGetError));
        }
        if (i5 % 90 != 0) {
            Log.e("IVideoFrameConsumer", "consumeByteArrayFrame rotation is not times of 90, set rotation to 0!");
            i6 = 0;
        } else {
            i6 = i5;
        }
        provideTextureFrame(this.mCaptureHandle, eGLContextEglGetCurrentContext, i, i2, i3, i4, i6, j, fArr);
    }

    public native void provideByteArrayFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2);

    public native void provideByteBufferFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j2);

    public native void provideTextureFrame(long j, Object obj, int i, int i2, int i3, int i4, int i5, long j2, float[] fArr);
}
