package p115o00O00oO;

import OooO00o.OooO00o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.CachePolicy;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO0.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f30374OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f30376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ColorSpace f30377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Scale f30378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f30379OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f30380OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f30381OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00O f30382OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30383OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30384OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30385OooOO0o;

    public o00oO0o(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @NotNull o00O headers, @NotNull OooOOOO parameters, @NotNull CachePolicy memoryCachePolicy, @NotNull CachePolicy diskCachePolicy, @NotNull CachePolicy networkCachePolicy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(memoryCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(diskCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.f30375OooO00o = context;
        this.f30376OooO0O0 = config;
        this.f30377OooO0OO = colorSpace;
        this.f30378OooO0Oo = scale;
        this.f30380OooO0o0 = z;
        this.f30379OooO0o = z2;
        this.f30381OooO0oO = z3;
        this.f30382OooO0oo = headers;
        this.f30374OooO = parameters;
        this.f30383OooOO0 = memoryCachePolicy;
        this.f30384OooOO0O = diskCachePolicy;
        this.f30385OooOO0o = networkCachePolicy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oO0o) {
            o00oO0o o00oo0o2 = (o00oO0o) obj;
            if (Intrinsics.areEqual(this.f30375OooO00o, o00oo0o2.f30375OooO00o) && this.f30376OooO0O0 == o00oo0o2.f30376OooO0O0 && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f30377OooO0OO, o00oo0o2.f30377OooO0OO)) && this.f30378OooO0Oo == o00oo0o2.f30378OooO0Oo && this.f30380OooO0o0 == o00oo0o2.f30380OooO0o0 && this.f30379OooO0o == o00oo0o2.f30379OooO0o && this.f30381OooO0oO == o00oo0o2.f30381OooO0oO && Intrinsics.areEqual(this.f30382OooO0oo, o00oo0o2.f30382OooO0oo) && Intrinsics.areEqual(this.f30374OooO, o00oo0o2.f30374OooO) && this.f30383OooOO0 == o00oo0o2.f30383OooOO0 && this.f30384OooOO0O == o00oo0o2.f30384OooOO0O && this.f30385OooOO0o == o00oo0o2.f30385OooOO0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f30376OooO0O0.hashCode() + (this.f30375OooO00o.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f30377OooO0OO;
        return this.f30385OooOO0o.hashCode() + ((this.f30384OooOO0O.hashCode() + ((this.f30383OooOO0.hashCode() + ((this.f30374OooO.hashCode() + ((this.f30382OooO0oo.hashCode() + ((((((((this.f30378OooO0Oo.hashCode() + ((iHashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31)) * 31) + (this.f30380OooO0o0 ? 1231 : 1237)) * 31) + (this.f30379OooO0o ? 1231 : 1237)) * 31) + (this.f30381OooO0oO ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Options(context=");
        sbOooO0o0.append(this.f30375OooO00o);
        sbOooO0o0.append(", config=");
        sbOooO0o0.append(this.f30376OooO0O0);
        sbOooO0o0.append(", colorSpace=");
        sbOooO0o0.append(this.f30377OooO0OO);
        sbOooO0o0.append(", scale=");
        sbOooO0o0.append(this.f30378OooO0Oo);
        sbOooO0o0.append(", allowInexactSize=");
        sbOooO0o0.append(this.f30380OooO0o0);
        sbOooO0o0.append(", allowRgb565=");
        sbOooO0o0.append(this.f30379OooO0o);
        sbOooO0o0.append(", premultipliedAlpha=");
        sbOooO0o0.append(this.f30381OooO0oO);
        sbOooO0o0.append(", headers=");
        sbOooO0o0.append(this.f30382OooO0oo);
        sbOooO0o0.append(", parameters=");
        sbOooO0o0.append(this.f30374OooO);
        sbOooO0o0.append(", memoryCachePolicy=");
        sbOooO0o0.append(this.f30383OooOO0);
        sbOooO0o0.append(", diskCachePolicy=");
        sbOooO0o0.append(this.f30384OooOO0O);
        sbOooO0o0.append(", networkCachePolicy=");
        sbOooO0o0.append(this.f30385OooOO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
