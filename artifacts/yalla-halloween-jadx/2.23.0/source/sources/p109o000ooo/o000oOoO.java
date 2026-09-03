package p109o000ooo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.size.Precision;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o00O0000.OooO0O0;
import o00O0000.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f35831OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f35832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f35833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f35834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f35835OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Precision f35836OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0OO.OooO00o f35837OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f35838OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f35839OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Drawable f35840OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Drawable f35841OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Drawable f35842OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35843OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35844OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f35845OooOOOO;

    public o000oOoO() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000oOoO) {
            o000oOoO o000oooo2 = (o000oOoO) obj;
            if (Intrinsics.areEqual(this.f35832OooO00o, o000oooo2.f35832OooO00o) && Intrinsics.areEqual(this.f35833OooO0O0, o000oooo2.f35833OooO0O0) && Intrinsics.areEqual(this.f35834OooO0OO, o000oooo2.f35834OooO0OO) && Intrinsics.areEqual(this.f35835OooO0Oo, o000oooo2.f35835OooO0Oo) && Intrinsics.areEqual(this.f35837OooO0o0, o000oooo2.f35837OooO0o0) && this.f35836OooO0o == o000oooo2.f35836OooO0o && this.f35838OooO0oO == o000oooo2.f35838OooO0oO && this.f35839OooO0oo == o000oooo2.f35839OooO0oo && this.f35831OooO == o000oooo2.f35831OooO && Intrinsics.areEqual(this.f35840OooOO0, o000oooo2.f35840OooOO0) && Intrinsics.areEqual(this.f35841OooOO0O, o000oooo2.f35841OooOO0O) && Intrinsics.areEqual(this.f35842OooOO0o, o000oooo2.f35842OooOO0o) && this.f35844OooOOO0 == o000oooo2.f35844OooOOO0 && this.f35843OooOOO == o000oooo2.f35843OooOOO && this.f35845OooOOOO == o000oooo2.f35845OooOOOO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f35838OooO0oO.hashCode() + ((this.f35836OooO0o.hashCode() + ((this.f35837OooO0o0.hashCode() + ((this.f35835OooO0Oo.hashCode() + ((this.f35834OooO0OO.hashCode() + ((this.f35833OooO0O0.hashCode() + (this.f35832OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f35839OooO0oo ? 1231 : 1237)) * 31) + (this.f35831OooO ? 1231 : 1237)) * 31;
        Drawable drawable = this.f35840OooOO0;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f35841OooOO0O;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f35842OooOO0o;
        return this.f35845OooOOOO.hashCode() + ((this.f35843OooOOO.hashCode() + ((this.f35844OooOOO0.hashCode() + ((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public o000oOoO(int i) {
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineDispatcher io3 = Dispatchers.getIO();
        CoroutineDispatcher io4 = Dispatchers.getIO();
        OooO0O0.OooO00o oooO00o = OooO0OO.OooO00o.f36271OooO00o;
        Precision precision = Precision.AUTOMATIC;
        Bitmap.Config config = o000O0O0.f42846OooO0O0;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        this.f35832OooO00o = immediate;
        this.f35833OooO0O0 = io2;
        this.f35834OooO0OO = io3;
        this.f35835OooO0Oo = io4;
        this.f35837OooO0o0 = oooO00o;
        this.f35836OooO0o = precision;
        this.f35838OooO0oO = config;
        this.f35839OooO0oo = true;
        this.f35831OooO = false;
        this.f35840OooOO0 = null;
        this.f35841OooOO0O = null;
        this.f35842OooOO0o = null;
        this.f35844OooOOO0 = cachePolicy;
        this.f35843OooOOO = cachePolicy;
        this.f35845OooOOOO = cachePolicy;
    }
}
