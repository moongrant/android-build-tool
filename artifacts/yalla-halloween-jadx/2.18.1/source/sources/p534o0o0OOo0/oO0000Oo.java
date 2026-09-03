package p534o0o0OOo0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.LoginModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000Oo extends Lambda implements Function1<LoginModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO0000Oo f43609Oooo0o = new oO0000Oo();

    public oO0000Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginModel loginModel) {
        LiveEventBus.get("LOGIN_RESULT").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
