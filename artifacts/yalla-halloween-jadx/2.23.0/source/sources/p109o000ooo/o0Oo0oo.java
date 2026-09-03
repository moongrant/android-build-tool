package p109o000ooo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.CachePolicy;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p111o000oooO.o00O00;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f35862OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f35864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ColorSpace f35865OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O00 f35866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f35867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Scale f35868OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f35869OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f35870OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final oo0O f35871OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o000OOo f35872OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o0OO00O f35873OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35874OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35875OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35876OooOOOO;

    public o0Oo0oo(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull o00O00 o00o01, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull oo0O oo0o, @NotNull o000OOo o000ooo2, @NotNull o0OO00O o0oo00o2, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.f35863OooO00o = context;
        this.f35864OooO0O0 = config;
        this.f35865OooO0OO = colorSpace;
        this.f35866OooO0Oo = o00o01;
        this.f35868OooO0o0 = scale;
        this.f35867OooO0o = z;
        this.f35869OooO0oO = z2;
        this.f35870OooO0oo = z3;
        this.f35862OooO = str;
        this.f35871OooOO0 = oo0o;
        this.f35872OooOO0O = o000ooo2;
        this.f35873OooOO0o = o0oo00o2;
        this.f35875OooOOO0 = cachePolicy;
        this.f35874OooOOO = cachePolicy2;
        this.f35876OooOOOO = cachePolicy3;
    }

    public static o0Oo0oo OooO00o(o0Oo0oo o0oo0oo2, Bitmap.Config config) {
        Context context = o0oo0oo2.f35863OooO00o;
        ColorSpace colorSpace = o0oo0oo2.f35865OooO0OO;
        o00O00 o00o01 = o0oo0oo2.f35866OooO0Oo;
        Scale scale = o0oo0oo2.f35868OooO0o0;
        boolean z = o0oo0oo2.f35867OooO0o;
        boolean z2 = o0oo0oo2.f35869OooO0oO;
        boolean z3 = o0oo0oo2.f35870OooO0oo;
        String str = o0oo0oo2.f35862OooO;
        oo0O oo0o = o0oo0oo2.f35871OooOO0;
        o000OOo o000ooo2 = o0oo0oo2.f35872OooOO0O;
        o0OO00O o0oo00o2 = o0oo0oo2.f35873OooOO0o;
        CachePolicy cachePolicy = o0oo0oo2.f35875OooOOO0;
        CachePolicy cachePolicy2 = o0oo0oo2.f35874OooOOO;
        CachePolicy cachePolicy3 = o0oo0oo2.f35876OooOOOO;
        o0oo0oo2.getClass();
        return new o0Oo0oo(context, config, colorSpace, o00o01, scale, z, z2, z3, str, oo0o, o000ooo2, o0oo00o2, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0Oo0oo) {
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
            if (Intrinsics.areEqual(this.f35863OooO00o, o0oo0oo2.f35863OooO00o) && this.f35864OooO0O0 == o0oo0oo2.f35864OooO0O0 && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f35865OooO0OO, o0oo0oo2.f35865OooO0OO)) && Intrinsics.areEqual(this.f35866OooO0Oo, o0oo0oo2.f35866OooO0Oo) && this.f35868OooO0o0 == o0oo0oo2.f35868OooO0o0 && this.f35867OooO0o == o0oo0oo2.f35867OooO0o && this.f35869OooO0oO == o0oo0oo2.f35869OooO0oO && this.f35870OooO0oo == o0oo0oo2.f35870OooO0oo && Intrinsics.areEqual(this.f35862OooO, o0oo0oo2.f35862OooO) && Intrinsics.areEqual(this.f35871OooOO0, o0oo0oo2.f35871OooOO0) && Intrinsics.areEqual(this.f35872OooOO0O, o0oo0oo2.f35872OooOO0O) && Intrinsics.areEqual(this.f35873OooOO0o, o0oo0oo2.f35873OooOO0o) && this.f35875OooOOO0 == o0oo0oo2.f35875OooOOO0 && this.f35874OooOOO == o0oo0oo2.f35874OooOOO && this.f35876OooOOOO == o0oo0oo2.f35876OooOOOO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f35864OooO0O0.hashCode() + (this.f35863OooO00o.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f35865OooO0OO;
        int iHashCode2 = (((((((this.f35868OooO0o0.hashCode() + ((this.f35866OooO0Oo.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f35867OooO0o ? 1231 : 1237)) * 31) + (this.f35869OooO0oO ? 1231 : 1237)) * 31) + (this.f35870OooO0oo ? 1231 : 1237)) * 31;
        String str = this.f35862OooO;
        return this.f35876OooOOOO.hashCode() + ((this.f35874OooOOO.hashCode() + ((this.f35875OooOOO0.hashCode() + ((this.f35873OooOO0o.hashCode() + ((this.f35872OooOO0O.hashCode() + ((this.f35871OooOO0.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
