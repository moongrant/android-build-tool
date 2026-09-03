package p131o00O0oo0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o00OO000.OooO0O0;
import o00OO000.OooO0OO;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f36804OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f36805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f36806OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f36807OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f36808OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Precision f36809OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0OO.OooO00o f36810OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f36811OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f36812OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Drawable f36813OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Drawable f36814OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Drawable f36815OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36816OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36817OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f36818OooOOOO;

    public o00Oo0() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00Oo0) {
            o00Oo0 o00oo1 = (o00Oo0) obj;
            if (Intrinsics.areEqual(this.f36805OooO00o, o00oo1.f36805OooO00o) && Intrinsics.areEqual(this.f36806OooO0O0, o00oo1.f36806OooO0O0) && Intrinsics.areEqual(this.f36807OooO0OO, o00oo1.f36807OooO0OO) && Intrinsics.areEqual(this.f36808OooO0Oo, o00oo1.f36808OooO0Oo) && Intrinsics.areEqual(this.f36810OooO0o0, o00oo1.f36810OooO0o0) && this.f36809OooO0o == o00oo1.f36809OooO0o && this.f36811OooO0oO == o00oo1.f36811OooO0oO && this.f36812OooO0oo == o00oo1.f36812OooO0oo && this.f36804OooO == o00oo1.f36804OooO && Intrinsics.areEqual(this.f36813OooOO0, o00oo1.f36813OooOO0) && Intrinsics.areEqual(this.f36814OooOO0O, o00oo1.f36814OooOO0O) && Intrinsics.areEqual(this.f36815OooOO0o, o00oo1.f36815OooOO0o) && this.f36817OooOOO0 == o00oo1.f36817OooOOO0 && this.f36816OooOOO == o00oo1.f36816OooOOO && this.f36818OooOOOO == o00oo1.f36818OooOOOO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f36811OooO0oO.hashCode() + ((this.f36809OooO0o.hashCode() + ((this.f36810OooO0o0.hashCode() + ((this.f36808OooO0Oo.hashCode() + ((this.f36807OooO0OO.hashCode() + ((this.f36806OooO0O0.hashCode() + (this.f36805OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f36812OooO0oo ? 1231 : 1237)) * 31) + (this.f36804OooO ? 1231 : 1237)) * 31;
        Drawable drawable = this.f36813OooOO0;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f36814OooOO0O;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f36815OooOO0o;
        return this.f36818OooOOOO.hashCode() + ((this.f36816OooOOO.hashCode() + ((this.f36817OooOOO0.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public o00Oo0(int i) {
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        CoroutineDispatcher io4 = Dispatchers.getIO();
        OooO0O0.OooO00o oooO00o = OooO0OO.OooO00o.f37071OooO00o;
        Precision precision = Precision.AUTOMATIC;
        Bitmap.Config config = OooOo00.f37082OooO0O0;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        this.f36805OooO00o = immediate;
        this.f36806OooO0O0 = io2;
        this.f36807OooO0OO = io3;
        this.f36808OooO0Oo = io4;
        this.f36810OooO0o0 = oooO00o;
        this.f36809OooO0o = precision;
        this.f36811OooO0oO = config;
        this.f36812OooO0oo = true;
        this.f36804OooO = false;
        this.f36813OooOO0 = null;
        this.f36814OooOO0O = null;
        this.f36815OooOO0o = null;
        this.f36817OooOOO0 = cachePolicy;
        this.f36816OooOOO = cachePolicy;
        this.f36818OooOOOO = cachePolicy;
    }
}
