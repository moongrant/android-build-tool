package p520o0o0O0oo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class e8 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53276OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(x6 x6Var) {
        super(0);
        this.f53276OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53276OooO0Oo.getClass();
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
        oOO0OO.OooO00o(false, false, null);
        return Unit.INSTANCE;
    }
}
