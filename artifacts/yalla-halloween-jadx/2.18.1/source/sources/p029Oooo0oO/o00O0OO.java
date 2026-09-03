package p029Oooo0oO;

import androidx.compose.foundation.lazy.layout.OooOo;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO implements o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOo f2325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f2326OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f2327OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2328OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f2329OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f2330OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f2331OooO0oO;

    public o00O0OO(OooOo oooOo, boolean z, boolean z2, int i, int i2, o00O000 o00o001, long j) {
        this.f2325OooO00o = oooOo;
        this.f2326OooO0O0 = z;
        this.f2327OooO0OO = z2;
        this.f2328OooO0Oo = i;
        this.f2330OooO0o0 = i2;
        this.f2329OooO0o = o00o001;
        this.f2331OooO0oO = j;
    }

    @Override // p029Oooo0oO.o0O00O0o
    @NotNull
    public final o0O00o0 OooO00o(int i, @NotNull Object key, int i2, int i3, @NotNull o000O000[] placeables) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        return new o0O00o0(i, key, this.f2326OooO0O0, i2, i3, this.f2327OooO0OO, this.f2325OooO00o.getLayoutDirection(), this.f2328OooO0Oo, this.f2330OooO0o0, placeables, this.f2329OooO0o, this.f2331OooO0oO);
    }
}
