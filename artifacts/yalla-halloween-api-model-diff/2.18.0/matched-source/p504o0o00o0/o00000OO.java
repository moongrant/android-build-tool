package p504o0o00o0;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p255o00ooO0O.o00000O;
import p500o0o00Oo0.OooOOO;
import p540o0o0Oo0.o00O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41574Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ o00000OO f41573OoooO00 = new o00000OO(0);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ o00000OO f41572OoooO0 = new o00000OO(1);

    public /* synthetic */ o00000OO(int i) {
        this.f41574Oooo = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41574Oooo) {
            case 0:
                break;
            default:
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                o00O00O onLogin = o00O00O.f43963Oooo;
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    Objects.requireNonNull(onLogin);
                }
                break;
        }
    }
}
