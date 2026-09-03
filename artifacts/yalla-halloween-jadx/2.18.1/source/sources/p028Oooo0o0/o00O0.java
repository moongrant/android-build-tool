package p028Oooo0o0;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 extends Lambda implements Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooOo f2026Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(o00O000.OooOo oooOo) {
        super(5);
        this.f2026Oooo0o = oooOo;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, OooO oooO, int[] iArr2) {
        int iIntValue = num.intValue();
        int[] size = iArr;
        OooO density = oooO;
        int[] outPosition = iArr2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        this.f2026Oooo0o.OooO0OO(density, iIntValue, size, outPosition);
        return Unit.INSTANCE;
    }
}
