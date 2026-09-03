package io.agora.rtc.gl;

import OooO00o.OooO00o;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.rtc.internal.ATrace;
import io.agora.rtc.internal.Logging;
import io.agora.rtc.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public class TextureBufferPool {
    private static final String TAG = "TextureBufferPool";
    private static final boolean VERBOSE = false;
    private static final AtomicInteger nextSeq = new AtomicInteger(0);
    private final GlRectDrawer drawer;
    private int dropCount;
    private final EglBase eglBase;
    private final EglBase.Context eglContext;
    private final int glPixelFormat;
    private final Handler handler;
    private boolean isQuitting;
    private final int keepBufferCnt;
    private final int maxBufferCnt;
    private final String name;
    private final boolean ownGlThread;
    private final boolean shrinkPool;
    private final ArrayList<TextureInfo> textureInfoList;
    private final YuvConverter yuvConverter;

    /* JADX INFO: renamed from: io.agora.rtc.gl.TextureBufferPool$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class TextureInfo {
        public int frameBufferId;
        public int textureId;
        public boolean inUse = false;
        public boolean specified = false;
        public int width = 0;
        public int height = 0;

        public TextureInfo(int i, int i2) {
            this.textureId = i;
            this.frameBufferId = i2;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TextureInfo{textureId=");
            sbOooO0o0.append(this.textureId);
            sbOooO0o0.append(", frameBufferId=");
            sbOooO0o0.append(this.frameBufferId);
            sbOooO0o0.append(", inUse=");
            sbOooO0o0.append(this.inUse);
            sbOooO0o0.append(", specified=");
            sbOooO0o0.append(this.specified);
            sbOooO0o0.append(", width=");
            sbOooO0o0.append(this.width);
            sbOooO0o0.append(", height=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.height, '}');
        }
    }

    private TextureInfo acquireTextureFramebuffer() {
        TextureInfo next;
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.inUse);
        if (next == null) {
            if (this.textureInfoList.size() >= this.maxBufferCnt) {
                int i = this.dropCount + 1;
                this.dropCount = i;
                ATrace.traceCounter("Drop@TexPool", i);
                return null;
            }
            int iGenerateTexture = GlUtil.generateTexture(3553);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            TextureInfo textureInfo = new TextureInfo(iGenerateTexture, iArr[0]);
            this.textureInfoList.add(textureInfo);
            next = textureInfo;
        }
        next.inUse = true;
        return next;
    }

    public static VideoFrame.TextureBuffer.Type agoraFrameTypeToTextureBufferType(int i) {
        return i == 11 ? VideoFrame.TextureBuffer.Type.OES : VideoFrame.TextureBuffer.Type.RGB;
    }

    public static TextureBufferPool create(final String str, final EglBase.Context context, final int i) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TextureBufferPool) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<TextureBufferPool>() { // from class: io.agora.rtc.gl.TextureBufferPool.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public TextureBufferPool call() {
                try {
                    EglBase eglBaseCreate = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                    try {
                        eglBaseCreate.createDummyPbufferSurface();
                        eglBaseCreate.makeCurrent();
                        return new TextureBufferPool(str, i, 6408, handler, true, eglBaseCreate, null);
                    } catch (RuntimeException e) {
                        Logging.e(TextureBufferPool.TAG, str + " failed to create pbufferSurface!!");
                        eglBaseCreate.release();
                        handler.getLooper().quit();
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    Logging.e(TextureBufferPool.TAG, str + " create failure", e2);
                    return null;
                }
            }
        });
    }

    public static TextureBufferPool createWithinGlThread(String str, int i, int i2, Handler handler, EglBase eglBase, YuvConverter yuvConverter) {
        return new TextureBufferPool(str, i, i2, handler, false, eglBase, yuvConverter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrame.TextureBuffer doTextureCopy(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, Matrix matrix, final Runnable runnable) {
        final TextureInfo textureInfoAcquireTextureFramebuffer = acquireTextureFramebuffer();
        if (textureInfoAcquireTextureFramebuffer == null) {
            return null;
        }
        ATrace.beginSection("setupTextureFrameBuffer");
        boolean z = setupTextureFrameBuffer(textureInfoAcquireTextureFramebuffer, i2, i3);
        ATrace.endSection();
        if (!z) {
            releaseTextureFramebuffer(textureInfoAcquireTextureFramebuffer);
            return null;
        }
        GLES20.glBindFramebuffer(36160, textureInfoAcquireTextureFramebuffer.frameBufferId);
        ATrace.beginSection("drawTexture");
        drawTexture(i, type, i2, i3);
        ATrace.endSection();
        ATrace.beginSection("flush");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(0);
        GLES20.glFlush();
        ATrace.endSection();
        final VideoFrame.TextureBuffer[] textureBufferArr = new VideoFrame.TextureBuffer[1];
        textureBufferArr[0] = new TextureBufferImpl(this.eglContext, i2, i3, VideoFrame.TextureBuffer.Type.RGB, textureInfoAcquireTextureFramebuffer.textureId, matrix, this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.rtc.gl.TextureBufferPool.4
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferPool.this.handler.post(new Runnable() { // from class: io.agora.rtc.gl.TextureBufferPool.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        TextureBufferPool.this.releaseTextureFramebuffer(textureInfoAcquireTextureFramebuffer);
                        if (TextureBufferPool.this.isQuitting && !TextureBufferPool.this.anyTextureInUse()) {
                            Logging.i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no buffer in flight");
                            TextureBufferPool.this.release();
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        }, nextSeq.getAndIncrement());
        return textureBufferArr[0];
    }

    private void drawTexture(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3) {
        GLES20.glClear(16384);
        int i4 = AnonymousClass5.$SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i4 == 1) {
            this.drawer.drawOes(i, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3);
        } else {
            if (i4 != 2) {
                throw new RuntimeException("Unknown texture type.");
            }
            this.drawer.drawRgb(i, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3);
        }
        GlUtil.checkNoGLES2Error("TextureBufferPool.drawFrameBuffer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        Logging.i(TAG, this.name + " release()");
        if (!this.textureInfoList.isEmpty()) {
            int size = this.textureInfoList.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                TextureInfo textureInfo = this.textureInfoList.get(i);
                iArr[i] = textureInfo.textureId;
                iArr2[i] = textureInfo.frameBufferId;
            }
            Logging.d(TAG, this.name + ": delete textures " + Arrays.toString(iArr));
            GLES20.glDeleteTextures(size, iArr, 0);
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
            this.textureInfoList.clear();
        }
        this.drawer.release();
        if (this.ownGlThread) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null) {
                eglBase.release();
            }
            this.handler.getLooper().quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseTextureFramebuffer(TextureInfo textureInfo) {
        textureInfo.inUse = false;
        int iIndexOf = this.textureInfoList.indexOf(textureInfo);
        if (iIndexOf < 0) {
            Logging.e(TAG, "texture info not found!");
        } else if (iIndexOf >= this.keepBufferCnt) {
            GLES20.glDeleteTextures(1, new int[]{textureInfo.textureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{textureInfo.frameBufferId}, 0);
            this.textureInfoList.remove(iIndexOf);
        }
    }

    private boolean setupTextureFrameBuffer(TextureInfo textureInfo, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            Logging.w(TAG, "Invalid size: " + i + "x" + i2);
            return false;
        }
        if (textureInfo.specified && textureInfo.width == i && textureInfo.height == i2) {
            return true;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textureInfo.textureId);
        ATrace.beginSection("glTexImage2D");
        int i3 = this.glPixelFormat;
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, 5121, null);
        ATrace.endSection();
        GlUtil.checkNoGLES2Error("TextureBufferPool.glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, textureInfo.frameBufferId);
        ATrace.beginSection("glFramebufferTexture2D");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureId, 0);
        ATrace.endSection();
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        GLES20.glBindFramebuffer(36160, 0);
        if (iGlCheckFramebufferStatus == 36053) {
            textureInfo.specified = true;
            textureInfo.width = i;
            textureInfo.height = i2;
            return true;
        }
        Logging.w(TAG, "Framebuffer not complete, status: " + iGlCheckFramebufferStatus);
        return false;
    }

    public boolean anyTextureInUse() {
        Iterator<TextureInfo> it = this.textureInfoList.iterator();
        while (it.hasNext()) {
            if (it.next().inUse) {
                return true;
            }
        }
        return false;
    }

    public void dispose() {
        Logging.i(TAG, this.name + " dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.rtc.gl.TextureBufferPool.3
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferPool.this.isQuitting = true;
                if (TextureBufferPool.this.anyTextureInUse()) {
                    return;
                }
                Logging.i(TextureBufferPool.TAG, TextureBufferPool.this.name + " ready to release since no more buffer in flight");
                TextureBufferPool.this.release();
            }
        });
    }

    public VideoFrame.TextureBuffer makeTextureBuffer(int i, int i2, int i3, int i4, float[] fArr) {
        return new TextureBufferImpl(this.eglContext, i3, i4, agoraFrameTypeToTextureBufferType(i), i2, fArr == null ? new Matrix() : RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, null, nextSeq.getAndIncrement());
    }

    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer, Runnable runnable) {
        if (textureBuffer == null) {
            return null;
        }
        return textureCopy(textureBuffer.getTextureId(), textureBuffer.getType(), textureBuffer.getWidth(), textureBuffer.getHeight(), textureBuffer.getTransformMatrix(), runnable);
    }

    private TextureBufferPool(String str, int i, int i2, Handler handler, boolean z, EglBase eglBase, YuvConverter yuvConverter) {
        this.shrinkPool = true;
        this.textureInfoList = new ArrayList<>();
        this.isQuitting = false;
        this.dropCount = 0;
        Logging.i(TAG, str + " init buffer pool, ownGlThread: " + z + " cnt: " + i);
        this.name = str;
        int iMax = Math.max(i, 1);
        this.maxBufferCnt = iMax;
        this.keepBufferCnt = Math.min(iMax, 3);
        this.glPixelFormat = i2;
        this.handler = handler;
        this.ownGlThread = z;
        this.eglBase = eglBase;
        this.yuvConverter = yuvConverter == null ? new YuvConverter() : yuvConverter;
        this.eglContext = eglBase.getEglBaseContext();
        this.drawer = new GlRectDrawer();
    }

    public VideoFrame.TextureBuffer textureCopy(final int i, final VideoFrame.TextureBuffer.Type type, final int i2, final int i3, final Matrix matrix, final Runnable runnable) {
        return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.rtc.gl.TextureBufferPool.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public VideoFrame.TextureBuffer call() throws Exception {
                return TextureBufferPool.this.doTextureCopy(i, type, i2, i3, matrix, runnable);
            }
        });
    }

    public static VideoFrame.TextureBuffer makeTextureBuffer(EglBase.Context context, int i, int i2, int i3, int i4, float[] fArr, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        Matrix matrixConvertMatrixToAndroidGraphicsMatrix;
        if (fArr == null) {
            matrixConvertMatrixToAndroidGraphicsMatrix = new Matrix();
        } else {
            matrixConvertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        }
        return new TextureBufferImpl(context == null ? EglBase.getCurrentContext() : context, i3, i4, agoraFrameTypeToTextureBufferType(i), i2, matrixConvertMatrixToAndroidGraphicsMatrix, handler, yuvConverter, runnable, nextSeq.getAndIncrement());
    }
}
