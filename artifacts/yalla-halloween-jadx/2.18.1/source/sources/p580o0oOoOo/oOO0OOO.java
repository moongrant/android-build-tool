package p580o0oOoOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oOO0OOO f46677Oooo0o = new oOO0OOO();

    public oOO0OOO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0O0("102224");
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43155OooOOo.setValue(Boolean.FALSE);
        LiveEventBus.get("ROOM_SHOW_MUSIC").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
