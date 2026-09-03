package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53908OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(MomentReplyVM momentReplyVM) {
        super(1);
        this.f53908OooO0Oo = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f53908OooO0Oo.setSortTypeAndGetReplays(num.intValue());
        return Unit.INSTANCE;
    }
}
