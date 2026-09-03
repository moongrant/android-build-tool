package p381o0OOoOo0;

import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOo00 f43265OooO0Oo = new OooOo00();

    public OooOo00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.Vip1, false, 2, null);
        return Unit.INSTANCE;
    }
}
