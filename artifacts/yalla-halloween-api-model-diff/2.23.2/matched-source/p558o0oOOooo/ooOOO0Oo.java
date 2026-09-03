package p558o0oOOooo;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.SVGAState;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p423o0OoO0OO.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO0Oo extends Lambda implements Function1<SVGAState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56227OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f56228OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56229OooO0o0;

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
    public ooOOO0Oo(oOo0oooO ooo0oooo, SVGAView sVGAView, RoomRunWayItemView roomRunWayItemView) {
        super(1);
        this.f56227OooO0Oo = ooo0oooo;
        this.f56229OooO0o0 = sVGAView;
        this.f56228OooO0o = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SVGAState sVGAState) {
        SVGAState state = sVGAState;
        Intrinsics.checkNotNullParameter(state, "state");
        if (OooO00o.$EnumSwitchMapping$0[state.ordinal()] == 1) {
            this.f56227OooO0Oo.invoke();
            SVGAView svgaView = this.f56229OooO0o0;
            Intrinsics.checkNotNullExpressionValue(svgaView, "$it");
            oOo0o0oO ooo0o0oo = new oOo0o0oO(this.f56228OooO0o);
            Intrinsics.checkNotNullParameter(svgaView, "svgaView");
            o00O00O.OooO00o(svgaView, "svga/gift_run_way_bg_vip6_end.svga", -1, null, ooo0o0oo);
        }
        return Unit.INSTANCE;
    }
}
