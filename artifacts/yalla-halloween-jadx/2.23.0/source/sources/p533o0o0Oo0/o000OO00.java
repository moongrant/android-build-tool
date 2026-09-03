package p533o0o0Oo0;

import android.app.Activity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO00 f54719OooO0Oo = new o000OO00();

    public o000OO00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102267");
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        RoomLoginInformation value = oooO00o.OooO00o().f25005OooO0oo.getValue();
        RoomConfiguration value2 = oooO00o.OooO00o().f24997OooO.getValue();
        if (value != null && value2 != null) {
            o000O onLogin = o000O.f54696OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
