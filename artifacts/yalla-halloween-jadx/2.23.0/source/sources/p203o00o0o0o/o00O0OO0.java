package p203o00o0o0o;

import android.app.Activity;
import com.code.android.util.OooO0O0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;
import p464o0Oooo.o000000O;
import p484o0o00O.o000OOo;
import p598o0oo00oO.o0000O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO0 implements o00O.OooO00o, o0000O00.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39197OooO0Oo;

    public /* synthetic */ o00O0OO0(Object obj) {
        this.f39197OooO0Oo = obj;
    }

    @Override // o0oo00oO.o0000O00.OooO00o
    public final void OooO0Oo() {
        MomentReplyHeaderView this$0 = (MomentReplyHeaderView) this.f39197OooO0Oo;
        int i = MomentReplyHeaderView.f26450OooOO0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o000OOo onLogin = new o000OOo(this$0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackSuppressionReasonChanged(((o0O000o0) this.f39197OooO0Oo).f39274OooOOO0);
    }
}
