package p552o0oOOoOo;

import com.yalla.yalla.ui.view.gift.RoomRunWayItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomRunWayItemView f55952OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(RoomRunWayItemView roomRunWayItemView) {
        super(0);
        this.f55952OooO0Oo = roomRunWayItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> bgAnimationUiInitListener = this.f55952OooO0Oo.getBgAnimationUiInitListener();
        if (bgAnimationUiInitListener != null) {
            bgAnimationUiInitListener.invoke();
        }
        return Unit.INSTANCE;
    }
}
