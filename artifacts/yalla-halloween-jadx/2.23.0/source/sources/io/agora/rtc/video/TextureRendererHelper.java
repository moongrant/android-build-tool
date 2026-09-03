package io.agora.rtc.video;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.compose.animation.OooO0o;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.GlRectDrawer;
import io.agora.rtc.gl.GlUtil;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.internal.ATrace;
import io.agora.rtc.internal.Logging;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes5.dex */
public class TextureRendererHelper {
    private static String TAG = "TextureRendererHelper";
    private static final boolean VERBOSE = false;
    private EglBase eglBase = null;
    private boolean eglAttached = false;
    private GlRectDrawer drawer = null;
    private int oesTextureId = -1;
    private SurfaceTexture surfaceTexture = null;
    private boolean surfaceTextureRecreated = false;
    private TextureRenderer textureRenderer = null;
    private TextureFrame textureFrame = null;
    private Surface surface = null;
    private int oldWidth = -1;
    private int oldHeight = -1;
    private Object localRealEglContext = null;
    private int localEglType = -1;
    private volatile boolean textureSourceIncoming = false;

    public class TextureFrame {
        public EglBase.Context context;
        public long firstRecvTimestamp;
        public int frameHeight;
        public int frameWidth;
        public boolean isDummy;
        public long renderMs;
        public int rotation;
        public int texId;
        public int textureType;

        public TextureFrame() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TextureFrame{context=");
            sb.append(this.context);
            sb.append(", texId=");
            sb.append(this.texId);
            sb.append(", textureType=");
            sb.append(this.textureType);
            sb.append(", frameWidth=");
            sb.append(this.frameWidth);
            sb.append(", frameHeight=");
            sb.append(this.frameHeight);
            sb.append(", rotation=");
            sb.append(this.rotation);
            sb.append(", renderMs=");
            sb.append(this.renderMs);
            sb.append(", firstRecvTimestamp=");
            sb.append(this.firstRecvTimestamp);
            sb.append(", isDummy=");
            return OooO0o.OooO00o(sb, this.isDummy, '}');
        }
    }

    private void setupSurfaceTexture(GLRendererController gLRendererController) {
        if (this.surfaceTexture != null || gLRendererController == null) {
            return;
        }
        this.oesTextureId = GlUtil.generateTexture(36197, false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.oesTextureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(gLRendererController);
        this.surface = new Surface(this.surfaceTexture);
        this.surfaceTextureRecreated = true;
    }

    public void createProducerResourceIfNeeded(EglBase.Context context) {
        if (this.eglBase == null) {
            try {
                EglBase eglBaseCreate = EglBase.create(context);
                this.eglBase = eglBaseCreate;
                eglBaseCreate.createSurface(this.surface);
            } catch (Exception e) {
                Logging.e(TAG, "got exception when create eglbase:" + e.toString());
            }
            this.drawer = new GlRectDrawer();
        }
    }

    public TextureFrame getTextureFrame() {
        TextureFrame textureFrame = this.textureFrame;
        if (textureFrame != null) {
            textureFrame.texId = this.oesTextureId;
            textureFrame.textureType = 1;
        }
        return textureFrame;
    }

    public boolean isTextureSourceIncoming() {
        return this.textureSourceIncoming;
    }

    public void onDrawFrame(GLRendererController gLRendererController) throws Exception {
        ATrace.beginSection("setupSurfaceTexture");
        setupSurfaceTexture(gLRendererController);
        ATrace.endSection();
        if (useJavaRender()) {
            GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            GLES20.glClear(16640);
        }
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null && this.surface != null) {
            surfaceTexture.updateTexImage();
        }
        if (useJavaRender()) {
            if (this.textureRenderer == null) {
                this.textureRenderer = new TextureRenderer(true);
            }
            this.textureRenderer.draw(this.oesTextureId);
        }
    }

    public void onFrameAvailable(GLRendererController gLRendererController) {
        if (gLRendererController != null) {
            gLRendererController.ReDraw();
        }
    }

    public void onSurfaceChanged(GLRendererController gLRendererController, int i, int i2) {
        String str = TAG;
        StringBuilder sbOooO00o = o00000.OooO00o("onSurfaceChanged, w: ", i, " h: ", i2, " this: ");
        sbOooO00o.append(hashCode());
        Logging.i(str, sbOooO00o.toString());
        releaseSurfaceTexture();
        this.oldWidth = -1;
        this.oldHeight = -1;
        setupSurfaceTexture(gLRendererController);
        if (useJavaRender()) {
            GLES20.glViewport(0, 0, i, i2);
        }
    }

