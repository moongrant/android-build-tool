package p519o0o0O0oO;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O f52611OooO0Oo = new o0O();

    public o0O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("SHOW_BOTTOM_SHEET_POSITION").post(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
