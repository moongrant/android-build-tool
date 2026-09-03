package p614o0oo0o0O;

import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00 implements o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f57018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f57019OooO0O0;

    @Override // p614o0oo0o0O.o000OO00
    @NotNull
    public final Pair<Integer, Integer> OooO00o() {
        return new Pair<>(Integer.valueOf(this.f57018OooO00o), Integer.valueOf(this.f57019OooO0O0));
    }

    @Override // p614o0oo0o0O.o000OO00
    @NotNull
    public final FrameLayout.LayoutParams OooO0O0(int i, int i2, int i3, int i4, @NotNull FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        float f = i;
        float f2 = i2;
        float f3 = i3 / i4;
        if (f / f2 > f3) {
            i2 = (int) (f / f3);
        } else {
            i = (int) (f3 * f2);
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return layoutParams;
        }
        this.f57018OooO00o = iIntValue;
        this.f57019OooO0O0 = iIntValue2;
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.gravity = 17;
        return layoutParams;
    }
}
