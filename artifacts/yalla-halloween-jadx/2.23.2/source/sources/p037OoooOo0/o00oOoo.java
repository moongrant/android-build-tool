package p037OoooOo0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.OooO00o;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.o0OO00O;
import p031OoooO0.o0OOO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00oOoo implements SurfaceOutput {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO00o<SurfaceOutput.Event> f1570OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1572OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Surface f1573OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final Size f1574OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final float[] f1575OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Executor f1576OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1579OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final o000Oo0.OooO0o f1580OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final CameraInternal f1581OooOOOO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f1571OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f1577OooOO0O = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f1578OooOO0o = false;

    public o00oOoo(@NonNull Surface surface, int i, @NonNull Size size, @NonNull Size size2, @NonNull Rect rect, int i2, boolean z, @Nullable CameraInternal cameraInternal) {
        float[] fArr = new float[16];
        this.f1575OooO0oo = fArr;
        float[] fArr2 = new float[16];
        int i3 = 0;
        this.f1573OooO0o0 = surface;
        this.f1572OooO0o = i;
        this.f1574OooO0oO = size;
        Rect rect2 = new Rect(rect);
        this.f1581OooOOOO = cameraInternal;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
        o0OOO0o.OooO00o(fArr, i2);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeOooO0o = o0OO00O.OooO0o(i2, size2);
        android.graphics.Matrix matrixOooO00o = o0OO00O.OooO00o(i2, o0OO00O.OooO0oO(size2), o0OO00O.OooO0oO(sizeOooO0o), z);
        RectF rectF = new RectF(rect2);
        matrixOooO00o.mapRect(rectF);
        float width = rectF.left / sizeOooO0o.getWidth();
        float height = ((sizeOooO0o.getHeight() - rectF.height()) - rectF.top) / sizeOooO0o.getHeight();
        float fWidth = rectF.width() / sizeOooO0o.getWidth();
        float fHeight = rectF.height() / sizeOooO0o.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr2, 0, -0.0f, -0.5f, 0.0f);
        if (cameraInternal != null) {
            OooOOO0.OooO0o("Camera has no transform.", cameraInternal.OooOOOO());
            o0OOO0o.OooO00o(fArr2, cameraInternal.OooO00o().OooO0OO());
            if (cameraInternal.OooOO0()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        this.f1580OooOOO0 = o000Oo0.OooO00o(new o00O0000(this, i3));
    }

    public final void OooO00o() {
        int i;
        Executor executor;
        OooO00o<SurfaceOutput.Event> oooO00o;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f1571OooO0Oo) {
            i = 0;
            if (this.f1576OooOO0 == null || (oooO00o = this.f1570OooO) == null) {
                this.f1577OooOO0O = true;
            } else if (!this.f1578OooOO0o) {
                atomicReference.set(oooO00o);
                executor = this.f1576OooOO0;
                this.f1577OooOO0O = false;
            }
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new o0O0ooO(this, atomicReference, i));
            } catch (RejectedExecutionException e) {
                String strOooO0oO = o00O0O0.OooO0oO("SurfaceOutputImpl");
                if (o00O0O0.OooO0o(3, strOooO0oO)) {
                    Log.d(strOooO0oO, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    @AnyThread
    public final void Ooooooo(@NonNull float[] fArr, @NonNull float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f1575OooO0oo, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @AnyThread
    public final void close() {
        synchronized (this.f1571OooO0Oo) {
            if (!this.f1578OooOO0o) {
                this.f1578OooOO0o = true;
            }
        }
        this.f1579OooOOO.OooO0O0(null);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getFormat() {
        return this.f1572OooO0o;
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public final Size getSize() {
        return this.f1574OooO0oO;
    }

    @Override // androidx.camera.core.SurfaceOutput
    @NonNull
    public final Surface o0000OO0(@NonNull p033OoooO0O.o0OOO0o o0ooo0o2, @NonNull o000OO o000oo2) {
        boolean z;
        synchronized (this.f1571OooO0Oo) {
            this.f1576OooOO0 = o0ooo0o2;
            this.f1570OooO = o000oo2;
            z = this.f1577OooOO0O;
        }
        if (z) {
            OooO00o();
        }
        return this.f1573OooO0o0;
    }
}
