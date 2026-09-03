package p037OoooOo0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.media3.session.Oooo0;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.OooOO0O;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import kotlin.ULong;
import o000OO.OooOOO0;
import p022Oooo00O.o0O0OOO0;
import p022Oooo00O.o0O0oo0o;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo;
import p031OoooO0.o0OO00O;
import p033OoooO0O.o0OOO0o;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000 implements o00O000, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0 f1474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f1475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public final HandlerThread f1476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public final Handler f1477OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f1478OooO0oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f1473OooO = new float[16];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f1479OooOO0 = new float[16];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final LinkedHashMap f1480OooOO0O = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f1481OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f1483OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f1482OooOOO = new ArrayList();

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract o000O0.OooO00o<Void> OooO00o();

        @IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
        public abstract int OooO0O0();

        @IntRange(from = ULong.MIN_VALUE, to = 359)
        public abstract int OooO0OO();
    }

    public o000(@NonNull final DynamicRange dynamicRange) {
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f1476OooO0o0 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1477OooO0oO = handler;
        this.f1475OooO0o = new o0OOO0o(handler);
        this.f1474OooO0Oo = new o000Oo0();
        try {
            try {
                o000O0.OooO00o(new o000O0.OooO0OO(this) { // from class: OoooOo0.o0000O00

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ o000 f1511OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                    public final /* synthetic */ o000O00O f1512OooO0o;

                    {
                        o000O00O.OooO00o oooO00o = o000O00O.f1531OooO00o;
                        this.f1511OooO0Oo = this;
                        this.f1512OooO0o = oooO00o;
                    }

                    @Override // o0ooOO0.o000O0.OooO0OO
                    public final Object OooO0O0(o000O0.OooO00o oooO00o) {
                        DynamicRange dynamicRange2 = dynamicRange;
                        o000O00O o000o00o2 = this.f1512OooO0o;
                        o000 o000Var = this.f1511OooO0Oo;
                        o000Var.getClass();
                        o000Var.OooO(new o0000oo(0, o000Var, dynamicRange2, o000o00o2, oooO00o), new o0000O0O(0));
                        return "Init GlRenderer";
                    }
                }).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void OooO(@NonNull final Runnable runnable, @NonNull final Runnable runnable2) {
        try {
            this.f1475OooO0o.execute(new Runnable() { // from class: OoooOo0.o0000O0
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f1508OooO0Oo.f1483OooOOO0) {
                        runnable2.run();
                    } else {
                        runnable.run();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            o00O0O0.OooO("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // p028Oooo0oO.o00OO0OO
    public final void OooO0OO(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.f1478OooO0oo.get()) {
            surfaceRequest.OooO0Oo();
        } else {
            OooO(new o0000Ooo(0, this, surfaceRequest), new Runnable() { // from class: OoooOo0.o0000
                @Override // java.lang.Runnable
                public final void run() {
                    surfaceRequest.OooO0Oo();
                }
            });
        }
    }

    @Override // p037OoooOo0.o00O000
    @NonNull
    public final OooOO0O<Void> OooO0Oo(@IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) final int i, @IntRange(from = ULong.MIN_VALUE, to = 359) final int i2) {
        return OooOo.OooO0o0(o000O0.OooO00o(new o000O0.OooO0OO() { // from class: OoooOo0.o0000OO0
            @Override // o0ooOO0.o000O0.OooO0OO
            public final Object OooO0O0(final o000O0.OooO00o oooO00o) {
                o000 o000Var = this.f1515OooO0Oo;
                o000Var.getClass();
                final int i3 = 0;
                o000Var.OooO(new o00000O(i3, o000Var, new o000000(i, i2, oooO00o)), new Runnable() { // from class: OoooOo0.o00000OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        Object obj = oooO00o;
                        switch (i4) {
                            case 0:
                                ((o000O0.OooO00o) obj).OooO0OO(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                                break;
                            default:
                                ((Oooo0) obj).release();
                                break;
                        }
                    }
                });
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    @Override // p028Oooo0oO.o00OO0OO
    public final void OooO0o(@NonNull final SurfaceOutput surfaceOutput) throws IOException {
        if (this.f1478OooO0oo.get()) {
            surfaceOutput.close();
            return;
        }
        o0O0oo0o o0o0oo0o = new o0O0oo0o(1, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        OooO(o0o0oo0o, new Runnable() { // from class: OoooOo0.o00000O0
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                surfaceOutput.close();
            }
        });
    }

    @WorkerThread
    public final void OooO0oo() {
        if (this.f1483OooOOO0 && this.f1481OooOO0o == 0) {
            LinkedHashMap linkedHashMap = this.f1480OooOO0O;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.f1482OooOOO.iterator();
            while (it2.hasNext()) {
                ((OooO00o) it2.next()).OooO00o().OooO0OO(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            o000Oo0 o000oo1 = this.f1474OooO0Oo;
            if (o000oo1.f1555OooO00o.getAndSet(false)) {
                o000oo1.OooO0OO();
                o000oo1.OooOOo0();
            }
            this.f1476OooO0o0.quit();
        }
    }

    public final void OooOO0(@NonNull Exception exc) {
        ArrayList arrayList = this.f1482OooOOO;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).OooO00o().OooO0OO(exc);
        }
        arrayList.clear();
    }

    @NonNull
    public final Bitmap OooOO0O(@NonNull Size size, @NonNull float[] fArr, int i) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr2, 0, -0.0f, -0.5f, 0.0f);
        p031OoooO0.o0OOO0o.OooO00o(fArr2, i);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        Size sizeOooO0o = o0OO00O.OooO0o(i, size);
        o000Oo0 o000oo1 = this.f1474OooO0Oo;
        o000oo1.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeOooO0o.getHeight() * sizeOooO0o.getWidth() * 4);
        OooOOO0.OooO0O0(byteBufferAllocateDirect.capacity() == (sizeOooO0o.getHeight() * sizeOooO0o.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        OooOOO0.OooO0O0(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        o000Oo0.OooO0O0("glGenTextures");
        int i2 = iArr[0];
        GLES20.glActiveTexture(33985);
        o000Oo0.OooO0O0("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        o000Oo0.OooO0O0("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), 0, 6407, 5121, null);
        o000Oo0.OooO0O0("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        o000Oo0.OooO0O0("glGenFramebuffers");
        int i3 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i3);
        o000Oo0.OooO0O0("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        o000Oo0.OooO0O0("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        o000Oo0.OooO0O0("glActiveTexture");
        GLES20.glBindTexture(36197, o000oo1.f1554OooO);
        o000Oo0.OooO0O0("glBindTexture");
        o000oo1.f1562OooO0oo = null;
        GLES20.glViewport(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight());
        GLES20.glScissor(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight());
        GLES20.glUniformMatrix4fv(o000oo1.f1564OooOO0O, 1, false, fArr2, 0);
        o000Oo0.OooO0O0("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        o000Oo0.OooO0O0("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        o000Oo0.OooO0O0("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        o000Oo0.OooO0O0("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        o000Oo0.OooO0O0("glDeleteFramebuffers");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, o000oo1.f1554OooO);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.OooO0OO(bitmapCreateBitmap, byteBufferAllocateDirect, sizeOooO0o.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    @WorkerThread
    public final void OooOO0o(@Nullable Triple<Surface, Size, float[]> triple) {
        ArrayList arrayList = this.f1482OooOOO;
        if (arrayList.isEmpty()) {
            return;
        }
        if (triple == null) {
            OooOO0(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int iOooO0OO = -1;
                int iOooO0O0 = -1;
                Bitmap bitmapOooOO0O = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    OooO00o oooO00o = (OooO00o) it.next();
                    if (iOooO0OO != oooO00o.OooO0OO() || bitmapOooOO0O == null) {
                        iOooO0OO = oooO00o.OooO0OO();
                        if (bitmapOooOO0O != null) {
                            bitmapOooOO0O.recycle();
                        }
                        bitmapOooOO0O = OooOO0O(triple.getSecond(), triple.getThird(), iOooO0OO);
                        iOooO0O0 = -1;
                    }
                    if (iOooO0O0 != oooO00o.OooO0O0()) {
                        byteArrayOutputStream.reset();
                        iOooO0O0 = oooO00o.OooO0O0();
                        bitmapOooOO0O.compress(Bitmap.CompressFormat.JPEG, iOooO0O0, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface first = triple.getFirst();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.OooO0Oo(byteArray, first);
                    oooO00o.OooO00o().OooO0O0(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            OooOO0(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@NonNull SurfaceTexture surfaceTexture) {
        if (this.f1478OooO0oo.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f1473OooO;
        surfaceTexture.getTransformMatrix(fArr);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry entry : this.f1480OooOO0O.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.f1479OooOO0;
            surfaceOutput.Ooooooo(fArr2, fArr);
            if (surfaceOutput.getFormat() == 34) {
                long timestamp = surfaceTexture.getTimestamp();
                o000Oo0 o000oo1 = this.f1474OooO0Oo;
                o000oo1.OooO0Oo(true);
                o000oo1.OooO0OO();
                HashMap map = o000oo1.f1556OooO0O0;
                OooOOO0.OooO0o("The surface is not registered.", map.containsKey(surface));
                o000Oo0.OooO00o o000000o2 = (o000Oo0.OooO00o) map.get(surface);
                Objects.requireNonNull(o000000o2);
                if (o000000o2 == o000Oo0.f1553OooOo00) {
                    try {
                        EGLDisplay eGLDisplay = o000oo1.f1558OooO0Oo;
                        EGLConfig eGLConfig = o000oo1.f1559OooO0o;
                        Objects.requireNonNull(eGLConfig);
                        EGLSurface eGLSurfaceOooOO0 = o000Oo0.OooOO0(eGLDisplay, eGLConfig, surface);
                        int[] iArr = new int[1];
                        EGL14.eglQuerySurface(o000oo1.f1558OooO0Oo, eGLSurfaceOooOO0, 12375, iArr, 0);
                        int i = iArr[0];
                        int[] iArr2 = new int[1];
                        EGL14.eglQuerySurface(o000oo1.f1558OooO0Oo, eGLSurfaceOooOO0, 12374, iArr2, 0);
                        Size size = new Size(i, iArr2[0]);
                        o000000o2 = new o000000O(eGLSurfaceOooOO0, size.getWidth(), size.getHeight());
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        o00O0O0.OooO("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                        o000000o2 = null;
                    }
                    if (o000000o2 != null) {
                        map.put(surface, o000000o2);
                    }
                } else {
                    fArr = fArr;
                }
                if (surface != o000oo1.f1562OooO0oo) {
                    o000oo1.OooOOOo(o000000o2.OooO00o());
                    o000oo1.f1562OooO0oo = surface;
                    GLES20.glViewport(0, 0, o000000o2.OooO0OO(), o000000o2.OooO0O0());
                    GLES20.glScissor(0, 0, o000000o2.OooO0OO(), o000000o2.OooO0O0());
                }
                GLES20.glUniformMatrix4fv(o000oo1.f1564OooOO0O, 1, false, fArr2, 0);
                o000Oo0.OooO0O0("glUniformMatrix4fv");
                GLES20.glDrawArrays(5, 0, 4);
                o000Oo0.OooO0O0("glDrawArrays");
                EGLExt.eglPresentationTimeANDROID(o000oo1.f1558OooO0Oo, o000000o2.OooO00o(), timestamp);
                if (!EGL14.eglSwapBuffers(o000oo1.f1558OooO0Oo, o000000o2.OooO00o())) {
                    o00O0O0.OooO0oo("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    o000oo1.OooOOo(surface, false);
                }
            } else {
                fArr = fArr;
                OooOOO0.OooO0o("Unsupported format: " + surfaceOutput.getFormat(), surfaceOutput.getFormat() == 256);
                OooOOO0.OooO0o("Only one JPEG output is supported.", triple == null);
                triple = new Triple<>(surface, surfaceOutput.getSize(), (float[]) fArr2.clone());
            }
            fArr = fArr;
        }
        try {
            OooOO0o(triple);
        } catch (RuntimeException e2) {
            OooOO0(e2);
        }
    }

    @Override // p037OoooOo0.o00O000
    public final void release() {
        if (this.f1478OooO0oo.getAndSet(true)) {
            return;
        }
        OooO(new o0O0OOO0(this, 1), new o0000O0O(0));
    }
}
