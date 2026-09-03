package p533o0o0Oo0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Pair<Integer, Integer>> f54729OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(MutableState<Pair<Integer, Integer>> mutableState) {
        super(1);
        this.f54729OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54729OooO0Oo.setValue(new Pair<>(Integer.valueOf((int) Offset.m1436getXimpl(LayoutCoordinatesKt.boundsInParent(it).m1470getTopCenterF1C5BW0())), Integer.valueOf((int) LayoutCoordinatesKt.boundsInParent(it).getTop())));
        return Unit.INSTANCE;
    }
}
