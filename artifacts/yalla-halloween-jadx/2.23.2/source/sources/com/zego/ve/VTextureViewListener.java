package com.zego.ve;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public class VTextureViewListener implements TextureView.SurfaceTextureListener {
    private static final String TAG = "VTextureViewListener";
    private long pthis = 0;
    private TextureView mView = null;
    private final Object lock = new Object();

    private static native int on_surface_texture_changed(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_created(long j, SurfaceTexture surfaceTexture, int i, int i2);

    private static native int on_surface_texture_destroyed(long j, SurfaceTexture surfaceTexture);

    public boolean isAvailable() {
        TextureView textureView = this.mView;
        return textureView != null && textureView.isAvailable();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            if (this.pthis != 0) {
                surfaceTexture.setDefaultBufferSize(i, i2);
                on_surface_texture_created(this.pthis, surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.lock) {
            long j = this.pthis;
            if (j != 0) {
                on_surface_texture_destroyed(j, surfaceTexture);
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.lock) {
            long j = this.pthis;
            if (j != 0) {
                on_surface_texture_changed(j, surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public int setThis(long j, TextureView textureView) {
        synchronized (this.lock) {
            TextureView textureView2 = this.mView;
            if (textureView2 != null && textureView2.getSurfaceTextureListener().equals(this)) {
                this.mView.setSurfaceTextureListener(null);
            }
            if (textureView != null) {
                textureView.setSurfaceTextureListener(this);
            }
            this.pthis = j;
            this.mView = textureView;
        }
        return 0;
    }
}
