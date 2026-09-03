package p535o0o0OOoO;

import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f54077OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f54077OooO0Oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentGiftsVM momentGiftsVM = this.f54077OooO0Oo;
        if (momentGiftsVM.getGiftsSortType() != 1) {
            momentGiftsVM.switchSortType(1);
        }
        return Unit.INSTANCE;
    }
}
