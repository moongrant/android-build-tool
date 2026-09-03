package p620o0oo0oO0;

import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 implements o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f57586OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f57587OooO0O0;

    @Override // p620o0oo0oO0.o000O0Oo
    @NotNull
    public final Pair<Integer, Integer> OooO00o() {
        return new Pair<>(Integer.valueOf(this.f57586OooO00o), Integer.valueOf(this.f57587OooO0O0));
    }

    @Override // p620o0oo0oO0.o000O0Oo
    @NotNull
    public final FrameLayout.LayoutParams OooO0O0(int i, int i2, int i3, int i4, @NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f57586OooO00o = i;
        this.f57587OooO0O0 = i2;
        return layoutParams;
    }
}
