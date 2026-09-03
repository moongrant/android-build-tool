package p528o0o0OOOo;

import android.app.Activity;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53932OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000(MomentVideoVM momentVideoVM) {
        super(1);
        this.f53932OooO0Oo = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        oO0 onLogin = new oO0(this.f53932OooO0Oo);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
