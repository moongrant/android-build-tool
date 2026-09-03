package p558o0oOOoo;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.SVGAState;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p425o0OoO0OO.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function1<SVGAState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f56102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56103OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SVGAState.values().length];
            try {
                iArr[SVGAState.PlayFinished.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(oo0oO0 oo0oo0, SVGAView sVGAView, RoomRunWayItemView roomRunWayItemView) {
        super(1);
        this.f56101OooO0Oo = oo0oo0;
        this.f56103OooO0o0 = sVGAView;
        this.f56102OooO0o = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SVGAState sVGAState) {
        SVGAState state = sVGAState;
        Intrinsics.checkNotNullParameter(state, "state");
        if (OooO00o.$EnumSwitchMapping$0[state.ordinal()] == 1) {
            this.f56101OooO0Oo.invoke();
            SVGAView svgaView = this.f56103OooO0o0;
            Intrinsics.checkNotNullExpressionValue(svgaView, "$it");
            o0OO00OO o0oo00oo2 = new o0OO00OO(this.f56102OooO0o);
            Intrinsics.checkNotNullParameter(svgaView, "svgaView");
            o00O00.OooO00o(svgaView, "svga/gift_run_way_bg_vip6_end.svga", -1, null, o0oo00oo2);
        }
        return Unit.INSTANCE;
    }
}
