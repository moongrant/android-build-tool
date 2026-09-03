package p502o0o00o0;

import android.view.View;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.jvm.internal.Intrinsics;
import p142o00OOooO.o0000;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f41551Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f41552Oooo0oO;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f41551Oooo0o = i;
        this.f41552Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41551Oooo0o) {
            case 0:
                o00000O this$0 = (o00000O) this.f41552Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f41547OoooO00) {
                    this$0.OooO0O0();
                }
                break;
            default:
                LoginActivity this$1 = (LoginActivity) this.f41552Oooo0oO;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0O00000.OooO0OO("Log_in_feedback");
                SharedUrlManager.INSTANCE.getFeedBackLoginUrl().observe(this$1, new o0000(this$1, 1));
                break;
        }
    }
}
