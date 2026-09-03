package p535o0o0OOoO;

import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f54079OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f54079OooO0Oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentGiftsVM momentGiftsVM = this.f54079OooO0Oo;
        if (momentGiftsVM.getGiftsSortType() != 0) {
            momentGiftsVM.switchSortType(0);
        }
        return Unit.INSTANCE;
    }
}
