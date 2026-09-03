package p027Oooo0o;

import androidx.compose.foundation.lazy.layout.OooOo;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f1800OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f1801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f1802OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo f1803OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f1804OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0OO f1805OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0O0 f1806OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f1807OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f1808OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f1809OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ long f1810OooOO0O;

    public o00000O(int i, int i2, OooOo oooOo, boolean z, o00OO0O0.OooO0O0 oooO0O0, o00OO0O0.OooO0OO oooO0OO, boolean z2, int i3, int i4, o0OOO0o o0ooo0o2, long j) {
        this.f1801OooO00o = i;
        this.f1802OooO0O0 = i2;
        this.f1803OooO0OO = oooOo;
        this.f1804OooO0Oo = z;
        this.f1806OooO0o0 = oooO0O0;
        this.f1805OooO0o = oooO0OO;
        this.f1807OooO0oO = z2;
        this.f1808OooO0oo = i3;
        this.f1800OooO = i4;
        this.f1809OooOO0 = o0ooo0o2;
        this.f1810OooOO0O = j;
    }

    @Override // p027Oooo0o.o00O00O
    @NotNull
    public final o000O0O0 OooO00o(int i, @NotNull Object key, @NotNull o000O000[] placeables) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        return new o000O0O0(i, placeables, this.f1804OooO0Oo, this.f1806OooO0o0, this.f1805OooO0o, this.f1803OooO0OO.getLayoutDirection(), this.f1807OooO0oO, this.f1808OooO0oo, this.f1800OooO, this.f1809OooOO0, i == this.f1801OooO00o + (-1) ? 0 : this.f1802OooO0O0, this.f1810OooOO0O, key);
    }
}
