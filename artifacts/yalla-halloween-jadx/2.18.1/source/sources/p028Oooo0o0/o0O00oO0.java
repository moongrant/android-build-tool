package p028Oooo0o0;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00oO0 extends Lambda implements Function5<Integer, int[], LayoutDirection, OooO, int[], Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO0o f2152Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(o00O000.OooO0o oooO0o) {
        super(5);
        this.f2152Oooo0o = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, OooO oooO, int[] iArr2) {
        int iIntValue = num.intValue();
        int[] size = iArr;
        LayoutDirection layoutDirection2 = layoutDirection;
        OooO density = oooO;
        int[] outPosition = iArr2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        this.f2152Oooo0o.OooO0O0(density, iIntValue, size, layoutDirection2, outPosition);
        return Unit.INSTANCE;
    }
}
