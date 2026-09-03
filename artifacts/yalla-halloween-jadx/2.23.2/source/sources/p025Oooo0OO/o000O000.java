package p025Oooo0OO;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.session.o000OO0O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o00000O0;
import p080o000OoO.o0O0O00;
import p286o0O0OOoO.o00Ooo;
import p286o0O0OOoO.o00oO0o;
import p301o0O0o0O.OooO0OO;
import p301o0O0o0O.OooO0o;
import p424o0OoO0Oo.o00O;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o0OOO00;
import p506o0o00oOo.oO000Oo0;
import p506o0o00oOo.oO0OOo0o;
import p559o0oOo.o00O0O;
import p564o0oOo0O.o0O00o0;
import p593o0oo0.OooOOOO;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O000 implements o000Oo0.OooO0OO, o0O0O00, o00000O0.OooO00o, OooO0OO.OooO00o, BaseQuickAdapter.OooO0o, o00O0O, OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1045OooO0Oo;

    public /* synthetic */ o000O000(Object obj) {
        this.f1045OooO0Oo = obj;
    }

    @Override // o0O0o0O.OooO0OO.OooO00o
    public void OooO00o(OooO0o oooO0o) {
        o00oO0o o00oo0o2 = (o00oO0o) this.f1045OooO0Oo;
        o00oo0o2.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        o00oo0o2.f41435OooO0O0.set((o00Ooo) oooO0o.get());
    }

    @Override // p559o0oOo.o00O0O
    public void OooO0OO() {
        FollowerActivity this$0 = (FollowerActivity) this.f1045OooO0Oo;
        int i = FollowerActivity.f26638OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new oO0OOo0o(this$0, null)).observe(this$0, new FollowerActivity.OooO00o(new oO000Oo0(this$0, false)));
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public void OooO0Oo() {
        MomentDetailCommentItemView this$0 = (MomentDetailCommentItemView) this.f1045OooO0Oo;
        int i = MomentDetailCommentItemView.f30535OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getItem().isHide()) {
            return;
        }
        o0O00o0 onLogin = new o0O00o0(this$0);
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
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f1045OooO0Oo;
        int i2 = TopicBlackListActivity.f25826OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        o0OOO00 o0ooo00 = this$0.f25828OooOo0;
        if (o0ooo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            o0ooo00 = null;
        }
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, String.valueOf(((TopicBlackUserModel) o0ooo00.f13189OooOOoo.get(i)).getUserId()), false, 12);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        o000O0o o000o0o2 = (o000O0o) this.f1045OooO0Oo;
        o000o0o2.f1049OooO0Oo = oooO00o;
        return "WaitForRepeatingRequestStart[" + o000o0o2 + "]";
    }

    @Override // p080o000OoO.o0O0O00
    public void accept(Object obj) {
        ((androidx.media3.exoplayer.drm.OooO0O0.OooO00o) obj).OooO0o0((Exception) this.f1045OooO0Oo);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((o000OO0O.OooO0OO) this.f1045OooO0Oo).getClass();
        throw null;
    }
}
