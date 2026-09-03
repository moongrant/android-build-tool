package p027Oooo0o;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.OooO00o;
import o0O0O00.o000000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo implements o0000Ooo, o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o000O0O0 f1842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1843OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1844OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f1845OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1846OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<oo000o> f1847OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1848OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000000O f1849OooO0oo;

    public o0000oo(@Nullable o000O0O0 o000o0o1, int i, boolean z, float f, @NotNull o000000O measureResult, @NotNull List visibleItemsInfo, int i2, int i3, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f1842OooO00o = o000o0o1;
        this.f1843OooO0O0 = i;
        this.f1844OooO0OO = z;
        this.f1845OooO0Oo = f;
        this.f1847OooO0o0 = visibleItemsInfo;
        this.f1846OooO0o = i2;
        this.f1848OooO0oO = i3;
        this.f1849OooO0oo = measureResult;
    }

    @Override // p027Oooo0o.o0000Ooo
    public final int OooO00o() {
        return this.f1848OooO0oO;
    }

    @Override // p027Oooo0o.o0000Ooo
    @NotNull
    public final List<oo000o> OooO0O0() {
        return this.f1847OooO0o0;
    }

    @Override // o0O0O00.o000000O
    public final void OooO0OO() {
        this.f1849OooO0oo.OooO0OO();
    }

    @Override // p027Oooo0o.o0000Ooo
    public final int OooO0Oo() {
        return this.f1846OooO0o;
    }

    @Override // o0O0O00.o000000O
    @NotNull
    public final Map<OooO00o, Integer> OooO0o0() {
        return this.f1849OooO0oo.OooO0o0();
    }

    @Override // o0O0O00.o000000O
    public final int getHeight() {
        return this.f1849OooO0oo.getHeight();
    }

    @Override // o0O0O00.o000000O
    public final int getWidth() {
        return this.f1849OooO0oo.getWidth();
    }
}
