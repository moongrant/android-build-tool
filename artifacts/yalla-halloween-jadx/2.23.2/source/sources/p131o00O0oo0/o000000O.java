package p131o00O0oo0;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O extends o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f36784OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f36785OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f36786OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f36787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36788OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f36789OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f36790OooO0oO;

    public o000000O(@NotNull Drawable drawable, @NotNull OooO00o oooO00o, @NotNull DataSource dataSource, @Nullable MemoryCache.Key key, @Nullable String str, boolean z, boolean z2) {
        this.f36784OooO00o = drawable;
        this.f36785OooO0O0 = oooO00o;
        this.f36786OooO0OO = dataSource;
        this.f36787OooO0Oo = key;
        this.f36789OooO0o0 = str;
        this.f36788OooO0o = z;
        this.f36790OooO0oO = z2;
    }

    @Override // p131o00O0oo0.o0Oo0oo
    @NotNull
    public final Drawable OooO00o() {
        return this.f36784OooO00o;
    }

    @Override // p131o00O0oo0.o0Oo0oo
    @NotNull
    public final OooO00o OooO0O0() {
        return this.f36785OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000000O) {
            o000000O o000000o2 = (o000000O) obj;
            if (Intrinsics.areEqual(this.f36784OooO00o, o000000o2.f36784OooO00o)) {
                if (Intrinsics.areEqual(this.f36785OooO0O0, o000000o2.f36785OooO0O0) && this.f36786OooO0OO == o000000o2.f36786OooO0OO && Intrinsics.areEqual(this.f36787OooO0Oo, o000000o2.f36787OooO0Oo) && Intrinsics.areEqual(this.f36789OooO0o0, o000000o2.f36789OooO0o0) && this.f36788OooO0o == o000000o2.f36788OooO0o && this.f36790OooO0oO == o000000o2.f36790OooO0oO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f36786OooO0OO.hashCode() + ((this.f36785OooO0O0.hashCode() + (this.f36784OooO00o.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.f36787OooO0Oo;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f36789OooO0o0;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f36788OooO0o ? 1231 : 1237)) * 31) + (this.f36790OooO0oO ? 1231 : 1237);
    }
}
