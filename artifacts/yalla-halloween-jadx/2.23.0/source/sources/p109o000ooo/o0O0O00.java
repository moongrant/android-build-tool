package p109o000ooo;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f35849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f35850OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f35851OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f35852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f35853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f35854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f35855OooO0oO;

    public o0O0O00(@NotNull Drawable drawable, @NotNull OooO00o oooO00o, @NotNull DataSource dataSource, @Nullable MemoryCache.Key key, @Nullable String str, boolean z, boolean z2) {
        this.f35849OooO00o = drawable;
        this.f35850OooO0O0 = oooO00o;
        this.f35851OooO0OO = dataSource;
        this.f35852OooO0Oo = key;
        this.f35854OooO0o0 = str;
        this.f35853OooO0o = z;
        this.f35855OooO0oO = z2;
    }

    @Override // p109o000ooo.o00oO0o
    @NotNull
    public final Drawable OooO00o() {
        return this.f35849OooO00o;
    }

    @Override // p109o000ooo.o00oO0o
    @NotNull
    public final OooO00o OooO0O0() {
        return this.f35850OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0O00) {
            o0O0O00 o0o0o00 = (o0O0O00) obj;
            if (Intrinsics.areEqual(this.f35849OooO00o, o0o0o00.f35849OooO00o)) {
                if (Intrinsics.areEqual(this.f35850OooO0O0, o0o0o00.f35850OooO0O0) && this.f35851OooO0OO == o0o0o00.f35851OooO0OO && Intrinsics.areEqual(this.f35852OooO0Oo, o0o0o00.f35852OooO0Oo) && Intrinsics.areEqual(this.f35854OooO0o0, o0o0o00.f35854OooO0o0) && this.f35853OooO0o == o0o0o00.f35853OooO0o && this.f35855OooO0oO == o0o0o00.f35855OooO0oO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f35851OooO0OO.hashCode() + ((this.f35850OooO0O0.hashCode() + (this.f35849OooO00o.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.f35852OooO0Oo;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f35854OooO0o0;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f35853OooO0o ? 1231 : 1237)) * 31) + (this.f35855OooO0oO ? 1231 : 1237);
    }
}
