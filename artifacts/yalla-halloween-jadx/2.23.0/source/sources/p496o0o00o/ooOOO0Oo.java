package p496o0o00o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ooOOO0Oo f49207OooO0Oo = new ooOOO0Oo();

    public ooOOO0Oo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("WELFARE_ITEM_OUT_OF_STOCK_NOTIFY").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
