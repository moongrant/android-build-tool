package p500o0o00o0;

import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f50157OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooOOO oooOOO) {
        super(1);
        this.f50157OooO0Oo = oooOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        OooOOO oooOOO = this.f50157OooO0Oo;
        if (zBooleanValue) {
            LinearLayout linearLayout = oooOOO.f50148OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "access$getRoomRunWayLayout$p(...)");
            o000O.OooOOOO(linearLayout);
            RoomRunWayItemView roomRunWayItemView = oooOOO.f50149OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomRunWayItemView, "access$getRoomRunWayTop$p(...)");
            o000O.OooOOOO(roomRunWayItemView);
        } else {
            oooOOO.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
