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
import com.google.auto.value.AutoValue;
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
import o000OO.OooO00o;
import o000OO.OooOOO0;
import p022Oooo00O.Oooo0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo00;
import p031OoooO0.o0OO00O;
import p033OoooO0O.o0OOO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O000 implements o00O000o, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00 f1546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f1547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public final HandlerThread f1548OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public final Handler f1549OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f1550OooO0oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f1545OooO = new float[16];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f1551OooOO0 = new float[16];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final LinkedHashMap f1552OooOO0O = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f1553OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f1555OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f1554OooOOO = new ArrayList();

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract o00O000.OooO00o<Void> OooO00o();

        @IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
        public abstract int OooO0O0();

        @IntRange(from = ULong.MIN_VALUE, to = 359)
        public abstract int OooO0OO();
    }

    public o000O000(@NonNull final DynamicRange dynamicRange) {
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f1548OooO0o0 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1549OooO0oO = handler;
        this.f1547OooO0o = new o0OOO0o(handler);
        this.f1546OooO0Oo = new o000O00();
        try {
            try {
                o00O000.OooO00o(new o00O000.OooO0OO(this) { // from class: OoooOo0.o0000O0O

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ o000O000 f1514OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                    public final /* synthetic */ o000O0 f1515OooO0o;

                    {
                        o000O0.OooO00o oooO00o = o000O0.f1524OooO00o;
                        this.f1514OooO0Oo = this;
                        this.f1515OooO0o = oooO00o;
                    }

                    @Override // o0ooOO0.o00O000.OooO0OO
                    public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                        final o000O000 o000o001 = this.f1514OooO0Oo;
                        o000o001.getClass();
                        final DynamicRange dynamicRange2 = dynamicRange;
                        final o000O0 o000o0 = this.f1515OooO0o;
                        o000o001.OooO(new Runnable() { // from class: OoooOo0.o000OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                DynamicRange dynamicRange3 = dynamicRange2;
                                o000O0 o000o1 = o000o0;
                                o00O000.OooO00o oooO00o2 = oooO00o;
                                o000O000 o000o002 = o000o001;
                                o000o002.getClass();
                                try {
                                    o000o002.f1546OooO0Oo.OooOO0o(dynamicRange3, o000o1);
                                    oooO00o2.OooO0O0(null);
                                } catch (RuntimeException e) {
                                    oooO00o2.OooO0OO(e);
                                }
                            }
                        }, new Oooo0());
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
            this.f1547OooO0o.execute(new Runnable() { // from class: OoooOo0.o0000O
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f1507OooO0Oo.f1555OooOOO0) {
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

    @Override // p028Oooo0oO.oo0O
    public final void OooO0OO(@NonNull final SurfaceRequest surfaceRequest) {
        if (this.f1550OooO0oo.get()) {
            surfaceRequest.OooO0Oo();
        } else {
            OooO(new Runnable() { // from class: OoooOo0.o0000O00
                @Override // java.lang.Runnable
                public final void run() {
                    final o000O000 o000o001 = this.f1512OooO0Oo;
                    o000o001.f1553OooOO0o++;
                    o000O00 o000o01 = o000o001.f1546OooO0Oo;
                    o000o01.OooO0Oo(true);
                    o000o01.OooO0OO();
                    final SurfaceTexture surfaceTexture = new SurfaceTexture(o000o01.f1532OooO);
                    SurfaceRequest surfaceRequest2 = surfaceRequest;
                    surfaceTexture.setDefaultBufferSize(surfaceRequest2.f3505OooO0O0.getWidth(), surfaceRequest2.f3505OooO0O0.getHeight());
                    final Surface surface = new Surface(surfaceTexture);
                    surfaceRequest2.OooO0O0(surface, o000o001.f1547OooO0o, new OooO00o() { // from class: OoooOo0.o000
                        @Override // o000OO.OooO00o
                        public final void accept(Object obj) {
                            o000O000 o000o002 = o000o001;
                            o000o002.getClass();
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            surfaceTexture2.release();
                            surface.release();
                            o000o002.f1553OooOO0o--;
                            o000o002.OooO0oo();
                        }
                    });
                    surfaceTexture.setOnFrameAvailableListener(o000o001, o000o001.f1549OooO0oO);
                }
            }, new o0000oo(surfaceRequest, 0));
        }
    }

    @Override // p037OoooOo0.o00O000o
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO0o0(@IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) final int i, @IntRange(from = ULong.MIN_VALUE, to = 359) final int i2) {
        return OooOo00.OooO0o0(o00O000.OooO00o(new o00O000.OooO0OO() { // from class: OoooOo0.o00000O
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                final o000O000 o000o001 = this.f1500OooO0Oo;
                o000o001.getClass();
                final o000000 o000000Var = new o000000(i, i2, oooO00o);
                o000o001.OooO(new Runnable() { // from class: OoooOo0.o00000OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000o001.f1554OooOOO.add(o000000Var);
                    }
                }, new Runnable() { // from class: OoooOo0.o0000Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        oooO00o.OooO0OO(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                    }
                });
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    @Override // p028Oooo0oO.oo0O
    public final void OooO0oO(@NonNull final SurfaceOutput surfaceOutput) throws IOException {
        if (this.f1550OooO0oo.get()) {
            surfaceOutput.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: OoooOo0.o00000O0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [OoooOo0.o0000OO0] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                final o000O000 o000o001 = this.f1503OooO0Oo;
                o0OOO0o o0ooo0o2 = o000o001.f1547OooO0o;
                final SurfaceOutput surfaceOutput2 = surfaceOutput;
                Surface surfaceO0000O0 = surfaceOutput2.o0000O0(o0ooo0o2, new OooO00o() { // from class: OoooOo0.o0000OO0
                    @Override // o000OO.OooO00o
                    public final void accept(Object obj) throws IOException {
                        o000O000 o000o002 = o000o001;
                        o000o002.getClass();
                        SurfaceOutput surfaceOutput3 = surfaceOutput2;
                        surfaceOutput3.close();
                        Surface surface = (Surface) o000o002.f1552OooOO0O.remove(surfaceOutput3);
                        if (surface != null) {
                            o000O00 o000o01 = o000o002.f1546OooO0Oo;
                            o000o01.OooO0Oo(true);
                            o000o01.OooO0OO();
                            o000o01.OooOOo(surface, true);
                        }
                    }
                });
                o000O00 o000o01 = o000o001.f1546OooO0Oo;
                o000o01.OooO0Oo(true);
                o000o01.OooO0OO();
                HashMap map = o000o01.f1534OooO0O0;
                if (!map.containsKey(surfaceO0000O0)) {
                    map.put(surfaceO0000O0, o000O00.f1531OooOo00);
                }
                o000o001.f1552OooOO0O.put(surfaceOutput2, surfaceO0000O0);
            }
        };
        Objects.requireNonNull(surfaceOutput);
        OooO(runnable, new Runnable() { // from class: OoooOo0.o0000
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                surfaceOutput.close();
            }
        });
    }

    @WorkerThread
    public final void OooO0oo() {
        if (this.f1555OooOOO0 && this.f1553OooOO0o == 0) {
            LinkedHashMap linkedHashMap = this.f1552OooOO0O;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.f1554OooOOO.iterator();
            while (it2.hasNext()) {
                ((OooO00o) it2.next()).OooO00o().OooO0OO(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            o000O00 o000o01 = this.f1546OooO0Oo;
            if (o000o01.f1533OooO00o.getAndSet(false)) {
                o000o01.OooO0OO();
                o000o01.OooOOo0();
            }
            this.f1548OooO0o0.quit();
        }
    }

    public final void OooOO0(@NonNull Exception exc) {
        ArrayList arrayList = this.f1554OooOOO;
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
        o000O00 o000o01 = this.f1546OooO0Oo;
        o000o01.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeOooO0o.getHeight() * sizeOooO0o.getWidth() * 4);
        OooOOO0.OooO0O0(byteBufferAllocateDirect.capacity() == (sizeOooO0o.getHeight() * sizeOooO0o.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        OooOOO0.OooO0O0(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        o000O00.OooO0O0("glGenTextures");
        int i2 = iArr[0];
        GLES20.glActiveTexture(33985);
        o000O00.OooO0O0("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        o000O00.OooO0O0("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), 0, 6407, 5121, null);
        o000O00.OooO0O0("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        o000O00.OooO0O0("glGenFramebuffers");
        int i3 = iArr2[0];
        GLES20.glBindFramebuffer(36160, i3);
        o000O00.OooO0O0("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        o000O00.OooO0O0("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        o000O00.OooO0O0("glActiveTexture");
        GLES20.glBindTexture(36197, o000o01.f1532OooO);
        o000O00.OooO0O0("glBindTexture");
        o000o01.f1540OooO0oo = null;
        GLES20.glViewport(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight());
        GLES20.glScissor(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight());
        GLES20.glUniformMatrix4fv(o000o01.f1542OooOO0O, 1, false, fArr2, 0);
        o000O00.OooO0O0("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        o000O00.OooO0O0("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        o000O00.OooO0O0("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        o000O00.OooO0O0("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        o000O00.OooO0O0("glDeleteFramebuffers");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, o000o01.f1532OooO);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeOooO0o.getWidth(), sizeOooO0o.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.OooO0OO(bitmapCreateBitmap, byteBufferAllocateDirect, sizeOooO0o.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    @WorkerThread
    public final void OooOO0o(@Nullable Triple<Surface, Size, float[]> triple) {
        ArrayList arrayList = this.f1554OooOOO;
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
        if (this.f1550OooO0oo.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f1545OooO;
        surfaceTexture.getTransformMatrix(fArr);
        Triple<Surface, Size, float[]> triple = null;
        for (Map.Entry entry : this.f1552OooOO0O.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.f1551OooOO0;
            surfaceOutput.Ooooooo(fArr2, fArr);
            if (surfaceOutput.getFormat() == 34) {
                long timestamp = surfaceTexture.getTimestamp();
                o000O00 o000o01 = this.f1546OooO0Oo;
                o000o01.OooO0Oo(true);
                o000o01.OooO0OO();
                HashMap map = o000o01.f1534OooO0O0;
                OooOOO0.OooO0o("The surface is not registered.", map.containsKey(surface));
                o000O00.OooO00o o000000o2 = (o000O00.OooO00o) map.get(surface);
                Objects.requireNonNull(o000000o2);
                if (o000000o2 == o000O00.f1531OooOo00) {
                    try {
                        EGLDisplay eGLDisplay = o000o01.f1536OooO0Oo;
                        EGLConfig eGLConfig = o000o01.f1537OooO0o;
                        Objects.requireNonNull(eGLConfig);
                        EGLSurface eGLSurfaceOooOO0 = o000O00.OooOO0(eGLDisplay, eGLConfig, surface);
                        int[] iArr = new int[1];
                        EGL14.eglQuerySurface(o000o01.f1536OooO0Oo, eGLSurfaceOooOO0, 12375, iArr, 0);
                        int i = iArr[0];
                        int[] iArr2 = new int[1];
                        EGL14.eglQuerySurface(o000o01.f1536OooO0Oo, eGLSurfaceOooOO0, 12374, iArr2, 0);
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
                if (surface != o000o01.f1540OooO0oo) {
                    o000o01.OooOOOo(o000000o2.OooO00o());
                    o000o01.f1540OooO0oo = surface;
                    GLES20.glViewport(0, 0, o000000o2.OooO0OO(), o000000o2.OooO0O0());
                    GLES20.glScissor(0, 0, o000000o2.OooO0OO(), o000000o2.OooO0O0());
                }
                GLES20.glUniformMatrix4fv(o000o01.f1542OooOO0O, 1, false, fArr2, 0);
                o000O00.OooO0O0("glUniformMatrix4fv");
                GLES20.glDrawArrays(5, 0, 4);
                o000O00.OooO0O0("glDrawArrays");
                EGLExt.eglPresentationTimeANDROID(o000o01.f1536OooO0Oo, o000000o2.OooO00o(), timestamp);
                if (!EGL14.eglSwapBuffers(o000o01.f1536OooO0Oo, o000000o2.OooO00o())) {
                    o00O0O0.OooO0oo("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    o000o01.OooOOo(surface, false);
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

    @Override // p037OoooOo0.o00O000o
    public final void release() {
        if (this.f1550OooO0oo.getAndSet(true)) {
            return;
        }
        OooO(new o0000O0(this, 0), new Oooo0());
    }
}
