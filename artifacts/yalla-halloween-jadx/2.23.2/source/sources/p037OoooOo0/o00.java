package p037OoooOo0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOO0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.oo0O;
import com.google.common.util.concurrent.OooOO0O;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o000OO.OooOOO0;
import p003OooO0o0.Oooo000;
import p028Oooo0oO.o0O00o0;
import p030OoooO.OooOo;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f1452OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f1454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1455OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f1456OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1457OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f1458OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo0O f1459OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f1460OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00oOoo f1461OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public SurfaceRequest f1463OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public OooO00o f1465OooOOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f1462OooOO0O = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final HashSet f1464OooOOO = new HashSet();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f1466OooOOOO = false;

    public static class OooO00o extends DeferrableSurface {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public o000Oo0.OooO00o<Surface> f1467OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final o000Oo0.OooO0o f1468OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public DeferrableSurface f1469OooOOOO;

        public OooO00o(int i, @NonNull Size size) {
            super(i, size);
            this.f1468OooOOO0 = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: OoooOo0.o000OO00
                @Override // o0ooOO0.o000Oo0.OooO0OO
                public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
                    o00.OooO00o oooO00o2 = this.f1540OooO0Oo;
                    oooO00o2.f1467OooOOO = oooO00o;
                    return "SettableFuture hashCode: " + oooO00o2.hashCode();
                }
            });
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        public final OooOO0O<Surface> OooO0oO() {
            return this.f1468OooOOO0;
        }

        @MainThread
        public final boolean OooO0oo(@NonNull DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
            boolean z;
            o0Oo0oo.OooO00o();
            deferrableSurface.getClass();
            DeferrableSurface deferrableSurface2 = this.f1469OooOOOO;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            OooOOO0.OooO0o("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
            OooOOO0.OooO0O0(this.f3534OooO0o.equals(deferrableSurface.f3534OooO0o), "The provider's size must match the parent");
            OooOOO0.OooO0O0(this.f3536OooO0oO == deferrableSurface.f3536OooO0oO, "The provider's format must match the parent");
            synchronized (this.f3530OooO00o) {
                z = this.f3532OooO0OO;
            }
            OooOOO0.OooO0o("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
            this.f1469OooOOOO = deferrableSurface;
            OooOo.OooO0o(true, deferrableSurface.OooO0OO(), this.f1467OooOOO, o00oO0o.OooO00o());
            deferrableSurface.OooO0o0();
            OooO0Oo().OooO0oo(new o000OOo0(deferrableSurface, 0), o00oO0o.OooO00o());
            return true;
        }
    }

    public o00(int i, int i2, @NonNull oo0O oo0o, @NonNull Matrix matrix, boolean z, @NonNull Rect rect, int i3, int i4, boolean z2) {
        this.f1457OooO0o = i;
        this.f1453OooO00o = i2;
        this.f1459OooO0oO = oo0o;
        this.f1454OooO0O0 = matrix;
        this.f1455OooO0OO = z;
        this.f1456OooO0Oo = rect;
        this.f1452OooO = i3;
        this.f1460OooO0oo = i4;
        this.f1458OooO0o0 = z2;
        this.f1465OooOOO0 = new OooO00o(i2, oo0o.OooO0Oo());
    }

    @MainThread
    public final void OooO00o(@NonNull Runnable runnable) {
        o0Oo0oo.OooO00o();
        OooO0O0();
        this.f1464OooOOO.add(runnable);
    }

    public final void OooO0O0() {
        OooOOO0.OooO0o("Edge is already closed.", !this.f1466OooOOOO);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [OoooOo0.o000O0Oo] */
    @NonNull
    @MainThread
    public final SurfaceRequest OooO0OO(@NonNull CameraInternal cameraInternal) {
        o0Oo0oo.OooO00o();
        OooO0O0();
        oo0O oo0o = this.f1459OooO0oO;
        SurfaceRequest surfaceRequest = new SurfaceRequest(oo0o.OooO0Oo(), cameraInternal, oo0o.OooO00o(), oo0o.OooO0O0(), new Runnable() { // from class: OoooOo0.o000O0Oo
            @Override // java.lang.Runnable
            public final void run() {
                final o00 o00Var = this.f1537OooO0Oo;
                o00Var.getClass();
                o00oO0o.OooO0OO().execute(new Runnable() { // from class: OoooOo0.o000OO0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00 o00Var2 = o00Var;
                        if (o00Var2.f1466OooOOOO) {
                            return;
                        }
                        o00Var2.OooO0Oo();
                    }
                });
            }
        });
        try {
            o0O00o0 o0o00o1 = surfaceRequest.f3511OooOO0O;
            if (this.f1465OooOOO0.OooO0oo(o0o00o1)) {
                this.f1465OooOOO0.OooO0Oo().OooO0oo(new Oooo000(o0o00o1, 1), o00oO0o.OooO00o());
            }
            this.f1463OooOO0o = surfaceRequest;
            OooO0o0();
            return surfaceRequest;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.OooO0Oo();
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    @MainThread
    public final void OooO0Oo() {
        boolean z;
        boolean z2;
        o0Oo0oo.OooO00o();
        OooO0O0();
        OooO00o oooO00o = this.f1465OooOOO0;
        oooO00o.getClass();
        o0Oo0oo.OooO00o();
        if (oooO00o.f1469OooOOOO == null) {
            synchronized (oooO00o.f3530OooO00o) {
                z2 = oooO00o.f3532OooO0OO;
            }
            if (z2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        this.f1465OooOOO0.OooO00o();
        o00oOoo o00oooo2 = this.f1461OooOO0;
        if (o00oooo2 != null) {
            o00oooo2.OooO00o();
            this.f1461OooOO0 = null;
        }
        this.f1462OooOO0O = false;
        this.f1465OooOOO0 = new OooO00o(this.f1453OooO00o, this.f1459OooO0oO.OooO0Oo());
        Iterator it = this.f1464OooOOO.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void OooO0o(final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: OoooOo0.o000O0
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                o00 o00Var = this.f1524OooO0Oo;
                int i3 = o00Var.f1452OooO;
                int i4 = i;
                boolean z2 = true;
                if (i3 != i4) {
                    o00Var.f1452OooO = i4;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = o00Var.f1460OooO0oo;
                int i6 = i2;
                if (i5 != i6) {
                    o00Var.f1460OooO0oo = i6;
                } else {
                    z2 = z;
                }
                if (z2) {
                    o00Var.OooO0o0();
                }
            }
        };
        if (o0Oo0oo.OooO0O0()) {
            runnable.run();
        } else {
            OooOOO0.OooO0o("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    @MainThread
    public final void OooO0o0() {
        final SurfaceRequest.OooO0o oooO0o;
        Executor executor;
        o0Oo0oo.OooO00o();
        SurfaceRequest surfaceRequest = this.f1463OooOO0o;
        if (surfaceRequest != null) {
            final OooOO0 oooOO1 = new OooOO0(this.f1456OooO0Oo, this.f1452OooO, this.f1460OooO0oo, this.f1455OooO0OO, this.f1454OooO0O0);
            synchronized (surfaceRequest.f3502OooO00o) {
                surfaceRequest.f3512OooOO0o = oooOO1;
                oooO0o = surfaceRequest.f3514OooOOO0;
                executor = surfaceRequest.f3513OooOOO;
            }
            if (oooO0o == null || executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Oooo0oO.o0o0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0o.OooO00o(oooOO1);
                }
            });
        }
    }
}
