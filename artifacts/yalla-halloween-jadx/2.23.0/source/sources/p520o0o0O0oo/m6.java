package p520o0o0O0oo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final m6 f53314OooO0Oo = new m6();

    public m6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
