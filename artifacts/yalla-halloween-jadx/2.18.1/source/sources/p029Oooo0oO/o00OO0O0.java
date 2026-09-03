package p029Oooo0oO;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.OooO00o;
import o0O0O00.o000000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0O0 implements o00O, o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0oOOo f2341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f2343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f2344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f2345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<o00O0000> f2346OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000000O f2347OooO0oO;

    public o00OO0O0(@Nullable o0oOOo o0oooo2, int i, boolean z, float f, @NotNull o000000O measureResult, @NotNull List visibleItemsInfo, int i2, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f2341OooO00o = o0oooo2;
        this.f2342OooO0O0 = i;
        this.f2343OooO0OO = z;
        this.f2344OooO0Oo = f;
        this.f2346OooO0o0 = visibleItemsInfo;
        this.f2345OooO0o = i2;
        this.f2347OooO0oO = measureResult;
    }

    @Override // p029Oooo0oO.o00O
    public final int OooO00o() {
        return this.f2345OooO0o;
    }

    @Override // p029Oooo0oO.o00O
    @NotNull
    public final List<o00O0000> OooO0O0() {
        return this.f2346OooO0o0;
    }

    @Override // o0O0O00.o000000O
    public final void OooO0OO() {
        this.f2347OooO0oO.OooO0OO();
    }

    @Override // o0O0O00.o000000O
    @NotNull
    public final Map<OooO00o, Integer> OooO0o0() {
        return this.f2347OooO0oO.OooO0o0();
    }

    @Override // o0O0O00.o000000O
    public final int getHeight() {
        return this.f2347OooO0oO.getHeight();
    }

    @Override // o0O0O00.o000000O
    public final int getWidth() {
        return this.f2347OooO0oO.getWidth();
    }
}
