package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f53731OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f53731OooO0Oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentGiftsVM momentGiftsVM = this.f53731OooO0Oo;
        if (momentGiftsVM.getGiftsSortType() != 1) {
            momentGiftsVM.switchSortType(1);
        }
        return Unit.INSTANCE;
    }
}
