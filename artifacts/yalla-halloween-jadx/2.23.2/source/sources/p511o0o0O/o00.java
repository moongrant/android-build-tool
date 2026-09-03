package p511o0o0O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.k0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f50943OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o00000OO o00000oo2) {
        super(0);
        this.f50943OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f50943OooO0Oo.getClass();
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
        k0.OooO00o(false, false, null);
        return Unit.INSTANCE;
    }
}
