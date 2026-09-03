package p375o0OOoOO;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O f44050OooO0Oo = new o000000O();

    public o000000O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
        return Unit.INSTANCE;
    }
}
