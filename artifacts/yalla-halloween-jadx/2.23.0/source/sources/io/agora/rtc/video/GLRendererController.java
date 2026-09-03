package io.agora.rtc.video;

import android.graphics.SurfaceTexture;

/* JADX INFO: loaded from: classes5.dex */
public interface GLRendererController extends SurfaceTexture.OnFrameAvailableListener {
    int GetAPILevel();

    void ReDraw();
}
