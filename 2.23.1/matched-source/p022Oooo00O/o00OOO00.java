package p022Oooo00O;

import android.app.Activity;
import android.view.View;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o00000OO;
import com.google.firebase.messaging.o0000O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.adapter.oo0oOO0;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.youth.banner.listener.OnBannerListener;
import kotlin.jvm.internal.Intrinsics;
import o000OO.OooOOO0;
import p080o000OoO.o00000;
import p474o0OoooOO.oo0oO0;
import p546o0o0Ooo0.oO0000O;
import p546o0o0Ooo0.oO0000Oo;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements o000O0.OooO0OO, o00000.OooO00o, OnSuccessListener, BaseQuickAdapter.OooO0o, OnBannerListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f648OooO0o0;

    public /* synthetic */ o00OOO00(Object obj, int i) {
        this.f647OooO0Oo = i;
        this.f648OooO0o0 = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        oO0000O this$0 = (oO0000O) this.f648OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oO0000Oo onLogin = new oO0000Oo(this$0, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24734OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // o0ooOO0.o000O0.OooO0OO
    public final Object OooO0O0(o000O0.OooO00o oooO00o) {
        String str;
        o00OOO0 o00ooo1 = (o00OOO0) this.f648OooO0o0;
        synchronized (o00ooo1.f627OooO00o) {
            OooOOO0.OooO0o("Release completer expected to be null", o00ooo1.f638OooOOO == null);
            o00ooo1.f638OooOOO = oooO00o;
            str = "Release[session=" + o00ooo1 + "]";
        }
        return str;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f647OooO0Oo;
        Object obj = this.f648OooO0o0;
        switch (i2) {
            case 4:
                YallaTeamMessageActivity this$0 = (YallaTeamMessageActivity) obj;
                int i3 = YallaTeamMessageActivity.f25320OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                oo0oOO0 oo0ooo0 = this$0.f25322OooOo;
                if (oo0ooo0 != null) {
                    oo0ooo0.f27239OooOoo0 = i;
                }
                if (oo0ooo0 != null) {
                    oo0ooo0.notifyDataSetChanged();
                }
                break;
            default:
                ((UserInfoLeftFragment) obj).lambda$initView$4(baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onSeekBackIncrementChanged(((o00O00O) this.f648OooO0o0).f9398OooOooO);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f648OooO0o0;
        o0000O0 o0000o1 = (o0000O0) obj;
        o00000OO o00000oo2 = FirebaseMessaging.f19763OooOOO0;
        if (firebaseMessaging.OooO0oO()) {
            if (o0000o1.f19861OooO0oo.OooO00o() != null) {
                synchronized (o0000o1) {
                    z = o0000o1.f19860OooO0oO;
                }
                if (z) {
                    return;
                }
                o0000o1.OooO0oo(0L);
            }
        }
    }
}
