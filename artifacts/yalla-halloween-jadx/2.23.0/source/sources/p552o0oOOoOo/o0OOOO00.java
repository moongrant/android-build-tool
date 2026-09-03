package p552o0oOOoOo;

import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOOO00 extends Lambda implements Function1<OooOO0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f55990OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(RoomRunWayItemView roomRunWayItemView) {
        super(1);
        this.f55990OooO0Oo = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOO0 oooOO1) {
        OooOO0 entity = oooOO1;
        Intrinsics.checkNotNullParameter(entity, "entity");
        o0OOOO0o.OooO00o(entity, this.f55990OooO0Oo.f31058OooO0Oo);
        return Unit.INSTANCE;
    }
}
