package p650o0ooo;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOOO000o f58986OooO0Oo = new oOOO000o();

    public oOOO000o() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip2, false, 2, null);
        return Unit.INSTANCE;
    }
}
