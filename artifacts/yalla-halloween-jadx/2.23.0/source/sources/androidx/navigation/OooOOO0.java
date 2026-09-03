package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6902OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f6903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f6904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @IdRes
    public final int f6905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f6906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f6908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f6910OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f6911OooO00o = -1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f6912OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f6913OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f6914OooO0Oo = -1;
    }

    public OooOOO0(boolean z, boolean z2, @IdRes int i, boolean z3, boolean z4, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5) {
        this.f6903OooO00o = z;
        this.f6904OooO0O0 = z2;
        this.f6905OooO0OO = i;
        this.f6906OooO0Oo = z3;
        this.f6908OooO0o0 = z4;
        this.f6907OooO0o = i2;
        this.f6909OooO0oO = i3;
        this.f6910OooO0oo = i4;
        this.f6902OooO = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(OooOOO0.class, obj.getClass())) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (this.f6903OooO00o == oooOOO0.f6903OooO00o && this.f6904OooO0O0 == oooOOO0.f6904OooO0O0 && this.f6905OooO0OO == oooOOO0.f6905OooO0OO) {
            oooOOO0.getClass();
            if (Intrinsics.areEqual((Object) null, (Object) null) && this.f6906OooO0Oo == oooOOO0.f6906OooO0Oo && this.f6908OooO0o0 == oooOOO0.f6908OooO0o0 && this.f6907OooO0o == oooOOO0.f6907OooO0o && this.f6909OooO0oO == oooOOO0.f6909OooO0oO && this.f6910OooO0oo == oooOOO0.f6910OooO0oo && this.f6902OooO == oooOOO0.f6902OooO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f6903OooO00o ? 1 : 0) * 31) + (this.f6904OooO0O0 ? 1 : 0)) * 31) + this.f6905OooO0OO) * 31) + 0) * 31) + (this.f6906OooO0Oo ? 1 : 0)) * 31) + (this.f6908OooO0o0 ? 1 : 0)) * 31) + this.f6907OooO0o) * 31) + this.f6909OooO0oO) * 31) + this.f6910OooO0oo) * 31) + this.f6902OooO;
    }
}
