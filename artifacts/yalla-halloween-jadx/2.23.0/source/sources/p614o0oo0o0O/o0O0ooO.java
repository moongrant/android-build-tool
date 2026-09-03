package p614o0oo0o0O;

import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0ooO implements o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f57046OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f57047OooO0O0;

    @Override // p614o0oo0o0O.o000OO00
    @NotNull
    public final Pair<Integer, Integer> OooO00o() {
        return new Pair<>(Integer.valueOf(this.f57046OooO00o), Integer.valueOf(this.f57047OooO0O0));
    }

    @Override // p614o0oo0o0O.o000OO00
    @NotNull
    public final FrameLayout.LayoutParams OooO0O0(int i, int i2, int i3, int i4, @NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f57046OooO00o = i;
        this.f57047OooO0O0 = i2;
        return layoutParams;
    }
}