    public void onTextureFrameArrived(VideoFrame.TextureBuffer textureBuffer, int i, long j, long j2, boolean z) {
        if (textureBuffer == null) {
            Logging.e(TAG, "texture buffer is null.");
            return;
        }
        textureBuffer.retain();
        if (this.surfaceTexture == null || this.surface == null) {
            Logging.w(TAG, "frame is ready, but the gl renderer thread is not ready yet.");
            releaseProducerResourceIfNotYet();
            textureBuffer.release();
            return;
        }
        if (!textureBuffer.getRealEglContext().equals(this.localRealEglContext) || textureBuffer.getEglType() != this.localEglType) {
            this.localRealEglContext = textureBuffer.getRealEglContext();
            this.localEglType = textureBuffer.getEglType();
            releaseProducerResourceIfNotYet();
        }
        if (this.oldWidth != textureBuffer.getWidth() || this.oldHeight != textureBuffer.getHeight()) {
            this.oldWidth = textureBuffer.getWidth();
            this.oldHeight = textureBuffer.getHeight();
            this.surfaceTexture.setDefaultBufferSize(textureBuffer.getWidth(), textureBuffer.getHeight());
            releaseProducerResourceIfNotYet();
        }
        if (this.surfaceTextureRecreated) {
            releaseProducerResourceIfNotYet();
            this.surfaceTextureRecreated = false;
        }
        ATrace.beginSection("prepare@render");
        createProducerResourceIfNeeded(textureBuffer.getEglBaseContext());
        ATrace.endSection();
        if (this.textureFrame == null) {
            this.textureFrame = new TextureFrame();
        }
        int textureId = textureBuffer.getTextureId();
        VideoFrame.TextureBuffer.Type type = textureBuffer.getType();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        float[] fArrConvertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
        this.textureFrame.frameWidth = textureBuffer.getWidth();
        this.textureFrame.frameHeight = textureBuffer.getHeight();
        TextureFrame textureFrame = this.textureFrame;
        textureFrame.rotation = i;
        textureFrame.renderMs = j;
        textureFrame.firstRecvTimestamp = j2;
        textureFrame.isDummy = z;
        try {
            ATrace.beginSection("makeCurrent@render");
            if (!this.eglAttached) {
                Logging.i(TAG, "attaching egl context, this: " + hashCode() + ", thread id: " + Thread.currentThread().getId());
                this.eglBase.makeCurrent();
                this.eglAttached = true;
            }
            ATrace.endSection();
            ATrace.beginSection("glClear@render");
            GLES20.glClear(16384);
            ATrace.endSection();
            ATrace.beginSection("draw@render");
            if (type == VideoFrame.TextureBuffer.Type.RGB) {
                this.drawer.drawRgb(textureId, fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height);
            } else {
                this.drawer.drawOes(textureId, fArrConvertMatrixFromAndroidGraphicsMatrix, width, height, 0, 0, width, height);
            }
            ATrace.endSection();
            ATrace.beginSection("swapBuffers@render");
            this.eglBase.swapBuffers();
            ATrace.endSection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        textureBuffer.release();
    }

    public void releaseProducerResourceIfNotYet() {
        if (this.eglBase == null) {
            return;
        }
        try {
            Logging.i(TAG, "release gl resource, this: " + hashCode() + ", thread id: " + Thread.currentThread().getId());
            if (!this.eglAttached) {
                this.eglBase.makeCurrent();
            }
            GlRectDrawer glRectDrawer = this.drawer;
            if (glRectDrawer != null) {
                glRectDrawer.release();
                this.drawer = null;
            }
            this.eglBase.release();
            this.eglBase = null;
            this.eglAttached = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void releaseSurfaceTexture() {
        Logging.d(TAG, "release surface texture, this: " + hashCode());
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.surfaceTexture = null;
        }
        int i = this.oesTextureId;
        if (i >= 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.oesTextureId = -1;
        }
    }

    public void setTextureSourceIncoming(boolean z) {
        this.textureSourceIncoming = z;
    }

    public boolean useJavaRender() {
        return false;
    }
}
