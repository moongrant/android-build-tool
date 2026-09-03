package o000O00O;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import kotlin.jvm.internal.Intrinsics;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0Oo implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34031OooO0Oo;

    public /* synthetic */ o000O0Oo(Object obj) {
        this.f34031OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainMomentsTopicFollowingFragment.initView$lambda$2((MainMomentsTopicFollowingFragment) this.f34031OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SupportTopActivity this$0 = (SupportTopActivity) this.f34031OooO0Oo;
        int i2 = SupportTopActivity.f26727OooOo0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.SupportInfo.UserData");
        this$0.getClass();
        com.yalla.yalla.ui.activity.user.OooO0OO onLogin = new com.yalla.yalla.ui.activity.user.OooO0OO(this$0, (SupportInfo.UserData) obj);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity context = com.code.android.util.OooO0O0.OooO0O0();
        if (context != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onCues((o000O000.OooO0O0) this.f34031OooO0Oo);
    }
}
