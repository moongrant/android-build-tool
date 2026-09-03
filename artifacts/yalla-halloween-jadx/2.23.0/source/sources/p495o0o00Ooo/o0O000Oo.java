package p495o0o00Ooo;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<o> f48794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48795OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(MutableState<o> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48794OooO0Oo = mutableState;
        this.f48795OooO0o0 = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OoOoOo onLogin = new o0OoOoOo(this.f48794OooO0Oo, this.f48795OooO0o0);
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
