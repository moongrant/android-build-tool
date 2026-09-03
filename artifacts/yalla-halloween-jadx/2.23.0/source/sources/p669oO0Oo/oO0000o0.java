package p669oO0Oo;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o000O00O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p427o0OoOO00.o0OOO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0000o0 f60783OooO0Oo = new oO0000o0();

    public oO0000o0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        o000O00O.OooO00o(oO00OOo0.password_unjoin_toast_Done);
        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
        MutableState mutableState = o0OOO0o.f45698OooO00o;
        o0OOO0o.OooO00o();
        return Unit.INSTANCE;
    }
}
