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
import androidx.camera.core.impl.o00OO0O0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o000OO.OooOOO0;
import p028Oooo0oO.o0oOO;
import p030OoooO.OooOo00;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f1590OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1591OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f1592OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1593OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f1594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f1596OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0O0 f1597OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f1598OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O000 f1599OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public SurfaceRequest f1601OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public OooO00o f1603OooOOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f1600OooOO0O = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final HashSet f1602OooOOO = new HashSet();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f1604OooOOOO = false;

    public static class OooO00o extends DeferrableSurface {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public o00O000.OooO00o<Surface> f1605OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final o00O000.OooO0o f1606OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public DeferrableSurface f1607OooOOOO;

        public OooO00o(int i, @NonNull Size size) {
            super(i, size);
            this.f1606OooOOO0 = o00O000.OooO00o(new o000OOo0(this));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        public final com.google.common.util.concurrent.OooO00o<Surface> OooO0oO() {
            return this.f1606OooOOO0;
        }

        @MainThread
        public final boolean OooO0oo(@NonNull DeferrableSurface deferrableSurface) throws DeferrableSurface.SurfaceClosedException {
            boolean z;
            o0Oo0oo.OooO00o();
            deferrableSurface.getClass();
            DeferrableSurface deferrableSurface2 = this.f1607OooOOOO;
            int i = 0;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            OooOOO0.OooO0o("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
            OooOOO0.OooO0O0(this.f3536OooO0o.equals(deferrableSurface.f3536OooO0o), "The provider's size must match the parent");
            OooOOO0.OooO0O0(this.f3538OooO0oO == deferrableSurface.f3538OooO0oO, "The provider's format must match the parent");
            synchronized (this.f3532OooO00o) {
                z = this.f3534OooO0OO;
            }
            OooOOO0.OooO0o("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
            this.f1607OooOOOO = deferrableSurface;
            OooOo00.OooO0o(true, deferrableSurface.OooO0OO(), this.f1605OooOOO, o00oO0o.OooO00o());
            deferrableSurface.OooO0o0();
            OooO0Oo().OooO(new o00(deferrableSurface, i), o00oO0o.OooO00o());
            return true;
        }
    }

    public o00O0000(int i, int i2, @NonNull o00OO0O0 o00oo0o1, @NonNull Matrix matrix, boolean z, @NonNull Rect rect, int i3, int i4, boolean z2) {
        this.f1595OooO0o = i;
        this.f1591OooO00o = i2;
        this.f1597OooO0oO = o00oo0o1;
        this.f1592OooO0O0 = matrix;
        this.f1593OooO0OO = z;
        this.f1594OooO0Oo = rect;
        this.f1590OooO = i3;
        this.f1598OooO0oo = i4;
        this.f1596OooO0o0 = z2;
        this.f1603OooOOO0 = new OooO00o(i2, o00oo0o1.OooO0Oo());
    }

    @MainThread
    public final void OooO00o(@NonNull Runnable runnable) {
        o0Oo0oo.OooO00o();
        OooO0O0();
        this.f1602OooOOO.add(runnable);
    }

    public final void OooO0O0() {
        OooOOO0.OooO0o("Edge is already closed.", !this.f1604OooOOOO);
    }

    @NonNull
    @MainThread
    public final SurfaceRequest OooO0OO(@NonNull CameraInternal cameraInternal) {
        o0Oo0oo.OooO00o();
        OooO0O0();
        o00OO0O0 o00oo0o1 = this.f1597OooO0oO;
        int i = 0;
        SurfaceRequest surfaceRequest = new SurfaceRequest(o00oo0o1.OooO0Oo(), cameraInternal, o00oo0o1.OooO00o(), o00oo0o1.OooO0O0(), new o000OO0O(this, i));
        try {
            o0oOO o0ooo2 = surfaceRequest.f3513OooOO0O;
            if (this.f1603OooOOO0.OooO0oo(o0ooo2)) {
                this.f1603OooOOO0.OooO0Oo().OooO(new o000O0O0(o0ooo2, i), o00oO0o.OooO00o());
            }
            this.f1601OooOO0o = surfaceRequest;
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
        OooO00o oooO00o = this.f1603OooOOO0;
        oooO00o.getClass();
        o0Oo0oo.OooO00o();
        if (oooO00o.f1607OooOOOO == null) {
            synchronized (oooO00o.f3532OooO00o) {
                z2 = oooO00o.f3534OooO0OO;
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
        this.f1603OooOOO0.OooO00o();
        o00O000 o00o001 = this.f1599OooOO0;
        if (o00o001 != null) {
            o00o001.OooO00o();
            this.f1599OooOO0 = null;
        }
        this.f1600OooOO0O = false;
        this.f1603OooOOO0 = new OooO00o(this.f1591OooO00o, this.f1597OooO0oO.OooO0Oo());
        Iterator it = this.f1602OooOOO.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void OooO0o(final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: OoooOo0.o000O0Oo
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                o00O0000 o00o0001 = this.f1558OooO0Oo;
                int i3 = o00o0001.f1590OooO;
                int i4 = i;
                boolean z2 = true;
                if (i3 != i4) {
                    o00o0001.f1590OooO = i4;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = o00o0001.f1598OooO0oo;
                int i6 = i2;
                if (i5 != i6) {
                    o00o0001.f1598OooO0oo = i6;
                } else {
                    z2 = z;
                }
                if (z2) {
                    o00o0001.OooO0o0();
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
        SurfaceRequest surfaceRequest = this.f1601OooOO0o;
        if (surfaceRequest != null) {
            final OooOO0 oooOO1 = new OooOO0(this.f1594OooO0Oo, this.f1590OooO, this.f1598OooO0oo, this.f1593OooO0OO, this.f1592OooO0O0);
            synchronized (surfaceRequest.f3504OooO00o) {
                surfaceRequest.f3514OooOO0o = oooOO1;
                oooO0o = surfaceRequest.f3516OooOOO0;
                executor = surfaceRequest.f3515OooOOO;
            }
            if (oooO0o == null || executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Oooo0oO.o00OOOO0
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0o.OooO00o(oooOO1);
                }
            });
        }
    }
}
