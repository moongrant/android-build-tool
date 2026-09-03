package p669oO0Oo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O f60588OooO0Oo = new o0O();

    public o0O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102224");
        OooO00o.f24991OooOo0.f47432OooO0O0.setValue(Boolean.FALSE);
        LiveEventBus.get("ROOM_SHOW_MUSIC").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
