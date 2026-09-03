package io.agora.rtc.gl;

import OooO00o.OooO00o;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import io.agora.rtc.utils.ThreadUtils;
import io.agora.rtc.video.AGraphicBufferEx;
import java.util.concurrent.Callable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private static final boolean VERBOSE = false;
    private AGraphicBufferEx aGraphicBufferEx;
    private final EglBase.Context eglContext;
    private final int height;
    private final int id;
    private int oesTextureId;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private final int sequence;
    private TextureConverter textureConverter;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private final YuvConverter yuvConverter;

    public TextureBufferImpl(EglBase.Context context, int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable, int i4) {
        this.refCountLock = new Object();
        this.eglContext = context;
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.releaseCallback = runnable;
        this.refCount = 1;
        this.oesTextureId = -1;
        this.sequence = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AGraphicBufferEx copyToAGraphicBufferEx() {
        int i;
        int i2;
        if (getType() == VideoFrame.TextureBuffer.Type.OES) {
            i = 36197;
            i2 = 0;
        } else {
            i = 3553;
            i2 = 1;
        }
        if (this.textureConverter == null) {
            this.textureConverter = new TextureConverter(getTextureId(), i, i2);
        }
        if (this.oesTextureId < 0) {
            this.oesTextureId = this.textureConverter.getOneTexture(36197);
        }
        if (this.aGraphicBufferEx == null) {
            this.aGraphicBufferEx = new AGraphicBufferEx(getEglBaseContext(), getWidth(), getHeight(), this.toI420Handler, this.oesTextureId, getTransformMatrix(), this.releaseCallback);
        }
        this.textureConverter.convert(36197, this.oesTextureId);
        return this.aGraphicBufferEx;
    }

    private void releaseAGraphicBufferEx() {
        TextureConverter textureConverter = this.textureConverter;
        if (textureConverter != null) {
            textureConverter.release();
            this.textureConverter = null;
        }
        AGraphicBufferEx aGraphicBufferEx = this.aGraphicBufferEx;
        if (aGraphicBufferEx != null) {
            aGraphicBufferEx.releaseNativeBuffer();
            this.aGraphicBufferEx = null;
        }
    }

    public VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(this.eglContext, i, i2, this.type, this.id, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: io.agora.rtc.gl.TextureBufferImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        }, this.sequence);
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
        return 0L;
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
        return this.sequence;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
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
        return this.yuvConverter;
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
        return false;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && this.releaseCallback != null) {
                releaseAGraphicBufferEx();
                this.releaseCallback.run();
            }
        }
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

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer toAGraphicBufferEx() {
        if (isNativeBufferSupported()) {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.rtc.gl.TextureBufferImpl.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() throws Exception {
                    return TextureBufferImpl.this.copyToAGraphicBufferEx();
                }
            });
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("mini api level 26 is needed, curr: ");
        sbOooO0o0.append(Build.VERSION.SDK_INT);
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<VideoFrame.I420Buffer>() { // from class: io.agora.rtc.gl.TextureBufferImpl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public VideoFrame.I420Buffer call() throws Exception {
                return TextureBufferImpl.this.yuvConverter.convert(TextureBufferImpl.this);
            }
        });
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TextureBufferImpl{eglContext=");
        sbOooO0o0.append(this.eglContext);
        sbOooO0o0.append(", ");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append("x");
        sbOooO0o0.append(this.height);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", seq=");
        sbOooO0o0.append(this.sequence);
        sbOooO0o0.append(", id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", refCount=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.refCount, '}');
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer toTextureBuffer() {
        return this;
    }

    public TextureBufferImpl(EglBase.Context context, int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this(context, i, i2, type, i3, matrix, handler, yuvConverter, runnable, -1);
    }
}
