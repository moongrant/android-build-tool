package p519o0o0O0oO;

import android.app.Activity;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f52359OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(RoomUserInfoModel roomUserInfoModel) {
        super(1);
        this.f52359OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        h2 onLogin = new h2(this.f52359OooO0Oo);
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
