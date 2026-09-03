package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f9996OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f9997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f9998OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @IdRes
    public final int f9999OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f10000OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f10001OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f10002OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f10003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f10004OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f10005OooO00o = -1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f10006OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f10007OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f10008OooO0Oo = -1;
    }

    public OooOOO0(boolean z, boolean z2, @IdRes int i, boolean z3, boolean z4, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5) {
        this.f9997OooO00o = z;
        this.f9998OooO0O0 = z2;
        this.f9999OooO0OO = i;
        this.f10000OooO0Oo = z3;
        this.f10002OooO0o0 = z4;
        this.f10001OooO0o = i2;
        this.f10003OooO0oO = i3;
        this.f10004OooO0oo = i4;
        this.f9996OooO = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(OooOOO0.class, obj.getClass())) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (this.f9997OooO00o == oooOOO0.f9997OooO00o && this.f9998OooO0O0 == oooOOO0.f9998OooO0O0 && this.f9999OooO0OO == oooOOO0.f9999OooO0OO) {
            oooOOO0.getClass();
            if (Intrinsics.areEqual((Object) null, (Object) null) && this.f10000OooO0Oo == oooOOO0.f10000OooO0Oo && this.f10002OooO0o0 == oooOOO0.f10002OooO0o0 && this.f10001OooO0o == oooOOO0.f10001OooO0o && this.f10003OooO0oO == oooOOO0.f10003OooO0oO && this.f10004OooO0oo == oooOOO0.f10004OooO0oo && this.f9996OooO == oooOOO0.f9996OooO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f9997OooO00o ? 1 : 0) * 31) + (this.f9998OooO0O0 ? 1 : 0)) * 31) + this.f9999OooO0OO) * 31) + 0) * 31) + (this.f10000OooO0Oo ? 1 : 0)) * 31) + (this.f10002OooO0o0 ? 1 : 0)) * 31) + this.f10001OooO0o) * 31) + this.f10003OooO0oO) * 31) + this.f10004OooO0oo) * 31) + this.f9996OooO;
    }
}
