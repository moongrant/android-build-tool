package p486o0o00O00;

import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RedemptionCodeVm f48245OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(RedemptionCodeVm redemptionCodeVm) {
        super(0);
        this.f48245OooO0Oo = redemptionCodeVm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<String, Unit> searchTextSetter = this.f48245OooO0Oo.getSearchTextSetter();
        if (searchTextSetter != null) {
            searchTextSetter.invoke("");
        }
        return Unit.INSTANCE;
    }
}
