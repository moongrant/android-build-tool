package o00O0OO0;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Boolean f30568OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Lifecycle f30569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final oo0o0O0.OooO0o f30570OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Scale f30571OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f30572OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Precision f30573OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final p117o00O0OOo.OooO f30574OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Bitmap.Config f30575OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Boolean f30576OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final CachePolicy f30577OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final CachePolicy f30578OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final CachePolicy f30579OooOO0o;

    public OooO0OO(@Nullable Lifecycle lifecycle, @Nullable oo0o0O0.OooO0o oooO0o, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable p117o00O0OOo.OooO oooO, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.f30569OooO00o = lifecycle;
        this.f30570OooO0O0 = oooO0o;
        this.f30571OooO0OO = scale;
        this.f30572OooO0Oo = coroutineDispatcher;
        this.f30574OooO0o0 = oooO;
        this.f30573OooO0o = precision;
        this.f30575OooO0oO = config;
        this.f30576OooO0oo = bool;
        this.f30568OooO = bool2;
        this.f30577OooOO0 = cachePolicy;
        this.f30578OooOO0O = cachePolicy2;
        this.f30579OooOO0o = cachePolicy3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (Intrinsics.areEqual(this.f30569OooO00o, oooO0OO.f30569OooO00o) && Intrinsics.areEqual(this.f30570OooO0O0, oooO0OO.f30570OooO0O0) && this.f30571OooO0OO == oooO0OO.f30571OooO0OO && Intrinsics.areEqual(this.f30572OooO0Oo, oooO0OO.f30572OooO0Oo) && Intrinsics.areEqual(this.f30574OooO0o0, oooO0OO.f30574OooO0o0) && this.f30573OooO0o == oooO0OO.f30573OooO0o && this.f30575OooO0oO == oooO0OO.f30575OooO0oO && Intrinsics.areEqual(this.f30576OooO0oo, oooO0OO.f30576OooO0oo) && Intrinsics.areEqual(this.f30568OooO, oooO0OO.f30568OooO) && this.f30577OooOO0 == oooO0OO.f30577OooOO0 && this.f30578OooOO0O == oooO0OO.f30578OooOO0O && this.f30579OooOO0o == oooO0OO.f30579OooOO0o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.f30569OooO00o;
        int iHashCode = (lifecycle == null ? 0 : lifecycle.hashCode()) * 31;
        oo0o0O0.OooO0o oooO0o = this.f30570OooO0O0;
        int iHashCode2 = (iHashCode + (oooO0o == null ? 0 : oooO0o.hashCode())) * 31;
        Scale scale = this.f30571OooO0OO;
        int iHashCode3 = (iHashCode2 + (scale == null ? 0 : scale.hashCode())) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f30572OooO0Oo;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher == null ? 0 : coroutineDispatcher.hashCode())) * 31;
        p117o00O0OOo.OooO oooO = this.f30574OooO0o0;
        int iHashCode5 = (iHashCode4 + (oooO == null ? 0 : oooO.hashCode())) * 31;
        Precision precision = this.f30573OooO0o;
        int iHashCode6 = (iHashCode5 + (precision == null ? 0 : precision.hashCode())) * 31;
        Bitmap.Config config = this.f30575OooO0oO;
        int iHashCode7 = (iHashCode6 + (config == null ? 0 : config.hashCode())) * 31;
        Boolean bool = this.f30576OooO0oo;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f30568OooO;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CachePolicy cachePolicy = this.f30577OooOO0;
        int iHashCode10 = (iHashCode9 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
        CachePolicy cachePolicy2 = this.f30578OooOO0O;
        int iHashCode11 = (iHashCode10 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
        CachePolicy cachePolicy3 = this.f30579OooOO0o;
        return iHashCode11 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DefinedRequestOptions(lifecycle=");
        sbOooO0o0.append(this.f30569OooO00o);
        sbOooO0o0.append(", sizeResolver=");
        sbOooO0o0.append(this.f30570OooO0O0);
        sbOooO0o0.append(", scale=");
        sbOooO0o0.append(this.f30571OooO0OO);
        sbOooO0o0.append(", dispatcher=");
        sbOooO0o0.append(this.f30572OooO0Oo);
        sbOooO0o0.append(", transition=");
        sbOooO0o0.append(this.f30574OooO0o0);
        sbOooO0o0.append(", precision=");
        sbOooO0o0.append(this.f30573OooO0o);
        sbOooO0o0.append(", bitmapConfig=");
        sbOooO0o0.append(this.f30575OooO0oO);
        sbOooO0o0.append(", allowHardware=");
        sbOooO0o0.append(this.f30576OooO0oo);
        sbOooO0o0.append(", allowRgb565=");
        sbOooO0o0.append(this.f30568OooO);
        sbOooO0o0.append(", memoryCachePolicy=");
        sbOooO0o0.append(this.f30577OooOO0);
        sbOooO0o0.append(", diskCachePolicy=");
        sbOooO0o0.append(this.f30578OooOO0O);
        sbOooO0o0.append(", networkCachePolicy=");
        sbOooO0o0.append(this.f30579OooOO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
