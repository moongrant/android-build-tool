package p558o0oOOoo;

import android.app.Activity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<RoomVoteDialog> f44807Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44808Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(o0O00OO<RoomVoteDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44807Oooo0o = o0o00oo2;
        this.f44808Oooo0oO = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O0O0o0 onLogin = new o0O0O0o0(this.f44807Oooo0o, this.f44808Oooo0oO);
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
