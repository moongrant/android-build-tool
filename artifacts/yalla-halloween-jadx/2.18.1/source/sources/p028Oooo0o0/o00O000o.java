package p028Oooo0o0;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0O0 f2046Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o00OO0O0.OooO0O0 oooO0O0) {
        super(2);
        this.f2046Oooo0o = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
        int iIntValue = num.intValue();
        LayoutDirection layoutDirection2 = layoutDirection;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        return Integer.valueOf(this.f2046Oooo0o.OooO00o(0, iIntValue, layoutDirection2));
    }
}
