package p552o0oOOoOo;

import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.SVGAState;
import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p417o0OoO0.o0000oo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0OO extends Lambda implements Function1<SVGAState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f55987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f55988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f55989OooO0o0;

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
    public o0OOO0OO(o0OO o0oo, SVGAView sVGAView, RoomRunWayItemView roomRunWayItemView) {
        super(1);
        this.f55987OooO0Oo = o0oo;
        this.f55989OooO0o0 = sVGAView;
        this.f55988OooO0o = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SVGAState sVGAState) {
        SVGAState state = sVGAState;
        Intrinsics.checkNotNullParameter(state, "state");
        if (OooO00o.$EnumSwitchMapping$0[state.ordinal()] == 1) {
            this.f55987OooO0Oo.invoke();
            SVGAView svgaView = this.f55989OooO0o0;
            Intrinsics.checkNotNullExpressionValue(svgaView, "it");
            o0OOO0 o0ooo1 = new o0OOO0(this.f55988OooO0o);
            Intrinsics.checkNotNullParameter(svgaView, "svgaView");
            o0000oo.OooO00o(svgaView, "svga/gift_run_way_bg_vip6_end.svga", -1, null, o0ooo1);
        }
        return Unit.INSTANCE;
    }
}
