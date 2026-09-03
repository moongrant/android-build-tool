package p558o0oOOooo;

import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O extends Lambda implements Function1<OooOO0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f56226OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(RoomRunWayItemView roomRunWayItemView) {
        super(1);
        this.f56226OooO0Oo = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOO0 oooOO1) {
        OooOO0 entity = oooOO1;
        Intrinsics.checkNotNullParameter(entity, "entity");
        ooo0o.OooO00o(entity, this.f56226OooO0Oo.f30513OooO0Oo);
        return Unit.INSTANCE;
    }
}
