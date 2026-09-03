package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f53657OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f53657OooO0Oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentGiftsVM momentGiftsVM = this.f53657OooO0Oo;
        if (momentGiftsVM.getGiftsSortType() != 0) {
            momentGiftsVM.switchSortType(0);
        }
        return Unit.INSTANCE;
    }
}
