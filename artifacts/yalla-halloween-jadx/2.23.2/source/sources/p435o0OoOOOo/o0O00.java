package p435o0OoOOOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f47004OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(Ref.BooleanRef booleanRef) {
        super(0);
        this.f47004OooO0Oo = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f47004OooO0Oo.element) {
            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
