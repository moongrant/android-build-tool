package p131o00O0oo0;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o00OO000.OooO0OO;
import org.jetbrains.annotations.Nullable;
import p130o00O0oo.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Precision f36819OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Lifecycle f36820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o000OO0O f36821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Scale f36822OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f36823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f36824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f36825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f36826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final OooO0OO.OooO00o f36827OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Bitmap.Config f36828OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Boolean f36829OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Boolean f36830OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final CachePolicy f36831OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final CachePolicy f36832OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final CachePolicy f36833OooOOOO;

    public o00Ooo(@Nullable Lifecycle lifecycle, @Nullable o000OO0O o000oo0o2, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable OooO0OO.OooO00o oooO00o, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.f36820OooO00o = lifecycle;
        this.f36821OooO0O0 = o000oo0o2;
        this.f36822OooO0OO = scale;
        this.f36823OooO0Oo = coroutineDispatcher;
        this.f36825OooO0o0 = coroutineDispatcher2;
        this.f36824OooO0o = coroutineDispatcher3;
        this.f36826OooO0oO = coroutineDispatcher4;
        this.f36827OooO0oo = oooO00o;
        this.f36819OooO = precision;
        this.f36828OooOO0 = config;
        this.f36829OooOO0O = bool;
        this.f36830OooOO0o = bool2;
        this.f36832OooOOO0 = cachePolicy;
        this.f36831OooOOO = cachePolicy2;
        this.f36833OooOOOO = cachePolicy3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00Ooo) {
            o00Ooo o00ooo2 = (o00Ooo) obj;
            if (Intrinsics.areEqual(this.f36820OooO00o, o00ooo2.f36820OooO00o) && Intrinsics.areEqual(this.f36821OooO0O0, o00ooo2.f36821OooO0O0) && this.f36822OooO0OO == o00ooo2.f36822OooO0OO && Intrinsics.areEqual(this.f36823OooO0Oo, o00ooo2.f36823OooO0Oo) && Intrinsics.areEqual(this.f36825OooO0o0, o00ooo2.f36825OooO0o0) && Intrinsics.areEqual(this.f36824OooO0o, o00ooo2.f36824OooO0o) && Intrinsics.areEqual(this.f36826OooO0oO, o00ooo2.f36826OooO0oO) && Intrinsics.areEqual(this.f36827OooO0oo, o00ooo2.f36827OooO0oo) && this.f36819OooO == o00ooo2.f36819OooO && this.f36828OooOO0 == o00ooo2.f36828OooOO0 && Intrinsics.areEqual(this.f36829OooOO0O, o00ooo2.f36829OooOO0O) && Intrinsics.areEqual(this.f36830OooOO0o, o00ooo2.f36830OooOO0o) && this.f36832OooOOO0 == o00ooo2.f36832OooOOO0 && this.f36831OooOOO == o00ooo2.f36831OooOOO && this.f36833OooOOOO == o00ooo2.f36833OooOOOO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.f36820OooO00o;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        o000OO0O o000oo0o2 = this.f36821OooO0O0;
        int iHashCode2 = (iHashCode + (o000oo0o2 != null ? o000oo0o2.hashCode() : 0)) * 31;
        Scale scale = this.f36822OooO0OO;
        int iHashCode3 = (iHashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f36823OooO0Oo;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f36825OooO0o0;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f36824OooO0o;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f36826OooO0oO;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        OooO0OO.OooO00o oooO00o = this.f36827OooO0oo;
        int iHashCode8 = (iHashCode7 + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31;
        Precision precision = this.f36819OooO;
        int iHashCode9 = (iHashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f36828OooOO0;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f36829OooOO0O;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f36830OooOO0o;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.f36832OooOOO0;
        int iHashCode13 = (iHashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.f36831OooOOO;
        int iHashCode14 = (iHashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.f36833OooOOOO;
        return iHashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }
}
