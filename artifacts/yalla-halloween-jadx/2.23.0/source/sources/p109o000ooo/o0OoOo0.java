package p109o000ooo;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o00O0000.OooO0OO;
import org.jetbrains.annotations.Nullable;
import p111o000oooO.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Precision f35877OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Lifecycle f35878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00O00O f35879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Scale f35880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f35881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f35882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f35883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final CoroutineDispatcher f35884OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final OooO0OO.OooO00o f35885OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Bitmap.Config f35886OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Boolean f35887OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Boolean f35888OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final CachePolicy f35889OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final CachePolicy f35890OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final CachePolicy f35891OooOOOO;

    public o0OoOo0(@Nullable Lifecycle lifecycle, @Nullable o00O00O o00o00o2, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable OooO0OO.OooO00o oooO00o, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.f35878OooO00o = lifecycle;
        this.f35879OooO0O0 = o00o00o2;
        this.f35880OooO0OO = scale;
        this.f35881OooO0Oo = coroutineDispatcher;
        this.f35883OooO0o0 = coroutineDispatcher2;
        this.f35882OooO0o = coroutineDispatcher3;
        this.f35884OooO0oO = coroutineDispatcher4;
        this.f35885OooO0oo = oooO00o;
        this.f35877OooO = precision;
        this.f35886OooOO0 = config;
        this.f35887OooOO0O = bool;
        this.f35888OooOO0o = bool2;
        this.f35890OooOOO0 = cachePolicy;
        this.f35889OooOOO = cachePolicy2;
        this.f35891OooOOOO = cachePolicy3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OoOo0) {
            o0OoOo0 o0oooo0 = (o0OoOo0) obj;
            if (Intrinsics.areEqual(this.f35878OooO00o, o0oooo0.f35878OooO00o) && Intrinsics.areEqual(this.f35879OooO0O0, o0oooo0.f35879OooO0O0) && this.f35880OooO0OO == o0oooo0.f35880OooO0OO && Intrinsics.areEqual(this.f35881OooO0Oo, o0oooo0.f35881OooO0Oo) && Intrinsics.areEqual(this.f35883OooO0o0, o0oooo0.f35883OooO0o0) && Intrinsics.areEqual(this.f35882OooO0o, o0oooo0.f35882OooO0o) && Intrinsics.areEqual(this.f35884OooO0oO, o0oooo0.f35884OooO0oO) && Intrinsics.areEqual(this.f35885OooO0oo, o0oooo0.f35885OooO0oo) && this.f35877OooO == o0oooo0.f35877OooO && this.f35886OooOO0 == o0oooo0.f35886OooOO0 && Intrinsics.areEqual(this.f35887OooOO0O, o0oooo0.f35887OooOO0O) && Intrinsics.areEqual(this.f35888OooOO0o, o0oooo0.f35888OooOO0o) && this.f35890OooOOO0 == o0oooo0.f35890OooOOO0 && this.f35889OooOOO == o0oooo0.f35889OooOOO && this.f35891OooOOOO == o0oooo0.f35891OooOOOO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Lifecycle lifecycle = this.f35878OooO00o;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        o00O00O o00o00o2 = this.f35879OooO0O0;
        int iHashCode2 = (iHashCode + (o00o00o2 != null ? o00o00o2.hashCode() : 0)) * 31;
        Scale scale = this.f35880OooO0OO;
        int iHashCode3 = (iHashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f35881OooO0Oo;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f35883OooO0o0;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f35882OooO0o;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f35884OooO0oO;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        OooO0OO.OooO00o oooO00o = this.f35885OooO0oo;
        int iHashCode8 = (iHashCode7 + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31;
        Precision precision = this.f35877OooO;
        int iHashCode9 = (iHashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f35886OooOO0;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f35887OooOO0O;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f35888OooOO0o;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.f35890OooOOO0;
        int iHashCode13 = (iHashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.f35889OooOOO;
        int iHashCode14 = (iHashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.f35891OooOOOO;
        return iHashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }
}
