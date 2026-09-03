package p502o0o00o0;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p538o0o0Oo0.o00O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ o00000OO f41553Oooo0oO = new o00000OO(0);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ o00000OO f41554Oooo0oo = new o00000OO(1);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41555Oooo0o;

    public /* synthetic */ o00000OO(int i) {
        this.f41555Oooo0o = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41555Oooo0o) {
            case 0:
                break;
            default:
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                o00O00O onLogin = o00O00O.f43948Oooo0o;
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                } else {
                    Objects.requireNonNull(onLogin);
                }
                break;
        }
    }
}
