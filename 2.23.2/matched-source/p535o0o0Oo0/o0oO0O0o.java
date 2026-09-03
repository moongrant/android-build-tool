package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53817OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f53817OooO0Oo = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f53817OooO0Oo.switchSortType(num.intValue());
        return Unit.INSTANCE;
    }
}
