package p086o000OooO;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f28408OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f28409OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f28410OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @IdRes
    public final int f28411OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f28412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f28413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f28414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f28415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f28416OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f28417OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f28419OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f28420OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f28422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f28423OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f28424OooO0o0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @IdRes
        public int f28421OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f28425OooO0oO = -1;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f28426OooO0oo = -1;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f28418OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @AnimRes
        @AnimatorRes
        public int f28427OooOO0 = -1;

        @NotNull
        public final o00000 OooO00o() {
            String str = this.f28422OooO0Oo;
            if (str == null) {
                return new o00000(this.f28419OooO00o, this.f28420OooO0O0, this.f28421OooO0OO, this.f28424OooO0o0, this.f28423OooO0o, this.f28425OooO0oO, this.f28426OooO0oo, this.f28418OooO, this.f28427OooOO0);
            }
            o00000 o00000Var = new o00000(this.f28419OooO00o, this.f28420OooO0O0, NavDestination.f8629OoooOO0.OooO00o(str).hashCode(), this.f28424OooO0o0, this.f28423OooO0o, this.f28425OooO0oO, this.f28426OooO0oo, this.f28418OooO, this.f28427OooOO0);
            o00000Var.f28417OooOO0 = str;
            return o00000Var;
        }
    }

    public o00000(boolean z, boolean z2, @IdRes int i, boolean z3, boolean z4, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5) {
        this.f28409OooO00o = z;
        this.f28410OooO0O0 = z2;
        this.f28411OooO0OO = i;
        this.f28412OooO0Oo = z3;
        this.f28414OooO0o0 = z4;
        this.f28413OooO0o = i2;
        this.f28415OooO0oO = i3;
        this.f28416OooO0oo = i4;
        this.f28408OooO = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(o00000.class, obj.getClass())) {
            return false;
        }
        o00000 o00000Var = (o00000) obj;
        return this.f28409OooO00o == o00000Var.f28409OooO00o && this.f28410OooO0O0 == o00000Var.f28410OooO0O0 && this.f28411OooO0OO == o00000Var.f28411OooO0OO && Intrinsics.areEqual(this.f28417OooOO0, o00000Var.f28417OooOO0) && this.f28412OooO0Oo == o00000Var.f28412OooO0Oo && this.f28414OooO0o0 == o00000Var.f28414OooO0o0 && this.f28413OooO0o == o00000Var.f28413OooO0o && this.f28415OooO0oO == o00000Var.f28415OooO0oO && this.f28416OooO0oo == o00000Var.f28416OooO0oo && this.f28408OooO == o00000Var.f28408OooO;
    }

    public final int hashCode() {
        int i = (((((this.f28409OooO00o ? 1 : 0) * 31) + (this.f28410OooO0O0 ? 1 : 0)) * 31) + this.f28411OooO0OO) * 31;
        String str = this.f28417OooOO0;
        return ((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + (this.f28412OooO0Oo ? 1 : 0)) * 31) + (this.f28414OooO0o0 ? 1 : 0)) * 31) + this.f28413OooO0o) * 31) + this.f28415OooO0oO) * 31) + this.f28416OooO0oo) * 31) + this.f28408OooO;
    }
}
