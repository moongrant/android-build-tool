package p506o0o00oOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final a1 f50391OooO0Oo = new a1();

    public a1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("WELFARE_ITEM_OUT_OF_STOCK_NOTIFY").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
