package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Size f3526OooO = new Size(0, 0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final boolean f3527OooOO0 = p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface");

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final AtomicInteger f3528OooOO0O = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final AtomicInteger f3529OooOO0o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3530OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3531OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3532OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public o0ooOO0.o000Oo0.OooO00o<Void> f3533OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Size f3534OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOO0.o000Oo0.OooO0o f3535OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f3536OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Class<?> f3537OooO0oo;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SurfaceClosedException extends Exception {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final DeferrableSurface f3538OooO0Oo;

        public SurfaceClosedException(@NonNull DeferrableSurface deferrableSurface, @NonNull String str) {
            super(str);
            this.f3538OooO0Oo = deferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException() {
            super("Surface request will not complete.");
        }
    }

    public DeferrableSurface() {
        this(0, f3526OooO);
    }

    public final void OooO00o() {
        o0ooOO0.o000Oo0.OooO00o<Void> oooO00o;
        synchronized (this.f3530OooO00o) {
            if (this.f3532OooO0OO) {
                oooO00o = null;
            } else {
                this.f3532OooO0OO = true;
                if (this.f3531OooO0O0 == 0) {
                    oooO00o = this.f3533OooO0Oo;
                    this.f3533OooO0Oo = null;
                } else {
                    oooO00o = null;
                }
                if (p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface")) {
                    p028Oooo0oO.o00O0O0.OooO00o("DeferrableSurface", "surface closed,  useCount=" + this.f3531OooO0O0 + " closed=true " + this);
                }
            }
        }
        if (oooO00o != null) {
            oooO00o.OooO0O0(null);
        }
    }

    public final void OooO0O0() {
        o0ooOO0.o000Oo0.OooO00o<Void> oooO00o;
        synchronized (this.f3530OooO00o) {
            int i = this.f3531OooO0O0;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.f3531OooO0O0 = i2;
            if (i2 == 0 && this.f3532OooO0OO) {
                oooO00o = this.f3533OooO0Oo;
                this.f3533OooO0Oo = null;
            } else {
                oooO00o = null;
            }
            if (p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface")) {
                p028Oooo0oO.o00O0O0.OooO00o("DeferrableSurface", "use count-1,  useCount=" + this.f3531OooO0O0 + " closed=" + this.f3532OooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + this);
                if (this.f3531OooO0O0 == 0) {
                    OooO0o(f3529OooOO0o.get(), f3528OooOO0O.decrementAndGet(), "Surface no longer in use");
                }
            }
        }
        if (oooO00o != null) {
            oooO00o.OooO0O0(null);
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<Surface> OooO0OO() {
        synchronized (this.f3530OooO00o) {
            if (this.f3532OooO0OO) {
                return new OoooO.o000oOoO.OooO00o(new SurfaceClosedException(this, "DeferrableSurface already closed."));
            }
            return OooO0oO();
        }
    }

    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<Void> OooO0Oo() {
        return p030OoooO.OooOo.OooO0o0(this.f3535OooO0o0);
    }

    public final void OooO0o(int i, int i2, @NonNull String str) {
        if (!f3527OooOO0 && p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface")) {
            p028Oooo0oO.o00O0O0.OooO00o("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        p028Oooo0oO.o00O0O0.OooO00o("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final void OooO0o0() throws SurfaceClosedException {
        synchronized (this.f3530OooO00o) {
            int i = this.f3531OooO0O0;
            if (i == 0 && this.f3532OooO0OO) {
                throw new SurfaceClosedException(this, "Cannot begin use on a closed surface.");
            }
            this.f3531OooO0O0 = i + 1;
            if (p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface")) {
                if (this.f3531OooO0O0 == 1) {
                    OooO0o(f3529OooOO0o.get(), f3528OooOO0O.incrementAndGet(), "New surface in use");
                }
                p028Oooo0oO.o00O0O0.OooO00o("DeferrableSurface", "use count+1, useCount=" + this.f3531OooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream + this);
            }
        }
    }

    @NonNull
    public abstract com.google.common.util.concurrent.OooOO0O<Surface> OooO0oO();

    public DeferrableSurface(int i, @NonNull Size size) {
        this.f3530OooO00o = new Object();
        int i2 = 0;
        this.f3531OooO0O0 = 0;
        this.f3532OooO0OO = false;
        this.f3534OooO0o = size;
        this.f3536OooO0oO = i;
        o0ooOO0.o000Oo0.OooO0o oooO0oOooO00o = p639o0ooOO0.o000Oo0.OooO00o(new p022Oooo00O.o000O00O(this, 1));
        this.f3535OooO0o0 = oooO0oOooO00o;
        if (p028Oooo0oO.o00O0O0.OooO0o0("DeferrableSurface")) {
            OooO0o(f3529OooOO0o.incrementAndGet(), f3528OooOO0O.get(), "Surface created");
            oooO0oOooO00o.f57741OooO0o0.OooO0oo(new o0000Ooo(i2, this, Log.getStackTraceString(new Exception())), p033OoooO0O.o00oO0o.OooO00o());
        }
    }
}
