package p538o0o0Oo0;

import android.app.Activity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f44014Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(TopicDetailActivity topicDetailActivity) {
        super(0);
        this.f44014Oooo0o = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O0OOO0 onLogin = new o0O0OOO0(this.f44014Oooo0o);
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
