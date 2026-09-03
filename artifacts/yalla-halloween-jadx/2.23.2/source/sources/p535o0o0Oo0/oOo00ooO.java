package p535o0o0Oo0;

import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54249OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(MomentVideoVM momentVideoVM) {
        super(0);
        this.f54249OooO0Oo = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f54249OooO0Oo.setSendRewardDialogComment(null);
        return Unit.INSTANCE;
    }
}
