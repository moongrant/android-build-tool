package p501o0o00o;

import android.content.Context;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oo0O f41533Oooo0o = new oo0O();

    public oo0O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        VipActivity.f23570OoooOOo.OooO00o(contextOooO0O0, VipLevel.Vip0);
        return Unit.INSTANCE;
    }
}
