package p528o0o0OOOo;

import com.yalla.yalla.ui.vm.moment.MomentReplyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyVM f53935OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(MomentReplyVM momentReplyVM) {
        super(1);
        this.f53935OooO0Oo = momentReplyVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f53935OooO0Oo.setSortTypeAndGetReplays(num.intValue());
        return Unit.INSTANCE;
    }
}
