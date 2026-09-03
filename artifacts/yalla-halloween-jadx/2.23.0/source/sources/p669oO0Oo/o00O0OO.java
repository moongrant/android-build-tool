package p669oO0Oo;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.code.android.util.o0000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOoO.oOO000;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO000 f60551OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(oOO000 ooo000) {
        super(1);
        this.f60551OooO0Oo = ooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        long jM1470getTopCenterF1C5BW0 = LayoutCoordinatesKt.boundsInWindow(it).m1470getTopCenterF1C5BW0();
        this.f60551OooO0Oo.f56366OooO0o0 = OffsetKt.Offset(!OooO.OooO0o0() ? Offset.m1436getXimpl(jM1470getTopCenterF1C5BW0) : o0000O00.OooO0O0() - Offset.m1436getXimpl(jM1470getTopCenterF1C5BW0), Offset.m1437getYimpl(jM1470getTopCenterF1C5BW0));
        return Unit.INSTANCE;
    }
}
