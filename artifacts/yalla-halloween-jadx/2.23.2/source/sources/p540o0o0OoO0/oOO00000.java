package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p429o0OoOO.o0Oo0oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO00000 f55009OooO0Oo = new oOO00000();

    public oOO00000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        o000O00.OooO00o(o000000.password_unjoin_toast_Done);
        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        o0Oo0oo.OooO00o();
        return Unit.INSTANCE;
    }
}
