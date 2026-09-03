package io.agora.rtc.video;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import androidx.compose.animation.o000oOoO;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.gl.YuvConverter;
import io.agora.rtc.utils.ThreadUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class AGraphicBufferEx implements VideoFrame.TextureBuffer {
    private final EglBase.Context eglContext;
    private int height;
    private final int id;
    private long mHandler;
    private final Runnable releaseCallback;
    private final Handler toI420Handler;
    private Matrix transformMatrix;
    private int width;
    private final Object refCountLock = new Object();
    private final VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.OES;
    private int refCount = 1;

    public AGraphicBufferEx(EglBase.Context context, int i, int i2, Handler handler, int i3, Matrix matrix, Runnable runnable) {
        this.eglContext = context;
        this.width = i;
        this.height = i2;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.releaseCallback = runnable;
        this.mHandler = initHardwareBuffer(i, i2, i3);
    }

    private native byte[] getBuffer(long j);

    private native int getTextureId(long j);

    private native long initHardwareBuffer(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean isValid(long j);

    private native void releaseHardwareBuffer(long j);

    private native void setBuffer(long j, byte[] bArr);

    public VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        this.transformMatrix = matrix2;
        this.width = i;
        this.height = i2;
        return this;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(i / this.width, (i7 - (i2 + i4)) / i7);
        matrix.preScale(i3 / this.width, i4 / this.height);
        return applyTransformMatrix(matrix, i5, i6);
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer flip(boolean z) {
        return applyTransformMatrix(RendererCommon.convertMatrixToAndroidGraphicsMatrix(z ? RendererCommon.verticalFlipMatrix() : RendererCommon.horizontalFlipMatrix()), this.width, this.height);
    }

    public byte[] getBuffer() {
        return getBuffer(this.mHandler);
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public EglBase.Context getEglBaseContext() {
        return this.eglContext;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getEglType() {
        return this.eglContext.getEglType();
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public float[] getGlTransformMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public long getNativeBuffer() {
        return ((Long) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<Long>() { // from class: io.agora.rtc.video.AGraphicBufferEx.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                return Long.valueOf(AGraphicBufferEx.this.mHandler);
            }
        })).longValue();
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EglBase.Context context = this.eglContext;
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0L;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public Object getRealEglContext() {
        return this.eglContext.getRealEglContext();
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getSequence() {
        return 0;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getTextureId() {
        return getTextureId(this.mHandler);
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getTextureType() {
        return this.type == VideoFrame.TextureBuffer.Type.OES ? 11 : 10;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public YuvConverter getYuvConverter() {
        return null;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public String infoString() {
        return toString();
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public boolean isNativeBufferSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public boolean isValidNativeBuffer() {
        return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<Boolean>() { // from class: io.agora.rtc.video.AGraphicBufferEx.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                AGraphicBufferEx aGraphicBufferEx = AGraphicBufferEx.this;
                return Boolean.valueOf(aGraphicBufferEx.isValid(aGraphicBufferEx.mHandler));
            }
        })).booleanValue();
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && (runnable = this.releaseCallback) != null) {
                runnable.run();
            }
        }
    }

    public void releaseNativeBuffer() {
        releaseHardwareBuffer(this.mHandler);
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer rotate(int i) {
        boolean z = i == 90 || i == 270;
        int i2 = z ? this.height : this.width;
        int i3 = z ? this.width : this.height;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return applyTransformMatrix(matrix, i2, i3);
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(this.mHandler, bArr);
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer toAGraphicBufferEx() {
        return this;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AGraphicBufferEx{eglContext=");
        sb.append(this.eglContext);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", transformMatrix=");
        sb.append(this.transformMatrix);
        sb.append(", toI420Handler=");
        sb.append(this.toI420Handler);
        sb.append(", releaseCallback=");
        sb.append(this.releaseCallback);
        sb.append(", refCountLock=");
        sb.append(this.refCountLock);
        sb.append(", refCount=");
        sb.append(this.refCount);
        sb.append(", mHandler=");
        return o000oOoO.OooO00o(sb, this.mHandler, '}');
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer toTextureBuffer() {
        return this;
    }
}
