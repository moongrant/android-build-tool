package p028Oooo0o0;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0.OooO0OO f2027Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o00OO0O0.OooO0OO oooO0OO) {
        super(2);
        this.f2027Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.f2027Oooo0o.OooO00o(0, iIntValue));
    }
}
