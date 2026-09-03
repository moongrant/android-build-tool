package p580o0oOoOo;

import android.app.Activity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00O000;
import p516o0o0O000.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0OOOO00 f46419Oooo0o = new o0OOOO00();

    public o0OOOO00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (OooOo.f42064OooO00o.OooO0O0()) {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                WalletActivity.f23268OoooooO.OooO00o(activityOooO0O0, false);
            }
        } else {
            LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").post(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
