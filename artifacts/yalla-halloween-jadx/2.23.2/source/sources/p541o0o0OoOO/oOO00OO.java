package p541o0o0OoOO;

import android.app.Activity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO00OO f55232OooO0Oo = new oOO00OO();

    public oOO00OO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102267");
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        RoomLoginInformation value = oooO00o.OooO00o().f24543OooO0oo.getValue();
        RoomConfiguration value2 = oooO00o.OooO00o().f24535OooO.getValue();
        if (value != null && value2 != null) {
            oOO00O0 onLogin = oOO00O0.f55231OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
