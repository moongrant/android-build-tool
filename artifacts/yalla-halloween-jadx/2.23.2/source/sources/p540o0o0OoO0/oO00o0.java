package p540o0o0OoO0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00o0 f54953OooO0Oo = new oO00o0();

    public oO00o0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102224");
        com.yalla.yalla.service.room.OooO00o.f24529OooOo0.f48501OooO0O0.setValue(Boolean.FALSE);
        LiveEventBus.get("ROOM_SHOW_MUSIC").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
