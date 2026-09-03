package p540o0o0OoO0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.code.android.util.o0000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p581o0oOoo.o0000oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000oo f54834OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(o0000oo o0000ooVar) {
        super(1);
        this.f54834OooO0Oo = o0000ooVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        long jM1481getTopCenterF1C5BW0 = LayoutCoordinatesKt.boundsInWindow(it).m1481getTopCenterF1C5BW0();
        this.f54834OooO0Oo.f56615OooO0o0 = OffsetKt.Offset(!OooOo00.OooO0o0() ? Offset.m1447getXimpl(jM1481getTopCenterF1C5BW0) : o0000O00.OooO0OO() - Offset.m1447getXimpl(jM1481getTopCenterF1C5BW0), Offset.m1448getYimpl(jM1481getTopCenterF1C5BW0));
        return Unit.INSTANCE;
    }
}
