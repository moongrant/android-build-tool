package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(17)
@UnstableApi
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f6934OooOO0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f6935OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Handler f6936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public EGLDisplay f6937OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int[] f6938OooO0o0 = new int[1];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public EGLContext f6939OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public EGLSurface f6940OooO0oo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f6936OooO0Oo = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6936OooO0Oo.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f6935OooO;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
