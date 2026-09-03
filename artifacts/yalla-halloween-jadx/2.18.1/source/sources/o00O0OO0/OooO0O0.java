package o00O0OO0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final OooO0O0 f30555OooOOO0 = new OooO0O0(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Drawable f30556OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f30557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p117o00O0OOo.OooO f30558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Precision f30559OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f30560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f30561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f30562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Drawable f30563OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Drawable f30564OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30565OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30566OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final CachePolicy f30567OooOO0o;

    public OooO0O0() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, 4095, null);
    }

    public OooO0O0(CoroutineDispatcher coroutineDispatcher, p117o00O0OOo.OooO oooO, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineDispatcher dispatcher = Dispatchers.getIO();
        p117o00O0OOo.OooO0o transition = p117o00O0OOo.OooO0o.f30606OooO00o;
        Precision precision2 = Precision.AUTOMATIC;
        Bitmap.Config bitmapConfig = o0O0O00.OooO00o();
        CachePolicy networkCachePolicy = CachePolicy.ENABLED;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(precision2, "precision");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "memoryCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "diskCachePolicy");
        Intrinsics.checkNotNullParameter(networkCachePolicy, "networkCachePolicy");
        this.f30557OooO00o = dispatcher;
        this.f30558OooO0O0 = transition;
        this.f30559OooO0OO = precision2;
        this.f30560OooO0Oo = bitmapConfig;
        this.f30562OooO0o0 = true;
        this.f30561OooO0o = false;
        this.f30563OooO0oO = null;
        this.f30564OooO0oo = null;
        this.f30556OooO = null;
        this.f30565OooOO0 = networkCachePolicy;
        this.f30566OooOO0O = networkCachePolicy;
        this.f30567OooOO0o = networkCachePolicy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (Intrinsics.areEqual(this.f30557OooO00o, oooO0O0.f30557OooO00o) && Intrinsics.areEqual(this.f30558OooO0O0, oooO0O0.f30558OooO0O0) && this.f30559OooO0OO == oooO0O0.f30559OooO0OO && this.f30560OooO0Oo == oooO0O0.f30560OooO0Oo && this.f30562OooO0o0 == oooO0O0.f30562OooO0o0 && this.f30561OooO0o == oooO0O0.f30561OooO0o && Intrinsics.areEqual(this.f30563OooO0oO, oooO0O0.f30563OooO0oO) && Intrinsics.areEqual(this.f30564OooO0oo, oooO0O0.f30564OooO0oo) && Intrinsics.areEqual(this.f30556OooO, oooO0O0.f30556OooO) && this.f30565OooOO0 == oooO0O0.f30565OooOO0 && this.f30566OooOO0O == oooO0O0.f30566OooOO0O && this.f30567OooOO0o == oooO0O0.f30567OooOO0o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f30560OooO0Oo.hashCode() + ((this.f30559OooO0OO.hashCode() + ((this.f30558OooO0O0.hashCode() + (this.f30557OooO00o.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f30562OooO0o0 ? 1231 : 1237)) * 31) + (this.f30561OooO0o ? 1231 : 1237)) * 31;
        Drawable drawable = this.f30563OooO0oO;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f30564OooO0oo;
        int iHashCode3 = (iHashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f30556OooO;
        return this.f30567OooOO0o.hashCode() + ((this.f30566OooOO0O.hashCode() + ((this.f30565OooOO0.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DefaultRequestOptions(dispatcher=");
        sbOooO0o0.append(this.f30557OooO00o);
        sbOooO0o0.append(", transition=");
        sbOooO0o0.append(this.f30558OooO0O0);
        sbOooO0o0.append(", precision=");
        sbOooO0o0.append(this.f30559OooO0OO);
        sbOooO0o0.append(", bitmapConfig=");
        sbOooO0o0.append(this.f30560OooO0Oo);
        sbOooO0o0.append(", allowHardware=");
        sbOooO0o0.append(this.f30562OooO0o0);
        sbOooO0o0.append(", allowRgb565=");
        sbOooO0o0.append(this.f30561OooO0o);
        sbOooO0o0.append(", placeholder=");
        sbOooO0o0.append(this.f30563OooO0oO);
        sbOooO0o0.append(", error=");
        sbOooO0o0.append(this.f30564OooO0oo);
        sbOooO0o0.append(", fallback=");
        sbOooO0o0.append(this.f30556OooO);
        sbOooO0o0.append(", memoryCachePolicy=");
        sbOooO0o0.append(this.f30565OooOO0);
        sbOooO0o0.append(", diskCachePolicy=");
        sbOooO0o0.append(this.f30566OooOO0O);
        sbOooO0o0.append(", networkCachePolicy=");
        sbOooO0o0.append(this.f30567OooOO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
