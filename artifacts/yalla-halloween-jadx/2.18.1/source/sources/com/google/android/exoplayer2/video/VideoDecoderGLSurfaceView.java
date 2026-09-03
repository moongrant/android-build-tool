package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import p320o0O0oOoO.o00O0OO;
import p320o0O0oOoO.o00O0OOO;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoderGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O0OO f14909Oooo0o;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public o00O0OOO getVideoDecoderOutputBufferRenderer() {
        return this.f14909Oooo0o;
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        o00O0OO o00o0oo2 = new o00O0OO();
        this.f14909Oooo0o = o00o0oo2;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(o00o0oo2);
        setRenderMode(0);
    }
}
