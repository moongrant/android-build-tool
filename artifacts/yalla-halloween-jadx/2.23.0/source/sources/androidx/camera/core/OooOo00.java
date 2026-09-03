package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.OooOO0O;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o000O0O0;
import java.util.concurrent.Executor;
import p028Oooo0oO.o00OO000;
import p028Oooo0oO.o00OO0OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 implements o000O0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public final o000O0O0 f3481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0O.OooO00o f3482OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Surface f3483OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3478OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3479OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3480OooO0OO = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO000 f3484OooO0oO = new OooOO0O.OooO00o() { // from class: Oooo0oO.o00OO000
        @Override // androidx.camera.core.OooOO0O.OooO00o
        public final void OooO00o(OooOOO0 oooOOO0) {
            OooOO0O.OooO00o oooO00o;
            OooOo00 oooOo00 = this.f1157OooO00o;
            synchronized (oooOo00.f3478OooO00o) {
                int i = oooOo00.f3479OooO0O0 - 1;
                oooOo00.f3479OooO0O0 = i;
                if (oooOo00.f3480OooO0OO && i == 0) {
                    oooOo00.close();
                }
                oooO00o = oooOo00.f3482OooO0o;
            }
            if (oooO00o != null) {
                oooO00o.OooO00o(oooOOO0);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [Oooo0oO.o00OO000] */
    public OooOo00(@NonNull o000O0O0 o000o0o1) {
        this.f3481OooO0Oo = o000o0o1;
        this.f3483OooO0o0 = o000o0o1.getSurface();
    }

    public final void OooO00o() {
        synchronized (this.f3478OooO00o) {
            this.f3480OooO0OO = true;
            this.f3481OooO0Oo.OooO0Oo();
            if (this.f3479OooO0O0 == 0) {
                close();
            }
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0O0() {
        o00OO0OO o00oo0oo;
        synchronized (this.f3478OooO00o) {
            OooOOO0 oooOOO0OooO0O0 = this.f3481OooO0Oo.OooO0O0();
            if (oooOOO0OooO0O0 != null) {
                this.f3479OooO0O0++;
                o00oo0oo = new o00OO0OO(oooOOO0OooO0O0);
                o00oo0oo.OooO00o(this.f3484OooO0oO);
            } else {
                o00oo0oo = null;
            }
        }
        return o00oo0oo;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0OO() {
        int iOooO0OO;
        synchronized (this.f3478OooO00o) {
            iOooO0OO = this.f3481OooO0Oo.OooO0OO();
        }
        return iOooO0OO;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0Oo() {
        synchronized (this.f3478OooO00o) {
            this.f3481OooO0Oo.OooO0Oo();
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0o(@NonNull final o000O0O0.OooO00o oooO00o, @NonNull Executor executor) {
        synchronized (this.f3478OooO00o) {
            this.f3481OooO0Oo.OooO0o(new o000O0O0.OooO00o() { // from class: Oooo0oO.o00OO00O
                @Override // androidx.camera.core.impl.o000O0O0.OooO00o
                public final void OooO00o(o000O0O0 o000o0o1) {
                    OooOo00 oooOo00 = this.f1158OooO00o;
                    oooOo00.getClass();
                    oooO00o.OooO00o(oooOo00);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0o0() {
        int iOooO0o0;
        synchronized (this.f3478OooO00o) {
            iOooO0o0 = this.f3481OooO0Oo.OooO0o0();
        }
        return iOooO0o0;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0oO() {
        o00OO0OO o00oo0oo;
        synchronized (this.f3478OooO00o) {
            OooOOO0 oooOOO0OooO0oO = this.f3481OooO0Oo.OooO0oO();
            if (oooOOO0OooO0oO != null) {
                this.f3479OooO0O0++;
                o00oo0oo = new o00OO0OO(oooOOO0OooO0oO);
                o00oo0oo.OooO00o(this.f3484OooO0oO);
            } else {
                o00oo0oo = null;
            }
        }
        return o00oo0oo;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void close() {
        synchronized (this.f3478OooO00o) {
            Surface surface = this.f3483OooO0o0;
            if (surface != null) {
                surface.release();
            }
            this.f3481OooO0Oo.close();
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getHeight() {
        int height;
        synchronized (this.f3478OooO00o) {
            height = this.f3481OooO0Oo.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f3478OooO00o) {
            surface = this.f3481OooO0Oo.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getWidth() {
        int width;
        synchronized (this.f3478OooO00o) {
            width = this.f3481OooO0Oo.getWidth();
        }
        return width;
    }
}
