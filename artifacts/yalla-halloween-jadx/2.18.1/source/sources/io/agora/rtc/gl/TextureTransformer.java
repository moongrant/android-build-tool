package io.agora.rtc.gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import io.agora.rtc.utils.ThreadUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public class TextureTransformer {
    public static final float[] IDENTITY_MATRIX;
    private static final String TAG = "TextureTransformer";
    private final GlRectDrawer drawer;
    private final ConcurrentLinkedQueue<Integer> freeSlots;
    private final int maxBufferSlot;
    private final GlTextureFrameBuffer[] textureFrameBuffer;
    private final Map<Integer, Integer> textureId2SlotMap;
    private final ThreadUtils.ThreadChecker threadChecker;

    static {
        float[] fArr = new float[16];
        IDENTITY_MATRIX = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public TextureTransformer(int i) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.textureId2SlotMap = new HashMap();
        this.freeSlots = new ConcurrentLinkedQueue<>();
        threadChecker.checkIsOnValidThread();
        this.maxBufferSlot = Math.max(i, 1);
        this.textureFrameBuffer = new GlTextureFrameBuffer[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.textureFrameBuffer[i2] = new GlTextureFrameBuffer(6408);
            this.textureId2SlotMap.put(Integer.valueOf(this.textureFrameBuffer[i2].getTextureId()), Integer.valueOf(i2));
            this.freeSlots.offer(Integer.valueOf(i2));
        }
        this.drawer = new GlRectDrawer();
    }

    public int copy(int i, int i2, int i3, int i4) {
        this.threadChecker.checkIsOnValidThread();
        Integer numPoll = this.freeSlots.poll();
        if (numPoll == null) {
            return -1;
        }
        this.textureFrameBuffer[numPoll.intValue()].setSize(i3, i4);
        GLES20.glBindFramebuffer(36160, this.textureFrameBuffer[numPoll.intValue()].getFrameBufferId());
        GlUtil.checkNoGLES2Error("TextureHelper.glBindFramebuffer");
        GLES20.glClear(16384);
        if (i2 == 10) {
            this.drawer.drawRgb(i, IDENTITY_MATRIX, i3, i4, 0, 0, i3, i4);
        } else {
            if (i2 != 11) {
                throw new RuntimeException("Unknown texture type.");
            }
            this.drawer.drawOes(i, IDENTITY_MATRIX, i3, i4, 0, 0, i3, i4);
        }
        GlUtil.checkNoGLES2Error("TextureHelper.draw");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glFlush();
        int textureId = this.textureFrameBuffer[numPoll.intValue()].getTextureId();
        this.freeSlots.offer(this.textureId2SlotMap.get(Integer.valueOf(textureId)));
        return textureId;
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        for (int i = 0; i < this.maxBufferSlot; i++) {
            this.textureFrameBuffer[i].release();
        }
        this.drawer.release();
    }
}
