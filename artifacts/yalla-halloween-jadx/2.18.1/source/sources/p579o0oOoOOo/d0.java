package p579o0oOoOOo;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f45942Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(RoomUserInfoModel roomUserInfoModel) {
        super(1);
        this.f45942Oooo0o = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        c0 onLogin = new c0(this.f45942Oooo0o);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
            }
        }
        return Unit.INSTANCE;
    }
}
