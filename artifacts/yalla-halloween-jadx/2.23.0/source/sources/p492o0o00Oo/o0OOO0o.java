package p492o0o00Oo;

import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f48738OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o00oO0o o00oo0o2) {
        super(1);
        this.f48738OooO0Oo = o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        o00oO0o o00oo0o2 = this.f48738OooO0Oo;
        if (zBooleanValue) {
            LinearLayout roomRunWayLayout = o00oo0o2.f48729OooO0OO;
            Intrinsics.checkNotNullExpressionValue(roomRunWayLayout, "roomRunWayLayout");
            o000OO00.OooOOOO(roomRunWayLayout);
            RoomRunWayItemView roomRunWayTop = o00oo0o2.f48730OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomRunWayTop, "roomRunWayTop");
            o000OO00.OooOOOO(roomRunWayTop);
        } else {
            o00oo0o2.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
