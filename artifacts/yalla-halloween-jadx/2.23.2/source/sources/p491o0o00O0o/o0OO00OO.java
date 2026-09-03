package p491o0o00O0o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.LoginModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function1<LoginModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OO00OO f49042OooO0Oo = new o0OO00OO();

    public o0OO00OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginModel loginModel) {
        LiveEventBus.get("LOGIN_RESULT").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
