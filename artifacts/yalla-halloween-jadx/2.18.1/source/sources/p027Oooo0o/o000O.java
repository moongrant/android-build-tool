package p027Oooo0o;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.OooOo;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OO00O f1850OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo f1851OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O00O f1852OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f1853OooO0Oo;

    @ExperimentalFoundationApi
    public o000O(long j, boolean z, o0OO00O o0oo00o2, OooOo oooOo, o00O00O o00o00o2) {
        this.f1850OooO00o = o0oo00o2;
        this.f1851OooO0O0 = oooOo;
        this.f1852OooO0OO = o00o00o2;
        this.f1853OooO0Oo = OooO0OO.OooO0O0(z ? OooO0O0.OooO0oo(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : OooO0O0.OooO0oO(j), 5);
    }

    @NotNull
    public final o000O0O0 OooO00o(int i) {
        return this.f1852OooO0OO.OooO00o(i, this.f1850OooO00o.OooO00o(i), this.f1851OooO0O0.OoooO0O(i, this.f1853OooO0Oo));
    }
}
