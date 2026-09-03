package p131o00O0oo0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.CachePolicy;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p130o00O0oo.o000O0Oo;
import p641o0ooOO0o.o0O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f36837OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f36838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f36839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ColorSpace f36840OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f36841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36842OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Scale f36843OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f36844OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f36845OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0O000 f36846OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00000 f36847OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o000OOo f36848OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36849OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36850OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36851OooOOOO;

    public o0O0O00(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull o000O0Oo o000o0oo2, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull o0O000 o0o001, @NotNull o00000 o00000Var, @NotNull o000OOo o000ooo2, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.f36838OooO00o = context;
        this.f36839OooO0O0 = config;
        this.f36840OooO0OO = colorSpace;
        this.f36841OooO0Oo = o000o0oo2;
        this.f36843OooO0o0 = scale;
        this.f36842OooO0o = z;
        this.f36844OooO0oO = z2;
        this.f36845OooO0oo = z3;
        this.f36837OooO = str;
        this.f36846OooOO0 = o0o001;
        this.f36847OooOO0O = o00000Var;
        this.f36848OooOO0o = o000ooo2;
        this.f36850OooOOO0 = cachePolicy;
        this.f36849OooOOO = cachePolicy2;
        this.f36851OooOOOO = cachePolicy3;
    }

    public static o0O0O00 OooO00o(o0O0O00 o0o0o00, Bitmap.Config config) {
        Context context = o0o0o00.f36838OooO00o;
        ColorSpace colorSpace = o0o0o00.f36840OooO0OO;
        o000O0Oo o000o0oo2 = o0o0o00.f36841OooO0Oo;
        Scale scale = o0o0o00.f36843OooO0o0;
        boolean z = o0o0o00.f36842OooO0o;
        boolean z2 = o0o0o00.f36844OooO0oO;
        boolean z3 = o0o0o00.f36845OooO0oo;
        String str = o0o0o00.f36837OooO;
        o0O000 o0o001 = o0o0o00.f36846OooOO0;
        o00000 o00000Var = o0o0o00.f36847OooOO0O;
        o000OOo o000ooo2 = o0o0o00.f36848OooOO0o;
        CachePolicy cachePolicy = o0o0o00.f36850OooOOO0;
        CachePolicy cachePolicy2 = o0o0o00.f36849OooOOO;
        CachePolicy cachePolicy3 = o0o0o00.f36851OooOOOO;
        o0o0o00.getClass();
        return new o0O0O00(context, config, colorSpace, o000o0oo2, scale, z, z2, z3, str, o0o001, o00000Var, o000ooo2, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0O00) {
            o0O0O00 o0o0o00 = (o0O0O00) obj;
            if (Intrinsics.areEqual(this.f36838OooO00o, o0o0o00.f36838OooO00o) && this.f36839OooO0O0 == o0o0o00.f36839OooO0O0 && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f36840OooO0OO, o0o0o00.f36840OooO0OO)) && Intrinsics.areEqual(this.f36841OooO0Oo, o0o0o00.f36841OooO0Oo) && this.f36843OooO0o0 == o0o0o00.f36843OooO0o0 && this.f36842OooO0o == o0o0o00.f36842OooO0o && this.f36844OooO0oO == o0o0o00.f36844OooO0oO && this.f36845OooO0oo == o0o0o00.f36845OooO0oo && Intrinsics.areEqual(this.f36837OooO, o0o0o00.f36837OooO) && Intrinsics.areEqual(this.f36846OooOO0, o0o0o00.f36846OooOO0) && Intrinsics.areEqual(this.f36847OooOO0O, o0o0o00.f36847OooOO0O) && Intrinsics.areEqual(this.f36848OooOO0o, o0o0o00.f36848OooOO0o) && this.f36850OooOOO0 == o0o0o00.f36850OooOOO0 && this.f36849OooOOO == o0o0o00.f36849OooOOO && this.f36851OooOOOO == o0o0o00.f36851OooOOOO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f36839OooO0O0.hashCode() + (this.f36838OooO00o.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f36840OooO0OO;
        int iHashCode2 = (((((((this.f36843OooO0o0.hashCode() + ((this.f36841OooO0Oo.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31) + (this.f36842OooO0o ? 1231 : 1237)) * 31) + (this.f36844OooO0oO ? 1231 : 1237)) * 31) + (this.f36845OooO0oo ? 1231 : 1237)) * 31;
        String str = this.f36837OooO;
        return this.f36851OooOOOO.hashCode() + ((this.f36849OooOOO.hashCode() + ((this.f36850OooOOO0.hashCode() + ((this.f36848OooOO0o.hashCode() + ((this.f36847OooOO0O.hashCode() + ((this.f36846OooOO0.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
