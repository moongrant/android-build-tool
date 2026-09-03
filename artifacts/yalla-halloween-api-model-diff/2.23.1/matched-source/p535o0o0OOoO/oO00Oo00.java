package p535o0o0OOoO;

import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53807OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(MomentCommentsVM momentCommentsVM) {
        super(1);
        this.f53807OooO0Oo = momentCommentsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f53807OooO0Oo.switchSortType(num.intValue());
        return Unit.INSTANCE;
    }
}
