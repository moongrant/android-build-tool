package p504o0o00o0;

import android.view.View;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.internal.Intrinsics;
import p143o00OOooO.o0000;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f41570Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f41571OoooO00;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f41570Oooo = i;
        this.f41571OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41570Oooo) {
            case 0:
                o00000O this$0 = (o00000O) this.f41571OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f41562OoooO) {
                    this$0.OooO0O0();
                }
                break;
            default:
                LoginActivity this$1 = (LoginActivity) this.f41571OoooO00;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0O00000.OooO0OO("Log_in_feedback");
                SharedUrlManager.INSTANCE.getFeedBackLoginUrl().observe(this$1, new o0000(this$1, 1));
                break;
        }
    }
}
