package p022Oooo00O;

import android.app.Activity;
import android.view.View;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.o0000O0O;
import com.google.firebase.messaging.o0000Ooo;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.youth.banner.listener.OnBannerListener;
import kotlin.jvm.internal.Intrinsics;
import o000OO.OooOOO0;
import p080o000OoO.o00000O0;
import p475o0Ooooo0.o0O00oO0;
import p587o0oOooOO.p0;
import p587o0oOooOO.q0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements o000Oo0.OooO0OO, o00000O0.OooO00o, OnSuccessListener, BaseQuickAdapter.OooO0o, OnBannerListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f647OooO0Oo;

    public /* synthetic */ o00OOO00(Object obj) {
        this.f647OooO0Oo = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        p0 this$0 = (p0) this.f647OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        q0 onLogin = new q0(this$0, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ((UserInfoLeftFragment) this.f647OooO0Oo).lambda$initView$4(baseQuickAdapter, view, i);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        String str;
        o00OOO0 o00ooo1 = (o00OOO0) this.f647OooO0Oo;
        synchronized (o00ooo1.f627OooO00o) {
            OooOOO0.OooO0o("Release completer expected to be null", o00ooo1.f638OooOOO == null);
            o00ooo1.f638OooOOO = oooO00o;
            str = "Release[session=" + o00ooo1 + "]";
        }
        return str;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onSeekBackIncrementChanged(((o00O00O) this.f647OooO0Oo).f9392OooOooO);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f647OooO0Oo;
        o0000O0O o0000o0o2 = (o0000O0O) obj;
        o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
        if (firebaseMessaging.OooO0oO()) {
            if (o0000o0o2.f19861OooO0oo.OooO00o() != null) {
                synchronized (o0000o0o2) {
                    z = o0000o0o2.f19860OooO0oO;
                }
                if (z) {
                    return;
                }
                o0000o0o2.OooO0oo(0L);
            }
        }
    }
}
